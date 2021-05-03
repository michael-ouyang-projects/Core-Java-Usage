package abstraction.interfaces;

public class HttpUploader implements UploadInterface {

	@Override
	public void upload() {
		System.out.println("uploading by http!");
	}

}
