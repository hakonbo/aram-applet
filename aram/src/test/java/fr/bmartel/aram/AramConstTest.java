/*
 * The MIT License (MIT)
 * <p/>
 * Copyright (c) 2017 Bertrand Martel
 * <p/>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p/>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p/>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package fr.bmartel.aram;

import fr.bmartel.aram.util.TestUtils;

/**
 * Test constants.
 *
 * @author Bertrand Martel
 */
public class AramConstTest {

    public final static byte[] AID = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x06, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10};
    public final static byte[] HASH = new byte[]{
            0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x06, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14};
    public final static byte[] RULE = new byte[]{(byte) 0xD0, 0x08, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08};

    public final static byte[] VALID_HASH_REF_DO = TestUtils.concatByteArray(new byte[]{(byte) 0xC1, (byte) 0x14}, HASH);
    public final static byte[] VALID_AID_REF_DO = TestUtils.concatByteArray(new byte[]{(byte) 0x4F, (byte) 0x10}, AID);
    public final static byte[] VALID_REF_DO = TestUtils.concatByteArray(new byte[]{(byte) 0xE1,
            (byte) (VALID_HASH_REF_DO.length + VALID_AID_REF_DO.length)}, VALID_AID_REF_DO, VALID_HASH_REF_DO);
    public final static byte[] VALID_AR_DO = TestUtils.concatByteArray(new byte[]{(byte) 0xE3, 0x0A}, RULE);

    public final static byte[] CMD_WRONG_CLA = new byte[]{(byte) 0x70, AccessRuleMaster.INS_GET_DATA, 0x00, 0x00};
    public final static byte[] CMD_WRONG_INS = new byte[]{(byte) 0x80, (byte) 0xCB, 0x00, 0x00};
    public final static byte[] CMD_WRONG_P1P2_GET_DATA = new byte[]{(byte) 0x80, AccessRuleMaster.INS_GET_DATA, 0x01, 0x02};
    public final static byte[] CMD_WRONG_P1P2_STORE_DATA = new byte[]{(byte) 0x80, AccessRuleMaster.INS_STORE_DATA, 0x01, 0x02};

    public final static byte[] AID_REF_DO = new byte[]{(byte) 0x4F, (byte) 0x10, (byte) 0xD2, (byte) 0x76, (byte) 0x00, (byte) 0x01, (byte) 0x18, (byte) 0x00, (byte) 0x02, (byte) 0xFF, (byte) 0x49, (byte) 0x50, (byte) 0x25, (byte) 0x89, (byte) 0xC0, (byte) 0x01, (byte) 0x9B, (byte) 0x01};
    public final static byte[] REF_DO = new byte[]{
            //E1 = REF-DO
            (byte) 0xE1, (byte) 0x28,
            // 4F = AID-REF-DO
            (byte) 0x4F, (byte) 0x10, (byte) 0xD2, (byte) 0x76, (byte) 0x00, (byte) 0x01, (byte) 0x18, (byte) 0x00, (byte) 0x02, (byte) 0xFF, (byte) 0x49, (byte) 0x50, (byte) 0x25, (byte) 0x89, (byte) 0xC0, (byte) 0x01, (byte) 0x9B, (byte) 0x01,
            // C1 = HASH-REF-DO
            (byte) 0xC1, (byte) 0x14, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x06, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14,
    };

    public final static byte[] CMD_STORE_HEADER = new byte[]{(byte) 0x80, AccessRuleMaster.INS_STORE_DATA, (byte) 0x90, 0x00};

    public final static byte[] VALID_REF_AR_DO = new byte[]{
            //E2 = REF-AR-DO
            (byte) 0xE2, (byte) 0x2F,
            //E1 = REF-DO
            (byte) 0xE1, (byte) 0x28,
            // 4F = AID-REF-DO
            (byte) 0x4F, (byte) 0x10, (byte) 0xD2, (byte) 0x76, (byte) 0x00, (byte) 0x01, (byte) 0x18, (byte) 0x00, (byte) 0x02, (byte) 0xFF, (byte) 0x49, (byte) 0x50, (byte) 0x25, (byte) 0x89, (byte) 0xC0, (byte) 0x01, (byte) 0x9B, (byte) 0x01,
            // C1 = HASH-REF-DO
            (byte) 0xC1, (byte) 0x14, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x06, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14,
            // E3 = AR-DO
            (byte) 0xE3, (byte) 0x03, (byte) 0xD0, (byte) 0x01, (byte) 0x01
    };

    public final static byte[] VALID_REF_AR_DO_EMPTY = new byte[]{
            //E2 = REF-AR-DO
            (byte) 0xE2, (byte) 0x2E,
            //E1 = REF-DO
            (byte) 0xE1, (byte) 0x28,
            // 4F = AID-REF-DO
            (byte) 0x4F, (byte) 0x10, (byte) 0xD2, (byte) 0x76, (byte) 0x00, (byte) 0x01, (byte) 0x18, (byte) 0x00, (byte) 0x02, (byte) 0xFF, (byte) 0x49, (byte) 0x50, (byte) 0x25, (byte) 0x89, (byte) 0xC0, (byte) 0x01, (byte) 0x9B, (byte) 0x01,
            // C1 = HASH-REF-DO
            (byte) 0xC1, (byte) 0x14, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x06, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14,
            // E3 = AR-DO
            (byte) 0xE3, (byte) 0x02, (byte) 0xD0, (byte) 0x00
    };

    public final static byte[] VALID_REF_AR_DO_CLONE = new byte[]{
            //E2 = REF-AR-DO
            (byte) 0xE2, (byte) 0x2F,
            //E1 = REF-DO
            (byte) 0xE1, (byte) 0x28,
            // 4F = AID-REF-DO
            (byte) 0x4F, (byte) 0x10, (byte) 0xD2, (byte) 0x76, (byte) 0x00, (byte) 0x01, (byte) 0x18, (byte) 0x00, (byte) 0x02, (byte) 0xFF, (byte) 0x49, (byte) 0x50, (byte) 0x25, (byte) 0x89, (byte) 0xC0, (byte) 0x01, (byte) 0x9B, (byte) 0x01,
            // C1 = HASH-REF-DO
            (byte) 0xC1, (byte) 0x14, 0x02, 0x02, 0x03, 0x04, 0x05, 0x06, 0x06, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14,
            // E3 = AR-DO
            (byte) 0xE3, (byte) 0x03, (byte) 0xD0, (byte) 0x01, (byte) 0x01
    };

    public final static byte[] VALID_REF_AR_DO1 = new byte[]{
            //E2 = REF-AR-DO
            (byte) 0xE2, (byte) 0x2F,
            //E1 = REF-DO
            (byte) 0xE1, (byte) 0x28,
            // 4F = AID-REF-DO
            (byte) 0x4F, (byte) 0x10, (byte) 0xD3, (byte) 0x76, (byte) 0x00, (byte) 0x01, (byte) 0x18, (byte) 0x00, (byte) 0x02, (byte) 0xFF, (byte) 0x49, (byte) 0x50, (byte) 0x25, (byte) 0x89, (byte) 0xC0, (byte) 0x01, (byte) 0x9B, (byte) 0x01,
            // C1 = HASH-REF-DO
            (byte) 0xC1, (byte) 0x14, 0x02, 0x02, 0x03, 0x04, 0x05, 0x06, 0x06, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14,
            // E3 = AR-DO
            (byte) 0xE3, (byte) 0x03, (byte) 0xD0, (byte) 0x01, (byte) 0x01
    };

    public final static byte[] VALID_REF_AR_DO2 = new byte[]{
            //E2 = REF-AR-DO
            (byte) 0xE2, (byte) 0x2F,
            //E1 = REF-DO
            (byte) 0xE1, (byte) 0x28,
            // 4F = AID-REF-DO
            (byte) 0x4F, (byte) 0x10, (byte) 0xD4, (byte) 0x76, (byte) 0x00, (byte) 0x01, (byte) 0x18, (byte) 0x00, (byte) 0x02, (byte) 0xFF, (byte) 0x49, (byte) 0x50, (byte) 0x25, (byte) 0x89, (byte) 0xC0, (byte) 0x01, (byte) 0x9B, (byte) 0x01,
            // C1 = HASH-REF-DO
            (byte) 0xC1, (byte) 0x14, 0x03, 0x02, 0x03, 0x04, 0x05, 0x06, 0x06, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14,
            // E3 = AR-DO
            (byte) 0xE3, (byte) 0x03, (byte) 0xD0, (byte) 0x01, (byte) 0x01
    };

    public final static byte[] VALID_REF_AR_DO3 = new byte[]{
            //E2 = REF-AR-DO
            (byte) 0xE2, (byte) 0x2F,
            //E1 = REF-DO
            (byte) 0xE1, (byte) 0x28,
            // 4F = AID-REF-DO
            (byte) 0x4F, (byte) 0x10, (byte) 0xD5, (byte) 0x76, (byte) 0x00, (byte) 0x01, (byte) 0x18, (byte) 0x00, (byte) 0x02, (byte) 0xFF, (byte) 0x49, (byte) 0x50, (byte) 0x25, (byte) 0x89, (byte) 0xC0, (byte) 0x01, (byte) 0x9B, (byte) 0x01,
            // C1 = HASH-REF-DO
            (byte) 0xC1, (byte) 0x14, 0x04, 0x02, 0x03, 0x04, 0x05, 0x06, 0x06, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14,
            // E3 = AR-DO
            (byte) 0xE3, (byte) 0x03, (byte) 0xD0, (byte) 0x01, (byte) 0x01
    };

    public final static byte[] VALID_REF_AR_DO4 = new byte[]{
            //E2 = REF-AR-DO
            (byte) 0xE2, (byte) 0x2F,
            //E1 = REF-DO
            (byte) 0xE1, (byte) 0x28,
            // 4F = AID-REF-DO
            (byte) 0x4F, (byte) 0x10, (byte) 0xD6, (byte) 0x76, (byte) 0x00, (byte) 0x01, (byte) 0x18, (byte) 0x00, (byte) 0x02, (byte) 0xFF, (byte) 0x49, (byte) 0x50, (byte) 0x25, (byte) 0x89, (byte) 0xC0, (byte) 0x01, (byte) 0x9B, (byte) 0x01,
            // C1 = HASH-REF-DO
            (byte) 0xC1, (byte) 0x14, 0x05, 0x02, 0x03, 0x04, 0x05, 0x06, 0x06, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14,
            // E3 = AR-DO
            (byte) 0xE3, (byte) 0x03, (byte) 0xD0, (byte) 0x01, (byte) 0x01
    };

    public final static byte[] VALID_REF_AR_DO5 = new byte[]{
            //E2 = REF-AR-DO
            (byte) 0xE2, (byte) 0x2F,
            //E1 = REF-DO
            (byte) 0xE1, (byte) 0x28,
            // 4F = AID-REF-DO
            (byte) 0x4F, (byte) 0x10, (byte) 0xD7, (byte) 0x76, (byte) 0x00, (byte) 0x01, (byte) 0x18, (byte) 0x00, (byte) 0x02, (byte) 0xFF, (byte) 0x49, (byte) 0x50, (byte) 0x25, (byte) 0x89, (byte) 0xC0, (byte) 0x01, (byte) 0x9B, (byte) 0x01,
            // C1 = HASH-REF-DO
            (byte) 0xC1, (byte) 0x14, 0x06, 0x02, 0x03, 0x04, 0x05, 0x06, 0x06, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14,
            // E3 = AR-DO
            (byte) 0xE3, (byte) 0x03, (byte) 0xD0, (byte) 0x01, (byte) 0x01
    };

    public final static byte[] VALID_REF_AR_DO6 = new byte[]{
            //E2 = REF-AR-DO
            (byte) 0xE2, (byte) 0x2F,
            //E1 = REF-DO
            (byte) 0xE1, (byte) 0x28,
            // 4F = AID-REF-DO
            (byte) 0x4F, (byte) 0x10, (byte) 0xD8, (byte) 0x76, (byte) 0x00, (byte) 0x01, (byte) 0x18, (byte) 0x00, (byte) 0x02, (byte) 0xFF, (byte) 0x49, (byte) 0x50, (byte) 0x25, (byte) 0x89, (byte) 0xC0, (byte) 0x01, (byte) 0x9B, (byte) 0x01,
            // C1 = HASH-REF-DO
            (byte) 0xC1, (byte) 0x14, 0x07, 0x02, 0x03, 0x04, 0x05, 0x06, 0x06, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14,
            // E3 = AR-DO
            (byte) 0xE3, (byte) 0x03, (byte) 0xD0, (byte) 0x01, (byte) 0x01
    };

    public final static byte[] VALID_REF_AR_DO7 = new byte[]{
            //E2 = REF-AR-DO
            (byte) 0xE2, (byte) 0x2F,
            //E1 = REF-DO
            (byte) 0xE1, (byte) 0x28,
            // 4F = AID-REF-DO
            (byte) 0x4F, (byte) 0x10, (byte) 0xD9, (byte) 0x76, (byte) 0x00, (byte) 0x01, (byte) 0x18, (byte) 0x00, (byte) 0x02, (byte) 0xFF, (byte) 0x49, (byte) 0x50, (byte) 0x25, (byte) 0x89, (byte) 0xC0, (byte) 0x01, (byte) 0x9B, (byte) 0x01,
            // C1 = HASH-REF-DO
            (byte) 0xC1, (byte) 0x14, 0x08, 0x02, 0x03, 0x04, 0x05, 0x06, 0x06, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14,
            // E3 = AR-DO
            (byte) 0xE3, (byte) 0x03, (byte) 0xD0, (byte) 0x01, (byte) 0x01
    };

    public final static byte[] VALID_REF_AR_DO8 = new byte[]{
            //E2 = REF-AR-DO
            (byte) 0xE2, (byte) 0x2F,
            //E1 = REF-DO
            (byte) 0xE1, (byte) 0x28,
            // 4F = AID-REF-DO
            (byte) 0x4F, (byte) 0x10, (byte) 0xDA, (byte) 0x76, (byte) 0x00, (byte) 0x01, (byte) 0x18, (byte) 0x00, (byte) 0x02, (byte) 0xFF, (byte) 0x49, (byte) 0x50, (byte) 0x25, (byte) 0x89, (byte) 0xC0, (byte) 0x01, (byte) 0x9B, (byte) 0x01,
            // C1 = HASH-REF-DO
            (byte) 0xC1, (byte) 0x14, 0x09, 0x02, 0x03, 0x04, 0x05, 0x06, 0x06, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14,
            // E3 = AR-DO
            (byte) 0xE3, (byte) 0x03, (byte) 0xD0, (byte) 0x01, (byte) 0x01
    };

    public final static byte[] VALID_REF_AR_DO9 = new byte[]{
            //E2 = REF-AR-DO
            (byte) 0xE2, (byte) 0x2F,
            //E1 = REF-DO
            (byte) 0xE1, (byte) 0x28,
            // 4F = AID-REF-DO
            (byte) 0x4F, (byte) 0x10, (byte) 0xDB, (byte) 0x76, (byte) 0x00, (byte) 0x01, (byte) 0x18, (byte) 0x00, (byte) 0x02, (byte) 0xFF, (byte) 0x49, (byte) 0x50, (byte) 0x25, (byte) 0x89, (byte) 0xC0, (byte) 0x01, (byte) 0x9B, (byte) 0x01,
            // C1 = HASH-REF-DO
            (byte) 0xC1, (byte) 0x14, 0x0A, 0x02, 0x03, 0x04, 0x05, 0x06, 0x06, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14,
            // E3 = AR-DO
            (byte) 0xE3, (byte) 0x03, (byte) 0xD0, (byte) 0x01, (byte) 0x01
    };

    public final static byte[] VALID_REF_AR_DO10 = new byte[]{
            //E2 = REF-AR-DO
            (byte) 0xE2, (byte) 0x2F,
            //E1 = REF-DO
            (byte) 0xE1, (byte) 0x28,
            // 4F = AID-REF-DO
            (byte) 0x4F, (byte) 0x10, (byte) 0xDC, (byte) 0x76, (byte) 0x00, (byte) 0x01, (byte) 0x18, (byte) 0x00, (byte) 0x02, (byte) 0xFF, (byte) 0x49, (byte) 0x50, (byte) 0x25, (byte) 0x89, (byte) 0xC0, (byte) 0x01, (byte) 0x9B, (byte) 0x01,
            // C1 = HASH-REF-DO
            (byte) 0xC1, (byte) 0x14, 0x0B, 0x02, 0x03, 0x04, 0x05, 0x06, 0x06, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14,
            // E3 = AR-DO
            (byte) 0xE3, (byte) 0x03, (byte) 0xD0, (byte) 0x01, (byte) 0x01
    };

    public final static byte[] CMD_STORE_DATA_VALID = TestUtils.concatByteArray(new byte[]{
            //F0 = Command-Store-AR-DO
            (byte) 0xF0, (byte) VALID_REF_AR_DO.length
    }, VALID_REF_AR_DO);

    public final static byte[] RESPONSE_VALID = TestUtils.concatByteArray(new byte[]{
            (byte) 0xFF, (byte) 0x40, (byte) VALID_REF_AR_DO.length
    }, VALID_REF_AR_DO);

    public final static byte[] CMD_STORE_DATA_INVALID_CMD_STORE = new byte[]{
            //F0 = Command-Store-AR-DO INVALID
            (byte) 0xF3, (byte) 0x31,
            //E2 = REF-AR-DO
            (byte) 0xE2, (byte) 0x2F,
            //E1 = REF-DO
            (byte) 0xE1, (byte) 0x28,
            // 4F = AID-REF-DO
            (byte) 0x4F, (byte) 0x10, (byte) 0xD2, (byte) 0x76, (byte) 0x00, (byte) 0x01, (byte) 0x18, (byte) 0x00, (byte) 0x02, (byte) 0xFF, (byte) 0x49, (byte) 0x50, (byte) 0x25, (byte) 0x89, (byte) 0xC0, (byte) 0x01, (byte) 0x9B, (byte) 0x01,
            // C1 = HASH-REF-DO
            (byte) 0xC1, (byte) 0x14, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x06, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14,
            // E3 = AR-DO
            (byte) 0xE3, (byte) 0x03, (byte) 0xD0, (byte) 0x01, (byte) 0x01};

    public final static byte[] CMD_STORE_DATA_INVALID_REFARDO = new byte[]{
            //F0 = Command-Store-AR-DO
            (byte) 0xF0, (byte) 0x31,
            //E2 = REF-AR-DO INVALID
            (byte) 0xE3, (byte) 0x2F,
            //E1 = REF-DO
            (byte) 0xE1, (byte) 0x28,
            // 4F = AID-REF-DO
            (byte) 0x4F, (byte) 0x10, (byte) 0xD2, (byte) 0x76, (byte) 0x00, (byte) 0x01, (byte) 0x18, (byte) 0x00, (byte) 0x02, (byte) 0xFF, (byte) 0x49, (byte) 0x50, (byte) 0x25, (byte) 0x89, (byte) 0xC0, (byte) 0x01, (byte) 0x9B, (byte) 0x01,
            // C1 = HASH-REF-DO
            (byte) 0xC1, (byte) 0x14, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x06, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14,
            // E3 = AR-DO
            (byte) 0xE3, (byte) 0x03, (byte) 0xD0, (byte) 0x01, (byte) 0x01};

    public final static byte[] CMD_STORE_DATA_INVALID_REFDO = new byte[]{
            //F0 = Command-Store-AR-DO
            (byte) 0xF0, (byte) 0x31,
            //E2 = REF-AR-DO
            (byte) 0xE2, (byte) 0x2F,
            //E1 = REF-DO INVALID
            (byte) 0xE2, (byte) 0x28,
            // 4F = AID-REF-DO
            (byte) 0x4F, (byte) 0x10, (byte) 0xD2, (byte) 0x76, (byte) 0x00, (byte) 0x01, (byte) 0x18, (byte) 0x00, (byte) 0x02, (byte) 0xFF, (byte) 0x49, (byte) 0x50, (byte) 0x25, (byte) 0x89, (byte) 0xC0, (byte) 0x01, (byte) 0x9B, (byte) 0x01,
            // C1 = HASH-REF-DO
            (byte) 0xC1, (byte) 0x14, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x06, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14,
            // E3 = AR-DO
            (byte) 0xE3, (byte) 0x03, (byte) 0xD0, (byte) 0x01, (byte) 0x01};

    public final static byte[] CMD_STORE_DATA_INVALID_AIDREFDO = new byte[]{
            //F0 = Command-Store-AR-DO
            (byte) 0xF0, (byte) 0x31,
            //E2 = REF-AR-DO
            (byte) 0xE2, (byte) 0x2F,
            //E1 = REF-DO
            (byte) 0xE1, (byte) 0x28,
            // 4F = AID-REF-DO INVALID
            (byte) 0x4A, (byte) 0x10, (byte) 0xD2, (byte) 0x76, (byte) 0x00, (byte) 0x01, (byte) 0x18, (byte) 0x00, (byte) 0x02, (byte) 0xFF, (byte) 0x49, (byte) 0x50, (byte) 0x25, (byte) 0x89, (byte) 0xC0, (byte) 0x01, (byte) 0x9B, (byte) 0x01,
            // C1 = HASH-REF-DO
            (byte) 0xC1, (byte) 0x14, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x06, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14,
            // E3 = AR-DO
            (byte) 0xE3, (byte) 0x03, (byte) 0xD0, (byte) 0x01, (byte) 0x01};

    public final static byte[] CMD_STORE_DATA_INVALID_HASHREFDO = new byte[]{
            //F0 = Command-Store-AR-DO
            (byte) 0xF0, (byte) 0x31,
            //E2 = REF-AR-DO
            (byte) 0xE2, (byte) 0x2F,
            //E1 = REF-DO
            (byte) 0xE1, (byte) 0x28,
            // 4F = AID-REF-DO
            (byte) 0x4F, (byte) 0x10, (byte) 0xD2, (byte) 0x76, (byte) 0x00, (byte) 0x01, (byte) 0x18, (byte) 0x00, (byte) 0x02, (byte) 0xFF, (byte) 0x49, (byte) 0x50, (byte) 0x25, (byte) 0x89, (byte) 0xC0, (byte) 0x01, (byte) 0x9B, (byte) 0x01,
            // C1 = HASH-REF-DO INVALID
            (byte) 0xC2, (byte) 0x14, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x06, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14,
            // E3 = AR-DO
            (byte) 0xE3, (byte) 0x03, (byte) 0xD0, (byte) 0x01, (byte) 0x01};

    public final static byte[] CMD_STORE_DATA_INVALID_ARDO = new byte[]{
            //F0 = Command-Store-AR-DO
            (byte) 0xF0, (byte) 0x31,
            //E2 = REF-AR-DO
            (byte) 0xE2, (byte) 0x2F,
            //E1 = REF-DO
            (byte) 0xE1, (byte) 0x28,
            // 4F = AID-REF-DO
            (byte) 0x4F, (byte) 0x10, (byte) 0xD2, (byte) 0x76, (byte) 0x00, (byte) 0x01, (byte) 0x18, (byte) 0x00, (byte) 0x02, (byte) 0xFF, (byte) 0x49, (byte) 0x50, (byte) 0x25, (byte) 0x89, (byte) 0xC0, (byte) 0x01, (byte) 0x9B, (byte) 0x01,
            // C1 = HASH-REF-DO
            (byte) 0xC1, (byte) 0x14, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x06, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14,
            // E3 = AR-DO INVALID
            (byte) 0xE4, (byte) 0x03, (byte) 0xD0, (byte) 0x01, (byte) 0x01};

    public final static byte[] CMD_GET_ALL = new byte[]{(byte) 0x80, AccessRuleMaster.INS_GET_DATA, (byte) 0xFF, (byte) 0x40};
    public final static byte[] CMD_GET_NEXT = new byte[]{(byte) 0x80, AccessRuleMaster.INS_GET_DATA, (byte) 0xFF, (byte) 0x60};
    public final static byte[] CMD_GET_REFRESH_TAG = new byte[]{(byte) 0x80, AccessRuleMaster.INS_GET_DATA, (byte) 0xDF, (byte) 0x20};
    public final static byte[] CMD_GET_SPECIFIC = new byte[]{(byte) 0x80, AccessRuleMaster.INS_GET_DATA, (byte) 0xFF, (byte) 0x50};

    public final static byte[] CMD_GET_TMP = new byte[]{(byte) 0x80, AccessRuleMaster.INS_GET_DATA, (byte) 0xFF, (byte) 0x41};

    public final static byte[] GET_DATA_EMPTY_RESPONSE = new byte[]{(byte) 0xFF, (byte) 0x40, 0x00};

}