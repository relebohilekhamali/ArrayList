//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        String[] list = {"the", "quick", "brown", "fox", "ate", "my", "chickens"};
        longest(list); 
    }

    public static void longest(String[] list) {
        if (list.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        String longestList = list[0];

        for (String lists : list) {
            if (lists.length() > longestList.length()) {
                longestList = lists;
            }
        }

        System.out.println(longestList);
    }
}
