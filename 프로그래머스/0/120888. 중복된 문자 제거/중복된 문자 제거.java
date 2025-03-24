class Solution {
	public String solution(String my_string) {
		String[] arr = my_string.split("");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].equals(arr[i])) {
					arr[j] = "";
				}
			}
		}
		return String.join("", arr);
	}
}
