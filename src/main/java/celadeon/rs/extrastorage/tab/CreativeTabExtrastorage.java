package celadeon.rs.extrastorage.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by bdani on 2017. 03. 27..
 */
public class CreativeTabExtrastorage extends CreativeTabs
{
    public CreativeTabExtrastorage(int index, String label)
    {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.COOKIE;
    }
}
