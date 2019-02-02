
DROP TABLE IF EXISTS tb_config;

CREATE TABLE IF NOT EXISTS tb_config(  
  `configId` INT(11) NOT NULL AUTO_INCREMENT,
  `tableName` VARCHAR(64) NOT NULL COMMENT '表名称',
  `tableNameCN` VARCHAR(64) NOT NULL COMMENT '表中文名',
  `createBy` VARCHAR(64) NOT NULL DEFAULT '0' COMMENT '创建人',
  `createTime` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateBy` VARCHAR(64) NOT NULL DEFAULT '0' COMMENT '更新人',
  `updateTime` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `description` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '说明',
  `mark` INT(11) NOT NULL DEFAULT 0 COMMENT '是否有效：0有效 1失效',
  PRIMARY KEY (`configId`)
)
COMMENT='表配置';

DROP TABLE IF EXISTS tb_column_config;

CREATE TABLE IF NOT EXISTS tb_column_config(  
  `columnConfigId` INT(11) NOT NULL AUTO_INCREMENT,
  `configId` INT(11) NOT NULL DEFAULT 0 COMMENT '表编号',
  `columnName` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '字段名定义',
  `columnNameCN` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '字段中文名',
  `columnLength` INT(11) NOT NULL DEFAULT 64 COMMENT '字段长度:64；128；256；512；3000',
  `columnType` INT(11) NOT NULL DEFAULT 0 COMMENT '0:普通 1：主键 2：索引',
  `createBy` VARCHAR(64) NOT NULL DEFAULT '0' COMMENT '创建人',
  `createTime` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateBy` VARCHAR(64) NOT NULL DEFAULT '0' COMMENT '更新人',
  `updateTime` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `description` VARCHAR(128) NOT NULL DEFAULT '' COMMENT '说明',
  `mark` INT(11) NOT NULL DEFAULT 0 COMMENT '是否有效：0有效 1失效',
  PRIMARY KEY (`columnConfigId`)
)
COMMENT='字段表';

DROP TABLE IF EXISTS tb_test_table;

INSERT INTO `tb_config` (`configId`, `tableName`, `tableNameCN`) VALUES('1','tb_test_table','测试动态生成表');

INSERT INTO `tb_column_config` (`columnConfigId`,`configId`, `columnName`, `columnNameCN`, `columnLength`, `columnType`) VALUES('1','1','CSZD1','测试字段1','64','1');
INSERT INTO `tb_column_config` (`columnConfigId`,`configId`, `columnName`, `columnNameCN`, `columnLength`, `columnType`) VALUES('2','1','CSZD2','测试字段2','64','2');
INSERT INTO `tb_column_config` (`columnConfigId`,`configId`, `columnName`, `columnNameCN`, `columnLength`, `columnType`) VALUES('3','1','CSZD3','测试字段3','64','0');
INSERT INTO `tb_column_config` (`columnConfigId`,`configId`, `columnName`, `columnNameCN`, `columnLength`, `columnType`) VALUES('4','1','CSZD4','测试字段4','64','0');