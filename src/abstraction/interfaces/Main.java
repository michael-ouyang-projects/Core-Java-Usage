package abstraction.interfaces;

public class Main {

	public static void main(String[] args) {
		UploadInterface httpUploader = new HttpUploader();
		UploadInterface ftpUploader = new FtpUploader();

		httpUploader.upload();
		ftpUploader.upload();

		System.out.println();
		UploadInterface.showInterfaceNameByStaticMethod();

		System.out.println();
		httpUploader.showInterfaceNameByDefaultMethod();
		ftpUploader.showInterfaceNameByDefaultMethod();
	}

}
