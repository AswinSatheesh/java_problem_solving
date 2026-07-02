package Threads;

class FileDownloadTask implements Runnable{
	private String fileName;
	private int downloadTimeSeconds;
	FileDownloadTask(String fileName, int downloadTimeSeconds){
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

public class RunnableExample {
	public static void main(String[] args) {
		System.out.println("Main Application Thread Started : " + Thread.currentThread().getName());
		
		FileDownloadTask movieTask = new FileDownloadTask("movie.mp4", 3);
		FileDownloadTask zipTask = new FileDownloadTask("Zipdownload.zip", 5);
		
		Thread thread1 = new Thread(movieTask,"Movie-Thread");
		Thread thread2 = new Thread(zipTask, "Zip-Thread");
		
		thread1.start();
		thread2.start();
		
		System.out.println("Main Application THread finished");
	}
}
