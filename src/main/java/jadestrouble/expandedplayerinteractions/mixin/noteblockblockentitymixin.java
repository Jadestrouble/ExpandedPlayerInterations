package jadestrouble.expandedplayerinteractions.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.NoteBlockBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

@Mixin({NoteBlockBlockEntity.class})
public class noteblockblockentitymixin {
    @Inject(method = "playNote", at = @At("???"))
    private addNewInstruments(){
        if (var5 == Material.CLAY) {
            var6 = 5;
            //Flute Sound
        }
        if (var5 == Block.GLOWSTONE) {
            var6 = 6;
            //Probably need to decouple Glowstone from Stone Group.
            //Pling Sound
        }
        if (var5 == Material.PUMPKIN) {
            var6 = 7;
            //Didgeridoo Sound
        }
        if (var5 == Block.SOUL_SAND) {
            var6 = 8;
            //Cow Bell Sound
        }
        if (var5 == Block.IRON_BLOCK) {
            var6 = 9;
            //Metal Xylophone Sound
        }
        if (var5 == Block.GOLD_BLOCK) {
            var6 = 10;
            //Bell Sound
        }
        if (var5 == Material.WOOl) {
            var6 = 11;
            //Guitar Sound
        }
    }
}