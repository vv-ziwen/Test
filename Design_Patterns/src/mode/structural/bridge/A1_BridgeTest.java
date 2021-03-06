/*
 * COPYRIGHT. ShenZhen JiMi Technology Co., Ltd. 2021.
 * ALL RIGHTS RESERVED.
 *
 * No part of this publication may be reproduced, stored in a retrieval system, or transmitted,
 * on any form or by any means, electronic, mechanical, photocopying, recording,
 * or otherwise, without the prior written permission of ShenZhen JiMi Network Technology Co., Ltd.
 *
 * Amendment History:
 *
 * Date                   By              Description
 * -------------------    -----------     -------------------------------------------
 * 2021-02-26             liwen   Create the class
 * http://www.jimilab.com/
 */


package mode.structural.bridge;

/**
 * 结构模式之桥接模式
 * @author liwen
 * @date 2021-02-26
 * @since 1.0.0
 */
public class A1_BridgeTest {

    public static void main(String[] args) {
        Bridge bridge = new MyBridge();
        bridge.setSourceable(new Source01());
        bridge.m1();

        bridge.setSourceable(new Source02());
        bridge.m1();

    }
}
