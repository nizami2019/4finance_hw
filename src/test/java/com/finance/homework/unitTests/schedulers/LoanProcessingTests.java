package com.finance.homework.unitTests.schedulers;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.awaitility.Awaitility.await;


@RunWith(MockitoJUnitRunner.class)
@Ignore
public class LoanProcessingTests {

    private static final String DATE_CURRENT_2018_01_01 = "2018-01-01";
    private static final String SCHEDULER_AT_23_00_OCLOCK = "0 0 23 * * *";
    private static final String SCHEDULER_QUARTER_SEASON_PERIOD = "0 0 20 1-7 1,4,7,10 FRI";

//    @InjectMocks
//    LoanProcessing loanProcessing = mock(LoanProcessing.class);

//    @Mock
//    LoanService loanService;
//
//    @Mock
//    UserService userService;
//
//    @Mock
//    LoanService loanService;

//    @Test
//    public void cronSchedulerGenerator_0() {
//        cronSchedulerGenerator(SCHEDULER_QUARTER_SEASON_PERIOD, 100);
//    }
//
//
//    @Test
//    @Ignore
//    public void cronSchedulerGenerator_1() {
//        LoanService loanService = mock(LoanService.class);
//
////        for (int i = 0; i < 5; i++) {
//            cronSchedulerGenerator(SCHEDULER_AT_23_00_OCLOCK, 5);
//
//            Mockito.verify(loanService).processLoans();
////        }
//
//    }
//
//    public void cronSchedulerGenerator(String paramScheduler, int index) {
//        CronSequenceGenerator cronGen = new CronSequenceGenerator(paramScheduler);
//        java.util.Date date = java.sql.Date.valueOf(DATE_CURRENT_2018_01_01);
//
////        for (int i = 0; i < index; i++) {
//            date = cronGen.next(date);
//            System.out.println(new java.text.SimpleDateFormat("EEE, MMM d, yyyy 'at' hh:mm:ss a").format(date));
////            log.info(new java.text.SimpleDateFormat("EEE, MMM d, yyyy 'at' hh:mm:ss a").format(date));
////        }
//
//    }
}

