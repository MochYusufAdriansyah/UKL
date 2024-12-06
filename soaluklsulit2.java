public class soaluklsulit2{
    public static void main(String[] args) {
        int[] array = { 1, 2, 2, 3, 3, 5, 5, 1 ,5};
        MenemukanDuplicate(array);
    }

    public static void MenemukanDuplicate(int[] array) {
        boolean[] visited = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                if (count > 1) {
                    System.out.println("Angka " + array[i] + " memiliki duplikat sebanyak " + count + " kali.");
                }
            }
        }
    }
}