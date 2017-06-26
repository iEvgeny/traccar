package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class Gt06ProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Gt06Protocol());

        verifyNull(decoder, binary(
                "787805120099abec0d0a"));

        verifyNull(decoder, binary(
                "78780D01086471700328358100093F040D0A"));

        verifyNull(decoder, binary(
                "787811010863586038760942a0010000010aa4000d0a"));

        verifyNull(decoder, binary(
                "78781f3511061a0b24330503107d06084889cb01000100000cfa20e3acd301333fcb0d0a"));

        verifyPosition(decoder, binary(
                "78783c340000000011061809130c0903107d2408488a5800144c00000000000001940b00b1000047ff000000000500018f42210000000100050003010b69450d0a"));

        verifyPosition(decoder, binary(
                "78783c34000000001106190336070903107d51084889b900152e0000000043b101940b00b10000480100000000050001a3422100000001000300011bdc7b5f0d0a"));

        verifyAttributes(decoder, binary(
                "78780a13c40604000201298f5b0d0a"));

        verifyNotNull(decoder, binary(
                "78781f12110616091835d0024bb93007d3fb783dd4c501940500f2006c8504a6e0370d0a"));

        verifyPosition(decoder, binary(
                "787822221106160a1016c60278019407c7783800040001940504700046fc01030100065f570d0a"));

        verifyNotNull(decoder, binary(
                "7878661500000000004459443d537563636573732100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010009e82b0d0a"));

        verifyAttributes(decoder, binary(
                "7979000894000000000338ba0d0a"));

        verifyNull(decoder, binary(
                "79790020940a03516080825457290502194200448892980691312079088572f50004d4350d0a"));

        verifyPosition(decoder, binary(
                "7979007121000000000143757272656e7420706f736974696f6e214c61743a4e35342e3733393333322c4c6f6e3a4532352e3237333237302c436f757273653a3132362e35332c53706565643a302e303030302c4461746554696d653a323031372d30352d3236202031303a32373a3437000bbee30d0a"));

        verifyAttributes(decoder, binary(
                "7979003F940D110315102A202141494F494C2C30322C3030382E3239302C3032392E3630302C3531394A2C303430302C3030382E3433302C302C30302C4142001678EA0D0A"));

        verifyNull(decoder, binary(
                "79790005840016BB1A0D0A"));

        verifyAttributes(decoder, binary(
                "797900089400000002e852d70d0a"));

        verifyAttributes(decoder, binary(
                "7979000794050000c9b63e0d0a"));

        verifyNotNull(decoder, binary(
                "78783b18100c0f1201010195271784005ab63617840002fa47178400ff8f4817840019f3491784005ab54b178400ff8e4c17840019f24cff0002012287c80d0a"));

        verifyPosition(decoder, binary(
                "7878251610051b0f1c34c5022515d504b5dcd20738080902d4022bdf009cba5006640201006759680d0a"));

        verifyNotNull(decoder, binary(
                "787866150000000000416c726561647920696e20746865207374617465206f66206675656c20737570706c7920746f20726573756d652c74686520636f6d6d616e64206973206e6f742072756e6e696e672100000000000000000000000000000000000001001981e50d0a"));

        verifyAttributes(decoder, binary(
                "78782d152500000000437574206f666620746865206675656c20737570706c793a2053756363657373210002013b898a0d0a"));

        verifyAttributes(decoder, binary(
                "787829152100000000526573746f7265206675656c20737570706c793a2053756363657373210002014077ce0d0a"));

        verifyNull(decoder, binary(
                "78780D01012345678901234500018CDD0D0A"));

        verifyNull(decoder, binary(
                "78780d0103534190360660610003c3df0d0a"));

        verifyAttributes(decoder, binary(
                "78780a13440604000201baaf540d0a"));

        verifyAttributes(decoder, binary(
                "787825160F0C1D0A2B21C8027AC8040C46581000146F0901CC00287D001F714804040301001C84CF0D0A"));

        verifyPosition(decoder, binary(
                "78781f120f0a140e150bc505e51e780293a9e800540000f601006e0055da00035f240d0a"),
                position("2015-10-20 14:21:11.000", true, 54.94535, 24.01762));

        verifyPosition(decoder, binary(
                "787823120f081b121d37cb01c8e2cc08afd3c020d50201940701d600a1190041ee100576d1470d0a"));

        verifyPosition(decoder, binary(
                "78781F120B081D112E10CC027AC7EB0C46584900148F01CC00287D001FB8000380810D0A"));

        verifyPosition(decoder, binary(
                "787819100B031A0B1B31CC027AC7FD0C4657BF0115210001001CC6070D0A"));

        verifyPosition(decoder, binary(
                "787821120C010C0F151FCF027AC8840C4657EC00140001CC00287D001F720001000F53A00D0A"));

        verifyPosition(decoder, binary(
                "787825160B051B093523CF027AC8360C4657B30014000901CC00266A001E1740050400020008D7B10D0A"));

        verifyPosition(decoder, binary(
                "787819100e010903230ec803ae32a60653cded00180000020072feb70d0a"));

        verifyPosition(decoder, binary(
                "7878471e0e03110b0511c501c664fd074db73f0218a602e003433a002fed40433a0056e14e433a0056104e433a0056fd53433a002eed55433a007e4b57433a002ee25aff00020120f6720d0a"));

        verifyNull(decoder, binary(
                "7979005bfd0358899050927725004c0020bf984358df603b2ea3a339e54335013a5b56455253494f4e5d47543036445f32305f3630444d325f423235455f5631355f574d5b4255494c445d323031332f31322f32382031353a3234002a3b240d0a7979005bfd0358899050927725004c0020bf984358df603b2ea3a339e54335013a5b56455253494f4e5d47543036445f32305f3630444d325f423235455f5631355f574d5b4255494c445d323031332f31322f32382031353a3234002d4f9b0d0a7979005bfd0358899050927725004c0020bf984358df603b2ea3a339e54335013a5b56455253494f4e5d47543036445f32305f3630444d325f423235455f5631355f574d5b4255494c445d323031332f31322f32382031353a3234003084ff0d0a"));

        verifyNull(decoder, binary(
                "78788b818300000000534545464e2626004f04220045042626262b37393035343031353534362626262626260410041b0415041a04210415041926262b373930363433333031313526260410043d044f26262b373936303437383430363426260412043e0432043026262b373932383834373738383126262626262626262626262626262626232300020022155d0d0a"));

        verifyPosition(decoder, binary(
                "787822220e0914160f07c9021a362805090a7800d8b802d402c30e00a98a0105010213f4bb0d0a"));

        verifyNull(decoder, binary(
                "787811010864717003664467100f190a0002c6d20d0a"));

        verifyNull(decoder, binary(
                "787811010123456789012345100B3201000171930D0A"));

    }

}
