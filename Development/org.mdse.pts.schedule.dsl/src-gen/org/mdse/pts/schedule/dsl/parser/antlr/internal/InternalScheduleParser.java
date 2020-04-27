package org.mdse.pts.schedule.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mdse.pts.schedule.dsl.services.ScheduleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScheduleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_LETTER", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'schedule'", "'for'", "'with'", "','", "':'", "'train'", "'on'", "'and'", "'at'", "'start'", "'platform'", "'drive'", "'via'", "'stop'", "'min'", "'and turn'", "'terminate'", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Sunday'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_DIGIT=8;
    public static final int RULE_LETTER=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalScheduleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalScheduleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalScheduleParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSchedule.g"; }



     	private ScheduleGrammarAccess grammarAccess;

        public InternalScheduleParser(TokenStream input, ScheduleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Schedule";
       	}

       	@Override
       	protected ScheduleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSchedule"
    // InternalSchedule.g:65:1: entryRuleSchedule returns [EObject current=null] : iv_ruleSchedule= ruleSchedule EOF ;
    public final EObject entryRuleSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchedule = null;


        try {
            // InternalSchedule.g:65:49: (iv_ruleSchedule= ruleSchedule EOF )
            // InternalSchedule.g:66:2: iv_ruleSchedule= ruleSchedule EOF
            {
             newCompositeNode(grammarAccess.getScheduleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchedule=ruleSchedule();

            state._fsp--;

             current =iv_ruleSchedule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchedule"


    // $ANTLR start "ruleSchedule"
    // InternalSchedule.g:72:1: ruleSchedule returns [EObject current=null] : (otherlv_0= 'schedule' otherlv_1= 'for' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ':' ( (lv_trainSchedules_8_0= ruleTrainSchedule ) )* ) ;
    public final EObject ruleSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_trainSchedules_8_0 = null;



        	enterRule();

        try {
            // InternalSchedule.g:78:2: ( (otherlv_0= 'schedule' otherlv_1= 'for' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ':' ( (lv_trainSchedules_8_0= ruleTrainSchedule ) )* ) )
            // InternalSchedule.g:79:2: (otherlv_0= 'schedule' otherlv_1= 'for' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ':' ( (lv_trainSchedules_8_0= ruleTrainSchedule ) )* )
            {
            // InternalSchedule.g:79:2: (otherlv_0= 'schedule' otherlv_1= 'for' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ':' ( (lv_trainSchedules_8_0= ruleTrainSchedule ) )* )
            // InternalSchedule.g:80:3: otherlv_0= 'schedule' otherlv_1= 'for' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ':' ( (lv_trainSchedules_8_0= ruleTrainSchedule ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScheduleAccess().getScheduleKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getScheduleAccess().getForKeyword_1());
            		
            // InternalSchedule.g:88:3: ( (otherlv_2= RULE_ID ) )
            // InternalSchedule.g:89:4: (otherlv_2= RULE_ID )
            {
            // InternalSchedule.g:89:4: (otherlv_2= RULE_ID )
            // InternalSchedule.g:90:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScheduleRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_2, grammarAccess.getScheduleAccess().getNetworkNetworkCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getScheduleAccess().getWithKeyword_3());
            		
            // InternalSchedule.g:105:3: ( (otherlv_4= RULE_ID ) )
            // InternalSchedule.g:106:4: (otherlv_4= RULE_ID )
            {
            // InternalSchedule.g:106:4: (otherlv_4= RULE_ID )
            // InternalSchedule.g:107:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScheduleRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_4, grammarAccess.getScheduleAccess().getDepotsDepotCrossReference_4_0());
            				

            }


            }

            // InternalSchedule.g:118:3: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSchedule.g:119:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_5, grammarAccess.getScheduleAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSchedule.g:123:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalSchedule.g:124:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalSchedule.g:124:5: (otherlv_6= RULE_ID )
            	    // InternalSchedule.g:125:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getScheduleRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    						newLeafNode(otherlv_6, grammarAccess.getScheduleAccess().getDepotsDepotCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getScheduleAccess().getColonKeyword_6());
            		
            // InternalSchedule.g:141:3: ( (lv_trainSchedules_8_0= ruleTrainSchedule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSchedule.g:142:4: (lv_trainSchedules_8_0= ruleTrainSchedule )
            	    {
            	    // InternalSchedule.g:142:4: (lv_trainSchedules_8_0= ruleTrainSchedule )
            	    // InternalSchedule.g:143:5: lv_trainSchedules_8_0= ruleTrainSchedule
            	    {

            	    					newCompositeNode(grammarAccess.getScheduleAccess().getTrainSchedulesTrainScheduleParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_trainSchedules_8_0=ruleTrainSchedule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScheduleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"trainSchedules",
            	    						lv_trainSchedules_8_0,
            	    						"org.mdse.pts.schedule.dsl.Schedule.TrainSchedule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchedule"


    // $ANTLR start "entryRuleTrainSchedule"
    // InternalSchedule.g:164:1: entryRuleTrainSchedule returns [EObject current=null] : iv_ruleTrainSchedule= ruleTrainSchedule EOF ;
    public final EObject entryRuleTrainSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainSchedule = null;


        try {
            // InternalSchedule.g:164:54: (iv_ruleTrainSchedule= ruleTrainSchedule EOF )
            // InternalSchedule.g:165:2: iv_ruleTrainSchedule= ruleTrainSchedule EOF
            {
             newCompositeNode(grammarAccess.getTrainScheduleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrainSchedule=ruleTrainSchedule();

            state._fsp--;

             current =iv_ruleTrainSchedule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrainSchedule"


    // $ANTLR start "ruleTrainSchedule"
    // InternalSchedule.g:171:1: ruleTrainSchedule returns [EObject current=null] : (otherlv_0= 'train' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'on' ( (lv_dateTimes_3_0= ruleDateTime ) ) ( (otherlv_4= ',' ( (lv_dateTimes_5_0= ruleDateTime ) ) )* otherlv_6= 'and' ( (lv_dateTimes_7_0= ruleDateTime ) ) )? otherlv_8= ':' ( (lv_route_9_0= ruleRoute ) ) ) ;
    public final EObject ruleTrainSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_dateTimes_3_0 = null;

        EObject lv_dateTimes_5_0 = null;

        EObject lv_dateTimes_7_0 = null;

        EObject lv_route_9_0 = null;



        	enterRule();

        try {
            // InternalSchedule.g:177:2: ( (otherlv_0= 'train' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'on' ( (lv_dateTimes_3_0= ruleDateTime ) ) ( (otherlv_4= ',' ( (lv_dateTimes_5_0= ruleDateTime ) ) )* otherlv_6= 'and' ( (lv_dateTimes_7_0= ruleDateTime ) ) )? otherlv_8= ':' ( (lv_route_9_0= ruleRoute ) ) ) )
            // InternalSchedule.g:178:2: (otherlv_0= 'train' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'on' ( (lv_dateTimes_3_0= ruleDateTime ) ) ( (otherlv_4= ',' ( (lv_dateTimes_5_0= ruleDateTime ) ) )* otherlv_6= 'and' ( (lv_dateTimes_7_0= ruleDateTime ) ) )? otherlv_8= ':' ( (lv_route_9_0= ruleRoute ) ) )
            {
            // InternalSchedule.g:178:2: (otherlv_0= 'train' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'on' ( (lv_dateTimes_3_0= ruleDateTime ) ) ( (otherlv_4= ',' ( (lv_dateTimes_5_0= ruleDateTime ) ) )* otherlv_6= 'and' ( (lv_dateTimes_7_0= ruleDateTime ) ) )? otherlv_8= ':' ( (lv_route_9_0= ruleRoute ) ) )
            // InternalSchedule.g:179:3: otherlv_0= 'train' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'on' ( (lv_dateTimes_3_0= ruleDateTime ) ) ( (otherlv_4= ',' ( (lv_dateTimes_5_0= ruleDateTime ) ) )* otherlv_6= 'and' ( (lv_dateTimes_7_0= ruleDateTime ) ) )? otherlv_8= ':' ( (lv_route_9_0= ruleRoute ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTrainScheduleAccess().getTrainKeyword_0());
            		
            // InternalSchedule.g:183:3: ( (otherlv_1= RULE_ID ) )
            // InternalSchedule.g:184:4: (otherlv_1= RULE_ID )
            {
            // InternalSchedule.g:184:4: (otherlv_1= RULE_ID )
            // InternalSchedule.g:185:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrainScheduleRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_1, grammarAccess.getTrainScheduleAccess().getTrainTrainCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getTrainScheduleAccess().getOnKeyword_2());
            		
            // InternalSchedule.g:200:3: ( (lv_dateTimes_3_0= ruleDateTime ) )
            // InternalSchedule.g:201:4: (lv_dateTimes_3_0= ruleDateTime )
            {
            // InternalSchedule.g:201:4: (lv_dateTimes_3_0= ruleDateTime )
            // InternalSchedule.g:202:5: lv_dateTimes_3_0= ruleDateTime
            {

            					newCompositeNode(grammarAccess.getTrainScheduleAccess().getDateTimesDateTimeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_dateTimes_3_0=ruleDateTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrainScheduleRule());
            					}
            					add(
            						current,
            						"dateTimes",
            						lv_dateTimes_3_0,
            						"org.mdse.pts.schedule.dsl.Schedule.DateTime");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSchedule.g:219:3: ( (otherlv_4= ',' ( (lv_dateTimes_5_0= ruleDateTime ) ) )* otherlv_6= 'and' ( (lv_dateTimes_7_0= ruleDateTime ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15||LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSchedule.g:220:4: (otherlv_4= ',' ( (lv_dateTimes_5_0= ruleDateTime ) ) )* otherlv_6= 'and' ( (lv_dateTimes_7_0= ruleDateTime ) )
                    {
                    // InternalSchedule.g:220:4: (otherlv_4= ',' ( (lv_dateTimes_5_0= ruleDateTime ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSchedule.g:221:5: otherlv_4= ',' ( (lv_dateTimes_5_0= ruleDateTime ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_9); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getTrainScheduleAccess().getCommaKeyword_4_0_0());
                    	    				
                    	    // InternalSchedule.g:225:5: ( (lv_dateTimes_5_0= ruleDateTime ) )
                    	    // InternalSchedule.g:226:6: (lv_dateTimes_5_0= ruleDateTime )
                    	    {
                    	    // InternalSchedule.g:226:6: (lv_dateTimes_5_0= ruleDateTime )
                    	    // InternalSchedule.g:227:7: lv_dateTimes_5_0= ruleDateTime
                    	    {

                    	    							newCompositeNode(grammarAccess.getTrainScheduleAccess().getDateTimesDateTimeParserRuleCall_4_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_dateTimes_5_0=ruleDateTime();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTrainScheduleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"dateTimes",
                    	    								lv_dateTimes_5_0,
                    	    								"org.mdse.pts.schedule.dsl.Schedule.DateTime");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getTrainScheduleAccess().getAndKeyword_4_1());
                    			
                    // InternalSchedule.g:249:4: ( (lv_dateTimes_7_0= ruleDateTime ) )
                    // InternalSchedule.g:250:5: (lv_dateTimes_7_0= ruleDateTime )
                    {
                    // InternalSchedule.g:250:5: (lv_dateTimes_7_0= ruleDateTime )
                    // InternalSchedule.g:251:6: lv_dateTimes_7_0= ruleDateTime
                    {

                    						newCompositeNode(grammarAccess.getTrainScheduleAccess().getDateTimesDateTimeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_dateTimes_7_0=ruleDateTime();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrainScheduleRule());
                    						}
                    						add(
                    							current,
                    							"dateTimes",
                    							lv_dateTimes_7_0,
                    							"org.mdse.pts.schedule.dsl.Schedule.DateTime");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getTrainScheduleAccess().getColonKeyword_5());
            		
            // InternalSchedule.g:273:3: ( (lv_route_9_0= ruleRoute ) )
            // InternalSchedule.g:274:4: (lv_route_9_0= ruleRoute )
            {
            // InternalSchedule.g:274:4: (lv_route_9_0= ruleRoute )
            // InternalSchedule.g:275:5: lv_route_9_0= ruleRoute
            {

            					newCompositeNode(grammarAccess.getTrainScheduleAccess().getRouteRouteParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_route_9_0=ruleRoute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrainScheduleRule());
            					}
            					set(
            						current,
            						"route",
            						lv_route_9_0,
            						"org.mdse.pts.schedule.dsl.Schedule.Route");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrainSchedule"


    // $ANTLR start "entryRuleDateTime"
    // InternalSchedule.g:296:1: entryRuleDateTime returns [EObject current=null] : iv_ruleDateTime= ruleDateTime EOF ;
    public final EObject entryRuleDateTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTime = null;


        try {
            // InternalSchedule.g:296:49: (iv_ruleDateTime= ruleDateTime EOF )
            // InternalSchedule.g:297:2: iv_ruleDateTime= ruleDateTime EOF
            {
             newCompositeNode(grammarAccess.getDateTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateTime=ruleDateTime();

            state._fsp--;

             current =iv_ruleDateTime; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateTime"


    // $ANTLR start "ruleDateTime"
    // InternalSchedule.g:303:1: ruleDateTime returns [EObject current=null] : ( ( (lv_weekday_0_0= ruleWeekDays ) ) (otherlv_1= ',' ( (lv_weekday_2_0= ruleWeekDays ) ) )* otherlv_3= 'at' ( (lv_time_4_0= ruleTime ) ) ) ;
    public final EObject ruleDateTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_weekday_0_0 = null;

        Enumerator lv_weekday_2_0 = null;

        EObject lv_time_4_0 = null;



        	enterRule();

        try {
            // InternalSchedule.g:309:2: ( ( ( (lv_weekday_0_0= ruleWeekDays ) ) (otherlv_1= ',' ( (lv_weekday_2_0= ruleWeekDays ) ) )* otherlv_3= 'at' ( (lv_time_4_0= ruleTime ) ) ) )
            // InternalSchedule.g:310:2: ( ( (lv_weekday_0_0= ruleWeekDays ) ) (otherlv_1= ',' ( (lv_weekday_2_0= ruleWeekDays ) ) )* otherlv_3= 'at' ( (lv_time_4_0= ruleTime ) ) )
            {
            // InternalSchedule.g:310:2: ( ( (lv_weekday_0_0= ruleWeekDays ) ) (otherlv_1= ',' ( (lv_weekday_2_0= ruleWeekDays ) ) )* otherlv_3= 'at' ( (lv_time_4_0= ruleTime ) ) )
            // InternalSchedule.g:311:3: ( (lv_weekday_0_0= ruleWeekDays ) ) (otherlv_1= ',' ( (lv_weekday_2_0= ruleWeekDays ) ) )* otherlv_3= 'at' ( (lv_time_4_0= ruleTime ) )
            {
            // InternalSchedule.g:311:3: ( (lv_weekday_0_0= ruleWeekDays ) )
            // InternalSchedule.g:312:4: (lv_weekday_0_0= ruleWeekDays )
            {
            // InternalSchedule.g:312:4: (lv_weekday_0_0= ruleWeekDays )
            // InternalSchedule.g:313:5: lv_weekday_0_0= ruleWeekDays
            {

            					newCompositeNode(grammarAccess.getDateTimeAccess().getWeekdayWeekDaysEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_weekday_0_0=ruleWeekDays();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDateTimeRule());
            					}
            					add(
            						current,
            						"weekday",
            						lv_weekday_0_0,
            						"org.mdse.pts.schedule.dsl.Schedule.WeekDays");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSchedule.g:330:3: (otherlv_1= ',' ( (lv_weekday_2_0= ruleWeekDays ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSchedule.g:331:4: otherlv_1= ',' ( (lv_weekday_2_0= ruleWeekDays ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getDateTimeAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalSchedule.g:335:4: ( (lv_weekday_2_0= ruleWeekDays ) )
            	    // InternalSchedule.g:336:5: (lv_weekday_2_0= ruleWeekDays )
            	    {
            	    // InternalSchedule.g:336:5: (lv_weekday_2_0= ruleWeekDays )
            	    // InternalSchedule.g:337:6: lv_weekday_2_0= ruleWeekDays
            	    {

            	    						newCompositeNode(grammarAccess.getDateTimeAccess().getWeekdayWeekDaysEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_weekday_2_0=ruleWeekDays();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDateTimeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"weekday",
            	    							lv_weekday_2_0,
            	    							"org.mdse.pts.schedule.dsl.Schedule.WeekDays");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getDateTimeAccess().getAtKeyword_2());
            		
            // InternalSchedule.g:359:3: ( (lv_time_4_0= ruleTime ) )
            // InternalSchedule.g:360:4: (lv_time_4_0= ruleTime )
            {
            // InternalSchedule.g:360:4: (lv_time_4_0= ruleTime )
            // InternalSchedule.g:361:5: lv_time_4_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getDateTimeAccess().getTimeTimeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_time_4_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDateTimeRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_4_0,
            						"org.mdse.pts.schedule.dsl.Schedule.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateTime"


    // $ANTLR start "entryRuleTime"
    // InternalSchedule.g:382:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalSchedule.g:382:45: (iv_ruleTime= ruleTime EOF )
            // InternalSchedule.g:383:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalSchedule.g:389:1: ruleTime returns [EObject current=null] : ( ( (lv_hours_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minutes_2_0= RULE_INT ) ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_hours_0_0=null;
        Token otherlv_1=null;
        Token lv_minutes_2_0=null;


        	enterRule();

        try {
            // InternalSchedule.g:395:2: ( ( ( (lv_hours_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minutes_2_0= RULE_INT ) ) ) )
            // InternalSchedule.g:396:2: ( ( (lv_hours_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minutes_2_0= RULE_INT ) ) )
            {
            // InternalSchedule.g:396:2: ( ( (lv_hours_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minutes_2_0= RULE_INT ) ) )
            // InternalSchedule.g:397:3: ( (lv_hours_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minutes_2_0= RULE_INT ) )
            {
            // InternalSchedule.g:397:3: ( (lv_hours_0_0= RULE_INT ) )
            // InternalSchedule.g:398:4: (lv_hours_0_0= RULE_INT )
            {
            // InternalSchedule.g:398:4: (lv_hours_0_0= RULE_INT )
            // InternalSchedule.g:399:5: lv_hours_0_0= RULE_INT
            {
            lv_hours_0_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_hours_0_0, grammarAccess.getTimeAccess().getHoursINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"hours",
            						lv_hours_0_0,
            						"org.mdse.pts.schedule.dsl.Schedule.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeAccess().getColonKeyword_1());
            		
            // InternalSchedule.g:419:3: ( (lv_minutes_2_0= RULE_INT ) )
            // InternalSchedule.g:420:4: (lv_minutes_2_0= RULE_INT )
            {
            // InternalSchedule.g:420:4: (lv_minutes_2_0= RULE_INT )
            // InternalSchedule.g:421:5: lv_minutes_2_0= RULE_INT
            {
            lv_minutes_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_minutes_2_0, grammarAccess.getTimeAccess().getMinutesINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"minutes",
            						lv_minutes_2_0,
            						"org.mdse.pts.schedule.dsl.Schedule.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleRoute"
    // InternalSchedule.g:441:1: entryRuleRoute returns [EObject current=null] : iv_ruleRoute= ruleRoute EOF ;
    public final EObject entryRuleRoute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoute = null;


        try {
            // InternalSchedule.g:441:46: (iv_ruleRoute= ruleRoute EOF )
            // InternalSchedule.g:442:2: iv_ruleRoute= ruleRoute EOF
            {
             newCompositeNode(grammarAccess.getRouteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoute=ruleRoute();

            state._fsp--;

             current =iv_ruleRoute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoute"


    // $ANTLR start "ruleRoute"
    // InternalSchedule.g:448:1: ruleRoute returns [EObject current=null] : ( ( (lv_startSpot_0_0= ruleStartSpot ) ) ( (lv_middleSpots_1_0= ruleMiddleSpot ) )* ( (lv_finalSpot_2_0= ruleFinalSpot ) ) ) ;
    public final EObject ruleRoute() throws RecognitionException {
        EObject current = null;

        EObject lv_startSpot_0_0 = null;

        EObject lv_middleSpots_1_0 = null;

        EObject lv_finalSpot_2_0 = null;



        	enterRule();

        try {
            // InternalSchedule.g:454:2: ( ( ( (lv_startSpot_0_0= ruleStartSpot ) ) ( (lv_middleSpots_1_0= ruleMiddleSpot ) )* ( (lv_finalSpot_2_0= ruleFinalSpot ) ) ) )
            // InternalSchedule.g:455:2: ( ( (lv_startSpot_0_0= ruleStartSpot ) ) ( (lv_middleSpots_1_0= ruleMiddleSpot ) )* ( (lv_finalSpot_2_0= ruleFinalSpot ) ) )
            {
            // InternalSchedule.g:455:2: ( ( (lv_startSpot_0_0= ruleStartSpot ) ) ( (lv_middleSpots_1_0= ruleMiddleSpot ) )* ( (lv_finalSpot_2_0= ruleFinalSpot ) ) )
            // InternalSchedule.g:456:3: ( (lv_startSpot_0_0= ruleStartSpot ) ) ( (lv_middleSpots_1_0= ruleMiddleSpot ) )* ( (lv_finalSpot_2_0= ruleFinalSpot ) )
            {
            // InternalSchedule.g:456:3: ( (lv_startSpot_0_0= ruleStartSpot ) )
            // InternalSchedule.g:457:4: (lv_startSpot_0_0= ruleStartSpot )
            {
            // InternalSchedule.g:457:4: (lv_startSpot_0_0= ruleStartSpot )
            // InternalSchedule.g:458:5: lv_startSpot_0_0= ruleStartSpot
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getStartSpotStartSpotParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_startSpot_0_0=ruleStartSpot();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					set(
            						current,
            						"startSpot",
            						lv_startSpot_0_0,
            						"org.mdse.pts.schedule.dsl.Schedule.StartSpot");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSchedule.g:475:3: ( (lv_middleSpots_1_0= ruleMiddleSpot ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSchedule.g:476:4: (lv_middleSpots_1_0= ruleMiddleSpot )
            	    {
            	    // InternalSchedule.g:476:4: (lv_middleSpots_1_0= ruleMiddleSpot )
            	    // InternalSchedule.g:477:5: lv_middleSpots_1_0= ruleMiddleSpot
            	    {

            	    					newCompositeNode(grammarAccess.getRouteAccess().getMiddleSpotsMiddleSpotParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_middleSpots_1_0=ruleMiddleSpot();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRouteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"middleSpots",
            	    						lv_middleSpots_1_0,
            	    						"org.mdse.pts.schedule.dsl.Schedule.MiddleSpot");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalSchedule.g:494:3: ( (lv_finalSpot_2_0= ruleFinalSpot ) )
            // InternalSchedule.g:495:4: (lv_finalSpot_2_0= ruleFinalSpot )
            {
            // InternalSchedule.g:495:4: (lv_finalSpot_2_0= ruleFinalSpot )
            // InternalSchedule.g:496:5: lv_finalSpot_2_0= ruleFinalSpot
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getFinalSpotFinalSpotParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_finalSpot_2_0=ruleFinalSpot();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					set(
            						current,
            						"finalSpot",
            						lv_finalSpot_2_0,
            						"org.mdse.pts.schedule.dsl.Schedule.FinalSpot");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoute"


    // $ANTLR start "entryRuleStartSpot"
    // InternalSchedule.g:517:1: entryRuleStartSpot returns [EObject current=null] : iv_ruleStartSpot= ruleStartSpot EOF ;
    public final EObject entryRuleStartSpot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartSpot = null;


        try {
            // InternalSchedule.g:517:50: (iv_ruleStartSpot= ruleStartSpot EOF )
            // InternalSchedule.g:518:2: iv_ruleStartSpot= ruleStartSpot EOF
            {
             newCompositeNode(grammarAccess.getStartSpotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartSpot=ruleStartSpot();

            state._fsp--;

             current =iv_ruleStartSpot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStartSpot"


    // $ANTLR start "ruleStartSpot"
    // InternalSchedule.g:524:1: ruleStartSpot returns [EObject current=null] : (otherlv_0= 'start' otherlv_1= 'at' ( (lv_station_2_0= RULE_STRING ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? (otherlv_6= 'drive' otherlv_7= 'via' ( (otherlv_8= RULE_ID ) ) )? ) ;
    public final EObject ruleStartSpot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_station_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_platform_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalSchedule.g:530:2: ( (otherlv_0= 'start' otherlv_1= 'at' ( (lv_station_2_0= RULE_STRING ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? (otherlv_6= 'drive' otherlv_7= 'via' ( (otherlv_8= RULE_ID ) ) )? ) )
            // InternalSchedule.g:531:2: (otherlv_0= 'start' otherlv_1= 'at' ( (lv_station_2_0= RULE_STRING ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? (otherlv_6= 'drive' otherlv_7= 'via' ( (otherlv_8= RULE_ID ) ) )? )
            {
            // InternalSchedule.g:531:2: (otherlv_0= 'start' otherlv_1= 'at' ( (lv_station_2_0= RULE_STRING ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? (otherlv_6= 'drive' otherlv_7= 'via' ( (otherlv_8= RULE_ID ) ) )? )
            // InternalSchedule.g:532:3: otherlv_0= 'start' otherlv_1= 'at' ( (lv_station_2_0= RULE_STRING ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? (otherlv_6= 'drive' otherlv_7= 'via' ( (otherlv_8= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getStartSpotAccess().getStartKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getStartSpotAccess().getAtKeyword_1());
            		
            // InternalSchedule.g:540:3: ( (lv_station_2_0= RULE_STRING ) )
            // InternalSchedule.g:541:4: (lv_station_2_0= RULE_STRING )
            {
            // InternalSchedule.g:541:4: (lv_station_2_0= RULE_STRING )
            // InternalSchedule.g:542:5: lv_station_2_0= RULE_STRING
            {
            lv_station_2_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_station_2_0, grammarAccess.getStartSpotAccess().getStationSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartSpotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"station",
            						lv_station_2_0,
            						"org.mdse.pts.schedule.dsl.Schedule.STRING");
            				

            }


            }

            // InternalSchedule.g:558:3: (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSchedule.g:559:4: otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getStartSpotAccess().getOnKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getStartSpotAccess().getPlatformKeyword_3_1());
                    			
                    // InternalSchedule.g:567:4: ( (lv_platform_5_0= RULE_STRING ) )
                    // InternalSchedule.g:568:5: (lv_platform_5_0= RULE_STRING )
                    {
                    // InternalSchedule.g:568:5: (lv_platform_5_0= RULE_STRING )
                    // InternalSchedule.g:569:6: lv_platform_5_0= RULE_STRING
                    {
                    lv_platform_5_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_platform_5_0, grammarAccess.getStartSpotAccess().getPlatformSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStartSpotRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"platform",
                    							lv_platform_5_0,
                    							"org.mdse.pts.schedule.dsl.Schedule.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSchedule.g:586:3: (otherlv_6= 'drive' otherlv_7= 'via' ( (otherlv_8= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSchedule.g:587:4: otherlv_6= 'drive' otherlv_7= 'via' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getStartSpotAccess().getDriveKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getStartSpotAccess().getViaKeyword_4_1());
                    			
                    // InternalSchedule.g:595:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSchedule.g:596:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSchedule.g:596:5: (otherlv_8= RULE_ID )
                    // InternalSchedule.g:597:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStartSpotRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_8, grammarAccess.getStartSpotAccess().getLegLegCrossReference_4_2_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStartSpot"


    // $ANTLR start "entryRuleMiddleSpot"
    // InternalSchedule.g:613:1: entryRuleMiddleSpot returns [EObject current=null] : iv_ruleMiddleSpot= ruleMiddleSpot EOF ;
    public final EObject entryRuleMiddleSpot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMiddleSpot = null;


        try {
            // InternalSchedule.g:613:51: (iv_ruleMiddleSpot= ruleMiddleSpot EOF )
            // InternalSchedule.g:614:2: iv_ruleMiddleSpot= ruleMiddleSpot EOF
            {
             newCompositeNode(grammarAccess.getMiddleSpotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMiddleSpot=ruleMiddleSpot();

            state._fsp--;

             current =iv_ruleMiddleSpot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMiddleSpot"


    // $ANTLR start "ruleMiddleSpot"
    // InternalSchedule.g:620:1: ruleMiddleSpot returns [EObject current=null] : (otherlv_0= 'stop' otherlv_1= 'at' ( (lv_station_2_0= RULE_STRING ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? (otherlv_6= 'for' ( (lv_waitingTime_7_0= RULE_INT ) ) otherlv_8= 'min' )? ( (lv_turnStation_9_0= 'and turn' ) )? (otherlv_10= 'drive' otherlv_11= 'via' ( (otherlv_12= RULE_ID ) ) )? ) ;
    public final EObject ruleMiddleSpot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_station_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_platform_5_0=null;
        Token otherlv_6=null;
        Token lv_waitingTime_7_0=null;
        Token otherlv_8=null;
        Token lv_turnStation_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalSchedule.g:626:2: ( (otherlv_0= 'stop' otherlv_1= 'at' ( (lv_station_2_0= RULE_STRING ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? (otherlv_6= 'for' ( (lv_waitingTime_7_0= RULE_INT ) ) otherlv_8= 'min' )? ( (lv_turnStation_9_0= 'and turn' ) )? (otherlv_10= 'drive' otherlv_11= 'via' ( (otherlv_12= RULE_ID ) ) )? ) )
            // InternalSchedule.g:627:2: (otherlv_0= 'stop' otherlv_1= 'at' ( (lv_station_2_0= RULE_STRING ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? (otherlv_6= 'for' ( (lv_waitingTime_7_0= RULE_INT ) ) otherlv_8= 'min' )? ( (lv_turnStation_9_0= 'and turn' ) )? (otherlv_10= 'drive' otherlv_11= 'via' ( (otherlv_12= RULE_ID ) ) )? )
            {
            // InternalSchedule.g:627:2: (otherlv_0= 'stop' otherlv_1= 'at' ( (lv_station_2_0= RULE_STRING ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? (otherlv_6= 'for' ( (lv_waitingTime_7_0= RULE_INT ) ) otherlv_8= 'min' )? ( (lv_turnStation_9_0= 'and turn' ) )? (otherlv_10= 'drive' otherlv_11= 'via' ( (otherlv_12= RULE_ID ) ) )? )
            // InternalSchedule.g:628:3: otherlv_0= 'stop' otherlv_1= 'at' ( (lv_station_2_0= RULE_STRING ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? (otherlv_6= 'for' ( (lv_waitingTime_7_0= RULE_INT ) ) otherlv_8= 'min' )? ( (lv_turnStation_9_0= 'and turn' ) )? (otherlv_10= 'drive' otherlv_11= 'via' ( (otherlv_12= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getMiddleSpotAccess().getStopKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getMiddleSpotAccess().getAtKeyword_1());
            		
            // InternalSchedule.g:636:3: ( (lv_station_2_0= RULE_STRING ) )
            // InternalSchedule.g:637:4: (lv_station_2_0= RULE_STRING )
            {
            // InternalSchedule.g:637:4: (lv_station_2_0= RULE_STRING )
            // InternalSchedule.g:638:5: lv_station_2_0= RULE_STRING
            {
            lv_station_2_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_station_2_0, grammarAccess.getMiddleSpotAccess().getStationSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMiddleSpotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"station",
            						lv_station_2_0,
            						"org.mdse.pts.schedule.dsl.Schedule.STRING");
            				

            }


            }

            // InternalSchedule.g:654:3: (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSchedule.g:655:4: otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getMiddleSpotAccess().getOnKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getMiddleSpotAccess().getPlatformKeyword_3_1());
                    			
                    // InternalSchedule.g:663:4: ( (lv_platform_5_0= RULE_STRING ) )
                    // InternalSchedule.g:664:5: (lv_platform_5_0= RULE_STRING )
                    {
                    // InternalSchedule.g:664:5: (lv_platform_5_0= RULE_STRING )
                    // InternalSchedule.g:665:6: lv_platform_5_0= RULE_STRING
                    {
                    lv_platform_5_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

                    						newLeafNode(lv_platform_5_0, grammarAccess.getMiddleSpotAccess().getPlatformSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMiddleSpotRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"platform",
                    							lv_platform_5_0,
                    							"org.mdse.pts.schedule.dsl.Schedule.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSchedule.g:682:3: (otherlv_6= 'for' ( (lv_waitingTime_7_0= RULE_INT ) ) otherlv_8= 'min' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSchedule.g:683:4: otherlv_6= 'for' ( (lv_waitingTime_7_0= RULE_INT ) ) otherlv_8= 'min'
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getMiddleSpotAccess().getForKeyword_4_0());
                    			
                    // InternalSchedule.g:687:4: ( (lv_waitingTime_7_0= RULE_INT ) )
                    // InternalSchedule.g:688:5: (lv_waitingTime_7_0= RULE_INT )
                    {
                    // InternalSchedule.g:688:5: (lv_waitingTime_7_0= RULE_INT )
                    // InternalSchedule.g:689:6: lv_waitingTime_7_0= RULE_INT
                    {
                    lv_waitingTime_7_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                    						newLeafNode(lv_waitingTime_7_0, grammarAccess.getMiddleSpotAccess().getWaitingTimeINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMiddleSpotRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"waitingTime",
                    							lv_waitingTime_7_0,
                    							"org.mdse.pts.schedule.dsl.Schedule.INT");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,26,FOLLOW_26); 

                    				newLeafNode(otherlv_8, grammarAccess.getMiddleSpotAccess().getMinKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalSchedule.g:710:3: ( (lv_turnStation_9_0= 'and turn' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSchedule.g:711:4: (lv_turnStation_9_0= 'and turn' )
                    {
                    // InternalSchedule.g:711:4: (lv_turnStation_9_0= 'and turn' )
                    // InternalSchedule.g:712:5: lv_turnStation_9_0= 'and turn'
                    {
                    lv_turnStation_9_0=(Token)match(input,27,FOLLOW_21); 

                    					newLeafNode(lv_turnStation_9_0, grammarAccess.getMiddleSpotAccess().getTurnStationAndTurnKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMiddleSpotRule());
                    					}
                    					setWithLastConsumed(current, "turnStation", true, "and turn");
                    				

                    }


                    }
                    break;

            }

            // InternalSchedule.g:724:3: (otherlv_10= 'drive' otherlv_11= 'via' ( (otherlv_12= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSchedule.g:725:4: otherlv_10= 'drive' otherlv_11= 'via' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getMiddleSpotAccess().getDriveKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getMiddleSpotAccess().getViaKeyword_6_1());
                    			
                    // InternalSchedule.g:733:4: ( (otherlv_12= RULE_ID ) )
                    // InternalSchedule.g:734:5: (otherlv_12= RULE_ID )
                    {
                    // InternalSchedule.g:734:5: (otherlv_12= RULE_ID )
                    // InternalSchedule.g:735:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMiddleSpotRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_12, grammarAccess.getMiddleSpotAccess().getLegLegCrossReference_6_2_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMiddleSpot"


    // $ANTLR start "entryRuleFinalSpot"
    // InternalSchedule.g:751:1: entryRuleFinalSpot returns [EObject current=null] : iv_ruleFinalSpot= ruleFinalSpot EOF ;
    public final EObject entryRuleFinalSpot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalSpot = null;


        try {
            // InternalSchedule.g:751:50: (iv_ruleFinalSpot= ruleFinalSpot EOF )
            // InternalSchedule.g:752:2: iv_ruleFinalSpot= ruleFinalSpot EOF
            {
             newCompositeNode(grammarAccess.getFinalSpotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinalSpot=ruleFinalSpot();

            state._fsp--;

             current =iv_ruleFinalSpot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFinalSpot"


    // $ANTLR start "ruleFinalSpot"
    // InternalSchedule.g:758:1: ruleFinalSpot returns [EObject current=null] : (otherlv_0= 'terminate' otherlv_1= 'at' ( (lv_station_2_0= RULE_STRING ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleFinalSpot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_station_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_platform_5_0=null;


        	enterRule();

        try {
            // InternalSchedule.g:764:2: ( (otherlv_0= 'terminate' otherlv_1= 'at' ( (lv_station_2_0= RULE_STRING ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? ) )
            // InternalSchedule.g:765:2: (otherlv_0= 'terminate' otherlv_1= 'at' ( (lv_station_2_0= RULE_STRING ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? )
            {
            // InternalSchedule.g:765:2: (otherlv_0= 'terminate' otherlv_1= 'at' ( (lv_station_2_0= RULE_STRING ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? )
            // InternalSchedule.g:766:3: otherlv_0= 'terminate' otherlv_1= 'at' ( (lv_station_2_0= RULE_STRING ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getFinalSpotAccess().getTerminateKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getFinalSpotAccess().getAtKeyword_1());
            		
            // InternalSchedule.g:774:3: ( (lv_station_2_0= RULE_STRING ) )
            // InternalSchedule.g:775:4: (lv_station_2_0= RULE_STRING )
            {
            // InternalSchedule.g:775:4: (lv_station_2_0= RULE_STRING )
            // InternalSchedule.g:776:5: lv_station_2_0= RULE_STRING
            {
            lv_station_2_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_station_2_0, grammarAccess.getFinalSpotAccess().getStationSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFinalSpotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"station",
            						lv_station_2_0,
            						"org.mdse.pts.schedule.dsl.Schedule.STRING");
            				

            }


            }

            // InternalSchedule.g:792:3: (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSchedule.g:793:4: otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getFinalSpotAccess().getOnKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getFinalSpotAccess().getPlatformKeyword_3_1());
                    			
                    // InternalSchedule.g:801:4: ( (lv_platform_5_0= RULE_STRING ) )
                    // InternalSchedule.g:802:5: (lv_platform_5_0= RULE_STRING )
                    {
                    // InternalSchedule.g:802:5: (lv_platform_5_0= RULE_STRING )
                    // InternalSchedule.g:803:6: lv_platform_5_0= RULE_STRING
                    {
                    lv_platform_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_platform_5_0, grammarAccess.getFinalSpotAccess().getPlatformSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFinalSpotRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"platform",
                    							lv_platform_5_0,
                    							"org.mdse.pts.schedule.dsl.Schedule.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFinalSpot"


    // $ANTLR start "ruleWeekDays"
    // InternalSchedule.g:824:1: ruleWeekDays returns [Enumerator current=null] : ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) ;
    public final Enumerator ruleWeekDays() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalSchedule.g:830:2: ( ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) )
            // InternalSchedule.g:831:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            {
            // InternalSchedule.g:831:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            int alt14=7;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 31:
                {
                alt14=3;
                }
                break;
            case 32:
                {
                alt14=4;
                }
                break;
            case 33:
                {
                alt14=5;
                }
                break;
            case 34:
                {
                alt14=6;
                }
                break;
            case 35:
                {
                alt14=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSchedule.g:832:3: (enumLiteral_0= 'Monday' )
                    {
                    // InternalSchedule.g:832:3: (enumLiteral_0= 'Monday' )
                    // InternalSchedule.g:833:4: enumLiteral_0= 'Monday'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getWeekDaysAccess().getMONDAYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWeekDaysAccess().getMONDAYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSchedule.g:840:3: (enumLiteral_1= 'Tuesday' )
                    {
                    // InternalSchedule.g:840:3: (enumLiteral_1= 'Tuesday' )
                    // InternalSchedule.g:841:4: enumLiteral_1= 'Tuesday'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getWeekDaysAccess().getTUESDAYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWeekDaysAccess().getTUESDAYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSchedule.g:848:3: (enumLiteral_2= 'Wednesday' )
                    {
                    // InternalSchedule.g:848:3: (enumLiteral_2= 'Wednesday' )
                    // InternalSchedule.g:849:4: enumLiteral_2= 'Wednesday'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getWeekDaysAccess().getWEDNESDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWeekDaysAccess().getWEDNESDAYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSchedule.g:856:3: (enumLiteral_3= 'Thursday' )
                    {
                    // InternalSchedule.g:856:3: (enumLiteral_3= 'Thursday' )
                    // InternalSchedule.g:857:4: enumLiteral_3= 'Thursday'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getWeekDaysAccess().getTHURSDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWeekDaysAccess().getTHURSDAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSchedule.g:864:3: (enumLiteral_4= 'Friday' )
                    {
                    // InternalSchedule.g:864:3: (enumLiteral_4= 'Friday' )
                    // InternalSchedule.g:865:4: enumLiteral_4= 'Friday'
                    {
                    enumLiteral_4=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getWeekDaysAccess().getFRIDAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getWeekDaysAccess().getFRIDAYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSchedule.g:872:3: (enumLiteral_5= 'Saturday' )
                    {
                    // InternalSchedule.g:872:3: (enumLiteral_5= 'Saturday' )
                    // InternalSchedule.g:873:4: enumLiteral_5= 'Saturday'
                    {
                    enumLiteral_5=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getWeekDaysAccess().getSATURDAYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getWeekDaysAccess().getSATURDAYEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSchedule.g:880:3: (enumLiteral_6= 'Sunday' )
                    {
                    // InternalSchedule.g:880:3: (enumLiteral_6= 'Sunday' )
                    // InternalSchedule.g:881:4: enumLiteral_6= 'Sunday'
                    {
                    enumLiteral_6=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getWeekDaysAccess().getSUNDAYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getWeekDaysAccess().getSUNDAYEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWeekDays"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000FE0000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000098000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000840002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008842002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008802002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008800002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000040002L});

}