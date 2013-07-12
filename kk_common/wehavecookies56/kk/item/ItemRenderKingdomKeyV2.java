/*package wehavecookies56.kk.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.client.model.ModelKingdomKey;
import wehavecookies56.kk.client.model.ModelKingdomKeyV2;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@SideOnly(Side.CLIENT)
public class ItemRenderKingdomKeyV2 implements IItemRenderer {

    protected ModelKingdomKeyV2 modelKingdomKey;

    public ItemRenderKingdomKeyV2() {

        modelKingdomKey = new ModelKingdomKeyV2();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {

        switch(type){
            case EQUIPPED: return true;
            default: return false;
        }
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {

        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {

        switch (type) {
         
            case EQUIPPED: {
                GL11.glPushMatrix();
                
                
                GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(45.0F, 0.0F, 0.0F, 1.0F);
                
                GL11.glTranslatef(0.0F, -0.8F, 0.0F);
                
                GL11.glScalef(1.2F, 1.2F, 1.2F);
                
                modelKingdomKey.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
                
                GL11.glPopMatrix();

            }
            default:
                break;
        }
    }
}
*/