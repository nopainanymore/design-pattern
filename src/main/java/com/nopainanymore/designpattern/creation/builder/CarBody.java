package com.nopainanymore.designpattern.creation.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * design-pattern: CarBody
 *
 * @author NoPainAnymore
 * @date 2019-07-23 20:54
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarBody {

    private String bodyColor;

    private String bodySize;

}
