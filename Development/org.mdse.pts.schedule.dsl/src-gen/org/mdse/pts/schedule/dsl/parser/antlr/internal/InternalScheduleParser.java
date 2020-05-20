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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_LETTER", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'schedule'", "'for'", "'with'", "','", "':'", "'train'", "'on'", "'and'", "'at'", "'start'", "'platform'", "'drive'", "'via'", "'stop'", "'min'", "'turn'", "'terminate'", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Sunday'"
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
    // InternalSchedule.g:171:1: ruleTrainSchedule returns [EObject current=null] : (otherlv_0= 'train' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'on' ( (lv_timeDescription_3_0= ruleTimeDescription ) ) otherlv_4= ':' ( (lv_route_5_0= ruleRoute ) ) ) ;
    public final EObject ruleTrainSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_timeDescription_3_0 = null;

        EObject lv_route_5_0 = null;



        	enterRule();

        try {
            // InternalSchedule.g:177:2: ( (otherlv_0= 'train' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'on' ( (lv_timeDescription_3_0= ruleTimeDescription ) ) otherlv_4= ':' ( (lv_route_5_0= ruleRoute ) ) ) )
            // InternalSchedule.g:178:2: (otherlv_0= 'train' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'on' ( (lv_timeDescription_3_0= ruleTimeDescription ) ) otherlv_4= ':' ( (lv_route_5_0= ruleRoute ) ) )
            {
            // InternalSchedule.g:178:2: (otherlv_0= 'train' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'on' ( (lv_timeDescription_3_0= ruleTimeDescription ) ) otherlv_4= ':' ( (lv_route_5_0= ruleRoute ) ) )
            // InternalSchedule.g:179:3: otherlv_0= 'train' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'on' ( (lv_timeDescription_3_0= ruleTimeDescription ) ) otherlv_4= ':' ( (lv_route_5_0= ruleRoute ) )
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
            		
            // InternalSchedule.g:200:3: ( (lv_timeDescription_3_0= ruleTimeDescription ) )
            // InternalSchedule.g:201:4: (lv_timeDescription_3_0= ruleTimeDescription )
            {
            // InternalSchedule.g:201:4: (lv_timeDescription_3_0= ruleTimeDescription )
            // InternalSchedule.g:202:5: lv_timeDescription_3_0= ruleTimeDescription
            {

            					newCompositeNode(grammarAccess.getTrainScheduleAccess().getTimeDescriptionTimeDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_timeDescription_3_0=ruleTimeDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrainScheduleRule());
            					}
            					set(
            						current,
            						"timeDescription",
            						lv_timeDescription_3_0,
            						"org.mdse.pts.schedule.dsl.Schedule.TimeDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getTrainScheduleAccess().getColonKeyword_4());
            		
            // InternalSchedule.g:223:3: ( (lv_route_5_0= ruleRoute ) )
            // InternalSchedule.g:224:4: (lv_route_5_0= ruleRoute )
            {
            // InternalSchedule.g:224:4: (lv_route_5_0= ruleRoute )
            // InternalSchedule.g:225:5: lv_route_5_0= ruleRoute
            {

            					newCompositeNode(grammarAccess.getTrainScheduleAccess().getRouteRouteParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_route_5_0=ruleRoute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrainScheduleRule());
            					}
            					set(
            						current,
            						"route",
            						lv_route_5_0,
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


    // $ANTLR start "entryRuleTimeDescription"
    // InternalSchedule.g:246:1: entryRuleTimeDescription returns [EObject current=null] : iv_ruleTimeDescription= ruleTimeDescription EOF ;
    public final EObject entryRuleTimeDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeDescription = null;


        try {
            // InternalSchedule.g:246:56: (iv_ruleTimeDescription= ruleTimeDescription EOF )
            // InternalSchedule.g:247:2: iv_ruleTimeDescription= ruleTimeDescription EOF
            {
             newCompositeNode(grammarAccess.getTimeDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeDescription=ruleTimeDescription();

            state._fsp--;

             current =iv_ruleTimeDescription; 
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
    // $ANTLR end "entryRuleTimeDescription"


    // $ANTLR start "ruleTimeDescription"
    // InternalSchedule.g:253:1: ruleTimeDescription returns [EObject current=null] : ( ( (lv_dateTimes_0_0= ruleDateTime ) ) ( (otherlv_1= ',' ( (lv_dateTimes_2_0= ruleDateTime ) ) )* otherlv_3= 'and' ( (lv_dateTimes_4_0= ruleDateTime ) ) )? ) ;
    public final EObject ruleTimeDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_dateTimes_0_0 = null;

        EObject lv_dateTimes_2_0 = null;

        EObject lv_dateTimes_4_0 = null;



        	enterRule();

        try {
            // InternalSchedule.g:259:2: ( ( ( (lv_dateTimes_0_0= ruleDateTime ) ) ( (otherlv_1= ',' ( (lv_dateTimes_2_0= ruleDateTime ) ) )* otherlv_3= 'and' ( (lv_dateTimes_4_0= ruleDateTime ) ) )? ) )
            // InternalSchedule.g:260:2: ( ( (lv_dateTimes_0_0= ruleDateTime ) ) ( (otherlv_1= ',' ( (lv_dateTimes_2_0= ruleDateTime ) ) )* otherlv_3= 'and' ( (lv_dateTimes_4_0= ruleDateTime ) ) )? )
            {
            // InternalSchedule.g:260:2: ( ( (lv_dateTimes_0_0= ruleDateTime ) ) ( (otherlv_1= ',' ( (lv_dateTimes_2_0= ruleDateTime ) ) )* otherlv_3= 'and' ( (lv_dateTimes_4_0= ruleDateTime ) ) )? )
            // InternalSchedule.g:261:3: ( (lv_dateTimes_0_0= ruleDateTime ) ) ( (otherlv_1= ',' ( (lv_dateTimes_2_0= ruleDateTime ) ) )* otherlv_3= 'and' ( (lv_dateTimes_4_0= ruleDateTime ) ) )?
            {
            // InternalSchedule.g:261:3: ( (lv_dateTimes_0_0= ruleDateTime ) )
            // InternalSchedule.g:262:4: (lv_dateTimes_0_0= ruleDateTime )
            {
            // InternalSchedule.g:262:4: (lv_dateTimes_0_0= ruleDateTime )
            // InternalSchedule.g:263:5: lv_dateTimes_0_0= ruleDateTime
            {

            					newCompositeNode(grammarAccess.getTimeDescriptionAccess().getDateTimesDateTimeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_dateTimes_0_0=ruleDateTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeDescriptionRule());
            					}
            					add(
            						current,
            						"dateTimes",
            						lv_dateTimes_0_0,
            						"org.mdse.pts.schedule.dsl.Schedule.DateTime");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSchedule.g:280:3: ( (otherlv_1= ',' ( (lv_dateTimes_2_0= ruleDateTime ) ) )* otherlv_3= 'and' ( (lv_dateTimes_4_0= ruleDateTime ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15||LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSchedule.g:281:4: (otherlv_1= ',' ( (lv_dateTimes_2_0= ruleDateTime ) ) )* otherlv_3= 'and' ( (lv_dateTimes_4_0= ruleDateTime ) )
                    {
                    // InternalSchedule.g:281:4: (otherlv_1= ',' ( (lv_dateTimes_2_0= ruleDateTime ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSchedule.g:282:5: otherlv_1= ',' ( (lv_dateTimes_2_0= ruleDateTime ) )
                    	    {
                    	    otherlv_1=(Token)match(input,15,FOLLOW_9); 

                    	    					newLeafNode(otherlv_1, grammarAccess.getTimeDescriptionAccess().getCommaKeyword_1_0_0());
                    	    				
                    	    // InternalSchedule.g:286:5: ( (lv_dateTimes_2_0= ruleDateTime ) )
                    	    // InternalSchedule.g:287:6: (lv_dateTimes_2_0= ruleDateTime )
                    	    {
                    	    // InternalSchedule.g:287:6: (lv_dateTimes_2_0= ruleDateTime )
                    	    // InternalSchedule.g:288:7: lv_dateTimes_2_0= ruleDateTime
                    	    {

                    	    							newCompositeNode(grammarAccess.getTimeDescriptionAccess().getDateTimesDateTimeParserRuleCall_1_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_dateTimes_2_0=ruleDateTime();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTimeDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"dateTimes",
                    	    								lv_dateTimes_2_0,
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

                    otherlv_3=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getTimeDescriptionAccess().getAndKeyword_1_1());
                    			
                    // InternalSchedule.g:310:4: ( (lv_dateTimes_4_0= ruleDateTime ) )
                    // InternalSchedule.g:311:5: (lv_dateTimes_4_0= ruleDateTime )
                    {
                    // InternalSchedule.g:311:5: (lv_dateTimes_4_0= ruleDateTime )
                    // InternalSchedule.g:312:6: lv_dateTimes_4_0= ruleDateTime
                    {

                    						newCompositeNode(grammarAccess.getTimeDescriptionAccess().getDateTimesDateTimeParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_dateTimes_4_0=ruleDateTime();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimeDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"dateTimes",
                    							lv_dateTimes_4_0,
                    							"org.mdse.pts.schedule.dsl.Schedule.DateTime");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleTimeDescription"


    // $ANTLR start "entryRuleDateTime"
    // InternalSchedule.g:334:1: entryRuleDateTime returns [EObject current=null] : iv_ruleDateTime= ruleDateTime EOF ;
    public final EObject entryRuleDateTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTime = null;


        try {
            // InternalSchedule.g:334:49: (iv_ruleDateTime= ruleDateTime EOF )
            // InternalSchedule.g:335:2: iv_ruleDateTime= ruleDateTime EOF
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
    // InternalSchedule.g:341:1: ruleDateTime returns [EObject current=null] : ( ( (lv_weekdays_0_0= ruleWeekDay ) ) (otherlv_1= ',' ( (lv_weekdays_2_0= ruleWeekDay ) ) )* otherlv_3= 'at' ( (lv_time_4_0= ruleTime ) ) ) ;
    public final EObject ruleDateTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_weekdays_0_0 = null;

        Enumerator lv_weekdays_2_0 = null;

        EObject lv_time_4_0 = null;



        	enterRule();

        try {
            // InternalSchedule.g:347:2: ( ( ( (lv_weekdays_0_0= ruleWeekDay ) ) (otherlv_1= ',' ( (lv_weekdays_2_0= ruleWeekDay ) ) )* otherlv_3= 'at' ( (lv_time_4_0= ruleTime ) ) ) )
            // InternalSchedule.g:348:2: ( ( (lv_weekdays_0_0= ruleWeekDay ) ) (otherlv_1= ',' ( (lv_weekdays_2_0= ruleWeekDay ) ) )* otherlv_3= 'at' ( (lv_time_4_0= ruleTime ) ) )
            {
            // InternalSchedule.g:348:2: ( ( (lv_weekdays_0_0= ruleWeekDay ) ) (otherlv_1= ',' ( (lv_weekdays_2_0= ruleWeekDay ) ) )* otherlv_3= 'at' ( (lv_time_4_0= ruleTime ) ) )
            // InternalSchedule.g:349:3: ( (lv_weekdays_0_0= ruleWeekDay ) ) (otherlv_1= ',' ( (lv_weekdays_2_0= ruleWeekDay ) ) )* otherlv_3= 'at' ( (lv_time_4_0= ruleTime ) )
            {
            // InternalSchedule.g:349:3: ( (lv_weekdays_0_0= ruleWeekDay ) )
            // InternalSchedule.g:350:4: (lv_weekdays_0_0= ruleWeekDay )
            {
            // InternalSchedule.g:350:4: (lv_weekdays_0_0= ruleWeekDay )
            // InternalSchedule.g:351:5: lv_weekdays_0_0= ruleWeekDay
            {

            					newCompositeNode(grammarAccess.getDateTimeAccess().getWeekdaysWeekDayEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_weekdays_0_0=ruleWeekDay();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDateTimeRule());
            					}
            					add(
            						current,
            						"weekdays",
            						lv_weekdays_0_0,
            						"org.mdse.pts.schedule.dsl.Schedule.WeekDay");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSchedule.g:368:3: (otherlv_1= ',' ( (lv_weekdays_2_0= ruleWeekDay ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSchedule.g:369:4: otherlv_1= ',' ( (lv_weekdays_2_0= ruleWeekDay ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getDateTimeAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalSchedule.g:373:4: ( (lv_weekdays_2_0= ruleWeekDay ) )
            	    // InternalSchedule.g:374:5: (lv_weekdays_2_0= ruleWeekDay )
            	    {
            	    // InternalSchedule.g:374:5: (lv_weekdays_2_0= ruleWeekDay )
            	    // InternalSchedule.g:375:6: lv_weekdays_2_0= ruleWeekDay
            	    {

            	    						newCompositeNode(grammarAccess.getDateTimeAccess().getWeekdaysWeekDayEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_weekdays_2_0=ruleWeekDay();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDateTimeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"weekdays",
            	    							lv_weekdays_2_0,
            	    							"org.mdse.pts.schedule.dsl.Schedule.WeekDay");
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
            		
            // InternalSchedule.g:397:3: ( (lv_time_4_0= ruleTime ) )
            // InternalSchedule.g:398:4: (lv_time_4_0= ruleTime )
            {
            // InternalSchedule.g:398:4: (lv_time_4_0= ruleTime )
            // InternalSchedule.g:399:5: lv_time_4_0= ruleTime
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
    // InternalSchedule.g:420:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalSchedule.g:420:45: (iv_ruleTime= ruleTime EOF )
            // InternalSchedule.g:421:2: iv_ruleTime= ruleTime EOF
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
    // InternalSchedule.g:427:1: ruleTime returns [EObject current=null] : ( ( (lv_hours_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minutes_2_0= RULE_INT ) ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_hours_0_0=null;
        Token otherlv_1=null;
        Token lv_minutes_2_0=null;


        	enterRule();

        try {
            // InternalSchedule.g:433:2: ( ( ( (lv_hours_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minutes_2_0= RULE_INT ) ) ) )
            // InternalSchedule.g:434:2: ( ( (lv_hours_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minutes_2_0= RULE_INT ) ) )
            {
            // InternalSchedule.g:434:2: ( ( (lv_hours_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minutes_2_0= RULE_INT ) ) )
            // InternalSchedule.g:435:3: ( (lv_hours_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minutes_2_0= RULE_INT ) )
            {
            // InternalSchedule.g:435:3: ( (lv_hours_0_0= RULE_INT ) )
            // InternalSchedule.g:436:4: (lv_hours_0_0= RULE_INT )
            {
            // InternalSchedule.g:436:4: (lv_hours_0_0= RULE_INT )
            // InternalSchedule.g:437:5: lv_hours_0_0= RULE_INT
            {
            lv_hours_0_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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
            		
            // InternalSchedule.g:457:3: ( (lv_minutes_2_0= RULE_INT ) )
            // InternalSchedule.g:458:4: (lv_minutes_2_0= RULE_INT )
            {
            // InternalSchedule.g:458:4: (lv_minutes_2_0= RULE_INT )
            // InternalSchedule.g:459:5: lv_minutes_2_0= RULE_INT
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
    // InternalSchedule.g:479:1: entryRuleRoute returns [EObject current=null] : iv_ruleRoute= ruleRoute EOF ;
    public final EObject entryRuleRoute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoute = null;


        try {
            // InternalSchedule.g:479:46: (iv_ruleRoute= ruleRoute EOF )
            // InternalSchedule.g:480:2: iv_ruleRoute= ruleRoute EOF
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
    // InternalSchedule.g:486:1: ruleRoute returns [EObject current=null] : ( ( (lv_spots_0_0= ruleStartSpot ) ) ( (lv_spots_1_0= ruleMiddleSpot ) )* ( (lv_spots_2_0= ruleFinalSpot ) ) ) ;
    public final EObject ruleRoute() throws RecognitionException {
        EObject current = null;

        EObject lv_spots_0_0 = null;

        EObject lv_spots_1_0 = null;

        EObject lv_spots_2_0 = null;



        	enterRule();

        try {
            // InternalSchedule.g:492:2: ( ( ( (lv_spots_0_0= ruleStartSpot ) ) ( (lv_spots_1_0= ruleMiddleSpot ) )* ( (lv_spots_2_0= ruleFinalSpot ) ) ) )
            // InternalSchedule.g:493:2: ( ( (lv_spots_0_0= ruleStartSpot ) ) ( (lv_spots_1_0= ruleMiddleSpot ) )* ( (lv_spots_2_0= ruleFinalSpot ) ) )
            {
            // InternalSchedule.g:493:2: ( ( (lv_spots_0_0= ruleStartSpot ) ) ( (lv_spots_1_0= ruleMiddleSpot ) )* ( (lv_spots_2_0= ruleFinalSpot ) ) )
            // InternalSchedule.g:494:3: ( (lv_spots_0_0= ruleStartSpot ) ) ( (lv_spots_1_0= ruleMiddleSpot ) )* ( (lv_spots_2_0= ruleFinalSpot ) )
            {
            // InternalSchedule.g:494:3: ( (lv_spots_0_0= ruleStartSpot ) )
            // InternalSchedule.g:495:4: (lv_spots_0_0= ruleStartSpot )
            {
            // InternalSchedule.g:495:4: (lv_spots_0_0= ruleStartSpot )
            // InternalSchedule.g:496:5: lv_spots_0_0= ruleStartSpot
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getSpotsStartSpotParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_spots_0_0=ruleStartSpot();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					add(
            						current,
            						"spots",
            						lv_spots_0_0,
            						"org.mdse.pts.schedule.dsl.Schedule.StartSpot");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSchedule.g:513:3: ( (lv_spots_1_0= ruleMiddleSpot ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSchedule.g:514:4: (lv_spots_1_0= ruleMiddleSpot )
            	    {
            	    // InternalSchedule.g:514:4: (lv_spots_1_0= ruleMiddleSpot )
            	    // InternalSchedule.g:515:5: lv_spots_1_0= ruleMiddleSpot
            	    {

            	    					newCompositeNode(grammarAccess.getRouteAccess().getSpotsMiddleSpotParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_spots_1_0=ruleMiddleSpot();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRouteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"spots",
            	    						lv_spots_1_0,
            	    						"org.mdse.pts.schedule.dsl.Schedule.MiddleSpot");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalSchedule.g:532:3: ( (lv_spots_2_0= ruleFinalSpot ) )
            // InternalSchedule.g:533:4: (lv_spots_2_0= ruleFinalSpot )
            {
            // InternalSchedule.g:533:4: (lv_spots_2_0= ruleFinalSpot )
            // InternalSchedule.g:534:5: lv_spots_2_0= ruleFinalSpot
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getSpotsFinalSpotParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_spots_2_0=ruleFinalSpot();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					add(
            						current,
            						"spots",
            						lv_spots_2_0,
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
    // InternalSchedule.g:555:1: entryRuleStartSpot returns [EObject current=null] : iv_ruleStartSpot= ruleStartSpot EOF ;
    public final EObject entryRuleStartSpot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartSpot = null;


        try {
            // InternalSchedule.g:555:50: (iv_ruleStartSpot= ruleStartSpot EOF )
            // InternalSchedule.g:556:2: iv_ruleStartSpot= ruleStartSpot EOF
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
    // InternalSchedule.g:562:1: ruleStartSpot returns [EObject current=null] : (otherlv_0= 'start' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? (otherlv_6= 'drive' otherlv_7= 'via' ( (otherlv_8= RULE_ID ) ) )? ) ;
    public final EObject ruleStartSpot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_platform_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalSchedule.g:568:2: ( (otherlv_0= 'start' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? (otherlv_6= 'drive' otherlv_7= 'via' ( (otherlv_8= RULE_ID ) ) )? ) )
            // InternalSchedule.g:569:2: (otherlv_0= 'start' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? (otherlv_6= 'drive' otherlv_7= 'via' ( (otherlv_8= RULE_ID ) ) )? )
            {
            // InternalSchedule.g:569:2: (otherlv_0= 'start' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? (otherlv_6= 'drive' otherlv_7= 'via' ( (otherlv_8= RULE_ID ) ) )? )
            // InternalSchedule.g:570:3: otherlv_0= 'start' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? (otherlv_6= 'drive' otherlv_7= 'via' ( (otherlv_8= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getStartSpotAccess().getStartKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStartSpotAccess().getAtKeyword_1());
            		
            // InternalSchedule.g:578:3: ( (otherlv_2= RULE_ID ) )
            // InternalSchedule.g:579:4: (otherlv_2= RULE_ID )
            {
            // InternalSchedule.g:579:4: (otherlv_2= RULE_ID )
            // InternalSchedule.g:580:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartSpotRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_2, grammarAccess.getStartSpotAccess().getStationStationCrossReference_2_0());
            				

            }


            }

            // InternalSchedule.g:591:3: (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSchedule.g:592:4: otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getStartSpotAccess().getOnKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,22,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getStartSpotAccess().getPlatformKeyword_3_1());
                    			
                    // InternalSchedule.g:600:4: ( (lv_platform_5_0= RULE_STRING ) )
                    // InternalSchedule.g:601:5: (lv_platform_5_0= RULE_STRING )
                    {
                    // InternalSchedule.g:601:5: (lv_platform_5_0= RULE_STRING )
                    // InternalSchedule.g:602:6: lv_platform_5_0= RULE_STRING
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

            // InternalSchedule.g:619:3: (otherlv_6= 'drive' otherlv_7= 'via' ( (otherlv_8= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSchedule.g:620:4: otherlv_6= 'drive' otherlv_7= 'via' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getStartSpotAccess().getDriveKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getStartSpotAccess().getViaKeyword_4_1());
                    			
                    // InternalSchedule.g:628:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSchedule.g:629:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSchedule.g:629:5: (otherlv_8= RULE_ID )
                    // InternalSchedule.g:630:6: otherlv_8= RULE_ID
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
    // InternalSchedule.g:646:1: entryRuleMiddleSpot returns [EObject current=null] : iv_ruleMiddleSpot= ruleMiddleSpot EOF ;
    public final EObject entryRuleMiddleSpot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMiddleSpot = null;


        try {
            // InternalSchedule.g:646:51: (iv_ruleMiddleSpot= ruleMiddleSpot EOF )
            // InternalSchedule.g:647:2: iv_ruleMiddleSpot= ruleMiddleSpot EOF
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
    // InternalSchedule.g:653:1: ruleMiddleSpot returns [EObject current=null] : (otherlv_0= 'stop' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_waitingTime_7_0= RULE_INT ) ) otherlv_8= 'min' (otherlv_9= 'and' ( (lv_turnStation_10_0= 'turn' ) ) )? (otherlv_11= 'drive' otherlv_12= 'via' ( (otherlv_13= RULE_ID ) ) )? ) ;
    public final EObject ruleMiddleSpot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_platform_5_0=null;
        Token otherlv_6=null;
        Token lv_waitingTime_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_turnStation_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalSchedule.g:659:2: ( (otherlv_0= 'stop' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_waitingTime_7_0= RULE_INT ) ) otherlv_8= 'min' (otherlv_9= 'and' ( (lv_turnStation_10_0= 'turn' ) ) )? (otherlv_11= 'drive' otherlv_12= 'via' ( (otherlv_13= RULE_ID ) ) )? ) )
            // InternalSchedule.g:660:2: (otherlv_0= 'stop' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_waitingTime_7_0= RULE_INT ) ) otherlv_8= 'min' (otherlv_9= 'and' ( (lv_turnStation_10_0= 'turn' ) ) )? (otherlv_11= 'drive' otherlv_12= 'via' ( (otherlv_13= RULE_ID ) ) )? )
            {
            // InternalSchedule.g:660:2: (otherlv_0= 'stop' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_waitingTime_7_0= RULE_INT ) ) otherlv_8= 'min' (otherlv_9= 'and' ( (lv_turnStation_10_0= 'turn' ) ) )? (otherlv_11= 'drive' otherlv_12= 'via' ( (otherlv_13= RULE_ID ) ) )? )
            // InternalSchedule.g:661:3: otherlv_0= 'stop' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_waitingTime_7_0= RULE_INT ) ) otherlv_8= 'min' (otherlv_9= 'and' ( (lv_turnStation_10_0= 'turn' ) ) )? (otherlv_11= 'drive' otherlv_12= 'via' ( (otherlv_13= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getMiddleSpotAccess().getStopKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMiddleSpotAccess().getAtKeyword_1());
            		
            // InternalSchedule.g:669:3: ( (otherlv_2= RULE_ID ) )
            // InternalSchedule.g:670:4: (otherlv_2= RULE_ID )
            {
            // InternalSchedule.g:670:4: (otherlv_2= RULE_ID )
            // InternalSchedule.g:671:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMiddleSpotRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_2, grammarAccess.getMiddleSpotAccess().getStationStationCrossReference_2_0());
            				

            }


            }

            // InternalSchedule.g:682:3: (otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSchedule.g:683:4: otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getMiddleSpotAccess().getOnKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,22,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getMiddleSpotAccess().getPlatformKeyword_3_1());
                    			
                    // InternalSchedule.g:691:4: ( (lv_platform_5_0= RULE_STRING ) )
                    // InternalSchedule.g:692:5: (lv_platform_5_0= RULE_STRING )
                    {
                    // InternalSchedule.g:692:5: (lv_platform_5_0= RULE_STRING )
                    // InternalSchedule.g:693:6: lv_platform_5_0= RULE_STRING
                    {
                    lv_platform_5_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

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

            otherlv_6=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getMiddleSpotAccess().getForKeyword_4());
            		
            // InternalSchedule.g:714:3: ( (lv_waitingTime_7_0= RULE_INT ) )
            // InternalSchedule.g:715:4: (lv_waitingTime_7_0= RULE_INT )
            {
            // InternalSchedule.g:715:4: (lv_waitingTime_7_0= RULE_INT )
            // InternalSchedule.g:716:5: lv_waitingTime_7_0= RULE_INT
            {
            lv_waitingTime_7_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_waitingTime_7_0, grammarAccess.getMiddleSpotAccess().getWaitingTimeINTTerminalRuleCall_5_0());
            				

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

            otherlv_8=(Token)match(input,26,FOLLOW_25); 

            			newLeafNode(otherlv_8, grammarAccess.getMiddleSpotAccess().getMinKeyword_6());
            		
            // InternalSchedule.g:736:3: (otherlv_9= 'and' ( (lv_turnStation_10_0= 'turn' ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSchedule.g:737:4: otherlv_9= 'and' ( (lv_turnStation_10_0= 'turn' ) )
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_26); 

                    				newLeafNode(otherlv_9, grammarAccess.getMiddleSpotAccess().getAndKeyword_7_0());
                    			
                    // InternalSchedule.g:741:4: ( (lv_turnStation_10_0= 'turn' ) )
                    // InternalSchedule.g:742:5: (lv_turnStation_10_0= 'turn' )
                    {
                    // InternalSchedule.g:742:5: (lv_turnStation_10_0= 'turn' )
                    // InternalSchedule.g:743:6: lv_turnStation_10_0= 'turn'
                    {
                    lv_turnStation_10_0=(Token)match(input,27,FOLLOW_21); 

                    						newLeafNode(lv_turnStation_10_0, grammarAccess.getMiddleSpotAccess().getTurnStationTurnKeyword_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMiddleSpotRule());
                    						}
                    						setWithLastConsumed(current, "turnStation", true, "turn");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSchedule.g:756:3: (otherlv_11= 'drive' otherlv_12= 'via' ( (otherlv_13= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSchedule.g:757:4: otherlv_11= 'drive' otherlv_12= 'via' ( (otherlv_13= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getMiddleSpotAccess().getDriveKeyword_8_0());
                    			
                    otherlv_12=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getMiddleSpotAccess().getViaKeyword_8_1());
                    			
                    // InternalSchedule.g:765:4: ( (otherlv_13= RULE_ID ) )
                    // InternalSchedule.g:766:5: (otherlv_13= RULE_ID )
                    {
                    // InternalSchedule.g:766:5: (otherlv_13= RULE_ID )
                    // InternalSchedule.g:767:6: otherlv_13= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMiddleSpotRule());
                    						}
                    					
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_13, grammarAccess.getMiddleSpotAccess().getLegLegCrossReference_8_2_0());
                    					

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
    // InternalSchedule.g:783:1: entryRuleFinalSpot returns [EObject current=null] : iv_ruleFinalSpot= ruleFinalSpot EOF ;
    public final EObject entryRuleFinalSpot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalSpot = null;


        try {
            // InternalSchedule.g:783:50: (iv_ruleFinalSpot= ruleFinalSpot EOF )
            // InternalSchedule.g:784:2: iv_ruleFinalSpot= ruleFinalSpot EOF
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
    // InternalSchedule.g:790:1: ruleFinalSpot returns [EObject current=null] : (otherlv_0= 'terminate' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleFinalSpot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_platform_5_0=null;


        	enterRule();

        try {
            // InternalSchedule.g:796:2: ( (otherlv_0= 'terminate' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) ) )
            // InternalSchedule.g:797:2: (otherlv_0= 'terminate' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )
            {
            // InternalSchedule.g:797:2: (otherlv_0= 'terminate' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )
            // InternalSchedule.g:798:3: otherlv_0= 'terminate' otherlv_1= 'at' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getFinalSpotAccess().getTerminateKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFinalSpotAccess().getAtKeyword_1());
            		
            // InternalSchedule.g:806:3: ( (otherlv_2= RULE_ID ) )
            // InternalSchedule.g:807:4: (otherlv_2= RULE_ID )
            {
            // InternalSchedule.g:807:4: (otherlv_2= RULE_ID )
            // InternalSchedule.g:808:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFinalSpotRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_2, grammarAccess.getFinalSpotAccess().getStationStationCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getFinalSpotAccess().getOnKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getFinalSpotAccess().getPlatformKeyword_4());
            		
            // InternalSchedule.g:827:3: ( (lv_platform_5_0= RULE_STRING ) )
            // InternalSchedule.g:828:4: (lv_platform_5_0= RULE_STRING )
            {
            // InternalSchedule.g:828:4: (lv_platform_5_0= RULE_STRING )
            // InternalSchedule.g:829:5: lv_platform_5_0= RULE_STRING
            {
            lv_platform_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_platform_5_0, grammarAccess.getFinalSpotAccess().getPlatformSTRINGTerminalRuleCall_5_0());
            				

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


    // $ANTLR start "ruleWeekDay"
    // InternalSchedule.g:849:1: ruleWeekDay returns [Enumerator current=null] : ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) ;
    public final Enumerator ruleWeekDay() throws RecognitionException {
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
            // InternalSchedule.g:855:2: ( ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) )
            // InternalSchedule.g:856:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            {
            // InternalSchedule.g:856:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 30:
                {
                alt12=2;
                }
                break;
            case 31:
                {
                alt12=3;
                }
                break;
            case 32:
                {
                alt12=4;
                }
                break;
            case 33:
                {
                alt12=5;
                }
                break;
            case 34:
                {
                alt12=6;
                }
                break;
            case 35:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSchedule.g:857:3: (enumLiteral_0= 'Monday' )
                    {
                    // InternalSchedule.g:857:3: (enumLiteral_0= 'Monday' )
                    // InternalSchedule.g:858:4: enumLiteral_0= 'Monday'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getMONDAYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWeekDayAccess().getMONDAYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSchedule.g:865:3: (enumLiteral_1= 'Tuesday' )
                    {
                    // InternalSchedule.g:865:3: (enumLiteral_1= 'Tuesday' )
                    // InternalSchedule.g:866:4: enumLiteral_1= 'Tuesday'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTUESDAYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWeekDayAccess().getTUESDAYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSchedule.g:873:3: (enumLiteral_2= 'Wednesday' )
                    {
                    // InternalSchedule.g:873:3: (enumLiteral_2= 'Wednesday' )
                    // InternalSchedule.g:874:4: enumLiteral_2= 'Wednesday'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getWEDNESDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWeekDayAccess().getWEDNESDAYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSchedule.g:881:3: (enumLiteral_3= 'Thursday' )
                    {
                    // InternalSchedule.g:881:3: (enumLiteral_3= 'Thursday' )
                    // InternalSchedule.g:882:4: enumLiteral_3= 'Thursday'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTHURSDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWeekDayAccess().getTHURSDAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSchedule.g:889:3: (enumLiteral_4= 'Friday' )
                    {
                    // InternalSchedule.g:889:3: (enumLiteral_4= 'Friday' )
                    // InternalSchedule.g:890:4: enumLiteral_4= 'Friday'
                    {
                    enumLiteral_4=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getFRIDAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getWeekDayAccess().getFRIDAYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSchedule.g:897:3: (enumLiteral_5= 'Saturday' )
                    {
                    // InternalSchedule.g:897:3: (enumLiteral_5= 'Saturday' )
                    // InternalSchedule.g:898:4: enumLiteral_5= 'Saturday'
                    {
                    enumLiteral_5=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getSATURDAYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getWeekDayAccess().getSATURDAYEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSchedule.g:905:3: (enumLiteral_6= 'Sunday' )
                    {
                    // InternalSchedule.g:905:3: (enumLiteral_6= 'Sunday' )
                    // InternalSchedule.g:906:4: enumLiteral_6= 'Sunday'
                    {
                    enumLiteral_6=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getSUNDAYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getWeekDayAccess().getSUNDAYEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleWeekDay"

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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000088002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000840002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000880002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});

}