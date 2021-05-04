package abstraction.interfaces;

public interface UploadInterface {

	public static final String interfaceName = "UploadInterface";
	String field = "decompile this interface and see the implicit modifier of this field";

	public void upload();

	public static void showInterfaceNameByStaticMethod() {
		System.out.println("StaticMethod: " + interfaceName);
	}

	public default void showInterfaceNameByDefaultMethod() {
		System.out.println("DefaultMethod: " + interfaceName);
	}

}
