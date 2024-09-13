public class _88_Merge_Sorted_Array {
    public static void merge(int[] a, int m, int[] b, int n) {
        for(int ai:b){
            chenPhanTuVaoMang(ai,a,m);
            m++;
        }
    }

    public static void chenPhanTuVaoMang(int ai,int[] a,int m){
        boolean timDuocK = false;
        for(int i=0 ; i<m ; i++){
            if(a[i] > ai){
                timDuocK = true;

                for(int j=m-1 ; j>=i ; j--){
                    a[j+1] = a[j];
                }
                a[i] = ai;
                break;
            }
        }

        if(!timDuocK){
            a[m] = ai;
        }
    }

    public static void main(String[] args) {
        int[] a= {1,2,3,0,0,0};
        int[] b ={2,5,6};

        merge(a,3,b,3);
        for(int i:a){
            System.out.println(i);
        }
    }
}

/*  - Quy về bài toán thêm từng phần tử nums2 vào nums1
    - Tìm phần tử đầu tiên trong nums1 lớn hơn giá tị nums2
    - Nếu tìm được , đẩy lùi các giá trị về sau rồi chèn
    - Nếu không tìm được thì cho a[m] = ai
 */