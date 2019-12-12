package xmu.ddao.domain.standard;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
public class DefaultPieceFreight extends DefaultPieceFreightPo {
    private List<Integer> regionIds;

    //TODO: 加解析
}