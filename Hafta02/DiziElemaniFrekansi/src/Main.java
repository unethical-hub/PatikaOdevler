public class Main {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        // Elemanlar ve frekanslarını saklamak için iki ayrı dizi kullanacağız
        int[] elements = new int[dizi.length];
        int[] frequency = new int[dizi.length];
        int elementsCount = 0;

        // Diziyi dolaşarak elemanları ve frekanslarını bulalım
        for (int i = 0; i < dizi.length; i++) {
            int element = dizi[i];
            boolean elementFound = false;

            // Elemanı daha önce elemanlar dizisinde kontrol edelim
            for (int j = 0; j < elementsCount; j++) {
                // Eleman daha önce elemanlar dizisinde bulunduysa frekansını bir arttıralım
                if (elements[j] == element) {
                    frequency[j]++;
                    elementFound = true;
                    break;
                }
            }

            // Eleman elemanlar dizisinde bulunmadıysa yeni bir giriş yapalım
            if (!elementFound) {
                elements[elementsCount] = element;
                frequency[elementsCount] = 1;
                elementsCount++;
            }
        }

        // Frekansları yazdıralım
        for (int i = 0; i < elementsCount; i++) {
            System.out.println(elements[i] + " sayısı " + frequency[i] + " kere tekrar edildi.");
        }
    }
}