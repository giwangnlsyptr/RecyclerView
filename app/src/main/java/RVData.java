import com.example.giwangnuelsyaputri.cobarecyclerview.R;

import java.util.ArrayList;

public class RVData {
    private static String[] title = new String[]{"Jennie Blackpink", "Jisoo Blackpink", "Rose Blackpink", "Lisa Blackpink"};


    private static int[] thumbnail = new
            int[]{R.drawable.jennie_bp, R.drawable.jisoo_bp, R.drawable.rose_bp, R.drawable.lisa_bp};

    public static ArrayList<RVModel> getListData() {
        RVModel rvModel = null;
        ArrayList<RVModel> list = new ArrayList<>();
        for (int i = 0; i < title.length; i++) {
            rvModel = new RVModel();
            rvModel.setLogo(thumbnail[i]);
            rvModel.setName(title[i]);
            list.add(rvModel);
        }
        return list;
    }
}


