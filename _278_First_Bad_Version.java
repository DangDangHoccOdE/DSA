
public class _278_First_Bad_Version {
        public int firstBadVersion(int n) {
            int l=1;
            int r=n;
            int k=0;

            while (r>l){
                k = (r+l)/2;

                if(isBadVersion(k)){
                    return k;
                }else if(!isBadVersion(k)){
                    l=k+1;
                    r=k-1;
                }
            }
            return k==0?k+1:k;
        }

    public boolean isBadVersion(int version) {
        return false;
    }
}
