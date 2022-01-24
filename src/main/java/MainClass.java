public class MainClass {
    private static final int size = 10000000;
    private static final int h = size / 2;
    private static float[] arr = new float[size];

    public static void main(String[] args) {

        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        long singleTime = singleThread(arr);
    }

    private static long singleThread(float [] arr) {
        long a = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long singleThreadTime = System.currentTimeMillis() - a;

        System.out.println("Время выполнения 1 потока: " + singleThreadTime);
        return singleThreadTime;
    }
        private static void doubleThread(float [] arr){
        float[] arr01 = new float[h];
        float[] arr02 = new float[h];

        long a = System.currentTimeMillis();

            System.arraycopy(arr, 0, arr01, 0, h);
            System.arraycopy(arr, h, arr02, 0, h);




    }
}
class Thread1 extends Thread{
    private float arr;

    public Thread1(String name, float arr) {
        super(name);
        this.arr = arr;
    }
}


