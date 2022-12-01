package com.fibo.rule.server.dao.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@TableName("t_engine_node")
public class EngineNode {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Integer engineId;
    
    private String nodeName;

    private Integer nodeType;

    private String preNodes;
    
    private String nextNodes;

    private String nodeX;

    private String nodeY;

    private String fullClassName;

    private String className;

    private Integer status;

    private LocalDateTime createTime;
    
    private Integer createUser;

    private LocalDateTime updateTime;

    private Integer updateUser;

    private Integer delFlag;
}
