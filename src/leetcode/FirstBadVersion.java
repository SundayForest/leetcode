package leetcode;

/**
 * @author sunday
 * @create 2022 --- 10 --- 29 --- 19:44
 */
public class FirstBadVersion {
//    你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。
//    由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。
//
//假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
//
//你可以通过调用bool isBadVersion(version)接口来判断版本号 version
// 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。
//
//来源：力扣（LeetCode）
//链接：https://leetcode.cn/problems/first-bad-version
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。


//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!二分法为了防止溢出，求中间应该使用下面的表达式
//    point = low +  (high-low) / 2;
    public static void main(String[] args) {
        firstBadVersion(3);
    }
    public static int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        int point = 0;
        if(n <= 0){
            return 0;
        }
        while(true){
            point = low +  (high-low) / 2;
            if(isBadVersion(point)){
                if(!isBadVersion(point-1)){
                    return point;
                }
                high = point;
            }else{
                if(isBadVersion(point+1)){
                    return point+1;
                }
                low = point;
            }
        }
    }
    public static Boolean isBadVersion(int n){
        return n >= 3;
    }
}
