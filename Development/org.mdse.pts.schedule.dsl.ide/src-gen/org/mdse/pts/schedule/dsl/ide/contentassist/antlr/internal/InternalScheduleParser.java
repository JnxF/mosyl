package org.mdse.pts.schedule.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.mdse.pts.schedule.dsl.services.ScheduleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScheduleParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_LETTER", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Sunday'", "'schedule'", "'for'", "'with'", "':'", "','", "'train'", "'on'", "'and'", "'at'", "'start'", "'platform'", "'drive'", "'via'", "'stop'", "'min'", "'terminate'", "'and turn'"
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

    	public void setGrammarAccess(ScheduleGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSchedule"
    // InternalSchedule.g:53:1: entryRuleSchedule : ruleSchedule EOF ;
    public final void entryRuleSchedule() throws RecognitionException {
        try {
            // InternalSchedule.g:54:1: ( ruleSchedule EOF )
            // InternalSchedule.g:55:1: ruleSchedule EOF
            {
             before(grammarAccess.getScheduleRule()); 
            pushFollow(FOLLOW_1);
            ruleSchedule();

            state._fsp--;

             after(grammarAccess.getScheduleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSchedule"


    // $ANTLR start "ruleSchedule"
    // InternalSchedule.g:62:1: ruleSchedule : ( ( rule__Schedule__Group__0 ) ) ;
    public final void ruleSchedule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:66:2: ( ( ( rule__Schedule__Group__0 ) ) )
            // InternalSchedule.g:67:2: ( ( rule__Schedule__Group__0 ) )
            {
            // InternalSchedule.g:67:2: ( ( rule__Schedule__Group__0 ) )
            // InternalSchedule.g:68:3: ( rule__Schedule__Group__0 )
            {
             before(grammarAccess.getScheduleAccess().getGroup()); 
            // InternalSchedule.g:69:3: ( rule__Schedule__Group__0 )
            // InternalSchedule.g:69:4: rule__Schedule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScheduleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchedule"


    // $ANTLR start "entryRuleTrainSchedule"
    // InternalSchedule.g:78:1: entryRuleTrainSchedule : ruleTrainSchedule EOF ;
    public final void entryRuleTrainSchedule() throws RecognitionException {
        try {
            // InternalSchedule.g:79:1: ( ruleTrainSchedule EOF )
            // InternalSchedule.g:80:1: ruleTrainSchedule EOF
            {
             before(grammarAccess.getTrainScheduleRule()); 
            pushFollow(FOLLOW_1);
            ruleTrainSchedule();

            state._fsp--;

             after(grammarAccess.getTrainScheduleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrainSchedule"


    // $ANTLR start "ruleTrainSchedule"
    // InternalSchedule.g:87:1: ruleTrainSchedule : ( ( rule__TrainSchedule__Group__0 ) ) ;
    public final void ruleTrainSchedule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:91:2: ( ( ( rule__TrainSchedule__Group__0 ) ) )
            // InternalSchedule.g:92:2: ( ( rule__TrainSchedule__Group__0 ) )
            {
            // InternalSchedule.g:92:2: ( ( rule__TrainSchedule__Group__0 ) )
            // InternalSchedule.g:93:3: ( rule__TrainSchedule__Group__0 )
            {
             before(grammarAccess.getTrainScheduleAccess().getGroup()); 
            // InternalSchedule.g:94:3: ( rule__TrainSchedule__Group__0 )
            // InternalSchedule.g:94:4: rule__TrainSchedule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrainScheduleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrainSchedule"


    // $ANTLR start "entryRuleDateTime"
    // InternalSchedule.g:103:1: entryRuleDateTime : ruleDateTime EOF ;
    public final void entryRuleDateTime() throws RecognitionException {
        try {
            // InternalSchedule.g:104:1: ( ruleDateTime EOF )
            // InternalSchedule.g:105:1: ruleDateTime EOF
            {
             before(grammarAccess.getDateTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleDateTime();

            state._fsp--;

             after(grammarAccess.getDateTimeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDateTime"


    // $ANTLR start "ruleDateTime"
    // InternalSchedule.g:112:1: ruleDateTime : ( ( rule__DateTime__Group__0 ) ) ;
    public final void ruleDateTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:116:2: ( ( ( rule__DateTime__Group__0 ) ) )
            // InternalSchedule.g:117:2: ( ( rule__DateTime__Group__0 ) )
            {
            // InternalSchedule.g:117:2: ( ( rule__DateTime__Group__0 ) )
            // InternalSchedule.g:118:3: ( rule__DateTime__Group__0 )
            {
             before(grammarAccess.getDateTimeAccess().getGroup()); 
            // InternalSchedule.g:119:3: ( rule__DateTime__Group__0 )
            // InternalSchedule.g:119:4: rule__DateTime__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DateTime__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateTimeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDateTime"


    // $ANTLR start "entryRuleTime"
    // InternalSchedule.g:128:1: entryRuleTime : ruleTime EOF ;
    public final void entryRuleTime() throws RecognitionException {
        try {
            // InternalSchedule.g:129:1: ( ruleTime EOF )
            // InternalSchedule.g:130:1: ruleTime EOF
            {
             before(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getTimeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalSchedule.g:137:1: ruleTime : ( ( rule__Time__Group__0 ) ) ;
    public final void ruleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:141:2: ( ( ( rule__Time__Group__0 ) ) )
            // InternalSchedule.g:142:2: ( ( rule__Time__Group__0 ) )
            {
            // InternalSchedule.g:142:2: ( ( rule__Time__Group__0 ) )
            // InternalSchedule.g:143:3: ( rule__Time__Group__0 )
            {
             before(grammarAccess.getTimeAccess().getGroup()); 
            // InternalSchedule.g:144:3: ( rule__Time__Group__0 )
            // InternalSchedule.g:144:4: rule__Time__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Time__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleRoute"
    // InternalSchedule.g:153:1: entryRuleRoute : ruleRoute EOF ;
    public final void entryRuleRoute() throws RecognitionException {
        try {
            // InternalSchedule.g:154:1: ( ruleRoute EOF )
            // InternalSchedule.g:155:1: ruleRoute EOF
            {
             before(grammarAccess.getRouteRule()); 
            pushFollow(FOLLOW_1);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getRouteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoute"


    // $ANTLR start "ruleRoute"
    // InternalSchedule.g:162:1: ruleRoute : ( ( rule__Route__Group__0 ) ) ;
    public final void ruleRoute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:166:2: ( ( ( rule__Route__Group__0 ) ) )
            // InternalSchedule.g:167:2: ( ( rule__Route__Group__0 ) )
            {
            // InternalSchedule.g:167:2: ( ( rule__Route__Group__0 ) )
            // InternalSchedule.g:168:3: ( rule__Route__Group__0 )
            {
             before(grammarAccess.getRouteAccess().getGroup()); 
            // InternalSchedule.g:169:3: ( rule__Route__Group__0 )
            // InternalSchedule.g:169:4: rule__Route__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Route__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoute"


    // $ANTLR start "entryRuleStartSpot"
    // InternalSchedule.g:178:1: entryRuleStartSpot : ruleStartSpot EOF ;
    public final void entryRuleStartSpot() throws RecognitionException {
        try {
            // InternalSchedule.g:179:1: ( ruleStartSpot EOF )
            // InternalSchedule.g:180:1: ruleStartSpot EOF
            {
             before(grammarAccess.getStartSpotRule()); 
            pushFollow(FOLLOW_1);
            ruleStartSpot();

            state._fsp--;

             after(grammarAccess.getStartSpotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStartSpot"


    // $ANTLR start "ruleStartSpot"
    // InternalSchedule.g:187:1: ruleStartSpot : ( ( rule__StartSpot__Group__0 ) ) ;
    public final void ruleStartSpot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:191:2: ( ( ( rule__StartSpot__Group__0 ) ) )
            // InternalSchedule.g:192:2: ( ( rule__StartSpot__Group__0 ) )
            {
            // InternalSchedule.g:192:2: ( ( rule__StartSpot__Group__0 ) )
            // InternalSchedule.g:193:3: ( rule__StartSpot__Group__0 )
            {
             before(grammarAccess.getStartSpotAccess().getGroup()); 
            // InternalSchedule.g:194:3: ( rule__StartSpot__Group__0 )
            // InternalSchedule.g:194:4: rule__StartSpot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StartSpot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartSpotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStartSpot"


    // $ANTLR start "entryRuleMiddleSpot"
    // InternalSchedule.g:203:1: entryRuleMiddleSpot : ruleMiddleSpot EOF ;
    public final void entryRuleMiddleSpot() throws RecognitionException {
        try {
            // InternalSchedule.g:204:1: ( ruleMiddleSpot EOF )
            // InternalSchedule.g:205:1: ruleMiddleSpot EOF
            {
             before(grammarAccess.getMiddleSpotRule()); 
            pushFollow(FOLLOW_1);
            ruleMiddleSpot();

            state._fsp--;

             after(grammarAccess.getMiddleSpotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMiddleSpot"


    // $ANTLR start "ruleMiddleSpot"
    // InternalSchedule.g:212:1: ruleMiddleSpot : ( ( rule__MiddleSpot__Group__0 ) ) ;
    public final void ruleMiddleSpot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:216:2: ( ( ( rule__MiddleSpot__Group__0 ) ) )
            // InternalSchedule.g:217:2: ( ( rule__MiddleSpot__Group__0 ) )
            {
            // InternalSchedule.g:217:2: ( ( rule__MiddleSpot__Group__0 ) )
            // InternalSchedule.g:218:3: ( rule__MiddleSpot__Group__0 )
            {
             before(grammarAccess.getMiddleSpotAccess().getGroup()); 
            // InternalSchedule.g:219:3: ( rule__MiddleSpot__Group__0 )
            // InternalSchedule.g:219:4: rule__MiddleSpot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMiddleSpotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMiddleSpot"


    // $ANTLR start "entryRuleFinalSpot"
    // InternalSchedule.g:228:1: entryRuleFinalSpot : ruleFinalSpot EOF ;
    public final void entryRuleFinalSpot() throws RecognitionException {
        try {
            // InternalSchedule.g:229:1: ( ruleFinalSpot EOF )
            // InternalSchedule.g:230:1: ruleFinalSpot EOF
            {
             before(grammarAccess.getFinalSpotRule()); 
            pushFollow(FOLLOW_1);
            ruleFinalSpot();

            state._fsp--;

             after(grammarAccess.getFinalSpotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFinalSpot"


    // $ANTLR start "ruleFinalSpot"
    // InternalSchedule.g:237:1: ruleFinalSpot : ( ( rule__FinalSpot__Group__0 ) ) ;
    public final void ruleFinalSpot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:241:2: ( ( ( rule__FinalSpot__Group__0 ) ) )
            // InternalSchedule.g:242:2: ( ( rule__FinalSpot__Group__0 ) )
            {
            // InternalSchedule.g:242:2: ( ( rule__FinalSpot__Group__0 ) )
            // InternalSchedule.g:243:3: ( rule__FinalSpot__Group__0 )
            {
             before(grammarAccess.getFinalSpotAccess().getGroup()); 
            // InternalSchedule.g:244:3: ( rule__FinalSpot__Group__0 )
            // InternalSchedule.g:244:4: rule__FinalSpot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FinalSpot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFinalSpotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFinalSpot"


    // $ANTLR start "ruleWeekDays"
    // InternalSchedule.g:253:1: ruleWeekDays : ( ( rule__WeekDays__Alternatives ) ) ;
    public final void ruleWeekDays() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:257:1: ( ( ( rule__WeekDays__Alternatives ) ) )
            // InternalSchedule.g:258:2: ( ( rule__WeekDays__Alternatives ) )
            {
            // InternalSchedule.g:258:2: ( ( rule__WeekDays__Alternatives ) )
            // InternalSchedule.g:259:3: ( rule__WeekDays__Alternatives )
            {
             before(grammarAccess.getWeekDaysAccess().getAlternatives()); 
            // InternalSchedule.g:260:3: ( rule__WeekDays__Alternatives )
            // InternalSchedule.g:260:4: rule__WeekDays__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WeekDays__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWeekDaysAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWeekDays"


    // $ANTLR start "rule__WeekDays__Alternatives"
    // InternalSchedule.g:268:1: rule__WeekDays__Alternatives : ( ( ( 'Monday' ) ) | ( ( 'Tuesday' ) ) | ( ( 'Wednesday' ) ) | ( ( 'Thursday' ) ) | ( ( 'Friday' ) ) | ( ( 'Saturday' ) ) | ( ( 'Sunday' ) ) );
    public final void rule__WeekDays__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:272:1: ( ( ( 'Monday' ) ) | ( ( 'Tuesday' ) ) | ( ( 'Wednesday' ) ) | ( ( 'Thursday' ) ) | ( ( 'Friday' ) ) | ( ( 'Saturday' ) ) | ( ( 'Sunday' ) ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            case 15:
                {
                alt1=4;
                }
                break;
            case 16:
                {
                alt1=5;
                }
                break;
            case 17:
                {
                alt1=6;
                }
                break;
            case 18:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSchedule.g:273:2: ( ( 'Monday' ) )
                    {
                    // InternalSchedule.g:273:2: ( ( 'Monday' ) )
                    // InternalSchedule.g:274:3: ( 'Monday' )
                    {
                     before(grammarAccess.getWeekDaysAccess().getMONDAYEnumLiteralDeclaration_0()); 
                    // InternalSchedule.g:275:3: ( 'Monday' )
                    // InternalSchedule.g:275:4: 'Monday'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDaysAccess().getMONDAYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSchedule.g:279:2: ( ( 'Tuesday' ) )
                    {
                    // InternalSchedule.g:279:2: ( ( 'Tuesday' ) )
                    // InternalSchedule.g:280:3: ( 'Tuesday' )
                    {
                     before(grammarAccess.getWeekDaysAccess().getTUESDAYEnumLiteralDeclaration_1()); 
                    // InternalSchedule.g:281:3: ( 'Tuesday' )
                    // InternalSchedule.g:281:4: 'Tuesday'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDaysAccess().getTUESDAYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSchedule.g:285:2: ( ( 'Wednesday' ) )
                    {
                    // InternalSchedule.g:285:2: ( ( 'Wednesday' ) )
                    // InternalSchedule.g:286:3: ( 'Wednesday' )
                    {
                     before(grammarAccess.getWeekDaysAccess().getWEDNESDAYEnumLiteralDeclaration_2()); 
                    // InternalSchedule.g:287:3: ( 'Wednesday' )
                    // InternalSchedule.g:287:4: 'Wednesday'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDaysAccess().getWEDNESDAYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSchedule.g:291:2: ( ( 'Thursday' ) )
                    {
                    // InternalSchedule.g:291:2: ( ( 'Thursday' ) )
                    // InternalSchedule.g:292:3: ( 'Thursday' )
                    {
                     before(grammarAccess.getWeekDaysAccess().getTHURSDAYEnumLiteralDeclaration_3()); 
                    // InternalSchedule.g:293:3: ( 'Thursday' )
                    // InternalSchedule.g:293:4: 'Thursday'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDaysAccess().getTHURSDAYEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSchedule.g:297:2: ( ( 'Friday' ) )
                    {
                    // InternalSchedule.g:297:2: ( ( 'Friday' ) )
                    // InternalSchedule.g:298:3: ( 'Friday' )
                    {
                     before(grammarAccess.getWeekDaysAccess().getFRIDAYEnumLiteralDeclaration_4()); 
                    // InternalSchedule.g:299:3: ( 'Friday' )
                    // InternalSchedule.g:299:4: 'Friday'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDaysAccess().getFRIDAYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSchedule.g:303:2: ( ( 'Saturday' ) )
                    {
                    // InternalSchedule.g:303:2: ( ( 'Saturday' ) )
                    // InternalSchedule.g:304:3: ( 'Saturday' )
                    {
                     before(grammarAccess.getWeekDaysAccess().getSATURDAYEnumLiteralDeclaration_5()); 
                    // InternalSchedule.g:305:3: ( 'Saturday' )
                    // InternalSchedule.g:305:4: 'Saturday'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDaysAccess().getSATURDAYEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSchedule.g:309:2: ( ( 'Sunday' ) )
                    {
                    // InternalSchedule.g:309:2: ( ( 'Sunday' ) )
                    // InternalSchedule.g:310:3: ( 'Sunday' )
                    {
                     before(grammarAccess.getWeekDaysAccess().getSUNDAYEnumLiteralDeclaration_6()); 
                    // InternalSchedule.g:311:3: ( 'Sunday' )
                    // InternalSchedule.g:311:4: 'Sunday'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDaysAccess().getSUNDAYEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WeekDays__Alternatives"


    // $ANTLR start "rule__Schedule__Group__0"
    // InternalSchedule.g:319:1: rule__Schedule__Group__0 : rule__Schedule__Group__0__Impl rule__Schedule__Group__1 ;
    public final void rule__Schedule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:323:1: ( rule__Schedule__Group__0__Impl rule__Schedule__Group__1 )
            // InternalSchedule.g:324:2: rule__Schedule__Group__0__Impl rule__Schedule__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Schedule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__0"


    // $ANTLR start "rule__Schedule__Group__0__Impl"
    // InternalSchedule.g:331:1: rule__Schedule__Group__0__Impl : ( 'schedule' ) ;
    public final void rule__Schedule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:335:1: ( ( 'schedule' ) )
            // InternalSchedule.g:336:1: ( 'schedule' )
            {
            // InternalSchedule.g:336:1: ( 'schedule' )
            // InternalSchedule.g:337:2: 'schedule'
            {
             before(grammarAccess.getScheduleAccess().getScheduleKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getScheduleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__0__Impl"


    // $ANTLR start "rule__Schedule__Group__1"
    // InternalSchedule.g:346:1: rule__Schedule__Group__1 : rule__Schedule__Group__1__Impl rule__Schedule__Group__2 ;
    public final void rule__Schedule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:350:1: ( rule__Schedule__Group__1__Impl rule__Schedule__Group__2 )
            // InternalSchedule.g:351:2: rule__Schedule__Group__1__Impl rule__Schedule__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Schedule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__1"


    // $ANTLR start "rule__Schedule__Group__1__Impl"
    // InternalSchedule.g:358:1: rule__Schedule__Group__1__Impl : ( 'for' ) ;
    public final void rule__Schedule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:362:1: ( ( 'for' ) )
            // InternalSchedule.g:363:1: ( 'for' )
            {
            // InternalSchedule.g:363:1: ( 'for' )
            // InternalSchedule.g:364:2: 'for'
            {
             before(grammarAccess.getScheduleAccess().getForKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getForKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__1__Impl"


    // $ANTLR start "rule__Schedule__Group__2"
    // InternalSchedule.g:373:1: rule__Schedule__Group__2 : rule__Schedule__Group__2__Impl rule__Schedule__Group__3 ;
    public final void rule__Schedule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:377:1: ( rule__Schedule__Group__2__Impl rule__Schedule__Group__3 )
            // InternalSchedule.g:378:2: rule__Schedule__Group__2__Impl rule__Schedule__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Schedule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__2"


    // $ANTLR start "rule__Schedule__Group__2__Impl"
    // InternalSchedule.g:385:1: rule__Schedule__Group__2__Impl : ( ( rule__Schedule__NetworkAssignment_2 ) ) ;
    public final void rule__Schedule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:389:1: ( ( ( rule__Schedule__NetworkAssignment_2 ) ) )
            // InternalSchedule.g:390:1: ( ( rule__Schedule__NetworkAssignment_2 ) )
            {
            // InternalSchedule.g:390:1: ( ( rule__Schedule__NetworkAssignment_2 ) )
            // InternalSchedule.g:391:2: ( rule__Schedule__NetworkAssignment_2 )
            {
             before(grammarAccess.getScheduleAccess().getNetworkAssignment_2()); 
            // InternalSchedule.g:392:2: ( rule__Schedule__NetworkAssignment_2 )
            // InternalSchedule.g:392:3: rule__Schedule__NetworkAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__NetworkAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScheduleAccess().getNetworkAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__2__Impl"


    // $ANTLR start "rule__Schedule__Group__3"
    // InternalSchedule.g:400:1: rule__Schedule__Group__3 : rule__Schedule__Group__3__Impl rule__Schedule__Group__4 ;
    public final void rule__Schedule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:404:1: ( rule__Schedule__Group__3__Impl rule__Schedule__Group__4 )
            // InternalSchedule.g:405:2: rule__Schedule__Group__3__Impl rule__Schedule__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Schedule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__3"


    // $ANTLR start "rule__Schedule__Group__3__Impl"
    // InternalSchedule.g:412:1: rule__Schedule__Group__3__Impl : ( 'with' ) ;
    public final void rule__Schedule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:416:1: ( ( 'with' ) )
            // InternalSchedule.g:417:1: ( 'with' )
            {
            // InternalSchedule.g:417:1: ( 'with' )
            // InternalSchedule.g:418:2: 'with'
            {
             before(grammarAccess.getScheduleAccess().getWithKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getWithKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__3__Impl"


    // $ANTLR start "rule__Schedule__Group__4"
    // InternalSchedule.g:427:1: rule__Schedule__Group__4 : rule__Schedule__Group__4__Impl rule__Schedule__Group__5 ;
    public final void rule__Schedule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:431:1: ( rule__Schedule__Group__4__Impl rule__Schedule__Group__5 )
            // InternalSchedule.g:432:2: rule__Schedule__Group__4__Impl rule__Schedule__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Schedule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__4"


    // $ANTLR start "rule__Schedule__Group__4__Impl"
    // InternalSchedule.g:439:1: rule__Schedule__Group__4__Impl : ( ( rule__Schedule__DepotsAssignment_4 ) ) ;
    public final void rule__Schedule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:443:1: ( ( ( rule__Schedule__DepotsAssignment_4 ) ) )
            // InternalSchedule.g:444:1: ( ( rule__Schedule__DepotsAssignment_4 ) )
            {
            // InternalSchedule.g:444:1: ( ( rule__Schedule__DepotsAssignment_4 ) )
            // InternalSchedule.g:445:2: ( rule__Schedule__DepotsAssignment_4 )
            {
             before(grammarAccess.getScheduleAccess().getDepotsAssignment_4()); 
            // InternalSchedule.g:446:2: ( rule__Schedule__DepotsAssignment_4 )
            // InternalSchedule.g:446:3: rule__Schedule__DepotsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__DepotsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getScheduleAccess().getDepotsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__4__Impl"


    // $ANTLR start "rule__Schedule__Group__5"
    // InternalSchedule.g:454:1: rule__Schedule__Group__5 : rule__Schedule__Group__5__Impl rule__Schedule__Group__6 ;
    public final void rule__Schedule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:458:1: ( rule__Schedule__Group__5__Impl rule__Schedule__Group__6 )
            // InternalSchedule.g:459:2: rule__Schedule__Group__5__Impl rule__Schedule__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Schedule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__5"


    // $ANTLR start "rule__Schedule__Group__5__Impl"
    // InternalSchedule.g:466:1: rule__Schedule__Group__5__Impl : ( ( rule__Schedule__Group_5__0 )* ) ;
    public final void rule__Schedule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:470:1: ( ( ( rule__Schedule__Group_5__0 )* ) )
            // InternalSchedule.g:471:1: ( ( rule__Schedule__Group_5__0 )* )
            {
            // InternalSchedule.g:471:1: ( ( rule__Schedule__Group_5__0 )* )
            // InternalSchedule.g:472:2: ( rule__Schedule__Group_5__0 )*
            {
             before(grammarAccess.getScheduleAccess().getGroup_5()); 
            // InternalSchedule.g:473:2: ( rule__Schedule__Group_5__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSchedule.g:473:3: rule__Schedule__Group_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Schedule__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getScheduleAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__5__Impl"


    // $ANTLR start "rule__Schedule__Group__6"
    // InternalSchedule.g:481:1: rule__Schedule__Group__6 : rule__Schedule__Group__6__Impl rule__Schedule__Group__7 ;
    public final void rule__Schedule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:485:1: ( rule__Schedule__Group__6__Impl rule__Schedule__Group__7 )
            // InternalSchedule.g:486:2: rule__Schedule__Group__6__Impl rule__Schedule__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Schedule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__6"


    // $ANTLR start "rule__Schedule__Group__6__Impl"
    // InternalSchedule.g:493:1: rule__Schedule__Group__6__Impl : ( ':' ) ;
    public final void rule__Schedule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:497:1: ( ( ':' ) )
            // InternalSchedule.g:498:1: ( ':' )
            {
            // InternalSchedule.g:498:1: ( ':' )
            // InternalSchedule.g:499:2: ':'
            {
             before(grammarAccess.getScheduleAccess().getColonKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__6__Impl"


    // $ANTLR start "rule__Schedule__Group__7"
    // InternalSchedule.g:508:1: rule__Schedule__Group__7 : rule__Schedule__Group__7__Impl ;
    public final void rule__Schedule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:512:1: ( rule__Schedule__Group__7__Impl )
            // InternalSchedule.g:513:2: rule__Schedule__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__7"


    // $ANTLR start "rule__Schedule__Group__7__Impl"
    // InternalSchedule.g:519:1: rule__Schedule__Group__7__Impl : ( ( rule__Schedule__TrainSchedulesAssignment_7 )* ) ;
    public final void rule__Schedule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:523:1: ( ( ( rule__Schedule__TrainSchedulesAssignment_7 )* ) )
            // InternalSchedule.g:524:1: ( ( rule__Schedule__TrainSchedulesAssignment_7 )* )
            {
            // InternalSchedule.g:524:1: ( ( rule__Schedule__TrainSchedulesAssignment_7 )* )
            // InternalSchedule.g:525:2: ( rule__Schedule__TrainSchedulesAssignment_7 )*
            {
             before(grammarAccess.getScheduleAccess().getTrainSchedulesAssignment_7()); 
            // InternalSchedule.g:526:2: ( rule__Schedule__TrainSchedulesAssignment_7 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSchedule.g:526:3: rule__Schedule__TrainSchedulesAssignment_7
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Schedule__TrainSchedulesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getScheduleAccess().getTrainSchedulesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__7__Impl"


    // $ANTLR start "rule__Schedule__Group_5__0"
    // InternalSchedule.g:535:1: rule__Schedule__Group_5__0 : rule__Schedule__Group_5__0__Impl rule__Schedule__Group_5__1 ;
    public final void rule__Schedule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:539:1: ( rule__Schedule__Group_5__0__Impl rule__Schedule__Group_5__1 )
            // InternalSchedule.g:540:2: rule__Schedule__Group_5__0__Impl rule__Schedule__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Schedule__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group_5__0"


    // $ANTLR start "rule__Schedule__Group_5__0__Impl"
    // InternalSchedule.g:547:1: rule__Schedule__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Schedule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:551:1: ( ( ',' ) )
            // InternalSchedule.g:552:1: ( ',' )
            {
            // InternalSchedule.g:552:1: ( ',' )
            // InternalSchedule.g:553:2: ','
            {
             before(grammarAccess.getScheduleAccess().getCommaKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group_5__0__Impl"


    // $ANTLR start "rule__Schedule__Group_5__1"
    // InternalSchedule.g:562:1: rule__Schedule__Group_5__1 : rule__Schedule__Group_5__1__Impl ;
    public final void rule__Schedule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:566:1: ( rule__Schedule__Group_5__1__Impl )
            // InternalSchedule.g:567:2: rule__Schedule__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group_5__1"


    // $ANTLR start "rule__Schedule__Group_5__1__Impl"
    // InternalSchedule.g:573:1: rule__Schedule__Group_5__1__Impl : ( ( rule__Schedule__DepotsAssignment_5_1 ) ) ;
    public final void rule__Schedule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:577:1: ( ( ( rule__Schedule__DepotsAssignment_5_1 ) ) )
            // InternalSchedule.g:578:1: ( ( rule__Schedule__DepotsAssignment_5_1 ) )
            {
            // InternalSchedule.g:578:1: ( ( rule__Schedule__DepotsAssignment_5_1 ) )
            // InternalSchedule.g:579:2: ( rule__Schedule__DepotsAssignment_5_1 )
            {
             before(grammarAccess.getScheduleAccess().getDepotsAssignment_5_1()); 
            // InternalSchedule.g:580:2: ( rule__Schedule__DepotsAssignment_5_1 )
            // InternalSchedule.g:580:3: rule__Schedule__DepotsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__DepotsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getScheduleAccess().getDepotsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group_5__1__Impl"


    // $ANTLR start "rule__TrainSchedule__Group__0"
    // InternalSchedule.g:589:1: rule__TrainSchedule__Group__0 : rule__TrainSchedule__Group__0__Impl rule__TrainSchedule__Group__1 ;
    public final void rule__TrainSchedule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:593:1: ( rule__TrainSchedule__Group__0__Impl rule__TrainSchedule__Group__1 )
            // InternalSchedule.g:594:2: rule__TrainSchedule__Group__0__Impl rule__TrainSchedule__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TrainSchedule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__0"


    // $ANTLR start "rule__TrainSchedule__Group__0__Impl"
    // InternalSchedule.g:601:1: rule__TrainSchedule__Group__0__Impl : ( 'train' ) ;
    public final void rule__TrainSchedule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:605:1: ( ( 'train' ) )
            // InternalSchedule.g:606:1: ( 'train' )
            {
            // InternalSchedule.g:606:1: ( 'train' )
            // InternalSchedule.g:607:2: 'train'
            {
             before(grammarAccess.getTrainScheduleAccess().getTrainKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTrainScheduleAccess().getTrainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__0__Impl"


    // $ANTLR start "rule__TrainSchedule__Group__1"
    // InternalSchedule.g:616:1: rule__TrainSchedule__Group__1 : rule__TrainSchedule__Group__1__Impl rule__TrainSchedule__Group__2 ;
    public final void rule__TrainSchedule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:620:1: ( rule__TrainSchedule__Group__1__Impl rule__TrainSchedule__Group__2 )
            // InternalSchedule.g:621:2: rule__TrainSchedule__Group__1__Impl rule__TrainSchedule__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__TrainSchedule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__1"


    // $ANTLR start "rule__TrainSchedule__Group__1__Impl"
    // InternalSchedule.g:628:1: rule__TrainSchedule__Group__1__Impl : ( ( rule__TrainSchedule__TrainAssignment_1 ) ) ;
    public final void rule__TrainSchedule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:632:1: ( ( ( rule__TrainSchedule__TrainAssignment_1 ) ) )
            // InternalSchedule.g:633:1: ( ( rule__TrainSchedule__TrainAssignment_1 ) )
            {
            // InternalSchedule.g:633:1: ( ( rule__TrainSchedule__TrainAssignment_1 ) )
            // InternalSchedule.g:634:2: ( rule__TrainSchedule__TrainAssignment_1 )
            {
             before(grammarAccess.getTrainScheduleAccess().getTrainAssignment_1()); 
            // InternalSchedule.g:635:2: ( rule__TrainSchedule__TrainAssignment_1 )
            // InternalSchedule.g:635:3: rule__TrainSchedule__TrainAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TrainSchedule__TrainAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainScheduleAccess().getTrainAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__1__Impl"


    // $ANTLR start "rule__TrainSchedule__Group__2"
    // InternalSchedule.g:643:1: rule__TrainSchedule__Group__2 : rule__TrainSchedule__Group__2__Impl rule__TrainSchedule__Group__3 ;
    public final void rule__TrainSchedule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:647:1: ( rule__TrainSchedule__Group__2__Impl rule__TrainSchedule__Group__3 )
            // InternalSchedule.g:648:2: rule__TrainSchedule__Group__2__Impl rule__TrainSchedule__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__TrainSchedule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__2"


    // $ANTLR start "rule__TrainSchedule__Group__2__Impl"
    // InternalSchedule.g:655:1: rule__TrainSchedule__Group__2__Impl : ( 'on' ) ;
    public final void rule__TrainSchedule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:659:1: ( ( 'on' ) )
            // InternalSchedule.g:660:1: ( 'on' )
            {
            // InternalSchedule.g:660:1: ( 'on' )
            // InternalSchedule.g:661:2: 'on'
            {
             before(grammarAccess.getTrainScheduleAccess().getOnKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTrainScheduleAccess().getOnKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__2__Impl"


    // $ANTLR start "rule__TrainSchedule__Group__3"
    // InternalSchedule.g:670:1: rule__TrainSchedule__Group__3 : rule__TrainSchedule__Group__3__Impl rule__TrainSchedule__Group__4 ;
    public final void rule__TrainSchedule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:674:1: ( rule__TrainSchedule__Group__3__Impl rule__TrainSchedule__Group__4 )
            // InternalSchedule.g:675:2: rule__TrainSchedule__Group__3__Impl rule__TrainSchedule__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__TrainSchedule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__3"


    // $ANTLR start "rule__TrainSchedule__Group__3__Impl"
    // InternalSchedule.g:682:1: rule__TrainSchedule__Group__3__Impl : ( ( rule__TrainSchedule__DateTimesAssignment_3 ) ) ;
    public final void rule__TrainSchedule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:686:1: ( ( ( rule__TrainSchedule__DateTimesAssignment_3 ) ) )
            // InternalSchedule.g:687:1: ( ( rule__TrainSchedule__DateTimesAssignment_3 ) )
            {
            // InternalSchedule.g:687:1: ( ( rule__TrainSchedule__DateTimesAssignment_3 ) )
            // InternalSchedule.g:688:2: ( rule__TrainSchedule__DateTimesAssignment_3 )
            {
             before(grammarAccess.getTrainScheduleAccess().getDateTimesAssignment_3()); 
            // InternalSchedule.g:689:2: ( rule__TrainSchedule__DateTimesAssignment_3 )
            // InternalSchedule.g:689:3: rule__TrainSchedule__DateTimesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TrainSchedule__DateTimesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTrainScheduleAccess().getDateTimesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__3__Impl"


    // $ANTLR start "rule__TrainSchedule__Group__4"
    // InternalSchedule.g:697:1: rule__TrainSchedule__Group__4 : rule__TrainSchedule__Group__4__Impl rule__TrainSchedule__Group__5 ;
    public final void rule__TrainSchedule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:701:1: ( rule__TrainSchedule__Group__4__Impl rule__TrainSchedule__Group__5 )
            // InternalSchedule.g:702:2: rule__TrainSchedule__Group__4__Impl rule__TrainSchedule__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__TrainSchedule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__4"


    // $ANTLR start "rule__TrainSchedule__Group__4__Impl"
    // InternalSchedule.g:709:1: rule__TrainSchedule__Group__4__Impl : ( ( rule__TrainSchedule__Group_4__0 )? ) ;
    public final void rule__TrainSchedule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:713:1: ( ( ( rule__TrainSchedule__Group_4__0 )? ) )
            // InternalSchedule.g:714:1: ( ( rule__TrainSchedule__Group_4__0 )? )
            {
            // InternalSchedule.g:714:1: ( ( rule__TrainSchedule__Group_4__0 )? )
            // InternalSchedule.g:715:2: ( rule__TrainSchedule__Group_4__0 )?
            {
             before(grammarAccess.getTrainScheduleAccess().getGroup_4()); 
            // InternalSchedule.g:716:2: ( rule__TrainSchedule__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23||LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSchedule.g:716:3: rule__TrainSchedule__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TrainSchedule__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrainScheduleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__4__Impl"


    // $ANTLR start "rule__TrainSchedule__Group__5"
    // InternalSchedule.g:724:1: rule__TrainSchedule__Group__5 : rule__TrainSchedule__Group__5__Impl rule__TrainSchedule__Group__6 ;
    public final void rule__TrainSchedule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:728:1: ( rule__TrainSchedule__Group__5__Impl rule__TrainSchedule__Group__6 )
            // InternalSchedule.g:729:2: rule__TrainSchedule__Group__5__Impl rule__TrainSchedule__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__TrainSchedule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__5"


    // $ANTLR start "rule__TrainSchedule__Group__5__Impl"
    // InternalSchedule.g:736:1: rule__TrainSchedule__Group__5__Impl : ( ':' ) ;
    public final void rule__TrainSchedule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:740:1: ( ( ':' ) )
            // InternalSchedule.g:741:1: ( ':' )
            {
            // InternalSchedule.g:741:1: ( ':' )
            // InternalSchedule.g:742:2: ':'
            {
             before(grammarAccess.getTrainScheduleAccess().getColonKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTrainScheduleAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__5__Impl"


    // $ANTLR start "rule__TrainSchedule__Group__6"
    // InternalSchedule.g:751:1: rule__TrainSchedule__Group__6 : rule__TrainSchedule__Group__6__Impl ;
    public final void rule__TrainSchedule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:755:1: ( rule__TrainSchedule__Group__6__Impl )
            // InternalSchedule.g:756:2: rule__TrainSchedule__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__6"


    // $ANTLR start "rule__TrainSchedule__Group__6__Impl"
    // InternalSchedule.g:762:1: rule__TrainSchedule__Group__6__Impl : ( ( rule__TrainSchedule__RouteAssignment_6 ) ) ;
    public final void rule__TrainSchedule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:766:1: ( ( ( rule__TrainSchedule__RouteAssignment_6 ) ) )
            // InternalSchedule.g:767:1: ( ( rule__TrainSchedule__RouteAssignment_6 ) )
            {
            // InternalSchedule.g:767:1: ( ( rule__TrainSchedule__RouteAssignment_6 ) )
            // InternalSchedule.g:768:2: ( rule__TrainSchedule__RouteAssignment_6 )
            {
             before(grammarAccess.getTrainScheduleAccess().getRouteAssignment_6()); 
            // InternalSchedule.g:769:2: ( rule__TrainSchedule__RouteAssignment_6 )
            // InternalSchedule.g:769:3: rule__TrainSchedule__RouteAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__TrainSchedule__RouteAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTrainScheduleAccess().getRouteAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__6__Impl"


    // $ANTLR start "rule__TrainSchedule__Group_4__0"
    // InternalSchedule.g:778:1: rule__TrainSchedule__Group_4__0 : rule__TrainSchedule__Group_4__0__Impl rule__TrainSchedule__Group_4__1 ;
    public final void rule__TrainSchedule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:782:1: ( rule__TrainSchedule__Group_4__0__Impl rule__TrainSchedule__Group_4__1 )
            // InternalSchedule.g:783:2: rule__TrainSchedule__Group_4__0__Impl rule__TrainSchedule__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__TrainSchedule__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group_4__0"


    // $ANTLR start "rule__TrainSchedule__Group_4__0__Impl"
    // InternalSchedule.g:790:1: rule__TrainSchedule__Group_4__0__Impl : ( ( rule__TrainSchedule__Group_4_0__0 )* ) ;
    public final void rule__TrainSchedule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:794:1: ( ( ( rule__TrainSchedule__Group_4_0__0 )* ) )
            // InternalSchedule.g:795:1: ( ( rule__TrainSchedule__Group_4_0__0 )* )
            {
            // InternalSchedule.g:795:1: ( ( rule__TrainSchedule__Group_4_0__0 )* )
            // InternalSchedule.g:796:2: ( rule__TrainSchedule__Group_4_0__0 )*
            {
             before(grammarAccess.getTrainScheduleAccess().getGroup_4_0()); 
            // InternalSchedule.g:797:2: ( rule__TrainSchedule__Group_4_0__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSchedule.g:797:3: rule__TrainSchedule__Group_4_0__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TrainSchedule__Group_4_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTrainScheduleAccess().getGroup_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group_4__0__Impl"


    // $ANTLR start "rule__TrainSchedule__Group_4__1"
    // InternalSchedule.g:805:1: rule__TrainSchedule__Group_4__1 : rule__TrainSchedule__Group_4__1__Impl rule__TrainSchedule__Group_4__2 ;
    public final void rule__TrainSchedule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:809:1: ( rule__TrainSchedule__Group_4__1__Impl rule__TrainSchedule__Group_4__2 )
            // InternalSchedule.g:810:2: rule__TrainSchedule__Group_4__1__Impl rule__TrainSchedule__Group_4__2
            {
            pushFollow(FOLLOW_11);
            rule__TrainSchedule__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group_4__1"


    // $ANTLR start "rule__TrainSchedule__Group_4__1__Impl"
    // InternalSchedule.g:817:1: rule__TrainSchedule__Group_4__1__Impl : ( 'and' ) ;
    public final void rule__TrainSchedule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:821:1: ( ( 'and' ) )
            // InternalSchedule.g:822:1: ( 'and' )
            {
            // InternalSchedule.g:822:1: ( 'and' )
            // InternalSchedule.g:823:2: 'and'
            {
             before(grammarAccess.getTrainScheduleAccess().getAndKeyword_4_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTrainScheduleAccess().getAndKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group_4__1__Impl"


    // $ANTLR start "rule__TrainSchedule__Group_4__2"
    // InternalSchedule.g:832:1: rule__TrainSchedule__Group_4__2 : rule__TrainSchedule__Group_4__2__Impl ;
    public final void rule__TrainSchedule__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:836:1: ( rule__TrainSchedule__Group_4__2__Impl )
            // InternalSchedule.g:837:2: rule__TrainSchedule__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group_4__2"


    // $ANTLR start "rule__TrainSchedule__Group_4__2__Impl"
    // InternalSchedule.g:843:1: rule__TrainSchedule__Group_4__2__Impl : ( ( rule__TrainSchedule__DateTimesAssignment_4_2 ) ) ;
    public final void rule__TrainSchedule__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:847:1: ( ( ( rule__TrainSchedule__DateTimesAssignment_4_2 ) ) )
            // InternalSchedule.g:848:1: ( ( rule__TrainSchedule__DateTimesAssignment_4_2 ) )
            {
            // InternalSchedule.g:848:1: ( ( rule__TrainSchedule__DateTimesAssignment_4_2 ) )
            // InternalSchedule.g:849:2: ( rule__TrainSchedule__DateTimesAssignment_4_2 )
            {
             before(grammarAccess.getTrainScheduleAccess().getDateTimesAssignment_4_2()); 
            // InternalSchedule.g:850:2: ( rule__TrainSchedule__DateTimesAssignment_4_2 )
            // InternalSchedule.g:850:3: rule__TrainSchedule__DateTimesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__TrainSchedule__DateTimesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTrainScheduleAccess().getDateTimesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group_4__2__Impl"


    // $ANTLR start "rule__TrainSchedule__Group_4_0__0"
    // InternalSchedule.g:859:1: rule__TrainSchedule__Group_4_0__0 : rule__TrainSchedule__Group_4_0__0__Impl rule__TrainSchedule__Group_4_0__1 ;
    public final void rule__TrainSchedule__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:863:1: ( rule__TrainSchedule__Group_4_0__0__Impl rule__TrainSchedule__Group_4_0__1 )
            // InternalSchedule.g:864:2: rule__TrainSchedule__Group_4_0__0__Impl rule__TrainSchedule__Group_4_0__1
            {
            pushFollow(FOLLOW_11);
            rule__TrainSchedule__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group_4_0__0"


    // $ANTLR start "rule__TrainSchedule__Group_4_0__0__Impl"
    // InternalSchedule.g:871:1: rule__TrainSchedule__Group_4_0__0__Impl : ( ',' ) ;
    public final void rule__TrainSchedule__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:875:1: ( ( ',' ) )
            // InternalSchedule.g:876:1: ( ',' )
            {
            // InternalSchedule.g:876:1: ( ',' )
            // InternalSchedule.g:877:2: ','
            {
             before(grammarAccess.getTrainScheduleAccess().getCommaKeyword_4_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTrainScheduleAccess().getCommaKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group_4_0__0__Impl"


    // $ANTLR start "rule__TrainSchedule__Group_4_0__1"
    // InternalSchedule.g:886:1: rule__TrainSchedule__Group_4_0__1 : rule__TrainSchedule__Group_4_0__1__Impl ;
    public final void rule__TrainSchedule__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:890:1: ( rule__TrainSchedule__Group_4_0__1__Impl )
            // InternalSchedule.g:891:2: rule__TrainSchedule__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group_4_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group_4_0__1"


    // $ANTLR start "rule__TrainSchedule__Group_4_0__1__Impl"
    // InternalSchedule.g:897:1: rule__TrainSchedule__Group_4_0__1__Impl : ( ( rule__TrainSchedule__DateTimesAssignment_4_0_1 ) ) ;
    public final void rule__TrainSchedule__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:901:1: ( ( ( rule__TrainSchedule__DateTimesAssignment_4_0_1 ) ) )
            // InternalSchedule.g:902:1: ( ( rule__TrainSchedule__DateTimesAssignment_4_0_1 ) )
            {
            // InternalSchedule.g:902:1: ( ( rule__TrainSchedule__DateTimesAssignment_4_0_1 ) )
            // InternalSchedule.g:903:2: ( rule__TrainSchedule__DateTimesAssignment_4_0_1 )
            {
             before(grammarAccess.getTrainScheduleAccess().getDateTimesAssignment_4_0_1()); 
            // InternalSchedule.g:904:2: ( rule__TrainSchedule__DateTimesAssignment_4_0_1 )
            // InternalSchedule.g:904:3: rule__TrainSchedule__DateTimesAssignment_4_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TrainSchedule__DateTimesAssignment_4_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainScheduleAccess().getDateTimesAssignment_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group_4_0__1__Impl"


    // $ANTLR start "rule__DateTime__Group__0"
    // InternalSchedule.g:913:1: rule__DateTime__Group__0 : rule__DateTime__Group__0__Impl rule__DateTime__Group__1 ;
    public final void rule__DateTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:917:1: ( rule__DateTime__Group__0__Impl rule__DateTime__Group__1 )
            // InternalSchedule.g:918:2: rule__DateTime__Group__0__Impl rule__DateTime__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__DateTime__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateTime__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTime__Group__0"


    // $ANTLR start "rule__DateTime__Group__0__Impl"
    // InternalSchedule.g:925:1: rule__DateTime__Group__0__Impl : ( ( rule__DateTime__WeekdayAssignment_0 ) ) ;
    public final void rule__DateTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:929:1: ( ( ( rule__DateTime__WeekdayAssignment_0 ) ) )
            // InternalSchedule.g:930:1: ( ( rule__DateTime__WeekdayAssignment_0 ) )
            {
            // InternalSchedule.g:930:1: ( ( rule__DateTime__WeekdayAssignment_0 ) )
            // InternalSchedule.g:931:2: ( rule__DateTime__WeekdayAssignment_0 )
            {
             before(grammarAccess.getDateTimeAccess().getWeekdayAssignment_0()); 
            // InternalSchedule.g:932:2: ( rule__DateTime__WeekdayAssignment_0 )
            // InternalSchedule.g:932:3: rule__DateTime__WeekdayAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DateTime__WeekdayAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDateTimeAccess().getWeekdayAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTime__Group__0__Impl"


    // $ANTLR start "rule__DateTime__Group__1"
    // InternalSchedule.g:940:1: rule__DateTime__Group__1 : rule__DateTime__Group__1__Impl rule__DateTime__Group__2 ;
    public final void rule__DateTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:944:1: ( rule__DateTime__Group__1__Impl rule__DateTime__Group__2 )
            // InternalSchedule.g:945:2: rule__DateTime__Group__1__Impl rule__DateTime__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__DateTime__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateTime__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTime__Group__1"


    // $ANTLR start "rule__DateTime__Group__1__Impl"
    // InternalSchedule.g:952:1: rule__DateTime__Group__1__Impl : ( ( rule__DateTime__Group_1__0 )* ) ;
    public final void rule__DateTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:956:1: ( ( ( rule__DateTime__Group_1__0 )* ) )
            // InternalSchedule.g:957:1: ( ( rule__DateTime__Group_1__0 )* )
            {
            // InternalSchedule.g:957:1: ( ( rule__DateTime__Group_1__0 )* )
            // InternalSchedule.g:958:2: ( rule__DateTime__Group_1__0 )*
            {
             before(grammarAccess.getDateTimeAccess().getGroup_1()); 
            // InternalSchedule.g:959:2: ( rule__DateTime__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSchedule.g:959:3: rule__DateTime__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DateTime__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDateTimeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTime__Group__1__Impl"


    // $ANTLR start "rule__DateTime__Group__2"
    // InternalSchedule.g:967:1: rule__DateTime__Group__2 : rule__DateTime__Group__2__Impl rule__DateTime__Group__3 ;
    public final void rule__DateTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:971:1: ( rule__DateTime__Group__2__Impl rule__DateTime__Group__3 )
            // InternalSchedule.g:972:2: rule__DateTime__Group__2__Impl rule__DateTime__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__DateTime__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateTime__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTime__Group__2"


    // $ANTLR start "rule__DateTime__Group__2__Impl"
    // InternalSchedule.g:979:1: rule__DateTime__Group__2__Impl : ( 'at' ) ;
    public final void rule__DateTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:983:1: ( ( 'at' ) )
            // InternalSchedule.g:984:1: ( 'at' )
            {
            // InternalSchedule.g:984:1: ( 'at' )
            // InternalSchedule.g:985:2: 'at'
            {
             before(grammarAccess.getDateTimeAccess().getAtKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDateTimeAccess().getAtKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTime__Group__2__Impl"


    // $ANTLR start "rule__DateTime__Group__3"
    // InternalSchedule.g:994:1: rule__DateTime__Group__3 : rule__DateTime__Group__3__Impl ;
    public final void rule__DateTime__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:998:1: ( rule__DateTime__Group__3__Impl )
            // InternalSchedule.g:999:2: rule__DateTime__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateTime__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTime__Group__3"


    // $ANTLR start "rule__DateTime__Group__3__Impl"
    // InternalSchedule.g:1005:1: rule__DateTime__Group__3__Impl : ( ( rule__DateTime__TimeAssignment_3 ) ) ;
    public final void rule__DateTime__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1009:1: ( ( ( rule__DateTime__TimeAssignment_3 ) ) )
            // InternalSchedule.g:1010:1: ( ( rule__DateTime__TimeAssignment_3 ) )
            {
            // InternalSchedule.g:1010:1: ( ( rule__DateTime__TimeAssignment_3 ) )
            // InternalSchedule.g:1011:2: ( rule__DateTime__TimeAssignment_3 )
            {
             before(grammarAccess.getDateTimeAccess().getTimeAssignment_3()); 
            // InternalSchedule.g:1012:2: ( rule__DateTime__TimeAssignment_3 )
            // InternalSchedule.g:1012:3: rule__DateTime__TimeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DateTime__TimeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDateTimeAccess().getTimeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTime__Group__3__Impl"


    // $ANTLR start "rule__DateTime__Group_1__0"
    // InternalSchedule.g:1021:1: rule__DateTime__Group_1__0 : rule__DateTime__Group_1__0__Impl rule__DateTime__Group_1__1 ;
    public final void rule__DateTime__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1025:1: ( rule__DateTime__Group_1__0__Impl rule__DateTime__Group_1__1 )
            // InternalSchedule.g:1026:2: rule__DateTime__Group_1__0__Impl rule__DateTime__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__DateTime__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateTime__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTime__Group_1__0"


    // $ANTLR start "rule__DateTime__Group_1__0__Impl"
    // InternalSchedule.g:1033:1: rule__DateTime__Group_1__0__Impl : ( ',' ) ;
    public final void rule__DateTime__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1037:1: ( ( ',' ) )
            // InternalSchedule.g:1038:1: ( ',' )
            {
            // InternalSchedule.g:1038:1: ( ',' )
            // InternalSchedule.g:1039:2: ','
            {
             before(grammarAccess.getDateTimeAccess().getCommaKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDateTimeAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTime__Group_1__0__Impl"


    // $ANTLR start "rule__DateTime__Group_1__1"
    // InternalSchedule.g:1048:1: rule__DateTime__Group_1__1 : rule__DateTime__Group_1__1__Impl ;
    public final void rule__DateTime__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1052:1: ( rule__DateTime__Group_1__1__Impl )
            // InternalSchedule.g:1053:2: rule__DateTime__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateTime__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTime__Group_1__1"


    // $ANTLR start "rule__DateTime__Group_1__1__Impl"
    // InternalSchedule.g:1059:1: rule__DateTime__Group_1__1__Impl : ( ( rule__DateTime__WeekdayAssignment_1_1 ) ) ;
    public final void rule__DateTime__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1063:1: ( ( ( rule__DateTime__WeekdayAssignment_1_1 ) ) )
            // InternalSchedule.g:1064:1: ( ( rule__DateTime__WeekdayAssignment_1_1 ) )
            {
            // InternalSchedule.g:1064:1: ( ( rule__DateTime__WeekdayAssignment_1_1 ) )
            // InternalSchedule.g:1065:2: ( rule__DateTime__WeekdayAssignment_1_1 )
            {
             before(grammarAccess.getDateTimeAccess().getWeekdayAssignment_1_1()); 
            // InternalSchedule.g:1066:2: ( rule__DateTime__WeekdayAssignment_1_1 )
            // InternalSchedule.g:1066:3: rule__DateTime__WeekdayAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DateTime__WeekdayAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDateTimeAccess().getWeekdayAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTime__Group_1__1__Impl"


    // $ANTLR start "rule__Time__Group__0"
    // InternalSchedule.g:1075:1: rule__Time__Group__0 : rule__Time__Group__0__Impl rule__Time__Group__1 ;
    public final void rule__Time__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1079:1: ( rule__Time__Group__0__Impl rule__Time__Group__1 )
            // InternalSchedule.g:1080:2: rule__Time__Group__0__Impl rule__Time__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Time__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Time__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__0"


    // $ANTLR start "rule__Time__Group__0__Impl"
    // InternalSchedule.g:1087:1: rule__Time__Group__0__Impl : ( ( rule__Time__HoursAssignment_0 ) ) ;
    public final void rule__Time__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1091:1: ( ( ( rule__Time__HoursAssignment_0 ) ) )
            // InternalSchedule.g:1092:1: ( ( rule__Time__HoursAssignment_0 ) )
            {
            // InternalSchedule.g:1092:1: ( ( rule__Time__HoursAssignment_0 ) )
            // InternalSchedule.g:1093:2: ( rule__Time__HoursAssignment_0 )
            {
             before(grammarAccess.getTimeAccess().getHoursAssignment_0()); 
            // InternalSchedule.g:1094:2: ( rule__Time__HoursAssignment_0 )
            // InternalSchedule.g:1094:3: rule__Time__HoursAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Time__HoursAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getHoursAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__0__Impl"


    // $ANTLR start "rule__Time__Group__1"
    // InternalSchedule.g:1102:1: rule__Time__Group__1 : rule__Time__Group__1__Impl rule__Time__Group__2 ;
    public final void rule__Time__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1106:1: ( rule__Time__Group__1__Impl rule__Time__Group__2 )
            // InternalSchedule.g:1107:2: rule__Time__Group__1__Impl rule__Time__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Time__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Time__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__1"


    // $ANTLR start "rule__Time__Group__1__Impl"
    // InternalSchedule.g:1114:1: rule__Time__Group__1__Impl : ( ':' ) ;
    public final void rule__Time__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1118:1: ( ( ':' ) )
            // InternalSchedule.g:1119:1: ( ':' )
            {
            // InternalSchedule.g:1119:1: ( ':' )
            // InternalSchedule.g:1120:2: ':'
            {
             before(grammarAccess.getTimeAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTimeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__1__Impl"


    // $ANTLR start "rule__Time__Group__2"
    // InternalSchedule.g:1129:1: rule__Time__Group__2 : rule__Time__Group__2__Impl ;
    public final void rule__Time__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1133:1: ( rule__Time__Group__2__Impl )
            // InternalSchedule.g:1134:2: rule__Time__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Time__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__2"


    // $ANTLR start "rule__Time__Group__2__Impl"
    // InternalSchedule.g:1140:1: rule__Time__Group__2__Impl : ( ( rule__Time__MinutesAssignment_2 ) ) ;
    public final void rule__Time__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1144:1: ( ( ( rule__Time__MinutesAssignment_2 ) ) )
            // InternalSchedule.g:1145:1: ( ( rule__Time__MinutesAssignment_2 ) )
            {
            // InternalSchedule.g:1145:1: ( ( rule__Time__MinutesAssignment_2 ) )
            // InternalSchedule.g:1146:2: ( rule__Time__MinutesAssignment_2 )
            {
             before(grammarAccess.getTimeAccess().getMinutesAssignment_2()); 
            // InternalSchedule.g:1147:2: ( rule__Time__MinutesAssignment_2 )
            // InternalSchedule.g:1147:3: rule__Time__MinutesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Time__MinutesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getMinutesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__2__Impl"


    // $ANTLR start "rule__Route__Group__0"
    // InternalSchedule.g:1156:1: rule__Route__Group__0 : rule__Route__Group__0__Impl rule__Route__Group__1 ;
    public final void rule__Route__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1160:1: ( rule__Route__Group__0__Impl rule__Route__Group__1 )
            // InternalSchedule.g:1161:2: rule__Route__Group__0__Impl rule__Route__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Route__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__Group__0"


    // $ANTLR start "rule__Route__Group__0__Impl"
    // InternalSchedule.g:1168:1: rule__Route__Group__0__Impl : ( ( rule__Route__StartSpotAssignment_0 ) ) ;
    public final void rule__Route__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1172:1: ( ( ( rule__Route__StartSpotAssignment_0 ) ) )
            // InternalSchedule.g:1173:1: ( ( rule__Route__StartSpotAssignment_0 ) )
            {
            // InternalSchedule.g:1173:1: ( ( rule__Route__StartSpotAssignment_0 ) )
            // InternalSchedule.g:1174:2: ( rule__Route__StartSpotAssignment_0 )
            {
             before(grammarAccess.getRouteAccess().getStartSpotAssignment_0()); 
            // InternalSchedule.g:1175:2: ( rule__Route__StartSpotAssignment_0 )
            // InternalSchedule.g:1175:3: rule__Route__StartSpotAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Route__StartSpotAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getStartSpotAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__Group__0__Impl"


    // $ANTLR start "rule__Route__Group__1"
    // InternalSchedule.g:1183:1: rule__Route__Group__1 : rule__Route__Group__1__Impl rule__Route__Group__2 ;
    public final void rule__Route__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1187:1: ( rule__Route__Group__1__Impl rule__Route__Group__2 )
            // InternalSchedule.g:1188:2: rule__Route__Group__1__Impl rule__Route__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Route__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__Group__1"


    // $ANTLR start "rule__Route__Group__1__Impl"
    // InternalSchedule.g:1195:1: rule__Route__Group__1__Impl : ( ( rule__Route__MiddleSpotsAssignment_1 )* ) ;
    public final void rule__Route__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1199:1: ( ( ( rule__Route__MiddleSpotsAssignment_1 )* ) )
            // InternalSchedule.g:1200:1: ( ( rule__Route__MiddleSpotsAssignment_1 )* )
            {
            // InternalSchedule.g:1200:1: ( ( rule__Route__MiddleSpotsAssignment_1 )* )
            // InternalSchedule.g:1201:2: ( rule__Route__MiddleSpotsAssignment_1 )*
            {
             before(grammarAccess.getRouteAccess().getMiddleSpotsAssignment_1()); 
            // InternalSchedule.g:1202:2: ( rule__Route__MiddleSpotsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSchedule.g:1202:3: rule__Route__MiddleSpotsAssignment_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Route__MiddleSpotsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRouteAccess().getMiddleSpotsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__Group__1__Impl"


    // $ANTLR start "rule__Route__Group__2"
    // InternalSchedule.g:1210:1: rule__Route__Group__2 : rule__Route__Group__2__Impl ;
    public final void rule__Route__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1214:1: ( rule__Route__Group__2__Impl )
            // InternalSchedule.g:1215:2: rule__Route__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Route__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__Group__2"


    // $ANTLR start "rule__Route__Group__2__Impl"
    // InternalSchedule.g:1221:1: rule__Route__Group__2__Impl : ( ( rule__Route__FinalSpotAssignment_2 ) ) ;
    public final void rule__Route__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1225:1: ( ( ( rule__Route__FinalSpotAssignment_2 ) ) )
            // InternalSchedule.g:1226:1: ( ( rule__Route__FinalSpotAssignment_2 ) )
            {
            // InternalSchedule.g:1226:1: ( ( rule__Route__FinalSpotAssignment_2 ) )
            // InternalSchedule.g:1227:2: ( rule__Route__FinalSpotAssignment_2 )
            {
             before(grammarAccess.getRouteAccess().getFinalSpotAssignment_2()); 
            // InternalSchedule.g:1228:2: ( rule__Route__FinalSpotAssignment_2 )
            // InternalSchedule.g:1228:3: rule__Route__FinalSpotAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Route__FinalSpotAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getFinalSpotAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__Group__2__Impl"


    // $ANTLR start "rule__StartSpot__Group__0"
    // InternalSchedule.g:1237:1: rule__StartSpot__Group__0 : rule__StartSpot__Group__0__Impl rule__StartSpot__Group__1 ;
    public final void rule__StartSpot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1241:1: ( rule__StartSpot__Group__0__Impl rule__StartSpot__Group__1 )
            // InternalSchedule.g:1242:2: rule__StartSpot__Group__0__Impl rule__StartSpot__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__StartSpot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartSpot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__Group__0"


    // $ANTLR start "rule__StartSpot__Group__0__Impl"
    // InternalSchedule.g:1249:1: rule__StartSpot__Group__0__Impl : ( 'start' ) ;
    public final void rule__StartSpot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1253:1: ( ( 'start' ) )
            // InternalSchedule.g:1254:1: ( 'start' )
            {
            // InternalSchedule.g:1254:1: ( 'start' )
            // InternalSchedule.g:1255:2: 'start'
            {
             before(grammarAccess.getStartSpotAccess().getStartKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStartSpotAccess().getStartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__Group__0__Impl"


    // $ANTLR start "rule__StartSpot__Group__1"
    // InternalSchedule.g:1264:1: rule__StartSpot__Group__1 : rule__StartSpot__Group__1__Impl rule__StartSpot__Group__2 ;
    public final void rule__StartSpot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1268:1: ( rule__StartSpot__Group__1__Impl rule__StartSpot__Group__2 )
            // InternalSchedule.g:1269:2: rule__StartSpot__Group__1__Impl rule__StartSpot__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__StartSpot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartSpot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__Group__1"


    // $ANTLR start "rule__StartSpot__Group__1__Impl"
    // InternalSchedule.g:1276:1: rule__StartSpot__Group__1__Impl : ( 'at' ) ;
    public final void rule__StartSpot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1280:1: ( ( 'at' ) )
            // InternalSchedule.g:1281:1: ( 'at' )
            {
            // InternalSchedule.g:1281:1: ( 'at' )
            // InternalSchedule.g:1282:2: 'at'
            {
             before(grammarAccess.getStartSpotAccess().getAtKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStartSpotAccess().getAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__Group__1__Impl"


    // $ANTLR start "rule__StartSpot__Group__2"
    // InternalSchedule.g:1291:1: rule__StartSpot__Group__2 : rule__StartSpot__Group__2__Impl rule__StartSpot__Group__3 ;
    public final void rule__StartSpot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1295:1: ( rule__StartSpot__Group__2__Impl rule__StartSpot__Group__3 )
            // InternalSchedule.g:1296:2: rule__StartSpot__Group__2__Impl rule__StartSpot__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__StartSpot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartSpot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__Group__2"


    // $ANTLR start "rule__StartSpot__Group__2__Impl"
    // InternalSchedule.g:1303:1: rule__StartSpot__Group__2__Impl : ( ( rule__StartSpot__StationAssignment_2 ) ) ;
    public final void rule__StartSpot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1307:1: ( ( ( rule__StartSpot__StationAssignment_2 ) ) )
            // InternalSchedule.g:1308:1: ( ( rule__StartSpot__StationAssignment_2 ) )
            {
            // InternalSchedule.g:1308:1: ( ( rule__StartSpot__StationAssignment_2 ) )
            // InternalSchedule.g:1309:2: ( rule__StartSpot__StationAssignment_2 )
            {
             before(grammarAccess.getStartSpotAccess().getStationAssignment_2()); 
            // InternalSchedule.g:1310:2: ( rule__StartSpot__StationAssignment_2 )
            // InternalSchedule.g:1310:3: rule__StartSpot__StationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StartSpot__StationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStartSpotAccess().getStationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__Group__2__Impl"


    // $ANTLR start "rule__StartSpot__Group__3"
    // InternalSchedule.g:1318:1: rule__StartSpot__Group__3 : rule__StartSpot__Group__3__Impl rule__StartSpot__Group__4 ;
    public final void rule__StartSpot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1322:1: ( rule__StartSpot__Group__3__Impl rule__StartSpot__Group__4 )
            // InternalSchedule.g:1323:2: rule__StartSpot__Group__3__Impl rule__StartSpot__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__StartSpot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartSpot__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__Group__3"


    // $ANTLR start "rule__StartSpot__Group__3__Impl"
    // InternalSchedule.g:1330:1: rule__StartSpot__Group__3__Impl : ( ( rule__StartSpot__Group_3__0 )? ) ;
    public final void rule__StartSpot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1334:1: ( ( ( rule__StartSpot__Group_3__0 )? ) )
            // InternalSchedule.g:1335:1: ( ( rule__StartSpot__Group_3__0 )? )
            {
            // InternalSchedule.g:1335:1: ( ( rule__StartSpot__Group_3__0 )? )
            // InternalSchedule.g:1336:2: ( rule__StartSpot__Group_3__0 )?
            {
             before(grammarAccess.getStartSpotAccess().getGroup_3()); 
            // InternalSchedule.g:1337:2: ( rule__StartSpot__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSchedule.g:1337:3: rule__StartSpot__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StartSpot__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStartSpotAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__Group__3__Impl"


    // $ANTLR start "rule__StartSpot__Group__4"
    // InternalSchedule.g:1345:1: rule__StartSpot__Group__4 : rule__StartSpot__Group__4__Impl ;
    public final void rule__StartSpot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1349:1: ( rule__StartSpot__Group__4__Impl )
            // InternalSchedule.g:1350:2: rule__StartSpot__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartSpot__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__Group__4"


    // $ANTLR start "rule__StartSpot__Group__4__Impl"
    // InternalSchedule.g:1356:1: rule__StartSpot__Group__4__Impl : ( ( rule__StartSpot__Group_4__0 )? ) ;
    public final void rule__StartSpot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1360:1: ( ( ( rule__StartSpot__Group_4__0 )? ) )
            // InternalSchedule.g:1361:1: ( ( rule__StartSpot__Group_4__0 )? )
            {
            // InternalSchedule.g:1361:1: ( ( rule__StartSpot__Group_4__0 )? )
            // InternalSchedule.g:1362:2: ( rule__StartSpot__Group_4__0 )?
            {
             before(grammarAccess.getStartSpotAccess().getGroup_4()); 
            // InternalSchedule.g:1363:2: ( rule__StartSpot__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSchedule.g:1363:3: rule__StartSpot__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StartSpot__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStartSpotAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__Group__4__Impl"


    // $ANTLR start "rule__StartSpot__Group_3__0"
    // InternalSchedule.g:1372:1: rule__StartSpot__Group_3__0 : rule__StartSpot__Group_3__0__Impl rule__StartSpot__Group_3__1 ;
    public final void rule__StartSpot__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1376:1: ( rule__StartSpot__Group_3__0__Impl rule__StartSpot__Group_3__1 )
            // InternalSchedule.g:1377:2: rule__StartSpot__Group_3__0__Impl rule__StartSpot__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__StartSpot__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartSpot__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__Group_3__0"


    // $ANTLR start "rule__StartSpot__Group_3__0__Impl"
    // InternalSchedule.g:1384:1: rule__StartSpot__Group_3__0__Impl : ( 'on' ) ;
    public final void rule__StartSpot__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1388:1: ( ( 'on' ) )
            // InternalSchedule.g:1389:1: ( 'on' )
            {
            // InternalSchedule.g:1389:1: ( 'on' )
            // InternalSchedule.g:1390:2: 'on'
            {
             before(grammarAccess.getStartSpotAccess().getOnKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStartSpotAccess().getOnKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__Group_3__0__Impl"


    // $ANTLR start "rule__StartSpot__Group_3__1"
    // InternalSchedule.g:1399:1: rule__StartSpot__Group_3__1 : rule__StartSpot__Group_3__1__Impl rule__StartSpot__Group_3__2 ;
    public final void rule__StartSpot__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1403:1: ( rule__StartSpot__Group_3__1__Impl rule__StartSpot__Group_3__2 )
            // InternalSchedule.g:1404:2: rule__StartSpot__Group_3__1__Impl rule__StartSpot__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__StartSpot__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartSpot__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__Group_3__1"


    // $ANTLR start "rule__StartSpot__Group_3__1__Impl"
    // InternalSchedule.g:1411:1: rule__StartSpot__Group_3__1__Impl : ( 'platform' ) ;
    public final void rule__StartSpot__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1415:1: ( ( 'platform' ) )
            // InternalSchedule.g:1416:1: ( 'platform' )
            {
            // InternalSchedule.g:1416:1: ( 'platform' )
            // InternalSchedule.g:1417:2: 'platform'
            {
             before(grammarAccess.getStartSpotAccess().getPlatformKeyword_3_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStartSpotAccess().getPlatformKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__Group_3__1__Impl"


    // $ANTLR start "rule__StartSpot__Group_3__2"
    // InternalSchedule.g:1426:1: rule__StartSpot__Group_3__2 : rule__StartSpot__Group_3__2__Impl ;
    public final void rule__StartSpot__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1430:1: ( rule__StartSpot__Group_3__2__Impl )
            // InternalSchedule.g:1431:2: rule__StartSpot__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartSpot__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__Group_3__2"


    // $ANTLR start "rule__StartSpot__Group_3__2__Impl"
    // InternalSchedule.g:1437:1: rule__StartSpot__Group_3__2__Impl : ( ( rule__StartSpot__PlatformAssignment_3_2 ) ) ;
    public final void rule__StartSpot__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1441:1: ( ( ( rule__StartSpot__PlatformAssignment_3_2 ) ) )
            // InternalSchedule.g:1442:1: ( ( rule__StartSpot__PlatformAssignment_3_2 ) )
            {
            // InternalSchedule.g:1442:1: ( ( rule__StartSpot__PlatformAssignment_3_2 ) )
            // InternalSchedule.g:1443:2: ( rule__StartSpot__PlatformAssignment_3_2 )
            {
             before(grammarAccess.getStartSpotAccess().getPlatformAssignment_3_2()); 
            // InternalSchedule.g:1444:2: ( rule__StartSpot__PlatformAssignment_3_2 )
            // InternalSchedule.g:1444:3: rule__StartSpot__PlatformAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__StartSpot__PlatformAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getStartSpotAccess().getPlatformAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__Group_3__2__Impl"


    // $ANTLR start "rule__StartSpot__Group_4__0"
    // InternalSchedule.g:1453:1: rule__StartSpot__Group_4__0 : rule__StartSpot__Group_4__0__Impl rule__StartSpot__Group_4__1 ;
    public final void rule__StartSpot__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1457:1: ( rule__StartSpot__Group_4__0__Impl rule__StartSpot__Group_4__1 )
            // InternalSchedule.g:1458:2: rule__StartSpot__Group_4__0__Impl rule__StartSpot__Group_4__1
            {
            pushFollow(FOLLOW_24);
            rule__StartSpot__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartSpot__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__Group_4__0"


    // $ANTLR start "rule__StartSpot__Group_4__0__Impl"
    // InternalSchedule.g:1465:1: rule__StartSpot__Group_4__0__Impl : ( 'drive' ) ;
    public final void rule__StartSpot__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1469:1: ( ( 'drive' ) )
            // InternalSchedule.g:1470:1: ( 'drive' )
            {
            // InternalSchedule.g:1470:1: ( 'drive' )
            // InternalSchedule.g:1471:2: 'drive'
            {
             before(grammarAccess.getStartSpotAccess().getDriveKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStartSpotAccess().getDriveKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__Group_4__0__Impl"


    // $ANTLR start "rule__StartSpot__Group_4__1"
    // InternalSchedule.g:1480:1: rule__StartSpot__Group_4__1 : rule__StartSpot__Group_4__1__Impl rule__StartSpot__Group_4__2 ;
    public final void rule__StartSpot__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1484:1: ( rule__StartSpot__Group_4__1__Impl rule__StartSpot__Group_4__2 )
            // InternalSchedule.g:1485:2: rule__StartSpot__Group_4__1__Impl rule__StartSpot__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__StartSpot__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartSpot__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__Group_4__1"


    // $ANTLR start "rule__StartSpot__Group_4__1__Impl"
    // InternalSchedule.g:1492:1: rule__StartSpot__Group_4__1__Impl : ( 'via' ) ;
    public final void rule__StartSpot__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1496:1: ( ( 'via' ) )
            // InternalSchedule.g:1497:1: ( 'via' )
            {
            // InternalSchedule.g:1497:1: ( 'via' )
            // InternalSchedule.g:1498:2: 'via'
            {
             before(grammarAccess.getStartSpotAccess().getViaKeyword_4_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStartSpotAccess().getViaKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__Group_4__1__Impl"


    // $ANTLR start "rule__StartSpot__Group_4__2"
    // InternalSchedule.g:1507:1: rule__StartSpot__Group_4__2 : rule__StartSpot__Group_4__2__Impl ;
    public final void rule__StartSpot__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1511:1: ( rule__StartSpot__Group_4__2__Impl )
            // InternalSchedule.g:1512:2: rule__StartSpot__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartSpot__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__Group_4__2"


    // $ANTLR start "rule__StartSpot__Group_4__2__Impl"
    // InternalSchedule.g:1518:1: rule__StartSpot__Group_4__2__Impl : ( ( rule__StartSpot__LegAssignment_4_2 ) ) ;
    public final void rule__StartSpot__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1522:1: ( ( ( rule__StartSpot__LegAssignment_4_2 ) ) )
            // InternalSchedule.g:1523:1: ( ( rule__StartSpot__LegAssignment_4_2 ) )
            {
            // InternalSchedule.g:1523:1: ( ( rule__StartSpot__LegAssignment_4_2 ) )
            // InternalSchedule.g:1524:2: ( rule__StartSpot__LegAssignment_4_2 )
            {
             before(grammarAccess.getStartSpotAccess().getLegAssignment_4_2()); 
            // InternalSchedule.g:1525:2: ( rule__StartSpot__LegAssignment_4_2 )
            // InternalSchedule.g:1525:3: rule__StartSpot__LegAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__StartSpot__LegAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getStartSpotAccess().getLegAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__Group_4__2__Impl"


    // $ANTLR start "rule__MiddleSpot__Group__0"
    // InternalSchedule.g:1534:1: rule__MiddleSpot__Group__0 : rule__MiddleSpot__Group__0__Impl rule__MiddleSpot__Group__1 ;
    public final void rule__MiddleSpot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1538:1: ( rule__MiddleSpot__Group__0__Impl rule__MiddleSpot__Group__1 )
            // InternalSchedule.g:1539:2: rule__MiddleSpot__Group__0__Impl rule__MiddleSpot__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__MiddleSpot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group__0"


    // $ANTLR start "rule__MiddleSpot__Group__0__Impl"
    // InternalSchedule.g:1546:1: rule__MiddleSpot__Group__0__Impl : ( 'stop' ) ;
    public final void rule__MiddleSpot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1550:1: ( ( 'stop' ) )
            // InternalSchedule.g:1551:1: ( 'stop' )
            {
            // InternalSchedule.g:1551:1: ( 'stop' )
            // InternalSchedule.g:1552:2: 'stop'
            {
             before(grammarAccess.getMiddleSpotAccess().getStopKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group__0__Impl"


    // $ANTLR start "rule__MiddleSpot__Group__1"
    // InternalSchedule.g:1561:1: rule__MiddleSpot__Group__1 : rule__MiddleSpot__Group__1__Impl rule__MiddleSpot__Group__2 ;
    public final void rule__MiddleSpot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1565:1: ( rule__MiddleSpot__Group__1__Impl rule__MiddleSpot__Group__2 )
            // InternalSchedule.g:1566:2: rule__MiddleSpot__Group__1__Impl rule__MiddleSpot__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__MiddleSpot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group__1"


    // $ANTLR start "rule__MiddleSpot__Group__1__Impl"
    // InternalSchedule.g:1573:1: rule__MiddleSpot__Group__1__Impl : ( 'at' ) ;
    public final void rule__MiddleSpot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1577:1: ( ( 'at' ) )
            // InternalSchedule.g:1578:1: ( 'at' )
            {
            // InternalSchedule.g:1578:1: ( 'at' )
            // InternalSchedule.g:1579:2: 'at'
            {
             before(grammarAccess.getMiddleSpotAccess().getAtKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group__1__Impl"


    // $ANTLR start "rule__MiddleSpot__Group__2"
    // InternalSchedule.g:1588:1: rule__MiddleSpot__Group__2 : rule__MiddleSpot__Group__2__Impl rule__MiddleSpot__Group__3 ;
    public final void rule__MiddleSpot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1592:1: ( rule__MiddleSpot__Group__2__Impl rule__MiddleSpot__Group__3 )
            // InternalSchedule.g:1593:2: rule__MiddleSpot__Group__2__Impl rule__MiddleSpot__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__MiddleSpot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group__2"


    // $ANTLR start "rule__MiddleSpot__Group__2__Impl"
    // InternalSchedule.g:1600:1: rule__MiddleSpot__Group__2__Impl : ( ( rule__MiddleSpot__StationAssignment_2 ) ) ;
    public final void rule__MiddleSpot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1604:1: ( ( ( rule__MiddleSpot__StationAssignment_2 ) ) )
            // InternalSchedule.g:1605:1: ( ( rule__MiddleSpot__StationAssignment_2 ) )
            {
            // InternalSchedule.g:1605:1: ( ( rule__MiddleSpot__StationAssignment_2 ) )
            // InternalSchedule.g:1606:2: ( rule__MiddleSpot__StationAssignment_2 )
            {
             before(grammarAccess.getMiddleSpotAccess().getStationAssignment_2()); 
            // InternalSchedule.g:1607:2: ( rule__MiddleSpot__StationAssignment_2 )
            // InternalSchedule.g:1607:3: rule__MiddleSpot__StationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MiddleSpot__StationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMiddleSpotAccess().getStationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group__2__Impl"


    // $ANTLR start "rule__MiddleSpot__Group__3"
    // InternalSchedule.g:1615:1: rule__MiddleSpot__Group__3 : rule__MiddleSpot__Group__3__Impl rule__MiddleSpot__Group__4 ;
    public final void rule__MiddleSpot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1619:1: ( rule__MiddleSpot__Group__3__Impl rule__MiddleSpot__Group__4 )
            // InternalSchedule.g:1620:2: rule__MiddleSpot__Group__3__Impl rule__MiddleSpot__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__MiddleSpot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group__3"


    // $ANTLR start "rule__MiddleSpot__Group__3__Impl"
    // InternalSchedule.g:1627:1: rule__MiddleSpot__Group__3__Impl : ( ( rule__MiddleSpot__Group_3__0 )? ) ;
    public final void rule__MiddleSpot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1631:1: ( ( ( rule__MiddleSpot__Group_3__0 )? ) )
            // InternalSchedule.g:1632:1: ( ( rule__MiddleSpot__Group_3__0 )? )
            {
            // InternalSchedule.g:1632:1: ( ( rule__MiddleSpot__Group_3__0 )? )
            // InternalSchedule.g:1633:2: ( rule__MiddleSpot__Group_3__0 )?
            {
             before(grammarAccess.getMiddleSpotAccess().getGroup_3()); 
            // InternalSchedule.g:1634:2: ( rule__MiddleSpot__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSchedule.g:1634:3: rule__MiddleSpot__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MiddleSpot__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMiddleSpotAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group__3__Impl"


    // $ANTLR start "rule__MiddleSpot__Group__4"
    // InternalSchedule.g:1642:1: rule__MiddleSpot__Group__4 : rule__MiddleSpot__Group__4__Impl rule__MiddleSpot__Group__5 ;
    public final void rule__MiddleSpot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1646:1: ( rule__MiddleSpot__Group__4__Impl rule__MiddleSpot__Group__5 )
            // InternalSchedule.g:1647:2: rule__MiddleSpot__Group__4__Impl rule__MiddleSpot__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__MiddleSpot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group__4"


    // $ANTLR start "rule__MiddleSpot__Group__4__Impl"
    // InternalSchedule.g:1654:1: rule__MiddleSpot__Group__4__Impl : ( ( rule__MiddleSpot__Group_4__0 )? ) ;
    public final void rule__MiddleSpot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1658:1: ( ( ( rule__MiddleSpot__Group_4__0 )? ) )
            // InternalSchedule.g:1659:1: ( ( rule__MiddleSpot__Group_4__0 )? )
            {
            // InternalSchedule.g:1659:1: ( ( rule__MiddleSpot__Group_4__0 )? )
            // InternalSchedule.g:1660:2: ( rule__MiddleSpot__Group_4__0 )?
            {
             before(grammarAccess.getMiddleSpotAccess().getGroup_4()); 
            // InternalSchedule.g:1661:2: ( rule__MiddleSpot__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSchedule.g:1661:3: rule__MiddleSpot__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MiddleSpot__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMiddleSpotAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group__4__Impl"


    // $ANTLR start "rule__MiddleSpot__Group__5"
    // InternalSchedule.g:1669:1: rule__MiddleSpot__Group__5 : rule__MiddleSpot__Group__5__Impl rule__MiddleSpot__Group__6 ;
    public final void rule__MiddleSpot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1673:1: ( rule__MiddleSpot__Group__5__Impl rule__MiddleSpot__Group__6 )
            // InternalSchedule.g:1674:2: rule__MiddleSpot__Group__5__Impl rule__MiddleSpot__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__MiddleSpot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group__5"


    // $ANTLR start "rule__MiddleSpot__Group__5__Impl"
    // InternalSchedule.g:1681:1: rule__MiddleSpot__Group__5__Impl : ( ( rule__MiddleSpot__TurnStationAssignment_5 )? ) ;
    public final void rule__MiddleSpot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1685:1: ( ( ( rule__MiddleSpot__TurnStationAssignment_5 )? ) )
            // InternalSchedule.g:1686:1: ( ( rule__MiddleSpot__TurnStationAssignment_5 )? )
            {
            // InternalSchedule.g:1686:1: ( ( rule__MiddleSpot__TurnStationAssignment_5 )? )
            // InternalSchedule.g:1687:2: ( rule__MiddleSpot__TurnStationAssignment_5 )?
            {
             before(grammarAccess.getMiddleSpotAccess().getTurnStationAssignment_5()); 
            // InternalSchedule.g:1688:2: ( rule__MiddleSpot__TurnStationAssignment_5 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSchedule.g:1688:3: rule__MiddleSpot__TurnStationAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__MiddleSpot__TurnStationAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMiddleSpotAccess().getTurnStationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group__5__Impl"


    // $ANTLR start "rule__MiddleSpot__Group__6"
    // InternalSchedule.g:1696:1: rule__MiddleSpot__Group__6 : rule__MiddleSpot__Group__6__Impl ;
    public final void rule__MiddleSpot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1700:1: ( rule__MiddleSpot__Group__6__Impl )
            // InternalSchedule.g:1701:2: rule__MiddleSpot__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group__6"


    // $ANTLR start "rule__MiddleSpot__Group__6__Impl"
    // InternalSchedule.g:1707:1: rule__MiddleSpot__Group__6__Impl : ( ( rule__MiddleSpot__Group_6__0 )? ) ;
    public final void rule__MiddleSpot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1711:1: ( ( ( rule__MiddleSpot__Group_6__0 )? ) )
            // InternalSchedule.g:1712:1: ( ( rule__MiddleSpot__Group_6__0 )? )
            {
            // InternalSchedule.g:1712:1: ( ( rule__MiddleSpot__Group_6__0 )? )
            // InternalSchedule.g:1713:2: ( rule__MiddleSpot__Group_6__0 )?
            {
             before(grammarAccess.getMiddleSpotAccess().getGroup_6()); 
            // InternalSchedule.g:1714:2: ( rule__MiddleSpot__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSchedule.g:1714:3: rule__MiddleSpot__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MiddleSpot__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMiddleSpotAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group__6__Impl"


    // $ANTLR start "rule__MiddleSpot__Group_3__0"
    // InternalSchedule.g:1723:1: rule__MiddleSpot__Group_3__0 : rule__MiddleSpot__Group_3__0__Impl rule__MiddleSpot__Group_3__1 ;
    public final void rule__MiddleSpot__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1727:1: ( rule__MiddleSpot__Group_3__0__Impl rule__MiddleSpot__Group_3__1 )
            // InternalSchedule.g:1728:2: rule__MiddleSpot__Group_3__0__Impl rule__MiddleSpot__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__MiddleSpot__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group_3__0"


    // $ANTLR start "rule__MiddleSpot__Group_3__0__Impl"
    // InternalSchedule.g:1735:1: rule__MiddleSpot__Group_3__0__Impl : ( 'on' ) ;
    public final void rule__MiddleSpot__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1739:1: ( ( 'on' ) )
            // InternalSchedule.g:1740:1: ( 'on' )
            {
            // InternalSchedule.g:1740:1: ( 'on' )
            // InternalSchedule.g:1741:2: 'on'
            {
             before(grammarAccess.getMiddleSpotAccess().getOnKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getOnKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group_3__0__Impl"


    // $ANTLR start "rule__MiddleSpot__Group_3__1"
    // InternalSchedule.g:1750:1: rule__MiddleSpot__Group_3__1 : rule__MiddleSpot__Group_3__1__Impl rule__MiddleSpot__Group_3__2 ;
    public final void rule__MiddleSpot__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1754:1: ( rule__MiddleSpot__Group_3__1__Impl rule__MiddleSpot__Group_3__2 )
            // InternalSchedule.g:1755:2: rule__MiddleSpot__Group_3__1__Impl rule__MiddleSpot__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__MiddleSpot__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group_3__1"


    // $ANTLR start "rule__MiddleSpot__Group_3__1__Impl"
    // InternalSchedule.g:1762:1: rule__MiddleSpot__Group_3__1__Impl : ( 'platform' ) ;
    public final void rule__MiddleSpot__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1766:1: ( ( 'platform' ) )
            // InternalSchedule.g:1767:1: ( 'platform' )
            {
            // InternalSchedule.g:1767:1: ( 'platform' )
            // InternalSchedule.g:1768:2: 'platform'
            {
             before(grammarAccess.getMiddleSpotAccess().getPlatformKeyword_3_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getPlatformKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group_3__1__Impl"


    // $ANTLR start "rule__MiddleSpot__Group_3__2"
    // InternalSchedule.g:1777:1: rule__MiddleSpot__Group_3__2 : rule__MiddleSpot__Group_3__2__Impl ;
    public final void rule__MiddleSpot__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1781:1: ( rule__MiddleSpot__Group_3__2__Impl )
            // InternalSchedule.g:1782:2: rule__MiddleSpot__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group_3__2"


    // $ANTLR start "rule__MiddleSpot__Group_3__2__Impl"
    // InternalSchedule.g:1788:1: rule__MiddleSpot__Group_3__2__Impl : ( ( rule__MiddleSpot__PlatformAssignment_3_2 ) ) ;
    public final void rule__MiddleSpot__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1792:1: ( ( ( rule__MiddleSpot__PlatformAssignment_3_2 ) ) )
            // InternalSchedule.g:1793:1: ( ( rule__MiddleSpot__PlatformAssignment_3_2 ) )
            {
            // InternalSchedule.g:1793:1: ( ( rule__MiddleSpot__PlatformAssignment_3_2 ) )
            // InternalSchedule.g:1794:2: ( rule__MiddleSpot__PlatformAssignment_3_2 )
            {
             before(grammarAccess.getMiddleSpotAccess().getPlatformAssignment_3_2()); 
            // InternalSchedule.g:1795:2: ( rule__MiddleSpot__PlatformAssignment_3_2 )
            // InternalSchedule.g:1795:3: rule__MiddleSpot__PlatformAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__MiddleSpot__PlatformAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getMiddleSpotAccess().getPlatformAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group_3__2__Impl"


    // $ANTLR start "rule__MiddleSpot__Group_4__0"
    // InternalSchedule.g:1804:1: rule__MiddleSpot__Group_4__0 : rule__MiddleSpot__Group_4__0__Impl rule__MiddleSpot__Group_4__1 ;
    public final void rule__MiddleSpot__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1808:1: ( rule__MiddleSpot__Group_4__0__Impl rule__MiddleSpot__Group_4__1 )
            // InternalSchedule.g:1809:2: rule__MiddleSpot__Group_4__0__Impl rule__MiddleSpot__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__MiddleSpot__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group_4__0"


    // $ANTLR start "rule__MiddleSpot__Group_4__0__Impl"
    // InternalSchedule.g:1816:1: rule__MiddleSpot__Group_4__0__Impl : ( 'for' ) ;
    public final void rule__MiddleSpot__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1820:1: ( ( 'for' ) )
            // InternalSchedule.g:1821:1: ( 'for' )
            {
            // InternalSchedule.g:1821:1: ( 'for' )
            // InternalSchedule.g:1822:2: 'for'
            {
             before(grammarAccess.getMiddleSpotAccess().getForKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getForKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group_4__0__Impl"


    // $ANTLR start "rule__MiddleSpot__Group_4__1"
    // InternalSchedule.g:1831:1: rule__MiddleSpot__Group_4__1 : rule__MiddleSpot__Group_4__1__Impl rule__MiddleSpot__Group_4__2 ;
    public final void rule__MiddleSpot__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1835:1: ( rule__MiddleSpot__Group_4__1__Impl rule__MiddleSpot__Group_4__2 )
            // InternalSchedule.g:1836:2: rule__MiddleSpot__Group_4__1__Impl rule__MiddleSpot__Group_4__2
            {
            pushFollow(FOLLOW_26);
            rule__MiddleSpot__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group_4__1"


    // $ANTLR start "rule__MiddleSpot__Group_4__1__Impl"
    // InternalSchedule.g:1843:1: rule__MiddleSpot__Group_4__1__Impl : ( ( rule__MiddleSpot__WaitingTimeAssignment_4_1 ) ) ;
    public final void rule__MiddleSpot__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1847:1: ( ( ( rule__MiddleSpot__WaitingTimeAssignment_4_1 ) ) )
            // InternalSchedule.g:1848:1: ( ( rule__MiddleSpot__WaitingTimeAssignment_4_1 ) )
            {
            // InternalSchedule.g:1848:1: ( ( rule__MiddleSpot__WaitingTimeAssignment_4_1 ) )
            // InternalSchedule.g:1849:2: ( rule__MiddleSpot__WaitingTimeAssignment_4_1 )
            {
             before(grammarAccess.getMiddleSpotAccess().getWaitingTimeAssignment_4_1()); 
            // InternalSchedule.g:1850:2: ( rule__MiddleSpot__WaitingTimeAssignment_4_1 )
            // InternalSchedule.g:1850:3: rule__MiddleSpot__WaitingTimeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MiddleSpot__WaitingTimeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMiddleSpotAccess().getWaitingTimeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group_4__1__Impl"


    // $ANTLR start "rule__MiddleSpot__Group_4__2"
    // InternalSchedule.g:1858:1: rule__MiddleSpot__Group_4__2 : rule__MiddleSpot__Group_4__2__Impl ;
    public final void rule__MiddleSpot__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1862:1: ( rule__MiddleSpot__Group_4__2__Impl )
            // InternalSchedule.g:1863:2: rule__MiddleSpot__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group_4__2"


    // $ANTLR start "rule__MiddleSpot__Group_4__2__Impl"
    // InternalSchedule.g:1869:1: rule__MiddleSpot__Group_4__2__Impl : ( 'min' ) ;
    public final void rule__MiddleSpot__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1873:1: ( ( 'min' ) )
            // InternalSchedule.g:1874:1: ( 'min' )
            {
            // InternalSchedule.g:1874:1: ( 'min' )
            // InternalSchedule.g:1875:2: 'min'
            {
             before(grammarAccess.getMiddleSpotAccess().getMinKeyword_4_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getMinKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group_4__2__Impl"


    // $ANTLR start "rule__MiddleSpot__Group_6__0"
    // InternalSchedule.g:1885:1: rule__MiddleSpot__Group_6__0 : rule__MiddleSpot__Group_6__0__Impl rule__MiddleSpot__Group_6__1 ;
    public final void rule__MiddleSpot__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1889:1: ( rule__MiddleSpot__Group_6__0__Impl rule__MiddleSpot__Group_6__1 )
            // InternalSchedule.g:1890:2: rule__MiddleSpot__Group_6__0__Impl rule__MiddleSpot__Group_6__1
            {
            pushFollow(FOLLOW_24);
            rule__MiddleSpot__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group_6__0"


    // $ANTLR start "rule__MiddleSpot__Group_6__0__Impl"
    // InternalSchedule.g:1897:1: rule__MiddleSpot__Group_6__0__Impl : ( 'drive' ) ;
    public final void rule__MiddleSpot__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1901:1: ( ( 'drive' ) )
            // InternalSchedule.g:1902:1: ( 'drive' )
            {
            // InternalSchedule.g:1902:1: ( 'drive' )
            // InternalSchedule.g:1903:2: 'drive'
            {
             before(grammarAccess.getMiddleSpotAccess().getDriveKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getDriveKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group_6__0__Impl"


    // $ANTLR start "rule__MiddleSpot__Group_6__1"
    // InternalSchedule.g:1912:1: rule__MiddleSpot__Group_6__1 : rule__MiddleSpot__Group_6__1__Impl rule__MiddleSpot__Group_6__2 ;
    public final void rule__MiddleSpot__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1916:1: ( rule__MiddleSpot__Group_6__1__Impl rule__MiddleSpot__Group_6__2 )
            // InternalSchedule.g:1917:2: rule__MiddleSpot__Group_6__1__Impl rule__MiddleSpot__Group_6__2
            {
            pushFollow(FOLLOW_4);
            rule__MiddleSpot__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group_6__1"


    // $ANTLR start "rule__MiddleSpot__Group_6__1__Impl"
    // InternalSchedule.g:1924:1: rule__MiddleSpot__Group_6__1__Impl : ( 'via' ) ;
    public final void rule__MiddleSpot__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1928:1: ( ( 'via' ) )
            // InternalSchedule.g:1929:1: ( 'via' )
            {
            // InternalSchedule.g:1929:1: ( 'via' )
            // InternalSchedule.g:1930:2: 'via'
            {
             before(grammarAccess.getMiddleSpotAccess().getViaKeyword_6_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getViaKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group_6__1__Impl"


    // $ANTLR start "rule__MiddleSpot__Group_6__2"
    // InternalSchedule.g:1939:1: rule__MiddleSpot__Group_6__2 : rule__MiddleSpot__Group_6__2__Impl ;
    public final void rule__MiddleSpot__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1943:1: ( rule__MiddleSpot__Group_6__2__Impl )
            // InternalSchedule.g:1944:2: rule__MiddleSpot__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group_6__2"


    // $ANTLR start "rule__MiddleSpot__Group_6__2__Impl"
    // InternalSchedule.g:1950:1: rule__MiddleSpot__Group_6__2__Impl : ( ( rule__MiddleSpot__LegAssignment_6_2 ) ) ;
    public final void rule__MiddleSpot__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1954:1: ( ( ( rule__MiddleSpot__LegAssignment_6_2 ) ) )
            // InternalSchedule.g:1955:1: ( ( rule__MiddleSpot__LegAssignment_6_2 ) )
            {
            // InternalSchedule.g:1955:1: ( ( rule__MiddleSpot__LegAssignment_6_2 ) )
            // InternalSchedule.g:1956:2: ( rule__MiddleSpot__LegAssignment_6_2 )
            {
             before(grammarAccess.getMiddleSpotAccess().getLegAssignment_6_2()); 
            // InternalSchedule.g:1957:2: ( rule__MiddleSpot__LegAssignment_6_2 )
            // InternalSchedule.g:1957:3: rule__MiddleSpot__LegAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__MiddleSpot__LegAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getMiddleSpotAccess().getLegAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__Group_6__2__Impl"


    // $ANTLR start "rule__FinalSpot__Group__0"
    // InternalSchedule.g:1966:1: rule__FinalSpot__Group__0 : rule__FinalSpot__Group__0__Impl rule__FinalSpot__Group__1 ;
    public final void rule__FinalSpot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1970:1: ( rule__FinalSpot__Group__0__Impl rule__FinalSpot__Group__1 )
            // InternalSchedule.g:1971:2: rule__FinalSpot__Group__0__Impl rule__FinalSpot__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__FinalSpot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalSpot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalSpot__Group__0"


    // $ANTLR start "rule__FinalSpot__Group__0__Impl"
    // InternalSchedule.g:1978:1: rule__FinalSpot__Group__0__Impl : ( 'terminate' ) ;
    public final void rule__FinalSpot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1982:1: ( ( 'terminate' ) )
            // InternalSchedule.g:1983:1: ( 'terminate' )
            {
            // InternalSchedule.g:1983:1: ( 'terminate' )
            // InternalSchedule.g:1984:2: 'terminate'
            {
             before(grammarAccess.getFinalSpotAccess().getTerminateKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFinalSpotAccess().getTerminateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalSpot__Group__0__Impl"


    // $ANTLR start "rule__FinalSpot__Group__1"
    // InternalSchedule.g:1993:1: rule__FinalSpot__Group__1 : rule__FinalSpot__Group__1__Impl rule__FinalSpot__Group__2 ;
    public final void rule__FinalSpot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1997:1: ( rule__FinalSpot__Group__1__Impl rule__FinalSpot__Group__2 )
            // InternalSchedule.g:1998:2: rule__FinalSpot__Group__1__Impl rule__FinalSpot__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__FinalSpot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalSpot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalSpot__Group__1"


    // $ANTLR start "rule__FinalSpot__Group__1__Impl"
    // InternalSchedule.g:2005:1: rule__FinalSpot__Group__1__Impl : ( 'at' ) ;
    public final void rule__FinalSpot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2009:1: ( ( 'at' ) )
            // InternalSchedule.g:2010:1: ( 'at' )
            {
            // InternalSchedule.g:2010:1: ( 'at' )
            // InternalSchedule.g:2011:2: 'at'
            {
             before(grammarAccess.getFinalSpotAccess().getAtKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFinalSpotAccess().getAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalSpot__Group__1__Impl"


    // $ANTLR start "rule__FinalSpot__Group__2"
    // InternalSchedule.g:2020:1: rule__FinalSpot__Group__2 : rule__FinalSpot__Group__2__Impl rule__FinalSpot__Group__3 ;
    public final void rule__FinalSpot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2024:1: ( rule__FinalSpot__Group__2__Impl rule__FinalSpot__Group__3 )
            // InternalSchedule.g:2025:2: rule__FinalSpot__Group__2__Impl rule__FinalSpot__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__FinalSpot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalSpot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalSpot__Group__2"


    // $ANTLR start "rule__FinalSpot__Group__2__Impl"
    // InternalSchedule.g:2032:1: rule__FinalSpot__Group__2__Impl : ( ( rule__FinalSpot__StationAssignment_2 ) ) ;
    public final void rule__FinalSpot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2036:1: ( ( ( rule__FinalSpot__StationAssignment_2 ) ) )
            // InternalSchedule.g:2037:1: ( ( rule__FinalSpot__StationAssignment_2 ) )
            {
            // InternalSchedule.g:2037:1: ( ( rule__FinalSpot__StationAssignment_2 ) )
            // InternalSchedule.g:2038:2: ( rule__FinalSpot__StationAssignment_2 )
            {
             before(grammarAccess.getFinalSpotAccess().getStationAssignment_2()); 
            // InternalSchedule.g:2039:2: ( rule__FinalSpot__StationAssignment_2 )
            // InternalSchedule.g:2039:3: rule__FinalSpot__StationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FinalSpot__StationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFinalSpotAccess().getStationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalSpot__Group__2__Impl"


    // $ANTLR start "rule__FinalSpot__Group__3"
    // InternalSchedule.g:2047:1: rule__FinalSpot__Group__3 : rule__FinalSpot__Group__3__Impl ;
    public final void rule__FinalSpot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2051:1: ( rule__FinalSpot__Group__3__Impl )
            // InternalSchedule.g:2052:2: rule__FinalSpot__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FinalSpot__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalSpot__Group__3"


    // $ANTLR start "rule__FinalSpot__Group__3__Impl"
    // InternalSchedule.g:2058:1: rule__FinalSpot__Group__3__Impl : ( ( rule__FinalSpot__Group_3__0 )? ) ;
    public final void rule__FinalSpot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2062:1: ( ( ( rule__FinalSpot__Group_3__0 )? ) )
            // InternalSchedule.g:2063:1: ( ( rule__FinalSpot__Group_3__0 )? )
            {
            // InternalSchedule.g:2063:1: ( ( rule__FinalSpot__Group_3__0 )? )
            // InternalSchedule.g:2064:2: ( rule__FinalSpot__Group_3__0 )?
            {
             before(grammarAccess.getFinalSpotAccess().getGroup_3()); 
            // InternalSchedule.g:2065:2: ( rule__FinalSpot__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSchedule.g:2065:3: rule__FinalSpot__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FinalSpot__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFinalSpotAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalSpot__Group__3__Impl"


    // $ANTLR start "rule__FinalSpot__Group_3__0"
    // InternalSchedule.g:2074:1: rule__FinalSpot__Group_3__0 : rule__FinalSpot__Group_3__0__Impl rule__FinalSpot__Group_3__1 ;
    public final void rule__FinalSpot__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2078:1: ( rule__FinalSpot__Group_3__0__Impl rule__FinalSpot__Group_3__1 )
            // InternalSchedule.g:2079:2: rule__FinalSpot__Group_3__0__Impl rule__FinalSpot__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__FinalSpot__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalSpot__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalSpot__Group_3__0"


    // $ANTLR start "rule__FinalSpot__Group_3__0__Impl"
    // InternalSchedule.g:2086:1: rule__FinalSpot__Group_3__0__Impl : ( 'on' ) ;
    public final void rule__FinalSpot__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2090:1: ( ( 'on' ) )
            // InternalSchedule.g:2091:1: ( 'on' )
            {
            // InternalSchedule.g:2091:1: ( 'on' )
            // InternalSchedule.g:2092:2: 'on'
            {
             before(grammarAccess.getFinalSpotAccess().getOnKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFinalSpotAccess().getOnKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalSpot__Group_3__0__Impl"


    // $ANTLR start "rule__FinalSpot__Group_3__1"
    // InternalSchedule.g:2101:1: rule__FinalSpot__Group_3__1 : rule__FinalSpot__Group_3__1__Impl rule__FinalSpot__Group_3__2 ;
    public final void rule__FinalSpot__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2105:1: ( rule__FinalSpot__Group_3__1__Impl rule__FinalSpot__Group_3__2 )
            // InternalSchedule.g:2106:2: rule__FinalSpot__Group_3__1__Impl rule__FinalSpot__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__FinalSpot__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalSpot__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalSpot__Group_3__1"


    // $ANTLR start "rule__FinalSpot__Group_3__1__Impl"
    // InternalSchedule.g:2113:1: rule__FinalSpot__Group_3__1__Impl : ( 'platform' ) ;
    public final void rule__FinalSpot__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2117:1: ( ( 'platform' ) )
            // InternalSchedule.g:2118:1: ( 'platform' )
            {
            // InternalSchedule.g:2118:1: ( 'platform' )
            // InternalSchedule.g:2119:2: 'platform'
            {
             before(grammarAccess.getFinalSpotAccess().getPlatformKeyword_3_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFinalSpotAccess().getPlatformKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalSpot__Group_3__1__Impl"


    // $ANTLR start "rule__FinalSpot__Group_3__2"
    // InternalSchedule.g:2128:1: rule__FinalSpot__Group_3__2 : rule__FinalSpot__Group_3__2__Impl ;
    public final void rule__FinalSpot__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2132:1: ( rule__FinalSpot__Group_3__2__Impl )
            // InternalSchedule.g:2133:2: rule__FinalSpot__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FinalSpot__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalSpot__Group_3__2"


    // $ANTLR start "rule__FinalSpot__Group_3__2__Impl"
    // InternalSchedule.g:2139:1: rule__FinalSpot__Group_3__2__Impl : ( ( rule__FinalSpot__PlatformAssignment_3_2 ) ) ;
    public final void rule__FinalSpot__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2143:1: ( ( ( rule__FinalSpot__PlatformAssignment_3_2 ) ) )
            // InternalSchedule.g:2144:1: ( ( rule__FinalSpot__PlatformAssignment_3_2 ) )
            {
            // InternalSchedule.g:2144:1: ( ( rule__FinalSpot__PlatformAssignment_3_2 ) )
            // InternalSchedule.g:2145:2: ( rule__FinalSpot__PlatformAssignment_3_2 )
            {
             before(grammarAccess.getFinalSpotAccess().getPlatformAssignment_3_2()); 
            // InternalSchedule.g:2146:2: ( rule__FinalSpot__PlatformAssignment_3_2 )
            // InternalSchedule.g:2146:3: rule__FinalSpot__PlatformAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__FinalSpot__PlatformAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getFinalSpotAccess().getPlatformAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalSpot__Group_3__2__Impl"


    // $ANTLR start "rule__Schedule__NetworkAssignment_2"
    // InternalSchedule.g:2155:1: rule__Schedule__NetworkAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Schedule__NetworkAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2159:1: ( ( ( RULE_ID ) ) )
            // InternalSchedule.g:2160:2: ( ( RULE_ID ) )
            {
            // InternalSchedule.g:2160:2: ( ( RULE_ID ) )
            // InternalSchedule.g:2161:3: ( RULE_ID )
            {
             before(grammarAccess.getScheduleAccess().getNetworkNetworkCrossReference_2_0()); 
            // InternalSchedule.g:2162:3: ( RULE_ID )
            // InternalSchedule.g:2163:4: RULE_ID
            {
             before(grammarAccess.getScheduleAccess().getNetworkNetworkIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getNetworkNetworkIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getScheduleAccess().getNetworkNetworkCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__NetworkAssignment_2"


    // $ANTLR start "rule__Schedule__DepotsAssignment_4"
    // InternalSchedule.g:2174:1: rule__Schedule__DepotsAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Schedule__DepotsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2178:1: ( ( ( RULE_ID ) ) )
            // InternalSchedule.g:2179:2: ( ( RULE_ID ) )
            {
            // InternalSchedule.g:2179:2: ( ( RULE_ID ) )
            // InternalSchedule.g:2180:3: ( RULE_ID )
            {
             before(grammarAccess.getScheduleAccess().getDepotsDepotCrossReference_4_0()); 
            // InternalSchedule.g:2181:3: ( RULE_ID )
            // InternalSchedule.g:2182:4: RULE_ID
            {
             before(grammarAccess.getScheduleAccess().getDepotsDepotIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getDepotsDepotIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getScheduleAccess().getDepotsDepotCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__DepotsAssignment_4"


    // $ANTLR start "rule__Schedule__DepotsAssignment_5_1"
    // InternalSchedule.g:2193:1: rule__Schedule__DepotsAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Schedule__DepotsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2197:1: ( ( ( RULE_ID ) ) )
            // InternalSchedule.g:2198:2: ( ( RULE_ID ) )
            {
            // InternalSchedule.g:2198:2: ( ( RULE_ID ) )
            // InternalSchedule.g:2199:3: ( RULE_ID )
            {
             before(grammarAccess.getScheduleAccess().getDepotsDepotCrossReference_5_1_0()); 
            // InternalSchedule.g:2200:3: ( RULE_ID )
            // InternalSchedule.g:2201:4: RULE_ID
            {
             before(grammarAccess.getScheduleAccess().getDepotsDepotIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getDepotsDepotIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getScheduleAccess().getDepotsDepotCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__DepotsAssignment_5_1"


    // $ANTLR start "rule__Schedule__TrainSchedulesAssignment_7"
    // InternalSchedule.g:2212:1: rule__Schedule__TrainSchedulesAssignment_7 : ( ruleTrainSchedule ) ;
    public final void rule__Schedule__TrainSchedulesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2216:1: ( ( ruleTrainSchedule ) )
            // InternalSchedule.g:2217:2: ( ruleTrainSchedule )
            {
            // InternalSchedule.g:2217:2: ( ruleTrainSchedule )
            // InternalSchedule.g:2218:3: ruleTrainSchedule
            {
             before(grammarAccess.getScheduleAccess().getTrainSchedulesTrainScheduleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTrainSchedule();

            state._fsp--;

             after(grammarAccess.getScheduleAccess().getTrainSchedulesTrainScheduleParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__TrainSchedulesAssignment_7"


    // $ANTLR start "rule__TrainSchedule__TrainAssignment_1"
    // InternalSchedule.g:2227:1: rule__TrainSchedule__TrainAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TrainSchedule__TrainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2231:1: ( ( ( RULE_ID ) ) )
            // InternalSchedule.g:2232:2: ( ( RULE_ID ) )
            {
            // InternalSchedule.g:2232:2: ( ( RULE_ID ) )
            // InternalSchedule.g:2233:3: ( RULE_ID )
            {
             before(grammarAccess.getTrainScheduleAccess().getTrainTrainCrossReference_1_0()); 
            // InternalSchedule.g:2234:3: ( RULE_ID )
            // InternalSchedule.g:2235:4: RULE_ID
            {
             before(grammarAccess.getTrainScheduleAccess().getTrainTrainIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTrainScheduleAccess().getTrainTrainIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTrainScheduleAccess().getTrainTrainCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__TrainAssignment_1"


    // $ANTLR start "rule__TrainSchedule__DateTimesAssignment_3"
    // InternalSchedule.g:2246:1: rule__TrainSchedule__DateTimesAssignment_3 : ( ruleDateTime ) ;
    public final void rule__TrainSchedule__DateTimesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2250:1: ( ( ruleDateTime ) )
            // InternalSchedule.g:2251:2: ( ruleDateTime )
            {
            // InternalSchedule.g:2251:2: ( ruleDateTime )
            // InternalSchedule.g:2252:3: ruleDateTime
            {
             before(grammarAccess.getTrainScheduleAccess().getDateTimesDateTimeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDateTime();

            state._fsp--;

             after(grammarAccess.getTrainScheduleAccess().getDateTimesDateTimeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__DateTimesAssignment_3"


    // $ANTLR start "rule__TrainSchedule__DateTimesAssignment_4_0_1"
    // InternalSchedule.g:2261:1: rule__TrainSchedule__DateTimesAssignment_4_0_1 : ( ruleDateTime ) ;
    public final void rule__TrainSchedule__DateTimesAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2265:1: ( ( ruleDateTime ) )
            // InternalSchedule.g:2266:2: ( ruleDateTime )
            {
            // InternalSchedule.g:2266:2: ( ruleDateTime )
            // InternalSchedule.g:2267:3: ruleDateTime
            {
             before(grammarAccess.getTrainScheduleAccess().getDateTimesDateTimeParserRuleCall_4_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDateTime();

            state._fsp--;

             after(grammarAccess.getTrainScheduleAccess().getDateTimesDateTimeParserRuleCall_4_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__DateTimesAssignment_4_0_1"


    // $ANTLR start "rule__TrainSchedule__DateTimesAssignment_4_2"
    // InternalSchedule.g:2276:1: rule__TrainSchedule__DateTimesAssignment_4_2 : ( ruleDateTime ) ;
    public final void rule__TrainSchedule__DateTimesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2280:1: ( ( ruleDateTime ) )
            // InternalSchedule.g:2281:2: ( ruleDateTime )
            {
            // InternalSchedule.g:2281:2: ( ruleDateTime )
            // InternalSchedule.g:2282:3: ruleDateTime
            {
             before(grammarAccess.getTrainScheduleAccess().getDateTimesDateTimeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDateTime();

            state._fsp--;

             after(grammarAccess.getTrainScheduleAccess().getDateTimesDateTimeParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__DateTimesAssignment_4_2"


    // $ANTLR start "rule__TrainSchedule__RouteAssignment_6"
    // InternalSchedule.g:2291:1: rule__TrainSchedule__RouteAssignment_6 : ( ruleRoute ) ;
    public final void rule__TrainSchedule__RouteAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2295:1: ( ( ruleRoute ) )
            // InternalSchedule.g:2296:2: ( ruleRoute )
            {
            // InternalSchedule.g:2296:2: ( ruleRoute )
            // InternalSchedule.g:2297:3: ruleRoute
            {
             before(grammarAccess.getTrainScheduleAccess().getRouteRouteParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getTrainScheduleAccess().getRouteRouteParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__RouteAssignment_6"


    // $ANTLR start "rule__DateTime__WeekdayAssignment_0"
    // InternalSchedule.g:2306:1: rule__DateTime__WeekdayAssignment_0 : ( ruleWeekDays ) ;
    public final void rule__DateTime__WeekdayAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2310:1: ( ( ruleWeekDays ) )
            // InternalSchedule.g:2311:2: ( ruleWeekDays )
            {
            // InternalSchedule.g:2311:2: ( ruleWeekDays )
            // InternalSchedule.g:2312:3: ruleWeekDays
            {
             before(grammarAccess.getDateTimeAccess().getWeekdayWeekDaysEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWeekDays();

            state._fsp--;

             after(grammarAccess.getDateTimeAccess().getWeekdayWeekDaysEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTime__WeekdayAssignment_0"


    // $ANTLR start "rule__DateTime__WeekdayAssignment_1_1"
    // InternalSchedule.g:2321:1: rule__DateTime__WeekdayAssignment_1_1 : ( ruleWeekDays ) ;
    public final void rule__DateTime__WeekdayAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2325:1: ( ( ruleWeekDays ) )
            // InternalSchedule.g:2326:2: ( ruleWeekDays )
            {
            // InternalSchedule.g:2326:2: ( ruleWeekDays )
            // InternalSchedule.g:2327:3: ruleWeekDays
            {
             before(grammarAccess.getDateTimeAccess().getWeekdayWeekDaysEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWeekDays();

            state._fsp--;

             after(grammarAccess.getDateTimeAccess().getWeekdayWeekDaysEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTime__WeekdayAssignment_1_1"


    // $ANTLR start "rule__DateTime__TimeAssignment_3"
    // InternalSchedule.g:2336:1: rule__DateTime__TimeAssignment_3 : ( ruleTime ) ;
    public final void rule__DateTime__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2340:1: ( ( ruleTime ) )
            // InternalSchedule.g:2341:2: ( ruleTime )
            {
            // InternalSchedule.g:2341:2: ( ruleTime )
            // InternalSchedule.g:2342:3: ruleTime
            {
             before(grammarAccess.getDateTimeAccess().getTimeTimeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getDateTimeAccess().getTimeTimeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTime__TimeAssignment_3"


    // $ANTLR start "rule__Time__HoursAssignment_0"
    // InternalSchedule.g:2351:1: rule__Time__HoursAssignment_0 : ( RULE_INT ) ;
    public final void rule__Time__HoursAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2355:1: ( ( RULE_INT ) )
            // InternalSchedule.g:2356:2: ( RULE_INT )
            {
            // InternalSchedule.g:2356:2: ( RULE_INT )
            // InternalSchedule.g:2357:3: RULE_INT
            {
             before(grammarAccess.getTimeAccess().getHoursINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTimeAccess().getHoursINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__HoursAssignment_0"


    // $ANTLR start "rule__Time__MinutesAssignment_2"
    // InternalSchedule.g:2366:1: rule__Time__MinutesAssignment_2 : ( RULE_INT ) ;
    public final void rule__Time__MinutesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2370:1: ( ( RULE_INT ) )
            // InternalSchedule.g:2371:2: ( RULE_INT )
            {
            // InternalSchedule.g:2371:2: ( RULE_INT )
            // InternalSchedule.g:2372:3: RULE_INT
            {
             before(grammarAccess.getTimeAccess().getMinutesINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTimeAccess().getMinutesINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__MinutesAssignment_2"


    // $ANTLR start "rule__Route__StartSpotAssignment_0"
    // InternalSchedule.g:2381:1: rule__Route__StartSpotAssignment_0 : ( ruleStartSpot ) ;
    public final void rule__Route__StartSpotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2385:1: ( ( ruleStartSpot ) )
            // InternalSchedule.g:2386:2: ( ruleStartSpot )
            {
            // InternalSchedule.g:2386:2: ( ruleStartSpot )
            // InternalSchedule.g:2387:3: ruleStartSpot
            {
             before(grammarAccess.getRouteAccess().getStartSpotStartSpotParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStartSpot();

            state._fsp--;

             after(grammarAccess.getRouteAccess().getStartSpotStartSpotParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__StartSpotAssignment_0"


    // $ANTLR start "rule__Route__MiddleSpotsAssignment_1"
    // InternalSchedule.g:2396:1: rule__Route__MiddleSpotsAssignment_1 : ( ruleMiddleSpot ) ;
    public final void rule__Route__MiddleSpotsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2400:1: ( ( ruleMiddleSpot ) )
            // InternalSchedule.g:2401:2: ( ruleMiddleSpot )
            {
            // InternalSchedule.g:2401:2: ( ruleMiddleSpot )
            // InternalSchedule.g:2402:3: ruleMiddleSpot
            {
             before(grammarAccess.getRouteAccess().getMiddleSpotsMiddleSpotParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMiddleSpot();

            state._fsp--;

             after(grammarAccess.getRouteAccess().getMiddleSpotsMiddleSpotParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__MiddleSpotsAssignment_1"


    // $ANTLR start "rule__Route__FinalSpotAssignment_2"
    // InternalSchedule.g:2411:1: rule__Route__FinalSpotAssignment_2 : ( ruleFinalSpot ) ;
    public final void rule__Route__FinalSpotAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2415:1: ( ( ruleFinalSpot ) )
            // InternalSchedule.g:2416:2: ( ruleFinalSpot )
            {
            // InternalSchedule.g:2416:2: ( ruleFinalSpot )
            // InternalSchedule.g:2417:3: ruleFinalSpot
            {
             before(grammarAccess.getRouteAccess().getFinalSpotFinalSpotParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFinalSpot();

            state._fsp--;

             after(grammarAccess.getRouteAccess().getFinalSpotFinalSpotParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__FinalSpotAssignment_2"


    // $ANTLR start "rule__StartSpot__StationAssignment_2"
    // InternalSchedule.g:2426:1: rule__StartSpot__StationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__StartSpot__StationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2430:1: ( ( RULE_STRING ) )
            // InternalSchedule.g:2431:2: ( RULE_STRING )
            {
            // InternalSchedule.g:2431:2: ( RULE_STRING )
            // InternalSchedule.g:2432:3: RULE_STRING
            {
             before(grammarAccess.getStartSpotAccess().getStationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStartSpotAccess().getStationSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__StationAssignment_2"


    // $ANTLR start "rule__StartSpot__PlatformAssignment_3_2"
    // InternalSchedule.g:2441:1: rule__StartSpot__PlatformAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__StartSpot__PlatformAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2445:1: ( ( RULE_STRING ) )
            // InternalSchedule.g:2446:2: ( RULE_STRING )
            {
            // InternalSchedule.g:2446:2: ( RULE_STRING )
            // InternalSchedule.g:2447:3: RULE_STRING
            {
             before(grammarAccess.getStartSpotAccess().getPlatformSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStartSpotAccess().getPlatformSTRINGTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__PlatformAssignment_3_2"


    // $ANTLR start "rule__StartSpot__LegAssignment_4_2"
    // InternalSchedule.g:2456:1: rule__StartSpot__LegAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__StartSpot__LegAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2460:1: ( ( ( RULE_ID ) ) )
            // InternalSchedule.g:2461:2: ( ( RULE_ID ) )
            {
            // InternalSchedule.g:2461:2: ( ( RULE_ID ) )
            // InternalSchedule.g:2462:3: ( RULE_ID )
            {
             before(grammarAccess.getStartSpotAccess().getLegLegCrossReference_4_2_0()); 
            // InternalSchedule.g:2463:3: ( RULE_ID )
            // InternalSchedule.g:2464:4: RULE_ID
            {
             before(grammarAccess.getStartSpotAccess().getLegLegIDTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStartSpotAccess().getLegLegIDTerminalRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getStartSpotAccess().getLegLegCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSpot__LegAssignment_4_2"


    // $ANTLR start "rule__MiddleSpot__StationAssignment_2"
    // InternalSchedule.g:2475:1: rule__MiddleSpot__StationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MiddleSpot__StationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2479:1: ( ( RULE_STRING ) )
            // InternalSchedule.g:2480:2: ( RULE_STRING )
            {
            // InternalSchedule.g:2480:2: ( RULE_STRING )
            // InternalSchedule.g:2481:3: RULE_STRING
            {
             before(grammarAccess.getMiddleSpotAccess().getStationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getStationSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__StationAssignment_2"


    // $ANTLR start "rule__MiddleSpot__PlatformAssignment_3_2"
    // InternalSchedule.g:2490:1: rule__MiddleSpot__PlatformAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__MiddleSpot__PlatformAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2494:1: ( ( RULE_STRING ) )
            // InternalSchedule.g:2495:2: ( RULE_STRING )
            {
            // InternalSchedule.g:2495:2: ( RULE_STRING )
            // InternalSchedule.g:2496:3: RULE_STRING
            {
             before(grammarAccess.getMiddleSpotAccess().getPlatformSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getPlatformSTRINGTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__PlatformAssignment_3_2"


    // $ANTLR start "rule__MiddleSpot__WaitingTimeAssignment_4_1"
    // InternalSchedule.g:2505:1: rule__MiddleSpot__WaitingTimeAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__MiddleSpot__WaitingTimeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2509:1: ( ( RULE_INT ) )
            // InternalSchedule.g:2510:2: ( RULE_INT )
            {
            // InternalSchedule.g:2510:2: ( RULE_INT )
            // InternalSchedule.g:2511:3: RULE_INT
            {
             before(grammarAccess.getMiddleSpotAccess().getWaitingTimeINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getWaitingTimeINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__WaitingTimeAssignment_4_1"


    // $ANTLR start "rule__MiddleSpot__TurnStationAssignment_5"
    // InternalSchedule.g:2520:1: rule__MiddleSpot__TurnStationAssignment_5 : ( ( 'and turn' ) ) ;
    public final void rule__MiddleSpot__TurnStationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2524:1: ( ( ( 'and turn' ) ) )
            // InternalSchedule.g:2525:2: ( ( 'and turn' ) )
            {
            // InternalSchedule.g:2525:2: ( ( 'and turn' ) )
            // InternalSchedule.g:2526:3: ( 'and turn' )
            {
             before(grammarAccess.getMiddleSpotAccess().getTurnStationAndTurnKeyword_5_0()); 
            // InternalSchedule.g:2527:3: ( 'and turn' )
            // InternalSchedule.g:2528:4: 'and turn'
            {
             before(grammarAccess.getMiddleSpotAccess().getTurnStationAndTurnKeyword_5_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getTurnStationAndTurnKeyword_5_0()); 

            }

             after(grammarAccess.getMiddleSpotAccess().getTurnStationAndTurnKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__TurnStationAssignment_5"


    // $ANTLR start "rule__MiddleSpot__LegAssignment_6_2"
    // InternalSchedule.g:2539:1: rule__MiddleSpot__LegAssignment_6_2 : ( ( RULE_ID ) ) ;
    public final void rule__MiddleSpot__LegAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2543:1: ( ( ( RULE_ID ) ) )
            // InternalSchedule.g:2544:2: ( ( RULE_ID ) )
            {
            // InternalSchedule.g:2544:2: ( ( RULE_ID ) )
            // InternalSchedule.g:2545:3: ( RULE_ID )
            {
             before(grammarAccess.getMiddleSpotAccess().getLegLegCrossReference_6_2_0()); 
            // InternalSchedule.g:2546:3: ( RULE_ID )
            // InternalSchedule.g:2547:4: RULE_ID
            {
             before(grammarAccess.getMiddleSpotAccess().getLegLegIDTerminalRuleCall_6_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getLegLegIDTerminalRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getMiddleSpotAccess().getLegLegCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleSpot__LegAssignment_6_2"


    // $ANTLR start "rule__FinalSpot__StationAssignment_2"
    // InternalSchedule.g:2558:1: rule__FinalSpot__StationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FinalSpot__StationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2562:1: ( ( RULE_STRING ) )
            // InternalSchedule.g:2563:2: ( RULE_STRING )
            {
            // InternalSchedule.g:2563:2: ( RULE_STRING )
            // InternalSchedule.g:2564:3: RULE_STRING
            {
             before(grammarAccess.getFinalSpotAccess().getStationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFinalSpotAccess().getStationSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalSpot__StationAssignment_2"


    // $ANTLR start "rule__FinalSpot__PlatformAssignment_3_2"
    // InternalSchedule.g:2573:1: rule__FinalSpot__PlatformAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__FinalSpot__PlatformAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2577:1: ( ( RULE_STRING ) )
            // InternalSchedule.g:2578:2: ( RULE_STRING )
            {
            // InternalSchedule.g:2578:2: ( RULE_STRING )
            // InternalSchedule.g:2579:3: RULE_STRING
            {
             before(grammarAccess.getFinalSpotAccess().getPlatformSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFinalSpotAccess().getPlatformSTRINGTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalSpot__PlatformAssignment_3_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000007F000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004C00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000842100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});

}