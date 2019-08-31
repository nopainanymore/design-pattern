package com.nopainanymore.designpattern.constructure.decorator;

/**
 * design-pattern: PancakeRawMaterial
 *
 * @author nopainanymore
 * @version 2019-07-22 21:48
 */
public abstract class PancakeRawMaterial implements RawMaterial {

    protected RawMaterial rawMaterial;

    public PancakeRawMaterial(RawMaterial rawMaterial) {
        this.rawMaterial = rawMaterial;
    }

}
