package jadestrouble.expandedplayerinteractions.mixin;

import net.minecraft.block.NoteBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

@Mixin({NoteBlock.class})
public class noteblockmixin {
    @Inject(method = "onBlockAction", at = @At("???"))
    private defineNewInstruments(){
            if (data1 == 5) {
            var8 = "flute";
        }
            if (data1 == 6) {
            var8 = "pling";
        }
            if (data1 == 7) {
            var8 = "didgeridoo";
        }
            if (data1 == 8) {
            var8 = "cowbell";
        }
            if (data1 == 9) {
            var8 = "xylophone";
        }
            if (data1 == 10) {
            var8 = "bell";
        }
            if (data1 == 11) {
            var8 = "guitar";
        }
    }
}
