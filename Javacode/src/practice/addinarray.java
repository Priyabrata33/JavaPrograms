public List<Integer> addToArrayForm(int[] num, int k){
        int x=0;
        for(int i=0;i<num.length;i++){
        x=x*10+num[i];
        }
        int sum=x+k;

        List<Integer> ans=new ArrayList<>();
        int i=0;
        int rem=0;
        while(sum>0){
        rem=sum%10;
        ans.add(rem);
        sum=sum/10;

        }
        Collections.reverse(ans);
        return ans;

        }}