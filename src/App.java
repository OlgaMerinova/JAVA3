import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

// 1 Объявить два списка список ArrayList, в каждый добавить по 20 случайных чисел. Удалить из первого списка элементы отсутствующие во втором списке. Отсортировать первый список методом sort класса Collections.
// 2 * Отсортировать второй список методом sort списка и компаратором по уменьшению.
// 3 **Отсортировать первый список пузырьковой сортировкой самостоятельно, без использования доп методов и классов.




public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer>arrayList1 = new ArrayList<>();
        ArrayList<Integer>arrayList2 = new ArrayList<>();
        Random rnd = new Random();
        for(int i=0; i<20; i++) {
            arrayList1.add(rnd.nextInt(0, 30));  
            }
        for(int j=0; j<20; j++) {
            arrayList2.add(rnd.nextInt(0, 30));
        }

        System.out.print(arrayList1);
        System.out.print(arrayList2);

        arrayList1.retainAll(arrayList2);
        System.out.print(arrayList1);

        arrayList2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1 - integer;
            }
        });
        System.out.print(arrayList2);
        
    }
    
}
