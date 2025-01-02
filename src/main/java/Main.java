package level2;


public class level2 {
	//1
	public class MergeSortedLists {
	    public static int[] mergeSortedLists(int[] list1, int[] list2) {
	        int len1 = list1.length;
	        int len2 = list2.length;
	        int[] result = new int[len1 + len2];
	        int i = 0, j = 0, k = 0;

	        while (i < len1 && j < len2) {
	            if (list1[i] <= list2[j]) {
	                result[k++] = list1[i++];
	            } else {
	                result[k++] = list2[j++];
	            }
	        }

	        while (i < len1) {
	            result[k++] = list1[i++];
	        }
	        while (j < len2) {
	            result[k++] = list2[j++];
	        }

	        return result;
	    }
	}
	//2
	public class SelectionSort {
	    public static int[] selectionSort(int[] list) {
	        int n = list.length;
	        for (int i = 0; i < n; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (list[j] < list[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            int temp = list[i];
	            list[i] = list[minIndex];
	            list[minIndex] = temp;
	        }
	        return list;
	    }
	}
	//3
	public class SumOfDistances {
	    public static int sumOfDistances(int[] list, int value) {
	        int sum = 0;
	        int count = 0;
	        int len = list.length;	        
	        for (int i = 0; i < len; i++) {
	            if (list[i] == value) {
	                sum += Math.min(i, len - 1 - i);
	                count++;
	            }
	        }	        
	        if (count == 0) {
	            return -1;
	        }
	        
	        return sum;
	    }
	    //4
	    public class UniqueElements {
	        public static boolean areAllElementsUnique(int[] list) {
	            for (int i = 0; i < list.length; i++) {
	                for (int j = i + 1; j < list.length; j++) {
	                    if (list[i] == list[j]) {
	                        return false; e
	                    }
	                }
	            }
	            return true; 
	        }
	    }
	    //5
	    public class RemoveDuplicates {
	        public static int[] removeDuplicates(int[] list) {
	            int n = list.length;
	            if (n == 0) {
	                return new int[0];  
	            }

	            int uniqueIndex = 0;  

	            for (int i = 1; i < n; i++) {
	                boolean isDuplicate = false;
	                for (int j = 0; j < uniqueIndex; j++) {
	                    if (list[i] == list[j]) {  
	                        isDuplicate = true;
	                        break;
	                    }
	                }

	                if (!isDuplicate) {
	                    uniqueIndex++;
	                    list[uniqueIndex] = list[i];
	                }
	            }

	            int[] result = new int[uniqueIndex + 1];
	            for (int i = 0; i <= uniqueIndex; i++) {
	                result[i] = list[i];
	            }

	            return result;
	        }
	    }
}
}
