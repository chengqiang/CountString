package day01;
/**
 * 有一个长阶梯，每一步上2阶,最后剩1阶；
 * 若每一步上3阶，最后剩2阶；
 * 若每一步上5阶，最后剩4阶；
 * 若每一步上6阶，最后剩5阶；
 * 若每一步上7阶，最后一阶也不剩
 * 请问该阶梯至少有多少阶
 * @author Administrator
 *
 */
public class LadderCount {
	public int count(){
		int i=7;
		while(true){
			++i;
			if((1%2==1)&&(i%3==2)&&(i%5==4)&&(i%6==5)&&(i%7==0)){
				break;
			}
		}
		System.out.println("该阶梯至少有"+i+"阶");
		return i;
	}
}
