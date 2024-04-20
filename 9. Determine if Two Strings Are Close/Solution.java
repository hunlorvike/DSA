class Solution {
    public boolean closeStrings(String w1, String w2) {
        if(w1.length() != w2.length()) return false;

        int[] c1 = new int[26];
        int[] c2 = new int[26];

        for(int i = 0; i < w1.length(); i++) {
            c1[w1.charAt(i) - 'a']++;
            c2[w2.charAt(i) - 'a']++;
        }

          for(int i = 0; i < 26; i++) {
            if((c1[i] > 0 && c2[i] == 0) || (c1[i] == 0 && c2[i] > 0)) {
                return false;
            }
        }

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }
}
/*
- w1.charAt(i) - 'a' được sử dụng để chuyển đổi một ký tự từ chuỗi w1 thành một số nguyên. Cụ thể, nó chuyển đổi một ký tự chữ cái thành một chỉ số tương ứng trong mảng c1.

- Ở đây, 'a' là một ký tự Unicode và khi chúng ta trừ đi 'a' từ một ký tự chữ cái, chúng ta sẽ nhận được một số nguyên từ 0 đến 25 tương ứng với vị trí của ký tự đó trong bảng chữ cái (với ‘a’ tương ứng với 0, ‘b’ tương ứng với 1, v.v.).

- Ví dụ, nếu w1.charAt(i) là 'c', thì 'c' - 'a' sẽ cho ra kết quả là 2, tương ứng với vị trí của ‘c’ trong bảng chữ cái.

=> Đếm số lần ký tự xuất hiện
 */