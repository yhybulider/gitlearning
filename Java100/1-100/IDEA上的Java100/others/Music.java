package music.qiti;

import music.butongleixing.XiaoTiqin;
import music.butongleixing.erhu;

public class Music {
    /**
     * @param i
     * 是一个二胡类型的变量
     * 时间是
     * date 2020/1/1
     */
    public static void tune(erhu i){
        i.play(Note.C_SHARP);

    }
    protected void baoHu(int i){
        i = i + 1;

    }
    public static void main(String[] args){
        XiaoTiqin a = new XiaoTiqin();
        tune(a);
    }
}
