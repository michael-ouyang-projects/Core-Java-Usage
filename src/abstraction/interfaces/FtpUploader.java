package abstraction.interfaces;

public class FtpUploader implements UploadInterface {

	@Override
	public void upload() {
		System.out.println("uploading by ftp!");
	}

}
