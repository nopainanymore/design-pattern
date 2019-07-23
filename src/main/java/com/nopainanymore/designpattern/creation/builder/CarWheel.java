package com.nopainanymore.designpattern.creation.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * design-pattern: CarWheel
 *
 * @author NoPainAnymore
 * @date 2019-07-23 20:54
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarWheel {

    private String wheelSize;

    private String wheelType;
}
