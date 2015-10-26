import java.util.*;

public class TestSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
		System.out.println(nums);
		System.out.println(Collections.max(nums));
		System.out.println(Collections.min(nums));
		// 将nums中的所有0使用1来代替
		Collections.replaceAll(nums, 0, 1);
		System.out.println(nums);
		System.out.println(Collections.frequency(nums, 1));
		System.out.println(Collections.frequency(nums, 5));
        Collections.sort(nums);
        System.out.println(nums);
        System.out.println(Collections.binarySearch(nums, 2));
        
	}

}
