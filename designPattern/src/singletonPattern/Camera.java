package singletonPattern;

public class Camera {
    private Camera() {}
    private static Camera _Instance;
    private static Object obj = new Object();
    private static String cameraName = "";

    public Camera get_getInstance() {
        if (_Instance == null) {
            synchronized(obj) {
                if (_Instance == null) {
                    _Instance = new Camera();
                }
            }
        }
        return _Instance;
    }

    public static String getCameraName() {
        return cameraName;
    }

    public static void setCameraName(String cameraName) {
        Camera.cameraName = cameraName;
    }
}
