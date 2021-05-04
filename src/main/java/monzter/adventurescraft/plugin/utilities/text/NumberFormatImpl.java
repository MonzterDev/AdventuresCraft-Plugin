package monzter.adventurescraft.plugin.utilities.text;

import java.text.DecimalFormat;

public class NumberFormatImpl implements NumberFormat {
    @Override
    public String numberFormat(int number) {
        DecimalFormat format = new DecimalFormat("###,###,###");
        return format.format(number);
    }
    @Override
    public String numberFormat(double number) {
        DecimalFormat format = new DecimalFormat("###,###,###");
        return format.format(number);
    }
}
