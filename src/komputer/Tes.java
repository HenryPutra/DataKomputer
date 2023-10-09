package komputer;

import javax.swing.JOptionPane;

/**
 *
 * @author hp5cd
 */
public class Tes {
    public static void main(String[] args) {
        DataKomputer data = new DataKomputer();
        do {
            int p = data.pilihanMenu();
            switch (p) {
                case AppInterface.ADD_DATA_KOMPUTER -> {
                    data.add();
                }
                case AppInterface.SEARCH_BY_BRAND -> {
                    String key = data.keyword("brand");
                    Komputer k = data.searchByBrand(key);
                    data.viewData(k);
                }
                case AppInterface.SEARCH_BY_MODEL -> {
                    String key = data.keyword("model");
                    Komputer k = data.searchByModel(key);
                    data.viewData(k);
                }
                case AppInterface.EXIT -> {
                    data.exit();
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Pilihan salah!");
                }
            }
        } while (true);
    }
}

    

