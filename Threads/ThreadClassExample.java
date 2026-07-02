package Threads;

class FileDownloadThread extends Thread{
	private String fileName;
	private int downloadTimeSeconds;
    
	public FileDownloadThread(String fileName,int downloadTimeSeconds, String threadName) {
		super(threadName);
		this.fileName = fileName;
		this.downloadTimeSeconds = downloadTimeSeconds;
	}
	
	@Override
	public void run() {
		System.out.println("Download Started : " + fileName + "on " + Thread.currentThread().getName());
		try {
			for(int i =1; i <=downloadTimeSeconds; i++) {
				Thread.sleep(2000);
				System.out.println("⏬ Downloading [" + fileName + "]: " + (i * 100 / downloadTimeSeconds) + "% completed.");
			}
		}catch(InterruptedException e) {
			System.out.println("Download Interrupted for : " + fileName);
		}
		System.out.println("Download Completed Successfully");
	}
}
public class ThreadClassExample {
	public static void main(String[] args) {
		System.out.println("Main application thread started : " + Thread.currentThread().getName());
		
		FileDownloadThread movieThread = new FileDownloadThread("Movie.mp4", 4, "Movie-Thread");
		FileDownloadThread zipThread = new FileDownloadThread("newZip.zip", 6, "Zip-Thread");
		
		movieThread.start();
		zipThread.start();
		System.out.println("⏹️ Main Application thread finished its setup instructions.");
	}
}
