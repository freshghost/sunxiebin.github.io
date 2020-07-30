# 维度模型

## 背景

来自数据仓库领域，由大师 Ralph Kimball布道，其经典之作《The Data Warehouse Toolkit-The Complete Guid to Dimensional Modeling》.

## 模型

典型代表:星形模型、雪花模型 1. 事实表 表示发生的一个事实，这个事实有很多事件组成 2. 维度表 分析事实不同维度

## 步骤

1. 分析决策的业务过程
2. 选择粒度

   粒度决定的业务的明细程度，决定了数据量。数据量影响的性能

3. 设计维度表
4. 设计事实表

