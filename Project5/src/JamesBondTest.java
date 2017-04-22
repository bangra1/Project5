import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JamesBondTest {

	JamesBond jb;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test public void test1() {assertFalse(JamesBond.bondRegex("0 "));}
	@Test public void test2() {assertFalse(JamesBond.bondRegex("0 0 "));}
	@Test public void test3() {assertFalse(JamesBond.bondRegex("0 0 "));}

	@Test public void test5() {assertFalse(JamesBond.bondRegex("0 0 1 7 "));}
	@Test public void test6() {assertFalse(JamesBond.bondRegex("0 0 6 7 "));}
	
	@Test public void test9() {assertFalse(JamesBond.bondRegex("0 1 0 "));}
	@Test public void test10() {assertFalse(JamesBond.bondRegex("0 1 0 7 "));}
	@Test public void test11() {assertFalse(JamesBond.bondRegex("0 1 1 7 "));}
	@Test public void test12() {assertFalse(JamesBond.bondRegex("0 1 6 7 "));}
	@Test public void test13() {assertFalse(JamesBond.bondRegex("0 1 7 "));}
    @Test public void test14() {assertFalse(JamesBond.bondRegex("0 1 7 7 "));}
	@Test public void test15() {assertFalse(JamesBond.bondRegex("0 2 0 "));}
	@Test public void test16() {assertFalse(JamesBond.bondRegex("0 2 0 7 "));}
	@Test public void test17() {assertFalse(JamesBond.bondRegex("0 2 1 7 "));}
	@Test public void test18() {assertFalse(JamesBond.bondRegex("0 2 6 7 "));}
	@Test public void test19() {assertFalse(JamesBond.bondRegex("0 2 7 "));}
	@Test public void test20() {assertFalse(JamesBond.bondRegex("0 2 7 7 "));}
	@Test public void test21() {assertFalse(JamesBond.bondRegex("0 6 0 "));}
	@Test public void test22() {assertFalse(JamesBond.bondRegex("0 6 0 7 "));}
	@Test public void test23() {assertFalse(JamesBond.bondRegex("0 6 1 7 "));}
	@Test public void test24() {assertFalse(JamesBond.bondRegex("0 6 6 7 "));}
	@Test public void test25() {assertFalse(JamesBond.bondRegex("0 6 7 "));}
	@Test public void test26() {assertFalse(JamesBond.bondRegex("0 6 7 7 "));}
	@Test public void test27() {assertFalse(JamesBond.bondRegex("0 7 "));}
	@Test public void test28() {assertFalse(JamesBond.bondRegex("0 7 0 "));}
	@Test public void test29() {assertFalse(JamesBond.bondRegex("0 7 0 7 "));}
	@Test public void test30() {assertFalse(JamesBond.bondRegex("0 7 1 7 "));}
	@Test public void test31() {assertFalse(JamesBond.bondRegex("0 7 6 7 "));}
	@Test public void test32() {assertFalse(JamesBond.bondRegex("0 7 7 "));}
	@Test public void test33() {assertFalse(JamesBond.bondRegex("0 7 7 7 "));}
	@Test public void test34() {assertFalse(JamesBond.bondRegex("0 8 0 "));}
	@Test public void test35() {assertFalse(JamesBond.bondRegex("0 8 0 7 "));}
	@Test public void test36() {assertFalse(JamesBond.bondRegex("0 8 1 7 "));}
	@Test public void test37() {assertFalse(JamesBond.bondRegex("0 8 6 7 "));}
	@Test public void test38() {assertFalse(JamesBond.bondRegex("0 8 7 "));}
	@Test public void test39() {assertFalse(JamesBond.bondRegex("0 8 7 7 "));}
	@Test public void test40() {assertFalse(JamesBond.bondRegex("0 9 0 "));}
	@Test public void test41() {assertFalse(JamesBond.bondRegex("0 9 0 7 "));}
	@Test public void test42() {assertFalse(JamesBond.bondRegex("0 9 1 7 "));}
	@Test public void test43() {assertFalse(JamesBond.bondRegex("0 9 6 7 "));}
	@Test public void test44() {assertFalse(JamesBond.bondRegex("0 9 7 "));}
	@Test public void test45() {assertFalse(JamesBond.bondRegex("0 9 7 7 "));}
	@Test public void test46() {assertFalse(JamesBond.bondRegex("1 0 "));}
	@Test public void test47() {assertFalse(JamesBond.bondRegex("1 0 0 "));}
	
	@Test public void test49() {assertFalse(JamesBond.bondRegex("1 0 1 7 "));}
	@Test public void test50() {assertFalse(JamesBond.bondRegex("1 0 6 7 "));}
	@Test public void test51() {assertFalse(JamesBond.bondRegex("1 0 7 "));}
	@Test public void test52() {assertFalse(JamesBond.bondRegex("1 0 7 7 "));}
	@Test public void test53() {assertFalse(JamesBond.bondRegex("1 1 0 "));}
	@Test public void test54() {assertFalse(JamesBond.bondRegex("1 1 0 7 "));}
	@Test public void test55() {assertFalse(JamesBond.bondRegex("1 1 1 7 "));}
	@Test public void test56() {assertFalse(JamesBond.bondRegex("1 1 6 7 "));}
	@Test public void test57() {assertFalse(JamesBond.bondRegex("1 1 7 "));}
	@Test public void test58() {assertFalse(JamesBond.bondRegex("1 1 7 7 "));}
	@Test public void test59() {assertFalse(JamesBond.bondRegex("1 2 0 "));}
	@Test public void test60() {assertFalse(JamesBond.bondRegex("1 2 0 7 "));}
	@Test public void test61() {assertFalse(JamesBond.bondRegex("1 2 1 7 "));}
	@Test public void test62() {assertFalse(JamesBond.bondRegex("1 2 6 7 "));}
	@Test public void test63() {assertFalse(JamesBond.bondRegex("1 2 7 "));}
	@Test public void test64() {assertFalse(JamesBond.bondRegex("1 2 7 7 "));}
	@Test public void test65() {assertFalse(JamesBond.bondRegex("1 6 0 "));}
	@Test public void test66() {assertFalse(JamesBond.bondRegex("1 6 0 7 "));}
	@Test public void test67() {assertFalse(JamesBond.bondRegex("1 6 1 7 "));}
	@Test public void test68() {assertFalse(JamesBond.bondRegex("1 6 6 7 "));}
	@Test public void test69() {assertFalse(JamesBond.bondRegex("1 6 7 "));}
	@Test public void test70() {assertFalse(JamesBond.bondRegex("1 6 7 7 "));}
	@Test public void test71() {assertFalse(JamesBond.bondRegex("1 7 "));}
	@Test public void test72() {assertFalse(JamesBond.bondRegex("1 7 0 "));}
	@Test public void test73() {assertFalse(JamesBond.bondRegex("1 7 0 7 "));}
	@Test public void test74() {assertFalse(JamesBond.bondRegex("1 7 1 7 "));}
	@Test public void test75() {assertFalse(JamesBond.bondRegex("1 7 6 7 "));}
	@Test public void test76() {assertFalse(JamesBond.bondRegex("1 7 7 "));}
	@Test public void test77() {assertFalse(JamesBond.bondRegex("1 7 7 7 "));}
	@Test public void test78() {assertFalse(JamesBond.bondRegex("1 8 0 "));}
	@Test public void test79() {assertFalse(JamesBond.bondRegex("1 8 0 7 "));}
	@Test public void test80() {assertFalse(JamesBond.bondRegex("1 8 1 7 "));}
	@Test public void test81() {assertFalse(JamesBond.bondRegex("1 8 6 7 "));}
	@Test public void test82() {assertFalse(JamesBond.bondRegex("1 8 7 "));}
	@Test public void test83() {assertFalse(JamesBond.bondRegex("1 8 7 7 "));}
	@Test public void test84() {assertFalse(JamesBond.bondRegex("1 9 0 "));}
	@Test public void test85() {assertFalse(JamesBond.bondRegex("1 9 0 7 "));}
	@Test public void test86() {assertFalse(JamesBond.bondRegex("1 9 1 7 "));}
	@Test public void test87() {assertFalse(JamesBond.bondRegex("1 9 6 7 "));}
	@Test public void test88() {assertFalse(JamesBond.bondRegex("1 9 7 "));}
	@Test public void test89() {assertFalse(JamesBond.bondRegex("1 9 7 7 "));}
	@Test public void test90() {assertFalse(JamesBond.bondRegex("2 0 "));}
	@Test public void test91() {assertFalse(JamesBond.bondRegex("2 0 0 "));}
	
	@Test public void test93() {assertFalse(JamesBond.bondRegex("2 0 1 7 "));}
	@Test public void test94() {assertFalse(JamesBond.bondRegex("2 0 6 7 "));}
	@Test public void test95() {assertFalse(JamesBond.bondRegex("2 0 7 "));}
	@Test public void test96() {assertFalse(JamesBond.bondRegex("2 0 7 7 "));}
	@Test public void test97() {assertFalse(JamesBond.bondRegex("2 1 0 "));}
	@Test public void test98() {assertFalse(JamesBond.bondRegex("2 1 0 7 "));}
	@Test public void test99() {assertFalse(JamesBond.bondRegex("2 1 1 7 "));}
	@Test public void test100() {assertFalse(JamesBond.bondRegex("2 1 6 7 "));}
	
	
	
	@Test
	public void test4() {assertTrue(JamesBond.bondRegex("0 0 0 7 "));}
@Test public void test136() {assertTrue(JamesBond.bondRegex("6 0 0 7 "));}
@Test public void test7() {assertTrue(JamesBond.bondRegex("0 0 7 "));}
@Test public void test8() {assertTrue(JamesBond.bondRegex("0 0 7 7 "));}
	@Test public void test48() {assertTrue(JamesBond.bondRegex("1 0 0 7 "));}
	@Test public void test269() {assertTrue(JamesBond.bondRegex("9 0 0 7 "));}
	@Test public void test270() {assertTrue(JamesBond.bondRegex("9 0 1 7 "));}
	@Test public void test92() {assertTrue(JamesBond.bondRegex("2 0 0 7 "));}
	
	@Test public void test101() {assertFalse(JamesBond.bondRegex("2 1 7 "));}
	@Test public void test102() {assertFalse(JamesBond.bondRegex("2 1 7 7 "));}
	@Test public void test103() {assertFalse(JamesBond.bondRegex("2 2 0 "));}
	@Test public void test104() {assertFalse(JamesBond.bondRegex("2 2 0 7 "));}
	@Test public void test105() {assertFalse(JamesBond.bondRegex("2 2 1 7 "));}
	@Test public void test106() {assertFalse(JamesBond.bondRegex("2 2 6 7 "));}
	@Test public void test107() {assertFalse(JamesBond.bondRegex("2 2 7 "));}
	@Test public void test108() {assertFalse(JamesBond.bondRegex("2 2 7 7 "));}
	@Test public void test109() {assertFalse(JamesBond.bondRegex("2 6 0 "));}
	@Test public void test110() {assertFalse(JamesBond.bondRegex("2 6 0 7 "));}
	@Test public void test111() {assertFalse(JamesBond.bondRegex("2 6 1 7 "));}
	@Test public void test112() {assertFalse(JamesBond.bondRegex("2 6 6 7 "));}
	@Test public void test113() {assertFalse(JamesBond.bondRegex("2 6 7 "));}
	@Test public void test114() {assertFalse(JamesBond.bondRegex("2 6 7 7 "));}
	@Test public void test115() {assertFalse(JamesBond.bondRegex("2 7 "));}
	@Test public void test116() {assertFalse(JamesBond.bondRegex("2 7 0 "));}
	@Test public void test117() {assertFalse(JamesBond.bondRegex("2 7 0 7 "));}
	@Test public void test118() {assertFalse(JamesBond.bondRegex("2 7 1 7 "));}
	@Test public void test119() {assertFalse(JamesBond.bondRegex("2 7 6 7 "));}
	@Test public void test120() {assertFalse(JamesBond.bondRegex("2 7 7 "));}
	@Test public void test121() {assertFalse(JamesBond.bondRegex("2 7 7 7 "));}
	@Test public void test122() {assertFalse(JamesBond.bondRegex("2 8 0 "));}
	@Test public void test123() {assertFalse(JamesBond.bondRegex("2 8 0 7 "));}
	@Test public void test124() {assertFalse(JamesBond.bondRegex("2 8 1 7 "));}
	@Test public void test125() {assertFalse(JamesBond.bondRegex("2 8 6 7 "));}
	@Test public void test126() {assertFalse(JamesBond.bondRegex("2 8 7 "));}
	@Test public void test127() {assertFalse(JamesBond.bondRegex("2 8 7 7 "));}
	@Test public void test128() {assertFalse(JamesBond.bondRegex("2 9 0 "));}
	@Test public void test129() {assertFalse(JamesBond.bondRegex("2 9 0 7 "));}
	@Test public void test130() {assertFalse(JamesBond.bondRegex("2 9 1 7 "));}
	@Test public void test131() {assertFalse(JamesBond.bondRegex("2 9 6 7 "));}
	@Test public void test132() {assertFalse(JamesBond.bondRegex("2 9 7 "));}
	@Test public void test133() {assertFalse(JamesBond.bondRegex("2 9 7 7 "));}
	@Test public void test134() {assertFalse(JamesBond.bondRegex("6 0 "));}
	@Test public void test135() {assertFalse(JamesBond.bondRegex("6 0 0 "));}
	
	@Test public void test137() {assertFalse(JamesBond.bondRegex("6 0 1 7 "));}
	@Test public void test138() {assertFalse(JamesBond.bondRegex("6 0 6 7 "));}
	@Test public void test139() {assertFalse(JamesBond.bondRegex("6 0 7 "));}
	@Test public void test140() {assertFalse(JamesBond.bondRegex("6 0 7 7 "));}
	@Test public void test141() {assertFalse(JamesBond.bondRegex("6 1 0 "));}
	@Test public void test142() {assertFalse(JamesBond.bondRegex("6 1 0 7 "));}
	@Test public void test143() {assertFalse(JamesBond.bondRegex("6 1 1 7 "));}
	@Test public void test144() {assertFalse(JamesBond.bondRegex("6 1 6 7 "));}
	@Test public void test145() {assertFalse(JamesBond.bondRegex("6 1 7 "));}
	@Test public void test146() {assertFalse(JamesBond.bondRegex("6 1 7 7 "));}
	@Test public void test147() {assertFalse(JamesBond.bondRegex("6 2 0 "));}
	@Test public void test148() {assertFalse(JamesBond.bondRegex("6 2 0 7 "));}
	@Test public void test149() {assertFalse(JamesBond.bondRegex("6 2 1 7 "));}
	@Test public void test150() {assertFalse(JamesBond.bondRegex("6 2 6 7 "));}
	@Test public void test151() {assertFalse(JamesBond.bondRegex("6 2 7 "));}
	@Test public void test152() {assertFalse(JamesBond.bondRegex("6 2 7 7 "));}
	@Test public void test153() {assertFalse(JamesBond.bondRegex("6 6 0 "));}
	@Test public void test154() {assertFalse(JamesBond.bondRegex("6 6 0 7 "));}
	@Test public void test155() {assertFalse(JamesBond.bondRegex("6 6 1 7 "));}
	@Test public void test156() {assertFalse(JamesBond.bondRegex("6 6 6 7 "));}
	@Test public void test157() {assertFalse(JamesBond.bondRegex("6 6 7 "));}
	@Test public void test158() {assertFalse(JamesBond.bondRegex("6 6 7 7 "));}
	@Test public void test159() {assertFalse(JamesBond.bondRegex("6 7 "));}
	@Test public void test160() {assertFalse(JamesBond.bondRegex("6 7 0 "));}
	@Test public void test161() {assertFalse(JamesBond.bondRegex("6 7 0 7 "));}
	@Test public void test162() {assertFalse(JamesBond.bondRegex("6 7 1 7 "));}
	@Test public void test163() {assertFalse(JamesBond.bondRegex("6 7 6 7 "));}
	@Test public void test164() {assertFalse(JamesBond.bondRegex("6 7 7 "));}
	@Test public void test165() {assertFalse(JamesBond.bondRegex("6 7 7 7 "));}
	@Test public void test166() {assertFalse(JamesBond.bondRegex("6 8 0 "));}
	@Test public void test167() {assertFalse(JamesBond.bondRegex("6 8 0 7 "));}
	@Test public void test168() {assertFalse(JamesBond.bondRegex("6 8 1 7 "));}
	@Test public void test169() {assertFalse(JamesBond.bondRegex("6 8 6 7 "));}
	@Test public void test170() {assertFalse(JamesBond.bondRegex("6 8 7 "));}
	@Test public void test171() {assertFalse(JamesBond.bondRegex("6 8 7 7 "));}
	@Test public void test172() {assertFalse(JamesBond.bondRegex("6 9 0 "));}
	@Test public void test173() {assertFalse(JamesBond.bondRegex("6 9 0 7 "));}
	@Test public void test174() {assertFalse(JamesBond.bondRegex("6 9 1 7 "));}
	@Test public void test175() {assertFalse(JamesBond.bondRegex("6 9 6 7 "));}
	@Test public void test176() {assertFalse(JamesBond.bondRegex("6 9 7 "));}
	@Test public void test177() {assertFalse(JamesBond.bondRegex("6 9 7 7 "));}
	@Test public void test178() {assertFalse(JamesBond.bondRegex("7 "));}
	@Test public void test179() {assertFalse(JamesBond.bondRegex("7 0 "));}
	@Test public void test180() {assertFalse(JamesBond.bondRegex("7 0 0 "));}
	@Test public void test181() {assertTrue(JamesBond.bondRegex("7 0 0 7 "));}
	@Test public void test182() {assertFalse(JamesBond.bondRegex("7 0 1 7 "));}
	@Test public void test183() {assertFalse(JamesBond.bondRegex("7 0 6 7 "));}
	@Test public void test184() {assertFalse(JamesBond.bondRegex("7 0 7 "));}
	@Test public void test185() {assertFalse(JamesBond.bondRegex("7 0 7 7 "));}
	@Test public void test186() {assertFalse(JamesBond.bondRegex("7 1 0 "));}
	@Test public void test187() {assertFalse(JamesBond.bondRegex("7 1 0 7 "));}
	@Test public void test188() {assertFalse(JamesBond.bondRegex("7 1 1 7 "));}
	@Test public void test189() {assertFalse(JamesBond.bondRegex("7 1 6 7 "));}
	@Test public void test190() {assertFalse(JamesBond.bondRegex("7 1 7 "));}
	@Test public void test191() {assertFalse(JamesBond.bondRegex("7 1 7 7 "));}
	@Test public void test192() {assertFalse(JamesBond.bondRegex("7 2 0 "));}
	@Test public void test193() {assertFalse(JamesBond.bondRegex("7 2 0 7 "));}
	@Test public void test194() {assertFalse(JamesBond.bondRegex("7 2 1 7 "));}
	@Test public void test195() {assertFalse(JamesBond.bondRegex("7 2 6 7 "));}
	@Test public void test196() {assertFalse(JamesBond.bondRegex("7 2 7 "));}
	@Test public void test197() {assertFalse(JamesBond.bondRegex("7 2 7 7 "));}
	@Test public void test198() {assertFalse(JamesBond.bondRegex("7 6 0 "));}
	@Test public void test199() {assertFalse(JamesBond.bondRegex("7 6 0 7 "));}
	@Test public void test200() {assertFalse(JamesBond.bondRegex("7 6 1 7 "));}
	@Test public void test201() {assertFalse(JamesBond.bondRegex("7 6 6 7 "));}
	@Test public void test202() {assertFalse(JamesBond.bondRegex("7 6 7 "));}
	@Test public void test203() {assertFalse(JamesBond.bondRegex("7 6 7 7 "));}
	@Test public void test204() {assertFalse(JamesBond.bondRegex("7 7 "));}
	@Test public void test205() {assertFalse(JamesBond.bondRegex("7 7 0 "));}
	@Test public void test206() {assertFalse(JamesBond.bondRegex("7 7 0 7 "));}
	@Test public void test207() {assertFalse(JamesBond.bondRegex("7 7 1 7 "));}
	@Test public void test208() {assertFalse(JamesBond.bondRegex("7 7 6 7 "));}
	@Test public void test209() {assertFalse(JamesBond.bondRegex("7 7 7 "));}
	@Test public void test210() {assertFalse(JamesBond.bondRegex("7 7 7 7 "));}
	@Test public void test211() {assertFalse(JamesBond.bondRegex("7 8 0 "));}
	@Test public void test212() {assertFalse(JamesBond.bondRegex("7 8 0 7 "));}
	@Test public void test213() {assertFalse(JamesBond.bondRegex("7 8 1 7 "));}
	@Test public void test214() {assertFalse(JamesBond.bondRegex("7 8 6 7 "));}
	@Test public void test215() {assertFalse(JamesBond.bondRegex("7 8 7 "));}
	@Test public void test216() {assertFalse(JamesBond.bondRegex("7 8 7 7 "));}
	@Test public void test217() {assertFalse(JamesBond.bondRegex("7 9 0 "));}
	@Test public void test218() {assertFalse(JamesBond.bondRegex("7 9 0 7 "));}
	@Test public void test219() {assertFalse(JamesBond.bondRegex("7 9 1 7 "));}
	@Test public void test220() {assertFalse(JamesBond.bondRegex("7 9 6 7 "));}
	@Test public void test221() {assertFalse(JamesBond.bondRegex("7 9 7 "));}
	@Test public void test222() {assertFalse(JamesBond.bondRegex("7 9 7 7 "));}
	@Test public void test223() {assertFalse(JamesBond.bondRegex("8 0 "));}
	@Test public void test224() {assertFalse(JamesBond.bondRegex("8 0 0 "));}
	@Test public void test225() {assertTrue(JamesBond.bondRegex("8 0 0 7 "));}
	@Test public void test226() {assertFalse(JamesBond.bondRegex("8 0 1 7 "));}
	@Test public void test227() {assertFalse(JamesBond.bondRegex("8 0 6 7 "));}
	@Test public void test228() {assertFalse(JamesBond.bondRegex("8 0 7 "));}
	@Test public void test229() {assertFalse(JamesBond.bondRegex("8 0 7 7 "));}
	@Test public void test230() {assertFalse(JamesBond.bondRegex("8 1 0 "));}
	@Test public void test231() {assertFalse(JamesBond.bondRegex("8 1 0 7 "));}
	@Test public void test232() {assertFalse(JamesBond.bondRegex("8 1 1 7 "));}
	@Test public void test233() {assertFalse(JamesBond.bondRegex("8 1 6 7 "));}
	@Test public void test234() {assertFalse(JamesBond.bondRegex("8 1 7 "));}
	@Test public void test235() {assertFalse(JamesBond.bondRegex("8 1 7 7 "));}
	@Test public void test236() {assertFalse(JamesBond.bondRegex("8 2 0 "));}
	@Test public void test237() {assertFalse(JamesBond.bondRegex("8 2 0 7 "));}
	@Test public void test238() {assertFalse(JamesBond.bondRegex("8 2 1 7 "));}
	@Test public void test239() {assertFalse(JamesBond.bondRegex("8 2 6 7 "));}
	@Test public void test240() {assertFalse(JamesBond.bondRegex("8 2 7 "));}
	@Test public void test241() {assertFalse(JamesBond.bondRegex("8 2 7 7 "));}
	@Test public void test242() {assertFalse(JamesBond.bondRegex("8 6 0 "));}
	@Test public void test243() {assertFalse(JamesBond.bondRegex("8 6 0 7 "));}
	@Test public void test244() {assertFalse(JamesBond.bondRegex("8 6 1 7 "));}
	@Test public void test245() {assertFalse(JamesBond.bondRegex("8 6 6 7 "));}
	@Test public void test246() {assertFalse(JamesBond.bondRegex("8 6 7 "));}
	@Test public void test247() {assertFalse(JamesBond.bondRegex("8 6 7 7 "));}
	@Test public void test248() {assertFalse(JamesBond.bondRegex("8 7 "));}
	@Test public void test249() {assertFalse(JamesBond.bondRegex("8 7 0 "));}
	@Test public void test250() {assertFalse(JamesBond.bondRegex("8 7 0 7 "));}
	@Test public void test251() {assertFalse(JamesBond.bondRegex("8 7 1 7 "));}
	@Test public void test252() {assertFalse(JamesBond.bondRegex("8 7 6 7 "));}
	@Test public void test253() {assertFalse(JamesBond.bondRegex("8 7 7 "));}
	@Test public void test254() {assertFalse(JamesBond.bondRegex("8 7 7 7 "));}
	@Test public void test255() {assertFalse(JamesBond.bondRegex("8 8 0 "));}
	@Test public void test256() {assertFalse(JamesBond.bondRegex("8 8 0 7 "));}
	@Test public void test257() {assertFalse(JamesBond.bondRegex("8 8 1 7 "));}
	@Test public void test258() {assertFalse(JamesBond.bondRegex("8 8 6 7 "));}
	@Test public void test259() {assertFalse(JamesBond.bondRegex("8 8 7 "));}
	@Test public void test260() {assertFalse(JamesBond.bondRegex("8 8 7 7 "));}
	@Test public void test261() {assertFalse(JamesBond.bondRegex("8 9 0 "));}
	@Test public void test262() {assertFalse(JamesBond.bondRegex("8 9 0 7 "));}
	@Test public void test263() {assertFalse(JamesBond.bondRegex("8 9 1 7 "));}
	@Test public void test264() {assertFalse(JamesBond.bondRegex("8 9 6 7 "));}
	@Test public void test265() {assertFalse(JamesBond.bondRegex("8 9 7 "));}
	@Test public void test266() {assertFalse(JamesBond.bondRegex("8 9 7 7 "));}
	@Test public void test267() {assertFalse(JamesBond.bondRegex("9 0 "));}
	@Test public void test268() {assertFalse(JamesBond.bondRegex("9 0 0 "));}
	

	@Test public void test271() {assertFalse(JamesBond.bondRegex("9 0 6 7 "));}
	@Test public void test272() {assertFalse(JamesBond.bondRegex("9 0 7 "));}
	@Test public void test273() {assertFalse(JamesBond.bondRegex("9 0 7 7 "));}
	@Test public void test274() {assertFalse(JamesBond.bondRegex("9 1 0 "));}
	@Test public void test275() {assertFalse(JamesBond.bondRegex("9 1 0 7 "));}
	@Test public void test276() {assertFalse(JamesBond.bondRegex("9 1 1 7 "));}
	@Test public void test277() {assertFalse(JamesBond.bondRegex("9 1 6 7 "));}
	@Test public void test278() {assertFalse(JamesBond.bondRegex("9 1 7 "));}
	@Test public void test279() {assertFalse(JamesBond.bondRegex("9 1 7 7 "));}
	@Test public void test280() {assertFalse(JamesBond.bondRegex("9 2 0 "));}
	@Test public void test281() {assertFalse(JamesBond.bondRegex("9 2 0 7 "));}
	@Test public void test282() {assertFalse(JamesBond.bondRegex("9 2 1 7 "));}
	@Test public void test283() {assertFalse(JamesBond.bondRegex("9 2 6 7 "));}
	@Test public void test284() {assertFalse(JamesBond.bondRegex("9 2 7 "));}
	@Test public void test285() {assertFalse(JamesBond.bondRegex("9 2 7 7 "));}
	@Test public void test286() {assertFalse(JamesBond.bondRegex("9 6 0 "));}
	@Test public void test287() {assertFalse(JamesBond.bondRegex("9 6 0 7 "));}
	@Test public void test288() {assertFalse(JamesBond.bondRegex("9 6 1 7 "));}
	@Test public void test289() {assertFalse(JamesBond.bondRegex("9 6 6 7 "));}
	@Test public void test290() {assertFalse(JamesBond.bondRegex("9 6 7 "));}
	@Test public void test291() {assertFalse(JamesBond.bondRegex("9 6 7 7 "));}
	@Test public void test292() {assertFalse(JamesBond.bondRegex("9 7 "));}
	@Test public void test293() {assertFalse(JamesBond.bondRegex("9 7 0 "));}
	@Test public void test294() {assertFalse(JamesBond.bondRegex("9 7 0 7 "));}
	@Test public void test295() {assertFalse(JamesBond.bondRegex("9 7 1 7 "));}
	@Test public void test296() {assertFalse(JamesBond.bondRegex("9 7 6 7 "));}
	@Test public void test297() {assertFalse(JamesBond.bondRegex("9 7 7 "));}
	@Test public void test298() {assertFalse(JamesBond.bondRegex("9 7 7 7 "));}
	@Test public void test299() {assertFalse(JamesBond.bondRegex("9 8 0 "));}
	@Test public void test300() {assertFalse(JamesBond.bondRegex("9 8 0 7 "));}
	@Test public void test301() {assertFalse(JamesBond.bondRegex("9 8 1 7 "));}
	@Test public void test302() {assertFalse(JamesBond.bondRegex("9 8 6 7 "));}
	@Test public void test303() {assertFalse(JamesBond.bondRegex("9 8 7 "));}
	@Test public void test304() {assertFalse(JamesBond.bondRegex("9 8 7 7 "));}
	@Test public void test305() {assertFalse(JamesBond.bondRegex("9 9 0 "));}
	@Test public void test306() {assertFalse(JamesBond.bondRegex("9 9 0 7 "));}
	@Test public void test307() {assertFalse(JamesBond.bondRegex("9 9 1 7 "));}
	@Test public void test308() {assertFalse(JamesBond.bondRegex("9 9 6 7 "));}
	@Test public void test309() {assertFalse(JamesBond.bondRegex("9 9 7 "));}
	@Test public void test310() {assertFalse(JamesBond.bondRegex("9 9 7 7 "));}



	

}
