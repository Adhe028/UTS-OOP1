/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_OOP1;

import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author Adhe
 */
class Operasi {
    private static List<Data> listData = new LinkedList<Data>();

    public static void TambahData(Data data) {
        listData.add(data);
    }

    public static void UbahData(Data data, int idx) {
        listData.set(idx, data);
    }

    public static void HapusData(int idx) {
        listData.remove(idx);
    }

    public static List<Data> getListData() { return listData; }


}
