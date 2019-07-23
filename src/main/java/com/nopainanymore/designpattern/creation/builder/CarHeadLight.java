package com.nopainanymore.designpattern.creation.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * design-pattern: CarHeadLight
 *
 * @author NoPainAnymore
 * @date 2019-07-23 20:55
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarHeadLight {

    private String lightColor;

    private String lightSize;

}
