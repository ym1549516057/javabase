package com.ym.javabase.XMLAnalysis;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XStreamAlias("d")
public class City {

    @XStreamAsAttribute
    @XStreamAlias("d1")
    private String cityId;

    @XStreamAsAttribute
    @XStreamAlias("d2")
    private String cityName;

    @XStreamAsAttribute
    @XStreamAlias("d3")
    private String cityCode;

    @XStreamAsAttribute
    @XStreamAlias("d4")
    private String province;
}