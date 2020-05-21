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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_LETTER", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Sunday'", "'schedule'", "'for'", "'with'", "':'", "','", "'train'", "'on'", "'and'", "'at'", "'start'", "'platform'", "'drive'", "'via'", "'stop'", "'min'", "'terminate'", "'turn'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_DIGIT=8;
    public static final int RULE_LETTER=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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


    // $ANTLR start "entryRuleTimeDescription"
    // InternalSchedule.g:103:1: entryRuleTimeDescription : ruleTimeDescription EOF ;
    public final void entryRuleTimeDescription() throws RecognitionException {
        try {
            // InternalSchedule.g:104:1: ( ruleTimeDescription EOF )
            // InternalSchedule.g:105:1: ruleTimeDescription EOF
            {
             before(grammarAccess.getTimeDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeDescription();

            state._fsp--;

             after(grammarAccess.getTimeDescriptionRule()); 
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
    // $ANTLR end "entryRuleTimeDescription"


    // $ANTLR start "ruleTimeDescription"
    // InternalSchedule.g:112:1: ruleTimeDescription : ( ( rule__TimeDescription__Group__0 ) ) ;
    public final void ruleTimeDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:116:2: ( ( ( rule__TimeDescription__Group__0 ) ) )
            // InternalSchedule.g:117:2: ( ( rule__TimeDescription__Group__0 ) )
            {
            // InternalSchedule.g:117:2: ( ( rule__TimeDescription__Group__0 ) )
            // InternalSchedule.g:118:3: ( rule__TimeDescription__Group__0 )
            {
             before(grammarAccess.getTimeDescriptionAccess().getGroup()); 
            // InternalSchedule.g:119:3: ( rule__TimeDescription__Group__0 )
            // InternalSchedule.g:119:4: rule__TimeDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeDescriptionAccess().getGroup()); 

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
    // $ANTLR end "ruleTimeDescription"


    // $ANTLR start "entryRuleDateTime"
    // InternalSchedule.g:128:1: entryRuleDateTime : ruleDateTime EOF ;
    public final void entryRuleDateTime() throws RecognitionException {
        try {
            // InternalSchedule.g:129:1: ( ruleDateTime EOF )
            // InternalSchedule.g:130:1: ruleDateTime EOF
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
    // InternalSchedule.g:137:1: ruleDateTime : ( ( rule__DateTime__Group__0 ) ) ;
    public final void ruleDateTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:141:2: ( ( ( rule__DateTime__Group__0 ) ) )
            // InternalSchedule.g:142:2: ( ( rule__DateTime__Group__0 ) )
            {
            // InternalSchedule.g:142:2: ( ( rule__DateTime__Group__0 ) )
            // InternalSchedule.g:143:3: ( rule__DateTime__Group__0 )
            {
             before(grammarAccess.getDateTimeAccess().getGroup()); 
            // InternalSchedule.g:144:3: ( rule__DateTime__Group__0 )
            // InternalSchedule.g:144:4: rule__DateTime__Group__0
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
    // InternalSchedule.g:153:1: entryRuleTime : ruleTime EOF ;
    public final void entryRuleTime() throws RecognitionException {
        try {
            // InternalSchedule.g:154:1: ( ruleTime EOF )
            // InternalSchedule.g:155:1: ruleTime EOF
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
    // InternalSchedule.g:162:1: ruleTime : ( ( rule__Time__Group__0 ) ) ;
    public final void ruleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:166:2: ( ( ( rule__Time__Group__0 ) ) )
            // InternalSchedule.g:167:2: ( ( rule__Time__Group__0 ) )
            {
            // InternalSchedule.g:167:2: ( ( rule__Time__Group__0 ) )
            // InternalSchedule.g:168:3: ( rule__Time__Group__0 )
            {
             before(grammarAccess.getTimeAccess().getGroup()); 
            // InternalSchedule.g:169:3: ( rule__Time__Group__0 )
            // InternalSchedule.g:169:4: rule__Time__Group__0
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
    // InternalSchedule.g:178:1: entryRuleRoute : ruleRoute EOF ;
    public final void entryRuleRoute() throws RecognitionException {
        try {
            // InternalSchedule.g:179:1: ( ruleRoute EOF )
            // InternalSchedule.g:180:1: ruleRoute EOF
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
    // InternalSchedule.g:187:1: ruleRoute : ( ( rule__Route__Group__0 ) ) ;
    public final void ruleRoute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:191:2: ( ( ( rule__Route__Group__0 ) ) )
            // InternalSchedule.g:192:2: ( ( rule__Route__Group__0 ) )
            {
            // InternalSchedule.g:192:2: ( ( rule__Route__Group__0 ) )
            // InternalSchedule.g:193:3: ( rule__Route__Group__0 )
            {
             before(grammarAccess.getRouteAccess().getGroup()); 
            // InternalSchedule.g:194:3: ( rule__Route__Group__0 )
            // InternalSchedule.g:194:4: rule__Route__Group__0
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
    // InternalSchedule.g:203:1: entryRuleStartSpot : ruleStartSpot EOF ;
    public final void entryRuleStartSpot() throws RecognitionException {
        try {
            // InternalSchedule.g:204:1: ( ruleStartSpot EOF )
            // InternalSchedule.g:205:1: ruleStartSpot EOF
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
    // InternalSchedule.g:212:1: ruleStartSpot : ( ( rule__StartSpot__Group__0 ) ) ;
    public final void ruleStartSpot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:216:2: ( ( ( rule__StartSpot__Group__0 ) ) )
            // InternalSchedule.g:217:2: ( ( rule__StartSpot__Group__0 ) )
            {
            // InternalSchedule.g:217:2: ( ( rule__StartSpot__Group__0 ) )
            // InternalSchedule.g:218:3: ( rule__StartSpot__Group__0 )
            {
             before(grammarAccess.getStartSpotAccess().getGroup()); 
            // InternalSchedule.g:219:3: ( rule__StartSpot__Group__0 )
            // InternalSchedule.g:219:4: rule__StartSpot__Group__0
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
    // InternalSchedule.g:228:1: entryRuleMiddleSpot : ruleMiddleSpot EOF ;
    public final void entryRuleMiddleSpot() throws RecognitionException {
        try {
            // InternalSchedule.g:229:1: ( ruleMiddleSpot EOF )
            // InternalSchedule.g:230:1: ruleMiddleSpot EOF
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
    // InternalSchedule.g:237:1: ruleMiddleSpot : ( ( rule__MiddleSpot__Group__0 ) ) ;
    public final void ruleMiddleSpot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:241:2: ( ( ( rule__MiddleSpot__Group__0 ) ) )
            // InternalSchedule.g:242:2: ( ( rule__MiddleSpot__Group__0 ) )
            {
            // InternalSchedule.g:242:2: ( ( rule__MiddleSpot__Group__0 ) )
            // InternalSchedule.g:243:3: ( rule__MiddleSpot__Group__0 )
            {
             before(grammarAccess.getMiddleSpotAccess().getGroup()); 
            // InternalSchedule.g:244:3: ( rule__MiddleSpot__Group__0 )
            // InternalSchedule.g:244:4: rule__MiddleSpot__Group__0
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
    // InternalSchedule.g:253:1: entryRuleFinalSpot : ruleFinalSpot EOF ;
    public final void entryRuleFinalSpot() throws RecognitionException {
        try {
            // InternalSchedule.g:254:1: ( ruleFinalSpot EOF )
            // InternalSchedule.g:255:1: ruleFinalSpot EOF
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
    // InternalSchedule.g:262:1: ruleFinalSpot : ( ( rule__FinalSpot__Group__0 ) ) ;
    public final void ruleFinalSpot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:266:2: ( ( ( rule__FinalSpot__Group__0 ) ) )
            // InternalSchedule.g:267:2: ( ( rule__FinalSpot__Group__0 ) )
            {
            // InternalSchedule.g:267:2: ( ( rule__FinalSpot__Group__0 ) )
            // InternalSchedule.g:268:3: ( rule__FinalSpot__Group__0 )
            {
             before(grammarAccess.getFinalSpotAccess().getGroup()); 
            // InternalSchedule.g:269:3: ( rule__FinalSpot__Group__0 )
            // InternalSchedule.g:269:4: rule__FinalSpot__Group__0
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


    // $ANTLR start "ruleWeekDay"
    // InternalSchedule.g:278:1: ruleWeekDay : ( ( rule__WeekDay__Alternatives ) ) ;
    public final void ruleWeekDay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:282:1: ( ( ( rule__WeekDay__Alternatives ) ) )
            // InternalSchedule.g:283:2: ( ( rule__WeekDay__Alternatives ) )
            {
            // InternalSchedule.g:283:2: ( ( rule__WeekDay__Alternatives ) )
            // InternalSchedule.g:284:3: ( rule__WeekDay__Alternatives )
            {
             before(grammarAccess.getWeekDayAccess().getAlternatives()); 
            // InternalSchedule.g:285:3: ( rule__WeekDay__Alternatives )
            // InternalSchedule.g:285:4: rule__WeekDay__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WeekDay__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWeekDayAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWeekDay"


    // $ANTLR start "rule__WeekDay__Alternatives"
    // InternalSchedule.g:293:1: rule__WeekDay__Alternatives : ( ( ( 'Monday' ) ) | ( ( 'Tuesday' ) ) | ( ( 'Wednesday' ) ) | ( ( 'Thursday' ) ) | ( ( 'Friday' ) ) | ( ( 'Saturday' ) ) | ( ( 'Sunday' ) ) );
    public final void rule__WeekDay__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:297:1: ( ( ( 'Monday' ) ) | ( ( 'Tuesday' ) ) | ( ( 'Wednesday' ) ) | ( ( 'Thursday' ) ) | ( ( 'Friday' ) ) | ( ( 'Saturday' ) ) | ( ( 'Sunday' ) ) )
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
                    // InternalSchedule.g:298:2: ( ( 'Monday' ) )
                    {
                    // InternalSchedule.g:298:2: ( ( 'Monday' ) )
                    // InternalSchedule.g:299:3: ( 'Monday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getMONDAYEnumLiteralDeclaration_0()); 
                    // InternalSchedule.g:300:3: ( 'Monday' )
                    // InternalSchedule.g:300:4: 'Monday'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getMONDAYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSchedule.g:304:2: ( ( 'Tuesday' ) )
                    {
                    // InternalSchedule.g:304:2: ( ( 'Tuesday' ) )
                    // InternalSchedule.g:305:3: ( 'Tuesday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getTUESDAYEnumLiteralDeclaration_1()); 
                    // InternalSchedule.g:306:3: ( 'Tuesday' )
                    // InternalSchedule.g:306:4: 'Tuesday'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getTUESDAYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSchedule.g:310:2: ( ( 'Wednesday' ) )
                    {
                    // InternalSchedule.g:310:2: ( ( 'Wednesday' ) )
                    // InternalSchedule.g:311:3: ( 'Wednesday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getWEDNESDAYEnumLiteralDeclaration_2()); 
                    // InternalSchedule.g:312:3: ( 'Wednesday' )
                    // InternalSchedule.g:312:4: 'Wednesday'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getWEDNESDAYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSchedule.g:316:2: ( ( 'Thursday' ) )
                    {
                    // InternalSchedule.g:316:2: ( ( 'Thursday' ) )
                    // InternalSchedule.g:317:3: ( 'Thursday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getTHURSDAYEnumLiteralDeclaration_3()); 
                    // InternalSchedule.g:318:3: ( 'Thursday' )
                    // InternalSchedule.g:318:4: 'Thursday'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getTHURSDAYEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSchedule.g:322:2: ( ( 'Friday' ) )
                    {
                    // InternalSchedule.g:322:2: ( ( 'Friday' ) )
                    // InternalSchedule.g:323:3: ( 'Friday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getFRIDAYEnumLiteralDeclaration_4()); 
                    // InternalSchedule.g:324:3: ( 'Friday' )
                    // InternalSchedule.g:324:4: 'Friday'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getFRIDAYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSchedule.g:328:2: ( ( 'Saturday' ) )
                    {
                    // InternalSchedule.g:328:2: ( ( 'Saturday' ) )
                    // InternalSchedule.g:329:3: ( 'Saturday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getSATURDAYEnumLiteralDeclaration_5()); 
                    // InternalSchedule.g:330:3: ( 'Saturday' )
                    // InternalSchedule.g:330:4: 'Saturday'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getSATURDAYEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSchedule.g:334:2: ( ( 'Sunday' ) )
                    {
                    // InternalSchedule.g:334:2: ( ( 'Sunday' ) )
                    // InternalSchedule.g:335:3: ( 'Sunday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getSUNDAYEnumLiteralDeclaration_6()); 
                    // InternalSchedule.g:336:3: ( 'Sunday' )
                    // InternalSchedule.g:336:4: 'Sunday'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getSUNDAYEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__WeekDay__Alternatives"


    // $ANTLR start "rule__Schedule__Group__0"
    // InternalSchedule.g:344:1: rule__Schedule__Group__0 : rule__Schedule__Group__0__Impl rule__Schedule__Group__1 ;
    public final void rule__Schedule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:348:1: ( rule__Schedule__Group__0__Impl rule__Schedule__Group__1 )
            // InternalSchedule.g:349:2: rule__Schedule__Group__0__Impl rule__Schedule__Group__1
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
    // InternalSchedule.g:356:1: rule__Schedule__Group__0__Impl : ( 'schedule' ) ;
    public final void rule__Schedule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:360:1: ( ( 'schedule' ) )
            // InternalSchedule.g:361:1: ( 'schedule' )
            {
            // InternalSchedule.g:361:1: ( 'schedule' )
            // InternalSchedule.g:362:2: 'schedule'
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
    // InternalSchedule.g:371:1: rule__Schedule__Group__1 : rule__Schedule__Group__1__Impl rule__Schedule__Group__2 ;
    public final void rule__Schedule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:375:1: ( rule__Schedule__Group__1__Impl rule__Schedule__Group__2 )
            // InternalSchedule.g:376:2: rule__Schedule__Group__1__Impl rule__Schedule__Group__2
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
    // InternalSchedule.g:383:1: rule__Schedule__Group__1__Impl : ( 'for' ) ;
    public final void rule__Schedule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:387:1: ( ( 'for' ) )
            // InternalSchedule.g:388:1: ( 'for' )
            {
            // InternalSchedule.g:388:1: ( 'for' )
            // InternalSchedule.g:389:2: 'for'
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
    // InternalSchedule.g:398:1: rule__Schedule__Group__2 : rule__Schedule__Group__2__Impl rule__Schedule__Group__3 ;
    public final void rule__Schedule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:402:1: ( rule__Schedule__Group__2__Impl rule__Schedule__Group__3 )
            // InternalSchedule.g:403:2: rule__Schedule__Group__2__Impl rule__Schedule__Group__3
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
    // InternalSchedule.g:410:1: rule__Schedule__Group__2__Impl : ( ( rule__Schedule__NetworkAssignment_2 ) ) ;
    public final void rule__Schedule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:414:1: ( ( ( rule__Schedule__NetworkAssignment_2 ) ) )
            // InternalSchedule.g:415:1: ( ( rule__Schedule__NetworkAssignment_2 ) )
            {
            // InternalSchedule.g:415:1: ( ( rule__Schedule__NetworkAssignment_2 ) )
            // InternalSchedule.g:416:2: ( rule__Schedule__NetworkAssignment_2 )
            {
             before(grammarAccess.getScheduleAccess().getNetworkAssignment_2()); 
            // InternalSchedule.g:417:2: ( rule__Schedule__NetworkAssignment_2 )
            // InternalSchedule.g:417:3: rule__Schedule__NetworkAssignment_2
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
    // InternalSchedule.g:425:1: rule__Schedule__Group__3 : rule__Schedule__Group__3__Impl rule__Schedule__Group__4 ;
    public final void rule__Schedule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:429:1: ( rule__Schedule__Group__3__Impl rule__Schedule__Group__4 )
            // InternalSchedule.g:430:2: rule__Schedule__Group__3__Impl rule__Schedule__Group__4
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
    // InternalSchedule.g:437:1: rule__Schedule__Group__3__Impl : ( 'with' ) ;
    public final void rule__Schedule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:441:1: ( ( 'with' ) )
            // InternalSchedule.g:442:1: ( 'with' )
            {
            // InternalSchedule.g:442:1: ( 'with' )
            // InternalSchedule.g:443:2: 'with'
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
    // InternalSchedule.g:452:1: rule__Schedule__Group__4 : rule__Schedule__Group__4__Impl rule__Schedule__Group__5 ;
    public final void rule__Schedule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:456:1: ( rule__Schedule__Group__4__Impl rule__Schedule__Group__5 )
            // InternalSchedule.g:457:2: rule__Schedule__Group__4__Impl rule__Schedule__Group__5
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
    // InternalSchedule.g:464:1: rule__Schedule__Group__4__Impl : ( ( rule__Schedule__DepotsAssignment_4 ) ) ;
    public final void rule__Schedule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:468:1: ( ( ( rule__Schedule__DepotsAssignment_4 ) ) )
            // InternalSchedule.g:469:1: ( ( rule__Schedule__DepotsAssignment_4 ) )
            {
            // InternalSchedule.g:469:1: ( ( rule__Schedule__DepotsAssignment_4 ) )
            // InternalSchedule.g:470:2: ( rule__Schedule__DepotsAssignment_4 )
            {
             before(grammarAccess.getScheduleAccess().getDepotsAssignment_4()); 
            // InternalSchedule.g:471:2: ( rule__Schedule__DepotsAssignment_4 )
            // InternalSchedule.g:471:3: rule__Schedule__DepotsAssignment_4
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
    // InternalSchedule.g:479:1: rule__Schedule__Group__5 : rule__Schedule__Group__5__Impl rule__Schedule__Group__6 ;
    public final void rule__Schedule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:483:1: ( rule__Schedule__Group__5__Impl rule__Schedule__Group__6 )
            // InternalSchedule.g:484:2: rule__Schedule__Group__5__Impl rule__Schedule__Group__6
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
    // InternalSchedule.g:491:1: rule__Schedule__Group__5__Impl : ( ( rule__Schedule__Group_5__0 )* ) ;
    public final void rule__Schedule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:495:1: ( ( ( rule__Schedule__Group_5__0 )* ) )
            // InternalSchedule.g:496:1: ( ( rule__Schedule__Group_5__0 )* )
            {
            // InternalSchedule.g:496:1: ( ( rule__Schedule__Group_5__0 )* )
            // InternalSchedule.g:497:2: ( rule__Schedule__Group_5__0 )*
            {
             before(grammarAccess.getScheduleAccess().getGroup_5()); 
            // InternalSchedule.g:498:2: ( rule__Schedule__Group_5__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSchedule.g:498:3: rule__Schedule__Group_5__0
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
    // InternalSchedule.g:506:1: rule__Schedule__Group__6 : rule__Schedule__Group__6__Impl rule__Schedule__Group__7 ;
    public final void rule__Schedule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:510:1: ( rule__Schedule__Group__6__Impl rule__Schedule__Group__7 )
            // InternalSchedule.g:511:2: rule__Schedule__Group__6__Impl rule__Schedule__Group__7
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
    // InternalSchedule.g:518:1: rule__Schedule__Group__6__Impl : ( ':' ) ;
    public final void rule__Schedule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:522:1: ( ( ':' ) )
            // InternalSchedule.g:523:1: ( ':' )
            {
            // InternalSchedule.g:523:1: ( ':' )
            // InternalSchedule.g:524:2: ':'
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
    // InternalSchedule.g:533:1: rule__Schedule__Group__7 : rule__Schedule__Group__7__Impl ;
    public final void rule__Schedule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:537:1: ( rule__Schedule__Group__7__Impl )
            // InternalSchedule.g:538:2: rule__Schedule__Group__7__Impl
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
    // InternalSchedule.g:544:1: rule__Schedule__Group__7__Impl : ( ( rule__Schedule__TrainSchedulesAssignment_7 )* ) ;
    public final void rule__Schedule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:548:1: ( ( ( rule__Schedule__TrainSchedulesAssignment_7 )* ) )
            // InternalSchedule.g:549:1: ( ( rule__Schedule__TrainSchedulesAssignment_7 )* )
            {
            // InternalSchedule.g:549:1: ( ( rule__Schedule__TrainSchedulesAssignment_7 )* )
            // InternalSchedule.g:550:2: ( rule__Schedule__TrainSchedulesAssignment_7 )*
            {
             before(grammarAccess.getScheduleAccess().getTrainSchedulesAssignment_7()); 
            // InternalSchedule.g:551:2: ( rule__Schedule__TrainSchedulesAssignment_7 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSchedule.g:551:3: rule__Schedule__TrainSchedulesAssignment_7
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
    // InternalSchedule.g:560:1: rule__Schedule__Group_5__0 : rule__Schedule__Group_5__0__Impl rule__Schedule__Group_5__1 ;
    public final void rule__Schedule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:564:1: ( rule__Schedule__Group_5__0__Impl rule__Schedule__Group_5__1 )
            // InternalSchedule.g:565:2: rule__Schedule__Group_5__0__Impl rule__Schedule__Group_5__1
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
    // InternalSchedule.g:572:1: rule__Schedule__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Schedule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:576:1: ( ( ',' ) )
            // InternalSchedule.g:577:1: ( ',' )
            {
            // InternalSchedule.g:577:1: ( ',' )
            // InternalSchedule.g:578:2: ','
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
    // InternalSchedule.g:587:1: rule__Schedule__Group_5__1 : rule__Schedule__Group_5__1__Impl ;
    public final void rule__Schedule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:591:1: ( rule__Schedule__Group_5__1__Impl )
            // InternalSchedule.g:592:2: rule__Schedule__Group_5__1__Impl
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
    // InternalSchedule.g:598:1: rule__Schedule__Group_5__1__Impl : ( ( rule__Schedule__DepotsAssignment_5_1 ) ) ;
    public final void rule__Schedule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:602:1: ( ( ( rule__Schedule__DepotsAssignment_5_1 ) ) )
            // InternalSchedule.g:603:1: ( ( rule__Schedule__DepotsAssignment_5_1 ) )
            {
            // InternalSchedule.g:603:1: ( ( rule__Schedule__DepotsAssignment_5_1 ) )
            // InternalSchedule.g:604:2: ( rule__Schedule__DepotsAssignment_5_1 )
            {
             before(grammarAccess.getScheduleAccess().getDepotsAssignment_5_1()); 
            // InternalSchedule.g:605:2: ( rule__Schedule__DepotsAssignment_5_1 )
            // InternalSchedule.g:605:3: rule__Schedule__DepotsAssignment_5_1
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
    // InternalSchedule.g:614:1: rule__TrainSchedule__Group__0 : rule__TrainSchedule__Group__0__Impl rule__TrainSchedule__Group__1 ;
    public final void rule__TrainSchedule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:618:1: ( rule__TrainSchedule__Group__0__Impl rule__TrainSchedule__Group__1 )
            // InternalSchedule.g:619:2: rule__TrainSchedule__Group__0__Impl rule__TrainSchedule__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSchedule.g:626:1: rule__TrainSchedule__Group__0__Impl : ( 'train' ) ;
    public final void rule__TrainSchedule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:630:1: ( ( 'train' ) )
            // InternalSchedule.g:631:1: ( 'train' )
            {
            // InternalSchedule.g:631:1: ( 'train' )
            // InternalSchedule.g:632:2: 'train'
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
    // InternalSchedule.g:641:1: rule__TrainSchedule__Group__1 : rule__TrainSchedule__Group__1__Impl rule__TrainSchedule__Group__2 ;
    public final void rule__TrainSchedule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:645:1: ( rule__TrainSchedule__Group__1__Impl rule__TrainSchedule__Group__2 )
            // InternalSchedule.g:646:2: rule__TrainSchedule__Group__1__Impl rule__TrainSchedule__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSchedule.g:653:1: rule__TrainSchedule__Group__1__Impl : ( ( rule__TrainSchedule__TrainAssignment_1 ) ) ;
    public final void rule__TrainSchedule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:657:1: ( ( ( rule__TrainSchedule__TrainAssignment_1 ) ) )
            // InternalSchedule.g:658:1: ( ( rule__TrainSchedule__TrainAssignment_1 ) )
            {
            // InternalSchedule.g:658:1: ( ( rule__TrainSchedule__TrainAssignment_1 ) )
            // InternalSchedule.g:659:2: ( rule__TrainSchedule__TrainAssignment_1 )
            {
             before(grammarAccess.getTrainScheduleAccess().getTrainAssignment_1()); 
            // InternalSchedule.g:660:2: ( rule__TrainSchedule__TrainAssignment_1 )
            // InternalSchedule.g:660:3: rule__TrainSchedule__TrainAssignment_1
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
    // InternalSchedule.g:668:1: rule__TrainSchedule__Group__2 : rule__TrainSchedule__Group__2__Impl rule__TrainSchedule__Group__3 ;
    public final void rule__TrainSchedule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:672:1: ( rule__TrainSchedule__Group__2__Impl rule__TrainSchedule__Group__3 )
            // InternalSchedule.g:673:2: rule__TrainSchedule__Group__2__Impl rule__TrainSchedule__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalSchedule.g:680:1: rule__TrainSchedule__Group__2__Impl : ( 'on' ) ;
    public final void rule__TrainSchedule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:684:1: ( ( 'on' ) )
            // InternalSchedule.g:685:1: ( 'on' )
            {
            // InternalSchedule.g:685:1: ( 'on' )
            // InternalSchedule.g:686:2: 'on'
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
    // InternalSchedule.g:695:1: rule__TrainSchedule__Group__3 : rule__TrainSchedule__Group__3__Impl rule__TrainSchedule__Group__4 ;
    public final void rule__TrainSchedule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:699:1: ( rule__TrainSchedule__Group__3__Impl rule__TrainSchedule__Group__4 )
            // InternalSchedule.g:700:2: rule__TrainSchedule__Group__3__Impl rule__TrainSchedule__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalSchedule.g:707:1: rule__TrainSchedule__Group__3__Impl : ( ( rule__TrainSchedule__TimeDescriptionAssignment_3 ) ) ;
    public final void rule__TrainSchedule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:711:1: ( ( ( rule__TrainSchedule__TimeDescriptionAssignment_3 ) ) )
            // InternalSchedule.g:712:1: ( ( rule__TrainSchedule__TimeDescriptionAssignment_3 ) )
            {
            // InternalSchedule.g:712:1: ( ( rule__TrainSchedule__TimeDescriptionAssignment_3 ) )
            // InternalSchedule.g:713:2: ( rule__TrainSchedule__TimeDescriptionAssignment_3 )
            {
             before(grammarAccess.getTrainScheduleAccess().getTimeDescriptionAssignment_3()); 
            // InternalSchedule.g:714:2: ( rule__TrainSchedule__TimeDescriptionAssignment_3 )
            // InternalSchedule.g:714:3: rule__TrainSchedule__TimeDescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TrainSchedule__TimeDescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTrainScheduleAccess().getTimeDescriptionAssignment_3()); 

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
    // InternalSchedule.g:722:1: rule__TrainSchedule__Group__4 : rule__TrainSchedule__Group__4__Impl rule__TrainSchedule__Group__5 ;
    public final void rule__TrainSchedule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:726:1: ( rule__TrainSchedule__Group__4__Impl rule__TrainSchedule__Group__5 )
            // InternalSchedule.g:727:2: rule__TrainSchedule__Group__4__Impl rule__TrainSchedule__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalSchedule.g:734:1: rule__TrainSchedule__Group__4__Impl : ( ':' ) ;
    public final void rule__TrainSchedule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:738:1: ( ( ':' ) )
            // InternalSchedule.g:739:1: ( ':' )
            {
            // InternalSchedule.g:739:1: ( ':' )
            // InternalSchedule.g:740:2: ':'
            {
             before(grammarAccess.getTrainScheduleAccess().getColonKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTrainScheduleAccess().getColonKeyword_4()); 

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
    // InternalSchedule.g:749:1: rule__TrainSchedule__Group__5 : rule__TrainSchedule__Group__5__Impl ;
    public final void rule__TrainSchedule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:753:1: ( rule__TrainSchedule__Group__5__Impl )
            // InternalSchedule.g:754:2: rule__TrainSchedule__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group__5__Impl();

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
    // InternalSchedule.g:760:1: rule__TrainSchedule__Group__5__Impl : ( ( rule__TrainSchedule__RouteAssignment_5 ) ) ;
    public final void rule__TrainSchedule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:764:1: ( ( ( rule__TrainSchedule__RouteAssignment_5 ) ) )
            // InternalSchedule.g:765:1: ( ( rule__TrainSchedule__RouteAssignment_5 ) )
            {
            // InternalSchedule.g:765:1: ( ( rule__TrainSchedule__RouteAssignment_5 ) )
            // InternalSchedule.g:766:2: ( rule__TrainSchedule__RouteAssignment_5 )
            {
             before(grammarAccess.getTrainScheduleAccess().getRouteAssignment_5()); 
            // InternalSchedule.g:767:2: ( rule__TrainSchedule__RouteAssignment_5 )
            // InternalSchedule.g:767:3: rule__TrainSchedule__RouteAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TrainSchedule__RouteAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTrainScheduleAccess().getRouteAssignment_5()); 

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


    // $ANTLR start "rule__TimeDescription__Group__0"
    // InternalSchedule.g:776:1: rule__TimeDescription__Group__0 : rule__TimeDescription__Group__0__Impl rule__TimeDescription__Group__1 ;
    public final void rule__TimeDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:780:1: ( rule__TimeDescription__Group__0__Impl rule__TimeDescription__Group__1 )
            // InternalSchedule.g:781:2: rule__TimeDescription__Group__0__Impl rule__TimeDescription__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__TimeDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeDescription__Group__1();

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
    // $ANTLR end "rule__TimeDescription__Group__0"


    // $ANTLR start "rule__TimeDescription__Group__0__Impl"
    // InternalSchedule.g:788:1: rule__TimeDescription__Group__0__Impl : ( ( rule__TimeDescription__DateTimesAssignment_0 ) ) ;
    public final void rule__TimeDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:792:1: ( ( ( rule__TimeDescription__DateTimesAssignment_0 ) ) )
            // InternalSchedule.g:793:1: ( ( rule__TimeDescription__DateTimesAssignment_0 ) )
            {
            // InternalSchedule.g:793:1: ( ( rule__TimeDescription__DateTimesAssignment_0 ) )
            // InternalSchedule.g:794:2: ( rule__TimeDescription__DateTimesAssignment_0 )
            {
             before(grammarAccess.getTimeDescriptionAccess().getDateTimesAssignment_0()); 
            // InternalSchedule.g:795:2: ( rule__TimeDescription__DateTimesAssignment_0 )
            // InternalSchedule.g:795:3: rule__TimeDescription__DateTimesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TimeDescription__DateTimesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTimeDescriptionAccess().getDateTimesAssignment_0()); 

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
    // $ANTLR end "rule__TimeDescription__Group__0__Impl"


    // $ANTLR start "rule__TimeDescription__Group__1"
    // InternalSchedule.g:803:1: rule__TimeDescription__Group__1 : rule__TimeDescription__Group__1__Impl ;
    public final void rule__TimeDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:807:1: ( rule__TimeDescription__Group__1__Impl )
            // InternalSchedule.g:808:2: rule__TimeDescription__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeDescription__Group__1__Impl();

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
    // $ANTLR end "rule__TimeDescription__Group__1"


    // $ANTLR start "rule__TimeDescription__Group__1__Impl"
    // InternalSchedule.g:814:1: rule__TimeDescription__Group__1__Impl : ( ( rule__TimeDescription__Group_1__0 )? ) ;
    public final void rule__TimeDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:818:1: ( ( ( rule__TimeDescription__Group_1__0 )? ) )
            // InternalSchedule.g:819:1: ( ( rule__TimeDescription__Group_1__0 )? )
            {
            // InternalSchedule.g:819:1: ( ( rule__TimeDescription__Group_1__0 )? )
            // InternalSchedule.g:820:2: ( rule__TimeDescription__Group_1__0 )?
            {
             before(grammarAccess.getTimeDescriptionAccess().getGroup_1()); 
            // InternalSchedule.g:821:2: ( rule__TimeDescription__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23||LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSchedule.g:821:3: rule__TimeDescription__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TimeDescription__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTimeDescriptionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__TimeDescription__Group__1__Impl"


    // $ANTLR start "rule__TimeDescription__Group_1__0"
    // InternalSchedule.g:830:1: rule__TimeDescription__Group_1__0 : rule__TimeDescription__Group_1__0__Impl rule__TimeDescription__Group_1__1 ;
    public final void rule__TimeDescription__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:834:1: ( rule__TimeDescription__Group_1__0__Impl rule__TimeDescription__Group_1__1 )
            // InternalSchedule.g:835:2: rule__TimeDescription__Group_1__0__Impl rule__TimeDescription__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__TimeDescription__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeDescription__Group_1__1();

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
    // $ANTLR end "rule__TimeDescription__Group_1__0"


    // $ANTLR start "rule__TimeDescription__Group_1__0__Impl"
    // InternalSchedule.g:842:1: rule__TimeDescription__Group_1__0__Impl : ( ( rule__TimeDescription__Group_1_0__0 )* ) ;
    public final void rule__TimeDescription__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:846:1: ( ( ( rule__TimeDescription__Group_1_0__0 )* ) )
            // InternalSchedule.g:847:1: ( ( rule__TimeDescription__Group_1_0__0 )* )
            {
            // InternalSchedule.g:847:1: ( ( rule__TimeDescription__Group_1_0__0 )* )
            // InternalSchedule.g:848:2: ( rule__TimeDescription__Group_1_0__0 )*
            {
             before(grammarAccess.getTimeDescriptionAccess().getGroup_1_0()); 
            // InternalSchedule.g:849:2: ( rule__TimeDescription__Group_1_0__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSchedule.g:849:3: rule__TimeDescription__Group_1_0__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TimeDescription__Group_1_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTimeDescriptionAccess().getGroup_1_0()); 

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
    // $ANTLR end "rule__TimeDescription__Group_1__0__Impl"


    // $ANTLR start "rule__TimeDescription__Group_1__1"
    // InternalSchedule.g:857:1: rule__TimeDescription__Group_1__1 : rule__TimeDescription__Group_1__1__Impl rule__TimeDescription__Group_1__2 ;
    public final void rule__TimeDescription__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:861:1: ( rule__TimeDescription__Group_1__1__Impl rule__TimeDescription__Group_1__2 )
            // InternalSchedule.g:862:2: rule__TimeDescription__Group_1__1__Impl rule__TimeDescription__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__TimeDescription__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeDescription__Group_1__2();

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
    // $ANTLR end "rule__TimeDescription__Group_1__1"


    // $ANTLR start "rule__TimeDescription__Group_1__1__Impl"
    // InternalSchedule.g:869:1: rule__TimeDescription__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__TimeDescription__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:873:1: ( ( 'and' ) )
            // InternalSchedule.g:874:1: ( 'and' )
            {
            // InternalSchedule.g:874:1: ( 'and' )
            // InternalSchedule.g:875:2: 'and'
            {
             before(grammarAccess.getTimeDescriptionAccess().getAndKeyword_1_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTimeDescriptionAccess().getAndKeyword_1_1()); 

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
    // $ANTLR end "rule__TimeDescription__Group_1__1__Impl"


    // $ANTLR start "rule__TimeDescription__Group_1__2"
    // InternalSchedule.g:884:1: rule__TimeDescription__Group_1__2 : rule__TimeDescription__Group_1__2__Impl ;
    public final void rule__TimeDescription__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:888:1: ( rule__TimeDescription__Group_1__2__Impl )
            // InternalSchedule.g:889:2: rule__TimeDescription__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeDescription__Group_1__2__Impl();

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
    // $ANTLR end "rule__TimeDescription__Group_1__2"


    // $ANTLR start "rule__TimeDescription__Group_1__2__Impl"
    // InternalSchedule.g:895:1: rule__TimeDescription__Group_1__2__Impl : ( ( rule__TimeDescription__DateTimesAssignment_1_2 ) ) ;
    public final void rule__TimeDescription__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:899:1: ( ( ( rule__TimeDescription__DateTimesAssignment_1_2 ) ) )
            // InternalSchedule.g:900:1: ( ( rule__TimeDescription__DateTimesAssignment_1_2 ) )
            {
            // InternalSchedule.g:900:1: ( ( rule__TimeDescription__DateTimesAssignment_1_2 ) )
            // InternalSchedule.g:901:2: ( rule__TimeDescription__DateTimesAssignment_1_2 )
            {
             before(grammarAccess.getTimeDescriptionAccess().getDateTimesAssignment_1_2()); 
            // InternalSchedule.g:902:2: ( rule__TimeDescription__DateTimesAssignment_1_2 )
            // InternalSchedule.g:902:3: rule__TimeDescription__DateTimesAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__TimeDescription__DateTimesAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTimeDescriptionAccess().getDateTimesAssignment_1_2()); 

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
    // $ANTLR end "rule__TimeDescription__Group_1__2__Impl"


    // $ANTLR start "rule__TimeDescription__Group_1_0__0"
    // InternalSchedule.g:911:1: rule__TimeDescription__Group_1_0__0 : rule__TimeDescription__Group_1_0__0__Impl rule__TimeDescription__Group_1_0__1 ;
    public final void rule__TimeDescription__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:915:1: ( rule__TimeDescription__Group_1_0__0__Impl rule__TimeDescription__Group_1_0__1 )
            // InternalSchedule.g:916:2: rule__TimeDescription__Group_1_0__0__Impl rule__TimeDescription__Group_1_0__1
            {
            pushFollow(FOLLOW_12);
            rule__TimeDescription__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeDescription__Group_1_0__1();

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
    // $ANTLR end "rule__TimeDescription__Group_1_0__0"


    // $ANTLR start "rule__TimeDescription__Group_1_0__0__Impl"
    // InternalSchedule.g:923:1: rule__TimeDescription__Group_1_0__0__Impl : ( ',' ) ;
    public final void rule__TimeDescription__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:927:1: ( ( ',' ) )
            // InternalSchedule.g:928:1: ( ',' )
            {
            // InternalSchedule.g:928:1: ( ',' )
            // InternalSchedule.g:929:2: ','
            {
             before(grammarAccess.getTimeDescriptionAccess().getCommaKeyword_1_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTimeDescriptionAccess().getCommaKeyword_1_0_0()); 

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
    // $ANTLR end "rule__TimeDescription__Group_1_0__0__Impl"


    // $ANTLR start "rule__TimeDescription__Group_1_0__1"
    // InternalSchedule.g:938:1: rule__TimeDescription__Group_1_0__1 : rule__TimeDescription__Group_1_0__1__Impl ;
    public final void rule__TimeDescription__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:942:1: ( rule__TimeDescription__Group_1_0__1__Impl )
            // InternalSchedule.g:943:2: rule__TimeDescription__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeDescription__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__TimeDescription__Group_1_0__1"


    // $ANTLR start "rule__TimeDescription__Group_1_0__1__Impl"
    // InternalSchedule.g:949:1: rule__TimeDescription__Group_1_0__1__Impl : ( ( rule__TimeDescription__DateTimesAssignment_1_0_1 ) ) ;
    public final void rule__TimeDescription__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:953:1: ( ( ( rule__TimeDescription__DateTimesAssignment_1_0_1 ) ) )
            // InternalSchedule.g:954:1: ( ( rule__TimeDescription__DateTimesAssignment_1_0_1 ) )
            {
            // InternalSchedule.g:954:1: ( ( rule__TimeDescription__DateTimesAssignment_1_0_1 ) )
            // InternalSchedule.g:955:2: ( rule__TimeDescription__DateTimesAssignment_1_0_1 )
            {
             before(grammarAccess.getTimeDescriptionAccess().getDateTimesAssignment_1_0_1()); 
            // InternalSchedule.g:956:2: ( rule__TimeDescription__DateTimesAssignment_1_0_1 )
            // InternalSchedule.g:956:3: rule__TimeDescription__DateTimesAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TimeDescription__DateTimesAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeDescriptionAccess().getDateTimesAssignment_1_0_1()); 

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
    // $ANTLR end "rule__TimeDescription__Group_1_0__1__Impl"


    // $ANTLR start "rule__DateTime__Group__0"
    // InternalSchedule.g:965:1: rule__DateTime__Group__0 : rule__DateTime__Group__0__Impl rule__DateTime__Group__1 ;
    public final void rule__DateTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:969:1: ( rule__DateTime__Group__0__Impl rule__DateTime__Group__1 )
            // InternalSchedule.g:970:2: rule__DateTime__Group__0__Impl rule__DateTime__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSchedule.g:977:1: rule__DateTime__Group__0__Impl : ( ( rule__DateTime__WeekdaysAssignment_0 ) ) ;
    public final void rule__DateTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:981:1: ( ( ( rule__DateTime__WeekdaysAssignment_0 ) ) )
            // InternalSchedule.g:982:1: ( ( rule__DateTime__WeekdaysAssignment_0 ) )
            {
            // InternalSchedule.g:982:1: ( ( rule__DateTime__WeekdaysAssignment_0 ) )
            // InternalSchedule.g:983:2: ( rule__DateTime__WeekdaysAssignment_0 )
            {
             before(grammarAccess.getDateTimeAccess().getWeekdaysAssignment_0()); 
            // InternalSchedule.g:984:2: ( rule__DateTime__WeekdaysAssignment_0 )
            // InternalSchedule.g:984:3: rule__DateTime__WeekdaysAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DateTime__WeekdaysAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDateTimeAccess().getWeekdaysAssignment_0()); 

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
    // InternalSchedule.g:992:1: rule__DateTime__Group__1 : rule__DateTime__Group__1__Impl rule__DateTime__Group__2 ;
    public final void rule__DateTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:996:1: ( rule__DateTime__Group__1__Impl rule__DateTime__Group__2 )
            // InternalSchedule.g:997:2: rule__DateTime__Group__1__Impl rule__DateTime__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalSchedule.g:1004:1: rule__DateTime__Group__1__Impl : ( ( rule__DateTime__Group_1__0 )* ) ;
    public final void rule__DateTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1008:1: ( ( ( rule__DateTime__Group_1__0 )* ) )
            // InternalSchedule.g:1009:1: ( ( rule__DateTime__Group_1__0 )* )
            {
            // InternalSchedule.g:1009:1: ( ( rule__DateTime__Group_1__0 )* )
            // InternalSchedule.g:1010:2: ( rule__DateTime__Group_1__0 )*
            {
             before(grammarAccess.getDateTimeAccess().getGroup_1()); 
            // InternalSchedule.g:1011:2: ( rule__DateTime__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSchedule.g:1011:3: rule__DateTime__Group_1__0
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
    // InternalSchedule.g:1019:1: rule__DateTime__Group__2 : rule__DateTime__Group__2__Impl rule__DateTime__Group__3 ;
    public final void rule__DateTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1023:1: ( rule__DateTime__Group__2__Impl rule__DateTime__Group__3 )
            // InternalSchedule.g:1024:2: rule__DateTime__Group__2__Impl rule__DateTime__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalSchedule.g:1031:1: rule__DateTime__Group__2__Impl : ( 'at' ) ;
    public final void rule__DateTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1035:1: ( ( 'at' ) )
            // InternalSchedule.g:1036:1: ( 'at' )
            {
            // InternalSchedule.g:1036:1: ( 'at' )
            // InternalSchedule.g:1037:2: 'at'
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
    // InternalSchedule.g:1046:1: rule__DateTime__Group__3 : rule__DateTime__Group__3__Impl ;
    public final void rule__DateTime__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1050:1: ( rule__DateTime__Group__3__Impl )
            // InternalSchedule.g:1051:2: rule__DateTime__Group__3__Impl
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
    // InternalSchedule.g:1057:1: rule__DateTime__Group__3__Impl : ( ( rule__DateTime__TimeAssignment_3 ) ) ;
    public final void rule__DateTime__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1061:1: ( ( ( rule__DateTime__TimeAssignment_3 ) ) )
            // InternalSchedule.g:1062:1: ( ( rule__DateTime__TimeAssignment_3 ) )
            {
            // InternalSchedule.g:1062:1: ( ( rule__DateTime__TimeAssignment_3 ) )
            // InternalSchedule.g:1063:2: ( rule__DateTime__TimeAssignment_3 )
            {
             before(grammarAccess.getDateTimeAccess().getTimeAssignment_3()); 
            // InternalSchedule.g:1064:2: ( rule__DateTime__TimeAssignment_3 )
            // InternalSchedule.g:1064:3: rule__DateTime__TimeAssignment_3
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
    // InternalSchedule.g:1073:1: rule__DateTime__Group_1__0 : rule__DateTime__Group_1__0__Impl rule__DateTime__Group_1__1 ;
    public final void rule__DateTime__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1077:1: ( rule__DateTime__Group_1__0__Impl rule__DateTime__Group_1__1 )
            // InternalSchedule.g:1078:2: rule__DateTime__Group_1__0__Impl rule__DateTime__Group_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSchedule.g:1085:1: rule__DateTime__Group_1__0__Impl : ( ',' ) ;
    public final void rule__DateTime__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1089:1: ( ( ',' ) )
            // InternalSchedule.g:1090:1: ( ',' )
            {
            // InternalSchedule.g:1090:1: ( ',' )
            // InternalSchedule.g:1091:2: ','
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
    // InternalSchedule.g:1100:1: rule__DateTime__Group_1__1 : rule__DateTime__Group_1__1__Impl ;
    public final void rule__DateTime__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1104:1: ( rule__DateTime__Group_1__1__Impl )
            // InternalSchedule.g:1105:2: rule__DateTime__Group_1__1__Impl
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
    // InternalSchedule.g:1111:1: rule__DateTime__Group_1__1__Impl : ( ( rule__DateTime__WeekdaysAssignment_1_1 ) ) ;
    public final void rule__DateTime__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1115:1: ( ( ( rule__DateTime__WeekdaysAssignment_1_1 ) ) )
            // InternalSchedule.g:1116:1: ( ( rule__DateTime__WeekdaysAssignment_1_1 ) )
            {
            // InternalSchedule.g:1116:1: ( ( rule__DateTime__WeekdaysAssignment_1_1 ) )
            // InternalSchedule.g:1117:2: ( rule__DateTime__WeekdaysAssignment_1_1 )
            {
             before(grammarAccess.getDateTimeAccess().getWeekdaysAssignment_1_1()); 
            // InternalSchedule.g:1118:2: ( rule__DateTime__WeekdaysAssignment_1_1 )
            // InternalSchedule.g:1118:3: rule__DateTime__WeekdaysAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DateTime__WeekdaysAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDateTimeAccess().getWeekdaysAssignment_1_1()); 

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
    // InternalSchedule.g:1127:1: rule__Time__Group__0 : rule__Time__Group__0__Impl rule__Time__Group__1 ;
    public final void rule__Time__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1131:1: ( rule__Time__Group__0__Impl rule__Time__Group__1 )
            // InternalSchedule.g:1132:2: rule__Time__Group__0__Impl rule__Time__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSchedule.g:1139:1: rule__Time__Group__0__Impl : ( ( rule__Time__HoursAssignment_0 ) ) ;
    public final void rule__Time__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1143:1: ( ( ( rule__Time__HoursAssignment_0 ) ) )
            // InternalSchedule.g:1144:1: ( ( rule__Time__HoursAssignment_0 ) )
            {
            // InternalSchedule.g:1144:1: ( ( rule__Time__HoursAssignment_0 ) )
            // InternalSchedule.g:1145:2: ( rule__Time__HoursAssignment_0 )
            {
             before(grammarAccess.getTimeAccess().getHoursAssignment_0()); 
            // InternalSchedule.g:1146:2: ( rule__Time__HoursAssignment_0 )
            // InternalSchedule.g:1146:3: rule__Time__HoursAssignment_0
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
    // InternalSchedule.g:1154:1: rule__Time__Group__1 : rule__Time__Group__1__Impl rule__Time__Group__2 ;
    public final void rule__Time__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1158:1: ( rule__Time__Group__1__Impl rule__Time__Group__2 )
            // InternalSchedule.g:1159:2: rule__Time__Group__1__Impl rule__Time__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSchedule.g:1166:1: rule__Time__Group__1__Impl : ( ':' ) ;
    public final void rule__Time__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1170:1: ( ( ':' ) )
            // InternalSchedule.g:1171:1: ( ':' )
            {
            // InternalSchedule.g:1171:1: ( ':' )
            // InternalSchedule.g:1172:2: ':'
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
    // InternalSchedule.g:1181:1: rule__Time__Group__2 : rule__Time__Group__2__Impl ;
    public final void rule__Time__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1185:1: ( rule__Time__Group__2__Impl )
            // InternalSchedule.g:1186:2: rule__Time__Group__2__Impl
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
    // InternalSchedule.g:1192:1: rule__Time__Group__2__Impl : ( ( rule__Time__MinutesAssignment_2 ) ) ;
    public final void rule__Time__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1196:1: ( ( ( rule__Time__MinutesAssignment_2 ) ) )
            // InternalSchedule.g:1197:1: ( ( rule__Time__MinutesAssignment_2 ) )
            {
            // InternalSchedule.g:1197:1: ( ( rule__Time__MinutesAssignment_2 ) )
            // InternalSchedule.g:1198:2: ( rule__Time__MinutesAssignment_2 )
            {
             before(grammarAccess.getTimeAccess().getMinutesAssignment_2()); 
            // InternalSchedule.g:1199:2: ( rule__Time__MinutesAssignment_2 )
            // InternalSchedule.g:1199:3: rule__Time__MinutesAssignment_2
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
    // InternalSchedule.g:1208:1: rule__Route__Group__0 : rule__Route__Group__0__Impl rule__Route__Group__1 ;
    public final void rule__Route__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1212:1: ( rule__Route__Group__0__Impl rule__Route__Group__1 )
            // InternalSchedule.g:1213:2: rule__Route__Group__0__Impl rule__Route__Group__1
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
    // InternalSchedule.g:1220:1: rule__Route__Group__0__Impl : ( ( rule__Route__SpotsAssignment_0 ) ) ;
    public final void rule__Route__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1224:1: ( ( ( rule__Route__SpotsAssignment_0 ) ) )
            // InternalSchedule.g:1225:1: ( ( rule__Route__SpotsAssignment_0 ) )
            {
            // InternalSchedule.g:1225:1: ( ( rule__Route__SpotsAssignment_0 ) )
            // InternalSchedule.g:1226:2: ( rule__Route__SpotsAssignment_0 )
            {
             before(grammarAccess.getRouteAccess().getSpotsAssignment_0()); 
            // InternalSchedule.g:1227:2: ( rule__Route__SpotsAssignment_0 )
            // InternalSchedule.g:1227:3: rule__Route__SpotsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Route__SpotsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getSpotsAssignment_0()); 

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
    // InternalSchedule.g:1235:1: rule__Route__Group__1 : rule__Route__Group__1__Impl rule__Route__Group__2 ;
    public final void rule__Route__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1239:1: ( rule__Route__Group__1__Impl rule__Route__Group__2 )
            // InternalSchedule.g:1240:2: rule__Route__Group__1__Impl rule__Route__Group__2
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
    // InternalSchedule.g:1247:1: rule__Route__Group__1__Impl : ( ( rule__Route__SpotsAssignment_1 )* ) ;
    public final void rule__Route__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1251:1: ( ( ( rule__Route__SpotsAssignment_1 )* ) )
            // InternalSchedule.g:1252:1: ( ( rule__Route__SpotsAssignment_1 )* )
            {
            // InternalSchedule.g:1252:1: ( ( rule__Route__SpotsAssignment_1 )* )
            // InternalSchedule.g:1253:2: ( rule__Route__SpotsAssignment_1 )*
            {
             before(grammarAccess.getRouteAccess().getSpotsAssignment_1()); 
            // InternalSchedule.g:1254:2: ( rule__Route__SpotsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSchedule.g:1254:3: rule__Route__SpotsAssignment_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Route__SpotsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRouteAccess().getSpotsAssignment_1()); 

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
    // InternalSchedule.g:1262:1: rule__Route__Group__2 : rule__Route__Group__2__Impl ;
    public final void rule__Route__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1266:1: ( rule__Route__Group__2__Impl )
            // InternalSchedule.g:1267:2: rule__Route__Group__2__Impl
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
    // InternalSchedule.g:1273:1: rule__Route__Group__2__Impl : ( ( rule__Route__SpotsAssignment_2 ) ) ;
    public final void rule__Route__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1277:1: ( ( ( rule__Route__SpotsAssignment_2 ) ) )
            // InternalSchedule.g:1278:1: ( ( rule__Route__SpotsAssignment_2 ) )
            {
            // InternalSchedule.g:1278:1: ( ( rule__Route__SpotsAssignment_2 ) )
            // InternalSchedule.g:1279:2: ( rule__Route__SpotsAssignment_2 )
            {
             before(grammarAccess.getRouteAccess().getSpotsAssignment_2()); 
            // InternalSchedule.g:1280:2: ( rule__Route__SpotsAssignment_2 )
            // InternalSchedule.g:1280:3: rule__Route__SpotsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Route__SpotsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getSpotsAssignment_2()); 

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
    // InternalSchedule.g:1289:1: rule__StartSpot__Group__0 : rule__StartSpot__Group__0__Impl rule__StartSpot__Group__1 ;
    public final void rule__StartSpot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1293:1: ( rule__StartSpot__Group__0__Impl rule__StartSpot__Group__1 )
            // InternalSchedule.g:1294:2: rule__StartSpot__Group__0__Impl rule__StartSpot__Group__1
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
    // InternalSchedule.g:1301:1: rule__StartSpot__Group__0__Impl : ( 'start' ) ;
    public final void rule__StartSpot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1305:1: ( ( 'start' ) )
            // InternalSchedule.g:1306:1: ( 'start' )
            {
            // InternalSchedule.g:1306:1: ( 'start' )
            // InternalSchedule.g:1307:2: 'start'
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
    // InternalSchedule.g:1316:1: rule__StartSpot__Group__1 : rule__StartSpot__Group__1__Impl rule__StartSpot__Group__2 ;
    public final void rule__StartSpot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1320:1: ( rule__StartSpot__Group__1__Impl rule__StartSpot__Group__2 )
            // InternalSchedule.g:1321:2: rule__StartSpot__Group__1__Impl rule__StartSpot__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSchedule.g:1328:1: rule__StartSpot__Group__1__Impl : ( 'at' ) ;
    public final void rule__StartSpot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1332:1: ( ( 'at' ) )
            // InternalSchedule.g:1333:1: ( 'at' )
            {
            // InternalSchedule.g:1333:1: ( 'at' )
            // InternalSchedule.g:1334:2: 'at'
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
    // InternalSchedule.g:1343:1: rule__StartSpot__Group__2 : rule__StartSpot__Group__2__Impl rule__StartSpot__Group__3 ;
    public final void rule__StartSpot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1347:1: ( rule__StartSpot__Group__2__Impl rule__StartSpot__Group__3 )
            // InternalSchedule.g:1348:2: rule__StartSpot__Group__2__Impl rule__StartSpot__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalSchedule.g:1355:1: rule__StartSpot__Group__2__Impl : ( ( rule__StartSpot__StationAssignment_2 ) ) ;
    public final void rule__StartSpot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1359:1: ( ( ( rule__StartSpot__StationAssignment_2 ) ) )
            // InternalSchedule.g:1360:1: ( ( rule__StartSpot__StationAssignment_2 ) )
            {
            // InternalSchedule.g:1360:1: ( ( rule__StartSpot__StationAssignment_2 ) )
            // InternalSchedule.g:1361:2: ( rule__StartSpot__StationAssignment_2 )
            {
             before(grammarAccess.getStartSpotAccess().getStationAssignment_2()); 
            // InternalSchedule.g:1362:2: ( rule__StartSpot__StationAssignment_2 )
            // InternalSchedule.g:1362:3: rule__StartSpot__StationAssignment_2
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
    // InternalSchedule.g:1370:1: rule__StartSpot__Group__3 : rule__StartSpot__Group__3__Impl rule__StartSpot__Group__4 ;
    public final void rule__StartSpot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1374:1: ( rule__StartSpot__Group__3__Impl rule__StartSpot__Group__4 )
            // InternalSchedule.g:1375:2: rule__StartSpot__Group__3__Impl rule__StartSpot__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalSchedule.g:1382:1: rule__StartSpot__Group__3__Impl : ( 'on' ) ;
    public final void rule__StartSpot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1386:1: ( ( 'on' ) )
            // InternalSchedule.g:1387:1: ( 'on' )
            {
            // InternalSchedule.g:1387:1: ( 'on' )
            // InternalSchedule.g:1388:2: 'on'
            {
             before(grammarAccess.getStartSpotAccess().getOnKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStartSpotAccess().getOnKeyword_3()); 

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
    // InternalSchedule.g:1397:1: rule__StartSpot__Group__4 : rule__StartSpot__Group__4__Impl rule__StartSpot__Group__5 ;
    public final void rule__StartSpot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1401:1: ( rule__StartSpot__Group__4__Impl rule__StartSpot__Group__5 )
            // InternalSchedule.g:1402:2: rule__StartSpot__Group__4__Impl rule__StartSpot__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__StartSpot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartSpot__Group__5();

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
    // InternalSchedule.g:1409:1: rule__StartSpot__Group__4__Impl : ( 'platform' ) ;
    public final void rule__StartSpot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1413:1: ( ( 'platform' ) )
            // InternalSchedule.g:1414:1: ( 'platform' )
            {
            // InternalSchedule.g:1414:1: ( 'platform' )
            // InternalSchedule.g:1415:2: 'platform'
            {
             before(grammarAccess.getStartSpotAccess().getPlatformKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStartSpotAccess().getPlatformKeyword_4()); 

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


    // $ANTLR start "rule__StartSpot__Group__5"
    // InternalSchedule.g:1424:1: rule__StartSpot__Group__5 : rule__StartSpot__Group__5__Impl rule__StartSpot__Group__6 ;
    public final void rule__StartSpot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1428:1: ( rule__StartSpot__Group__5__Impl rule__StartSpot__Group__6 )
            // InternalSchedule.g:1429:2: rule__StartSpot__Group__5__Impl rule__StartSpot__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__StartSpot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartSpot__Group__6();

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
    // $ANTLR end "rule__StartSpot__Group__5"


    // $ANTLR start "rule__StartSpot__Group__5__Impl"
    // InternalSchedule.g:1436:1: rule__StartSpot__Group__5__Impl : ( ( rule__StartSpot__PlatformAssignment_5 ) ) ;
    public final void rule__StartSpot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1440:1: ( ( ( rule__StartSpot__PlatformAssignment_5 ) ) )
            // InternalSchedule.g:1441:1: ( ( rule__StartSpot__PlatformAssignment_5 ) )
            {
            // InternalSchedule.g:1441:1: ( ( rule__StartSpot__PlatformAssignment_5 ) )
            // InternalSchedule.g:1442:2: ( rule__StartSpot__PlatformAssignment_5 )
            {
             before(grammarAccess.getStartSpotAccess().getPlatformAssignment_5()); 
            // InternalSchedule.g:1443:2: ( rule__StartSpot__PlatformAssignment_5 )
            // InternalSchedule.g:1443:3: rule__StartSpot__PlatformAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__StartSpot__PlatformAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStartSpotAccess().getPlatformAssignment_5()); 

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
    // $ANTLR end "rule__StartSpot__Group__5__Impl"


    // $ANTLR start "rule__StartSpot__Group__6"
    // InternalSchedule.g:1451:1: rule__StartSpot__Group__6 : rule__StartSpot__Group__6__Impl ;
    public final void rule__StartSpot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1455:1: ( rule__StartSpot__Group__6__Impl )
            // InternalSchedule.g:1456:2: rule__StartSpot__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartSpot__Group__6__Impl();

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
    // $ANTLR end "rule__StartSpot__Group__6"


    // $ANTLR start "rule__StartSpot__Group__6__Impl"
    // InternalSchedule.g:1462:1: rule__StartSpot__Group__6__Impl : ( ( rule__StartSpot__Group_6__0 )? ) ;
    public final void rule__StartSpot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1466:1: ( ( ( rule__StartSpot__Group_6__0 )? ) )
            // InternalSchedule.g:1467:1: ( ( rule__StartSpot__Group_6__0 )? )
            {
            // InternalSchedule.g:1467:1: ( ( rule__StartSpot__Group_6__0 )? )
            // InternalSchedule.g:1468:2: ( rule__StartSpot__Group_6__0 )?
            {
             before(grammarAccess.getStartSpotAccess().getGroup_6()); 
            // InternalSchedule.g:1469:2: ( rule__StartSpot__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSchedule.g:1469:3: rule__StartSpot__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StartSpot__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStartSpotAccess().getGroup_6()); 

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
    // $ANTLR end "rule__StartSpot__Group__6__Impl"


    // $ANTLR start "rule__StartSpot__Group_6__0"
    // InternalSchedule.g:1478:1: rule__StartSpot__Group_6__0 : rule__StartSpot__Group_6__0__Impl rule__StartSpot__Group_6__1 ;
    public final void rule__StartSpot__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1482:1: ( rule__StartSpot__Group_6__0__Impl rule__StartSpot__Group_6__1 )
            // InternalSchedule.g:1483:2: rule__StartSpot__Group_6__0__Impl rule__StartSpot__Group_6__1
            {
            pushFollow(FOLLOW_23);
            rule__StartSpot__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartSpot__Group_6__1();

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
    // $ANTLR end "rule__StartSpot__Group_6__0"


    // $ANTLR start "rule__StartSpot__Group_6__0__Impl"
    // InternalSchedule.g:1490:1: rule__StartSpot__Group_6__0__Impl : ( 'drive' ) ;
    public final void rule__StartSpot__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1494:1: ( ( 'drive' ) )
            // InternalSchedule.g:1495:1: ( 'drive' )
            {
            // InternalSchedule.g:1495:1: ( 'drive' )
            // InternalSchedule.g:1496:2: 'drive'
            {
             before(grammarAccess.getStartSpotAccess().getDriveKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStartSpotAccess().getDriveKeyword_6_0()); 

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
    // $ANTLR end "rule__StartSpot__Group_6__0__Impl"


    // $ANTLR start "rule__StartSpot__Group_6__1"
    // InternalSchedule.g:1505:1: rule__StartSpot__Group_6__1 : rule__StartSpot__Group_6__1__Impl rule__StartSpot__Group_6__2 ;
    public final void rule__StartSpot__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1509:1: ( rule__StartSpot__Group_6__1__Impl rule__StartSpot__Group_6__2 )
            // InternalSchedule.g:1510:2: rule__StartSpot__Group_6__1__Impl rule__StartSpot__Group_6__2
            {
            pushFollow(FOLLOW_10);
            rule__StartSpot__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartSpot__Group_6__2();

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
    // $ANTLR end "rule__StartSpot__Group_6__1"


    // $ANTLR start "rule__StartSpot__Group_6__1__Impl"
    // InternalSchedule.g:1517:1: rule__StartSpot__Group_6__1__Impl : ( 'via' ) ;
    public final void rule__StartSpot__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1521:1: ( ( 'via' ) )
            // InternalSchedule.g:1522:1: ( 'via' )
            {
            // InternalSchedule.g:1522:1: ( 'via' )
            // InternalSchedule.g:1523:2: 'via'
            {
             before(grammarAccess.getStartSpotAccess().getViaKeyword_6_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStartSpotAccess().getViaKeyword_6_1()); 

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
    // $ANTLR end "rule__StartSpot__Group_6__1__Impl"


    // $ANTLR start "rule__StartSpot__Group_6__2"
    // InternalSchedule.g:1532:1: rule__StartSpot__Group_6__2 : rule__StartSpot__Group_6__2__Impl ;
    public final void rule__StartSpot__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1536:1: ( rule__StartSpot__Group_6__2__Impl )
            // InternalSchedule.g:1537:2: rule__StartSpot__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartSpot__Group_6__2__Impl();

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
    // $ANTLR end "rule__StartSpot__Group_6__2"


    // $ANTLR start "rule__StartSpot__Group_6__2__Impl"
    // InternalSchedule.g:1543:1: rule__StartSpot__Group_6__2__Impl : ( ( rule__StartSpot__LegAssignment_6_2 ) ) ;
    public final void rule__StartSpot__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1547:1: ( ( ( rule__StartSpot__LegAssignment_6_2 ) ) )
            // InternalSchedule.g:1548:1: ( ( rule__StartSpot__LegAssignment_6_2 ) )
            {
            // InternalSchedule.g:1548:1: ( ( rule__StartSpot__LegAssignment_6_2 ) )
            // InternalSchedule.g:1549:2: ( rule__StartSpot__LegAssignment_6_2 )
            {
             before(grammarAccess.getStartSpotAccess().getLegAssignment_6_2()); 
            // InternalSchedule.g:1550:2: ( rule__StartSpot__LegAssignment_6_2 )
            // InternalSchedule.g:1550:3: rule__StartSpot__LegAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__StartSpot__LegAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getStartSpotAccess().getLegAssignment_6_2()); 

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
    // $ANTLR end "rule__StartSpot__Group_6__2__Impl"


    // $ANTLR start "rule__MiddleSpot__Group__0"
    // InternalSchedule.g:1559:1: rule__MiddleSpot__Group__0 : rule__MiddleSpot__Group__0__Impl rule__MiddleSpot__Group__1 ;
    public final void rule__MiddleSpot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1563:1: ( rule__MiddleSpot__Group__0__Impl rule__MiddleSpot__Group__1 )
            // InternalSchedule.g:1564:2: rule__MiddleSpot__Group__0__Impl rule__MiddleSpot__Group__1
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
    // InternalSchedule.g:1571:1: rule__MiddleSpot__Group__0__Impl : ( 'stop' ) ;
    public final void rule__MiddleSpot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1575:1: ( ( 'stop' ) )
            // InternalSchedule.g:1576:1: ( 'stop' )
            {
            // InternalSchedule.g:1576:1: ( 'stop' )
            // InternalSchedule.g:1577:2: 'stop'
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
    // InternalSchedule.g:1586:1: rule__MiddleSpot__Group__1 : rule__MiddleSpot__Group__1__Impl rule__MiddleSpot__Group__2 ;
    public final void rule__MiddleSpot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1590:1: ( rule__MiddleSpot__Group__1__Impl rule__MiddleSpot__Group__2 )
            // InternalSchedule.g:1591:2: rule__MiddleSpot__Group__1__Impl rule__MiddleSpot__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSchedule.g:1598:1: rule__MiddleSpot__Group__1__Impl : ( 'at' ) ;
    public final void rule__MiddleSpot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1602:1: ( ( 'at' ) )
            // InternalSchedule.g:1603:1: ( 'at' )
            {
            // InternalSchedule.g:1603:1: ( 'at' )
            // InternalSchedule.g:1604:2: 'at'
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
    // InternalSchedule.g:1613:1: rule__MiddleSpot__Group__2 : rule__MiddleSpot__Group__2__Impl rule__MiddleSpot__Group__3 ;
    public final void rule__MiddleSpot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1617:1: ( rule__MiddleSpot__Group__2__Impl rule__MiddleSpot__Group__3 )
            // InternalSchedule.g:1618:2: rule__MiddleSpot__Group__2__Impl rule__MiddleSpot__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalSchedule.g:1625:1: rule__MiddleSpot__Group__2__Impl : ( ( rule__MiddleSpot__StationAssignment_2 ) ) ;
    public final void rule__MiddleSpot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1629:1: ( ( ( rule__MiddleSpot__StationAssignment_2 ) ) )
            // InternalSchedule.g:1630:1: ( ( rule__MiddleSpot__StationAssignment_2 ) )
            {
            // InternalSchedule.g:1630:1: ( ( rule__MiddleSpot__StationAssignment_2 ) )
            // InternalSchedule.g:1631:2: ( rule__MiddleSpot__StationAssignment_2 )
            {
             before(grammarAccess.getMiddleSpotAccess().getStationAssignment_2()); 
            // InternalSchedule.g:1632:2: ( rule__MiddleSpot__StationAssignment_2 )
            // InternalSchedule.g:1632:3: rule__MiddleSpot__StationAssignment_2
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
    // InternalSchedule.g:1640:1: rule__MiddleSpot__Group__3 : rule__MiddleSpot__Group__3__Impl rule__MiddleSpot__Group__4 ;
    public final void rule__MiddleSpot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1644:1: ( rule__MiddleSpot__Group__3__Impl rule__MiddleSpot__Group__4 )
            // InternalSchedule.g:1645:2: rule__MiddleSpot__Group__3__Impl rule__MiddleSpot__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalSchedule.g:1652:1: rule__MiddleSpot__Group__3__Impl : ( 'on' ) ;
    public final void rule__MiddleSpot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1656:1: ( ( 'on' ) )
            // InternalSchedule.g:1657:1: ( 'on' )
            {
            // InternalSchedule.g:1657:1: ( 'on' )
            // InternalSchedule.g:1658:2: 'on'
            {
             before(grammarAccess.getMiddleSpotAccess().getOnKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getOnKeyword_3()); 

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
    // InternalSchedule.g:1667:1: rule__MiddleSpot__Group__4 : rule__MiddleSpot__Group__4__Impl rule__MiddleSpot__Group__5 ;
    public final void rule__MiddleSpot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1671:1: ( rule__MiddleSpot__Group__4__Impl rule__MiddleSpot__Group__5 )
            // InternalSchedule.g:1672:2: rule__MiddleSpot__Group__4__Impl rule__MiddleSpot__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalSchedule.g:1679:1: rule__MiddleSpot__Group__4__Impl : ( 'platform' ) ;
    public final void rule__MiddleSpot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1683:1: ( ( 'platform' ) )
            // InternalSchedule.g:1684:1: ( 'platform' )
            {
            // InternalSchedule.g:1684:1: ( 'platform' )
            // InternalSchedule.g:1685:2: 'platform'
            {
             before(grammarAccess.getMiddleSpotAccess().getPlatformKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getPlatformKeyword_4()); 

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
    // InternalSchedule.g:1694:1: rule__MiddleSpot__Group__5 : rule__MiddleSpot__Group__5__Impl rule__MiddleSpot__Group__6 ;
    public final void rule__MiddleSpot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1698:1: ( rule__MiddleSpot__Group__5__Impl rule__MiddleSpot__Group__6 )
            // InternalSchedule.g:1699:2: rule__MiddleSpot__Group__5__Impl rule__MiddleSpot__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalSchedule.g:1706:1: rule__MiddleSpot__Group__5__Impl : ( ( rule__MiddleSpot__PlatformAssignment_5 ) ) ;
    public final void rule__MiddleSpot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1710:1: ( ( ( rule__MiddleSpot__PlatformAssignment_5 ) ) )
            // InternalSchedule.g:1711:1: ( ( rule__MiddleSpot__PlatformAssignment_5 ) )
            {
            // InternalSchedule.g:1711:1: ( ( rule__MiddleSpot__PlatformAssignment_5 ) )
            // InternalSchedule.g:1712:2: ( rule__MiddleSpot__PlatformAssignment_5 )
            {
             before(grammarAccess.getMiddleSpotAccess().getPlatformAssignment_5()); 
            // InternalSchedule.g:1713:2: ( rule__MiddleSpot__PlatformAssignment_5 )
            // InternalSchedule.g:1713:3: rule__MiddleSpot__PlatformAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__MiddleSpot__PlatformAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMiddleSpotAccess().getPlatformAssignment_5()); 

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
    // InternalSchedule.g:1721:1: rule__MiddleSpot__Group__6 : rule__MiddleSpot__Group__6__Impl rule__MiddleSpot__Group__7 ;
    public final void rule__MiddleSpot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1725:1: ( rule__MiddleSpot__Group__6__Impl rule__MiddleSpot__Group__7 )
            // InternalSchedule.g:1726:2: rule__MiddleSpot__Group__6__Impl rule__MiddleSpot__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__MiddleSpot__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group__7();

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
    // InternalSchedule.g:1733:1: rule__MiddleSpot__Group__6__Impl : ( 'for' ) ;
    public final void rule__MiddleSpot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1737:1: ( ( 'for' ) )
            // InternalSchedule.g:1738:1: ( 'for' )
            {
            // InternalSchedule.g:1738:1: ( 'for' )
            // InternalSchedule.g:1739:2: 'for'
            {
             before(grammarAccess.getMiddleSpotAccess().getForKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getForKeyword_6()); 

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


    // $ANTLR start "rule__MiddleSpot__Group__7"
    // InternalSchedule.g:1748:1: rule__MiddleSpot__Group__7 : rule__MiddleSpot__Group__7__Impl rule__MiddleSpot__Group__8 ;
    public final void rule__MiddleSpot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1752:1: ( rule__MiddleSpot__Group__7__Impl rule__MiddleSpot__Group__8 )
            // InternalSchedule.g:1753:2: rule__MiddleSpot__Group__7__Impl rule__MiddleSpot__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__MiddleSpot__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group__8();

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
    // $ANTLR end "rule__MiddleSpot__Group__7"


    // $ANTLR start "rule__MiddleSpot__Group__7__Impl"
    // InternalSchedule.g:1760:1: rule__MiddleSpot__Group__7__Impl : ( ( rule__MiddleSpot__WaitingTimeAssignment_7 ) ) ;
    public final void rule__MiddleSpot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1764:1: ( ( ( rule__MiddleSpot__WaitingTimeAssignment_7 ) ) )
            // InternalSchedule.g:1765:1: ( ( rule__MiddleSpot__WaitingTimeAssignment_7 ) )
            {
            // InternalSchedule.g:1765:1: ( ( rule__MiddleSpot__WaitingTimeAssignment_7 ) )
            // InternalSchedule.g:1766:2: ( rule__MiddleSpot__WaitingTimeAssignment_7 )
            {
             before(grammarAccess.getMiddleSpotAccess().getWaitingTimeAssignment_7()); 
            // InternalSchedule.g:1767:2: ( rule__MiddleSpot__WaitingTimeAssignment_7 )
            // InternalSchedule.g:1767:3: rule__MiddleSpot__WaitingTimeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__MiddleSpot__WaitingTimeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMiddleSpotAccess().getWaitingTimeAssignment_7()); 

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
    // $ANTLR end "rule__MiddleSpot__Group__7__Impl"


    // $ANTLR start "rule__MiddleSpot__Group__8"
    // InternalSchedule.g:1775:1: rule__MiddleSpot__Group__8 : rule__MiddleSpot__Group__8__Impl rule__MiddleSpot__Group__9 ;
    public final void rule__MiddleSpot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1779:1: ( rule__MiddleSpot__Group__8__Impl rule__MiddleSpot__Group__9 )
            // InternalSchedule.g:1780:2: rule__MiddleSpot__Group__8__Impl rule__MiddleSpot__Group__9
            {
            pushFollow(FOLLOW_25);
            rule__MiddleSpot__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group__9();

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
    // $ANTLR end "rule__MiddleSpot__Group__8"


    // $ANTLR start "rule__MiddleSpot__Group__8__Impl"
    // InternalSchedule.g:1787:1: rule__MiddleSpot__Group__8__Impl : ( 'min' ) ;
    public final void rule__MiddleSpot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1791:1: ( ( 'min' ) )
            // InternalSchedule.g:1792:1: ( 'min' )
            {
            // InternalSchedule.g:1792:1: ( 'min' )
            // InternalSchedule.g:1793:2: 'min'
            {
             before(grammarAccess.getMiddleSpotAccess().getMinKeyword_8()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getMinKeyword_8()); 

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
    // $ANTLR end "rule__MiddleSpot__Group__8__Impl"


    // $ANTLR start "rule__MiddleSpot__Group__9"
    // InternalSchedule.g:1802:1: rule__MiddleSpot__Group__9 : rule__MiddleSpot__Group__9__Impl rule__MiddleSpot__Group__10 ;
    public final void rule__MiddleSpot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1806:1: ( rule__MiddleSpot__Group__9__Impl rule__MiddleSpot__Group__10 )
            // InternalSchedule.g:1807:2: rule__MiddleSpot__Group__9__Impl rule__MiddleSpot__Group__10
            {
            pushFollow(FOLLOW_25);
            rule__MiddleSpot__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group__10();

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
    // $ANTLR end "rule__MiddleSpot__Group__9"


    // $ANTLR start "rule__MiddleSpot__Group__9__Impl"
    // InternalSchedule.g:1814:1: rule__MiddleSpot__Group__9__Impl : ( ( rule__MiddleSpot__Group_9__0 )? ) ;
    public final void rule__MiddleSpot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1818:1: ( ( ( rule__MiddleSpot__Group_9__0 )? ) )
            // InternalSchedule.g:1819:1: ( ( rule__MiddleSpot__Group_9__0 )? )
            {
            // InternalSchedule.g:1819:1: ( ( rule__MiddleSpot__Group_9__0 )? )
            // InternalSchedule.g:1820:2: ( rule__MiddleSpot__Group_9__0 )?
            {
             before(grammarAccess.getMiddleSpotAccess().getGroup_9()); 
            // InternalSchedule.g:1821:2: ( rule__MiddleSpot__Group_9__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSchedule.g:1821:3: rule__MiddleSpot__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MiddleSpot__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMiddleSpotAccess().getGroup_9()); 

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
    // $ANTLR end "rule__MiddleSpot__Group__9__Impl"


    // $ANTLR start "rule__MiddleSpot__Group__10"
    // InternalSchedule.g:1829:1: rule__MiddleSpot__Group__10 : rule__MiddleSpot__Group__10__Impl ;
    public final void rule__MiddleSpot__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1833:1: ( rule__MiddleSpot__Group__10__Impl )
            // InternalSchedule.g:1834:2: rule__MiddleSpot__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group__10__Impl();

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
    // $ANTLR end "rule__MiddleSpot__Group__10"


    // $ANTLR start "rule__MiddleSpot__Group__10__Impl"
    // InternalSchedule.g:1840:1: rule__MiddleSpot__Group__10__Impl : ( ( rule__MiddleSpot__Group_10__0 )? ) ;
    public final void rule__MiddleSpot__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1844:1: ( ( ( rule__MiddleSpot__Group_10__0 )? ) )
            // InternalSchedule.g:1845:1: ( ( rule__MiddleSpot__Group_10__0 )? )
            {
            // InternalSchedule.g:1845:1: ( ( rule__MiddleSpot__Group_10__0 )? )
            // InternalSchedule.g:1846:2: ( rule__MiddleSpot__Group_10__0 )?
            {
             before(grammarAccess.getMiddleSpotAccess().getGroup_10()); 
            // InternalSchedule.g:1847:2: ( rule__MiddleSpot__Group_10__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSchedule.g:1847:3: rule__MiddleSpot__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MiddleSpot__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMiddleSpotAccess().getGroup_10()); 

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
    // $ANTLR end "rule__MiddleSpot__Group__10__Impl"


    // $ANTLR start "rule__MiddleSpot__Group_9__0"
    // InternalSchedule.g:1856:1: rule__MiddleSpot__Group_9__0 : rule__MiddleSpot__Group_9__0__Impl rule__MiddleSpot__Group_9__1 ;
    public final void rule__MiddleSpot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1860:1: ( rule__MiddleSpot__Group_9__0__Impl rule__MiddleSpot__Group_9__1 )
            // InternalSchedule.g:1861:2: rule__MiddleSpot__Group_9__0__Impl rule__MiddleSpot__Group_9__1
            {
            pushFollow(FOLLOW_26);
            rule__MiddleSpot__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group_9__1();

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
    // $ANTLR end "rule__MiddleSpot__Group_9__0"


    // $ANTLR start "rule__MiddleSpot__Group_9__0__Impl"
    // InternalSchedule.g:1868:1: rule__MiddleSpot__Group_9__0__Impl : ( 'and' ) ;
    public final void rule__MiddleSpot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1872:1: ( ( 'and' ) )
            // InternalSchedule.g:1873:1: ( 'and' )
            {
            // InternalSchedule.g:1873:1: ( 'and' )
            // InternalSchedule.g:1874:2: 'and'
            {
             before(grammarAccess.getMiddleSpotAccess().getAndKeyword_9_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getAndKeyword_9_0()); 

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
    // $ANTLR end "rule__MiddleSpot__Group_9__0__Impl"


    // $ANTLR start "rule__MiddleSpot__Group_9__1"
    // InternalSchedule.g:1883:1: rule__MiddleSpot__Group_9__1 : rule__MiddleSpot__Group_9__1__Impl ;
    public final void rule__MiddleSpot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1887:1: ( rule__MiddleSpot__Group_9__1__Impl )
            // InternalSchedule.g:1888:2: rule__MiddleSpot__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group_9__1__Impl();

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
    // $ANTLR end "rule__MiddleSpot__Group_9__1"


    // $ANTLR start "rule__MiddleSpot__Group_9__1__Impl"
    // InternalSchedule.g:1894:1: rule__MiddleSpot__Group_9__1__Impl : ( ( rule__MiddleSpot__TurnStationAssignment_9_1 ) ) ;
    public final void rule__MiddleSpot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1898:1: ( ( ( rule__MiddleSpot__TurnStationAssignment_9_1 ) ) )
            // InternalSchedule.g:1899:1: ( ( rule__MiddleSpot__TurnStationAssignment_9_1 ) )
            {
            // InternalSchedule.g:1899:1: ( ( rule__MiddleSpot__TurnStationAssignment_9_1 ) )
            // InternalSchedule.g:1900:2: ( rule__MiddleSpot__TurnStationAssignment_9_1 )
            {
             before(grammarAccess.getMiddleSpotAccess().getTurnStationAssignment_9_1()); 
            // InternalSchedule.g:1901:2: ( rule__MiddleSpot__TurnStationAssignment_9_1 )
            // InternalSchedule.g:1901:3: rule__MiddleSpot__TurnStationAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__MiddleSpot__TurnStationAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getMiddleSpotAccess().getTurnStationAssignment_9_1()); 

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
    // $ANTLR end "rule__MiddleSpot__Group_9__1__Impl"


    // $ANTLR start "rule__MiddleSpot__Group_10__0"
    // InternalSchedule.g:1910:1: rule__MiddleSpot__Group_10__0 : rule__MiddleSpot__Group_10__0__Impl rule__MiddleSpot__Group_10__1 ;
    public final void rule__MiddleSpot__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1914:1: ( rule__MiddleSpot__Group_10__0__Impl rule__MiddleSpot__Group_10__1 )
            // InternalSchedule.g:1915:2: rule__MiddleSpot__Group_10__0__Impl rule__MiddleSpot__Group_10__1
            {
            pushFollow(FOLLOW_23);
            rule__MiddleSpot__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group_10__1();

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
    // $ANTLR end "rule__MiddleSpot__Group_10__0"


    // $ANTLR start "rule__MiddleSpot__Group_10__0__Impl"
    // InternalSchedule.g:1922:1: rule__MiddleSpot__Group_10__0__Impl : ( 'drive' ) ;
    public final void rule__MiddleSpot__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1926:1: ( ( 'drive' ) )
            // InternalSchedule.g:1927:1: ( 'drive' )
            {
            // InternalSchedule.g:1927:1: ( 'drive' )
            // InternalSchedule.g:1928:2: 'drive'
            {
             before(grammarAccess.getMiddleSpotAccess().getDriveKeyword_10_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getDriveKeyword_10_0()); 

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
    // $ANTLR end "rule__MiddleSpot__Group_10__0__Impl"


    // $ANTLR start "rule__MiddleSpot__Group_10__1"
    // InternalSchedule.g:1937:1: rule__MiddleSpot__Group_10__1 : rule__MiddleSpot__Group_10__1__Impl rule__MiddleSpot__Group_10__2 ;
    public final void rule__MiddleSpot__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1941:1: ( rule__MiddleSpot__Group_10__1__Impl rule__MiddleSpot__Group_10__2 )
            // InternalSchedule.g:1942:2: rule__MiddleSpot__Group_10__1__Impl rule__MiddleSpot__Group_10__2
            {
            pushFollow(FOLLOW_10);
            rule__MiddleSpot__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group_10__2();

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
    // $ANTLR end "rule__MiddleSpot__Group_10__1"


    // $ANTLR start "rule__MiddleSpot__Group_10__1__Impl"
    // InternalSchedule.g:1949:1: rule__MiddleSpot__Group_10__1__Impl : ( 'via' ) ;
    public final void rule__MiddleSpot__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1953:1: ( ( 'via' ) )
            // InternalSchedule.g:1954:1: ( 'via' )
            {
            // InternalSchedule.g:1954:1: ( 'via' )
            // InternalSchedule.g:1955:2: 'via'
            {
             before(grammarAccess.getMiddleSpotAccess().getViaKeyword_10_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getViaKeyword_10_1()); 

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
    // $ANTLR end "rule__MiddleSpot__Group_10__1__Impl"


    // $ANTLR start "rule__MiddleSpot__Group_10__2"
    // InternalSchedule.g:1964:1: rule__MiddleSpot__Group_10__2 : rule__MiddleSpot__Group_10__2__Impl ;
    public final void rule__MiddleSpot__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1968:1: ( rule__MiddleSpot__Group_10__2__Impl )
            // InternalSchedule.g:1969:2: rule__MiddleSpot__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MiddleSpot__Group_10__2__Impl();

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
    // $ANTLR end "rule__MiddleSpot__Group_10__2"


    // $ANTLR start "rule__MiddleSpot__Group_10__2__Impl"
    // InternalSchedule.g:1975:1: rule__MiddleSpot__Group_10__2__Impl : ( ( rule__MiddleSpot__LegAssignment_10_2 ) ) ;
    public final void rule__MiddleSpot__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1979:1: ( ( ( rule__MiddleSpot__LegAssignment_10_2 ) ) )
            // InternalSchedule.g:1980:1: ( ( rule__MiddleSpot__LegAssignment_10_2 ) )
            {
            // InternalSchedule.g:1980:1: ( ( rule__MiddleSpot__LegAssignment_10_2 ) )
            // InternalSchedule.g:1981:2: ( rule__MiddleSpot__LegAssignment_10_2 )
            {
             before(grammarAccess.getMiddleSpotAccess().getLegAssignment_10_2()); 
            // InternalSchedule.g:1982:2: ( rule__MiddleSpot__LegAssignment_10_2 )
            // InternalSchedule.g:1982:3: rule__MiddleSpot__LegAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__MiddleSpot__LegAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getMiddleSpotAccess().getLegAssignment_10_2()); 

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
    // $ANTLR end "rule__MiddleSpot__Group_10__2__Impl"


    // $ANTLR start "rule__FinalSpot__Group__0"
    // InternalSchedule.g:1991:1: rule__FinalSpot__Group__0 : rule__FinalSpot__Group__0__Impl rule__FinalSpot__Group__1 ;
    public final void rule__FinalSpot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1995:1: ( rule__FinalSpot__Group__0__Impl rule__FinalSpot__Group__1 )
            // InternalSchedule.g:1996:2: rule__FinalSpot__Group__0__Impl rule__FinalSpot__Group__1
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
    // InternalSchedule.g:2003:1: rule__FinalSpot__Group__0__Impl : ( 'terminate' ) ;
    public final void rule__FinalSpot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2007:1: ( ( 'terminate' ) )
            // InternalSchedule.g:2008:1: ( 'terminate' )
            {
            // InternalSchedule.g:2008:1: ( 'terminate' )
            // InternalSchedule.g:2009:2: 'terminate'
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
    // InternalSchedule.g:2018:1: rule__FinalSpot__Group__1 : rule__FinalSpot__Group__1__Impl rule__FinalSpot__Group__2 ;
    public final void rule__FinalSpot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2022:1: ( rule__FinalSpot__Group__1__Impl rule__FinalSpot__Group__2 )
            // InternalSchedule.g:2023:2: rule__FinalSpot__Group__1__Impl rule__FinalSpot__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSchedule.g:2030:1: rule__FinalSpot__Group__1__Impl : ( 'at' ) ;
    public final void rule__FinalSpot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2034:1: ( ( 'at' ) )
            // InternalSchedule.g:2035:1: ( 'at' )
            {
            // InternalSchedule.g:2035:1: ( 'at' )
            // InternalSchedule.g:2036:2: 'at'
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
    // InternalSchedule.g:2045:1: rule__FinalSpot__Group__2 : rule__FinalSpot__Group__2__Impl rule__FinalSpot__Group__3 ;
    public final void rule__FinalSpot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2049:1: ( rule__FinalSpot__Group__2__Impl rule__FinalSpot__Group__3 )
            // InternalSchedule.g:2050:2: rule__FinalSpot__Group__2__Impl rule__FinalSpot__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalSchedule.g:2057:1: rule__FinalSpot__Group__2__Impl : ( ( rule__FinalSpot__StationAssignment_2 ) ) ;
    public final void rule__FinalSpot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2061:1: ( ( ( rule__FinalSpot__StationAssignment_2 ) ) )
            // InternalSchedule.g:2062:1: ( ( rule__FinalSpot__StationAssignment_2 ) )
            {
            // InternalSchedule.g:2062:1: ( ( rule__FinalSpot__StationAssignment_2 ) )
            // InternalSchedule.g:2063:2: ( rule__FinalSpot__StationAssignment_2 )
            {
             before(grammarAccess.getFinalSpotAccess().getStationAssignment_2()); 
            // InternalSchedule.g:2064:2: ( rule__FinalSpot__StationAssignment_2 )
            // InternalSchedule.g:2064:3: rule__FinalSpot__StationAssignment_2
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
    // InternalSchedule.g:2072:1: rule__FinalSpot__Group__3 : rule__FinalSpot__Group__3__Impl rule__FinalSpot__Group__4 ;
    public final void rule__FinalSpot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2076:1: ( rule__FinalSpot__Group__3__Impl rule__FinalSpot__Group__4 )
            // InternalSchedule.g:2077:2: rule__FinalSpot__Group__3__Impl rule__FinalSpot__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__FinalSpot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalSpot__Group__4();

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
    // InternalSchedule.g:2084:1: rule__FinalSpot__Group__3__Impl : ( 'on' ) ;
    public final void rule__FinalSpot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2088:1: ( ( 'on' ) )
            // InternalSchedule.g:2089:1: ( 'on' )
            {
            // InternalSchedule.g:2089:1: ( 'on' )
            // InternalSchedule.g:2090:2: 'on'
            {
             before(grammarAccess.getFinalSpotAccess().getOnKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFinalSpotAccess().getOnKeyword_3()); 

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


    // $ANTLR start "rule__FinalSpot__Group__4"
    // InternalSchedule.g:2099:1: rule__FinalSpot__Group__4 : rule__FinalSpot__Group__4__Impl rule__FinalSpot__Group__5 ;
    public final void rule__FinalSpot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2103:1: ( rule__FinalSpot__Group__4__Impl rule__FinalSpot__Group__5 )
            // InternalSchedule.g:2104:2: rule__FinalSpot__Group__4__Impl rule__FinalSpot__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__FinalSpot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalSpot__Group__5();

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
    // $ANTLR end "rule__FinalSpot__Group__4"


    // $ANTLR start "rule__FinalSpot__Group__4__Impl"
    // InternalSchedule.g:2111:1: rule__FinalSpot__Group__4__Impl : ( 'platform' ) ;
    public final void rule__FinalSpot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2115:1: ( ( 'platform' ) )
            // InternalSchedule.g:2116:1: ( 'platform' )
            {
            // InternalSchedule.g:2116:1: ( 'platform' )
            // InternalSchedule.g:2117:2: 'platform'
            {
             before(grammarAccess.getFinalSpotAccess().getPlatformKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFinalSpotAccess().getPlatformKeyword_4()); 

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
    // $ANTLR end "rule__FinalSpot__Group__4__Impl"


    // $ANTLR start "rule__FinalSpot__Group__5"
    // InternalSchedule.g:2126:1: rule__FinalSpot__Group__5 : rule__FinalSpot__Group__5__Impl ;
    public final void rule__FinalSpot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2130:1: ( rule__FinalSpot__Group__5__Impl )
            // InternalSchedule.g:2131:2: rule__FinalSpot__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FinalSpot__Group__5__Impl();

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
    // $ANTLR end "rule__FinalSpot__Group__5"


    // $ANTLR start "rule__FinalSpot__Group__5__Impl"
    // InternalSchedule.g:2137:1: rule__FinalSpot__Group__5__Impl : ( ( rule__FinalSpot__PlatformAssignment_5 ) ) ;
    public final void rule__FinalSpot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2141:1: ( ( ( rule__FinalSpot__PlatformAssignment_5 ) ) )
            // InternalSchedule.g:2142:1: ( ( rule__FinalSpot__PlatformAssignment_5 ) )
            {
            // InternalSchedule.g:2142:1: ( ( rule__FinalSpot__PlatformAssignment_5 ) )
            // InternalSchedule.g:2143:2: ( rule__FinalSpot__PlatformAssignment_5 )
            {
             before(grammarAccess.getFinalSpotAccess().getPlatformAssignment_5()); 
            // InternalSchedule.g:2144:2: ( rule__FinalSpot__PlatformAssignment_5 )
            // InternalSchedule.g:2144:3: rule__FinalSpot__PlatformAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FinalSpot__PlatformAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFinalSpotAccess().getPlatformAssignment_5()); 

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
    // $ANTLR end "rule__FinalSpot__Group__5__Impl"


    // $ANTLR start "rule__Schedule__NetworkAssignment_2"
    // InternalSchedule.g:2153:1: rule__Schedule__NetworkAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__Schedule__NetworkAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2157:1: ( ( ( RULE_STRING ) ) )
            // InternalSchedule.g:2158:2: ( ( RULE_STRING ) )
            {
            // InternalSchedule.g:2158:2: ( ( RULE_STRING ) )
            // InternalSchedule.g:2159:3: ( RULE_STRING )
            {
             before(grammarAccess.getScheduleAccess().getNetworkNetworkCrossReference_2_0()); 
            // InternalSchedule.g:2160:3: ( RULE_STRING )
            // InternalSchedule.g:2161:4: RULE_STRING
            {
             before(grammarAccess.getScheduleAccess().getNetworkNetworkSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getNetworkNetworkSTRINGTerminalRuleCall_2_0_1()); 

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
    // InternalSchedule.g:2172:1: rule__Schedule__DepotsAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__Schedule__DepotsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2176:1: ( ( ( RULE_STRING ) ) )
            // InternalSchedule.g:2177:2: ( ( RULE_STRING ) )
            {
            // InternalSchedule.g:2177:2: ( ( RULE_STRING ) )
            // InternalSchedule.g:2178:3: ( RULE_STRING )
            {
             before(grammarAccess.getScheduleAccess().getDepotsDepotCrossReference_4_0()); 
            // InternalSchedule.g:2179:3: ( RULE_STRING )
            // InternalSchedule.g:2180:4: RULE_STRING
            {
             before(grammarAccess.getScheduleAccess().getDepotsDepotSTRINGTerminalRuleCall_4_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getDepotsDepotSTRINGTerminalRuleCall_4_0_1()); 

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
    // InternalSchedule.g:2191:1: rule__Schedule__DepotsAssignment_5_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Schedule__DepotsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2195:1: ( ( ( RULE_STRING ) ) )
            // InternalSchedule.g:2196:2: ( ( RULE_STRING ) )
            {
            // InternalSchedule.g:2196:2: ( ( RULE_STRING ) )
            // InternalSchedule.g:2197:3: ( RULE_STRING )
            {
             before(grammarAccess.getScheduleAccess().getDepotsDepotCrossReference_5_1_0()); 
            // InternalSchedule.g:2198:3: ( RULE_STRING )
            // InternalSchedule.g:2199:4: RULE_STRING
            {
             before(grammarAccess.getScheduleAccess().getDepotsDepotSTRINGTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getDepotsDepotSTRINGTerminalRuleCall_5_1_0_1()); 

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
    // InternalSchedule.g:2210:1: rule__Schedule__TrainSchedulesAssignment_7 : ( ruleTrainSchedule ) ;
    public final void rule__Schedule__TrainSchedulesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2214:1: ( ( ruleTrainSchedule ) )
            // InternalSchedule.g:2215:2: ( ruleTrainSchedule )
            {
            // InternalSchedule.g:2215:2: ( ruleTrainSchedule )
            // InternalSchedule.g:2216:3: ruleTrainSchedule
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
    // InternalSchedule.g:2225:1: rule__TrainSchedule__TrainAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TrainSchedule__TrainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2229:1: ( ( ( RULE_ID ) ) )
            // InternalSchedule.g:2230:2: ( ( RULE_ID ) )
            {
            // InternalSchedule.g:2230:2: ( ( RULE_ID ) )
            // InternalSchedule.g:2231:3: ( RULE_ID )
            {
             before(grammarAccess.getTrainScheduleAccess().getTrainTrainCrossReference_1_0()); 
            // InternalSchedule.g:2232:3: ( RULE_ID )
            // InternalSchedule.g:2233:4: RULE_ID
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


    // $ANTLR start "rule__TrainSchedule__TimeDescriptionAssignment_3"
    // InternalSchedule.g:2244:1: rule__TrainSchedule__TimeDescriptionAssignment_3 : ( ruleTimeDescription ) ;
    public final void rule__TrainSchedule__TimeDescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2248:1: ( ( ruleTimeDescription ) )
            // InternalSchedule.g:2249:2: ( ruleTimeDescription )
            {
            // InternalSchedule.g:2249:2: ( ruleTimeDescription )
            // InternalSchedule.g:2250:3: ruleTimeDescription
            {
             before(grammarAccess.getTrainScheduleAccess().getTimeDescriptionTimeDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeDescription();

            state._fsp--;

             after(grammarAccess.getTrainScheduleAccess().getTimeDescriptionTimeDescriptionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__TrainSchedule__TimeDescriptionAssignment_3"


    // $ANTLR start "rule__TrainSchedule__RouteAssignment_5"
    // InternalSchedule.g:2259:1: rule__TrainSchedule__RouteAssignment_5 : ( ruleRoute ) ;
    public final void rule__TrainSchedule__RouteAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2263:1: ( ( ruleRoute ) )
            // InternalSchedule.g:2264:2: ( ruleRoute )
            {
            // InternalSchedule.g:2264:2: ( ruleRoute )
            // InternalSchedule.g:2265:3: ruleRoute
            {
             before(grammarAccess.getTrainScheduleAccess().getRouteRouteParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getTrainScheduleAccess().getRouteRouteParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__TrainSchedule__RouteAssignment_5"


    // $ANTLR start "rule__TimeDescription__DateTimesAssignment_0"
    // InternalSchedule.g:2274:1: rule__TimeDescription__DateTimesAssignment_0 : ( ruleDateTime ) ;
    public final void rule__TimeDescription__DateTimesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2278:1: ( ( ruleDateTime ) )
            // InternalSchedule.g:2279:2: ( ruleDateTime )
            {
            // InternalSchedule.g:2279:2: ( ruleDateTime )
            // InternalSchedule.g:2280:3: ruleDateTime
            {
             before(grammarAccess.getTimeDescriptionAccess().getDateTimesDateTimeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDateTime();

            state._fsp--;

             after(grammarAccess.getTimeDescriptionAccess().getDateTimesDateTimeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__TimeDescription__DateTimesAssignment_0"


    // $ANTLR start "rule__TimeDescription__DateTimesAssignment_1_0_1"
    // InternalSchedule.g:2289:1: rule__TimeDescription__DateTimesAssignment_1_0_1 : ( ruleDateTime ) ;
    public final void rule__TimeDescription__DateTimesAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2293:1: ( ( ruleDateTime ) )
            // InternalSchedule.g:2294:2: ( ruleDateTime )
            {
            // InternalSchedule.g:2294:2: ( ruleDateTime )
            // InternalSchedule.g:2295:3: ruleDateTime
            {
             before(grammarAccess.getTimeDescriptionAccess().getDateTimesDateTimeParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDateTime();

            state._fsp--;

             after(grammarAccess.getTimeDescriptionAccess().getDateTimesDateTimeParserRuleCall_1_0_1_0()); 

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
    // $ANTLR end "rule__TimeDescription__DateTimesAssignment_1_0_1"


    // $ANTLR start "rule__TimeDescription__DateTimesAssignment_1_2"
    // InternalSchedule.g:2304:1: rule__TimeDescription__DateTimesAssignment_1_2 : ( ruleDateTime ) ;
    public final void rule__TimeDescription__DateTimesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2308:1: ( ( ruleDateTime ) )
            // InternalSchedule.g:2309:2: ( ruleDateTime )
            {
            // InternalSchedule.g:2309:2: ( ruleDateTime )
            // InternalSchedule.g:2310:3: ruleDateTime
            {
             before(grammarAccess.getTimeDescriptionAccess().getDateTimesDateTimeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDateTime();

            state._fsp--;

             after(grammarAccess.getTimeDescriptionAccess().getDateTimesDateTimeParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__TimeDescription__DateTimesAssignment_1_2"


    // $ANTLR start "rule__DateTime__WeekdaysAssignment_0"
    // InternalSchedule.g:2319:1: rule__DateTime__WeekdaysAssignment_0 : ( ruleWeekDay ) ;
    public final void rule__DateTime__WeekdaysAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2323:1: ( ( ruleWeekDay ) )
            // InternalSchedule.g:2324:2: ( ruleWeekDay )
            {
            // InternalSchedule.g:2324:2: ( ruleWeekDay )
            // InternalSchedule.g:2325:3: ruleWeekDay
            {
             before(grammarAccess.getDateTimeAccess().getWeekdaysWeekDayEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWeekDay();

            state._fsp--;

             after(grammarAccess.getDateTimeAccess().getWeekdaysWeekDayEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__DateTime__WeekdaysAssignment_0"


    // $ANTLR start "rule__DateTime__WeekdaysAssignment_1_1"
    // InternalSchedule.g:2334:1: rule__DateTime__WeekdaysAssignment_1_1 : ( ruleWeekDay ) ;
    public final void rule__DateTime__WeekdaysAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2338:1: ( ( ruleWeekDay ) )
            // InternalSchedule.g:2339:2: ( ruleWeekDay )
            {
            // InternalSchedule.g:2339:2: ( ruleWeekDay )
            // InternalSchedule.g:2340:3: ruleWeekDay
            {
             before(grammarAccess.getDateTimeAccess().getWeekdaysWeekDayEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWeekDay();

            state._fsp--;

             after(grammarAccess.getDateTimeAccess().getWeekdaysWeekDayEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__DateTime__WeekdaysAssignment_1_1"


    // $ANTLR start "rule__DateTime__TimeAssignment_3"
    // InternalSchedule.g:2349:1: rule__DateTime__TimeAssignment_3 : ( ruleTime ) ;
    public final void rule__DateTime__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2353:1: ( ( ruleTime ) )
            // InternalSchedule.g:2354:2: ( ruleTime )
            {
            // InternalSchedule.g:2354:2: ( ruleTime )
            // InternalSchedule.g:2355:3: ruleTime
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
    // InternalSchedule.g:2364:1: rule__Time__HoursAssignment_0 : ( RULE_INT ) ;
    public final void rule__Time__HoursAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2368:1: ( ( RULE_INT ) )
            // InternalSchedule.g:2369:2: ( RULE_INT )
            {
            // InternalSchedule.g:2369:2: ( RULE_INT )
            // InternalSchedule.g:2370:3: RULE_INT
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
    // InternalSchedule.g:2379:1: rule__Time__MinutesAssignment_2 : ( RULE_INT ) ;
    public final void rule__Time__MinutesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2383:1: ( ( RULE_INT ) )
            // InternalSchedule.g:2384:2: ( RULE_INT )
            {
            // InternalSchedule.g:2384:2: ( RULE_INT )
            // InternalSchedule.g:2385:3: RULE_INT
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


    // $ANTLR start "rule__Route__SpotsAssignment_0"
    // InternalSchedule.g:2394:1: rule__Route__SpotsAssignment_0 : ( ruleStartSpot ) ;
    public final void rule__Route__SpotsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2398:1: ( ( ruleStartSpot ) )
            // InternalSchedule.g:2399:2: ( ruleStartSpot )
            {
            // InternalSchedule.g:2399:2: ( ruleStartSpot )
            // InternalSchedule.g:2400:3: ruleStartSpot
            {
             before(grammarAccess.getRouteAccess().getSpotsStartSpotParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStartSpot();

            state._fsp--;

             after(grammarAccess.getRouteAccess().getSpotsStartSpotParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Route__SpotsAssignment_0"


    // $ANTLR start "rule__Route__SpotsAssignment_1"
    // InternalSchedule.g:2409:1: rule__Route__SpotsAssignment_1 : ( ruleMiddleSpot ) ;
    public final void rule__Route__SpotsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2413:1: ( ( ruleMiddleSpot ) )
            // InternalSchedule.g:2414:2: ( ruleMiddleSpot )
            {
            // InternalSchedule.g:2414:2: ( ruleMiddleSpot )
            // InternalSchedule.g:2415:3: ruleMiddleSpot
            {
             before(grammarAccess.getRouteAccess().getSpotsMiddleSpotParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMiddleSpot();

            state._fsp--;

             after(grammarAccess.getRouteAccess().getSpotsMiddleSpotParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Route__SpotsAssignment_1"


    // $ANTLR start "rule__Route__SpotsAssignment_2"
    // InternalSchedule.g:2424:1: rule__Route__SpotsAssignment_2 : ( ruleFinalSpot ) ;
    public final void rule__Route__SpotsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2428:1: ( ( ruleFinalSpot ) )
            // InternalSchedule.g:2429:2: ( ruleFinalSpot )
            {
            // InternalSchedule.g:2429:2: ( ruleFinalSpot )
            // InternalSchedule.g:2430:3: ruleFinalSpot
            {
             before(grammarAccess.getRouteAccess().getSpotsFinalSpotParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFinalSpot();

            state._fsp--;

             after(grammarAccess.getRouteAccess().getSpotsFinalSpotParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Route__SpotsAssignment_2"


    // $ANTLR start "rule__StartSpot__StationAssignment_2"
    // InternalSchedule.g:2439:1: rule__StartSpot__StationAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__StartSpot__StationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2443:1: ( ( ( RULE_STRING ) ) )
            // InternalSchedule.g:2444:2: ( ( RULE_STRING ) )
            {
            // InternalSchedule.g:2444:2: ( ( RULE_STRING ) )
            // InternalSchedule.g:2445:3: ( RULE_STRING )
            {
             before(grammarAccess.getStartSpotAccess().getStationStationCrossReference_2_0()); 
            // InternalSchedule.g:2446:3: ( RULE_STRING )
            // InternalSchedule.g:2447:4: RULE_STRING
            {
             before(grammarAccess.getStartSpotAccess().getStationStationSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStartSpotAccess().getStationStationSTRINGTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getStartSpotAccess().getStationStationCrossReference_2_0()); 

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


    // $ANTLR start "rule__StartSpot__PlatformAssignment_5"
    // InternalSchedule.g:2458:1: rule__StartSpot__PlatformAssignment_5 : ( RULE_STRING ) ;
    public final void rule__StartSpot__PlatformAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2462:1: ( ( RULE_STRING ) )
            // InternalSchedule.g:2463:2: ( RULE_STRING )
            {
            // InternalSchedule.g:2463:2: ( RULE_STRING )
            // InternalSchedule.g:2464:3: RULE_STRING
            {
             before(grammarAccess.getStartSpotAccess().getPlatformSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStartSpotAccess().getPlatformSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__StartSpot__PlatformAssignment_5"


    // $ANTLR start "rule__StartSpot__LegAssignment_6_2"
    // InternalSchedule.g:2473:1: rule__StartSpot__LegAssignment_6_2 : ( ( RULE_ID ) ) ;
    public final void rule__StartSpot__LegAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2477:1: ( ( ( RULE_ID ) ) )
            // InternalSchedule.g:2478:2: ( ( RULE_ID ) )
            {
            // InternalSchedule.g:2478:2: ( ( RULE_ID ) )
            // InternalSchedule.g:2479:3: ( RULE_ID )
            {
             before(grammarAccess.getStartSpotAccess().getLegLegCrossReference_6_2_0()); 
            // InternalSchedule.g:2480:3: ( RULE_ID )
            // InternalSchedule.g:2481:4: RULE_ID
            {
             before(grammarAccess.getStartSpotAccess().getLegLegIDTerminalRuleCall_6_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStartSpotAccess().getLegLegIDTerminalRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getStartSpotAccess().getLegLegCrossReference_6_2_0()); 

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
    // $ANTLR end "rule__StartSpot__LegAssignment_6_2"


    // $ANTLR start "rule__MiddleSpot__StationAssignment_2"
    // InternalSchedule.g:2492:1: rule__MiddleSpot__StationAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__MiddleSpot__StationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2496:1: ( ( ( RULE_STRING ) ) )
            // InternalSchedule.g:2497:2: ( ( RULE_STRING ) )
            {
            // InternalSchedule.g:2497:2: ( ( RULE_STRING ) )
            // InternalSchedule.g:2498:3: ( RULE_STRING )
            {
             before(grammarAccess.getMiddleSpotAccess().getStationStationCrossReference_2_0()); 
            // InternalSchedule.g:2499:3: ( RULE_STRING )
            // InternalSchedule.g:2500:4: RULE_STRING
            {
             before(grammarAccess.getMiddleSpotAccess().getStationStationSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getStationStationSTRINGTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMiddleSpotAccess().getStationStationCrossReference_2_0()); 

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


    // $ANTLR start "rule__MiddleSpot__PlatformAssignment_5"
    // InternalSchedule.g:2511:1: rule__MiddleSpot__PlatformAssignment_5 : ( RULE_STRING ) ;
    public final void rule__MiddleSpot__PlatformAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2515:1: ( ( RULE_STRING ) )
            // InternalSchedule.g:2516:2: ( RULE_STRING )
            {
            // InternalSchedule.g:2516:2: ( RULE_STRING )
            // InternalSchedule.g:2517:3: RULE_STRING
            {
             before(grammarAccess.getMiddleSpotAccess().getPlatformSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getPlatformSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__MiddleSpot__PlatformAssignment_5"


    // $ANTLR start "rule__MiddleSpot__WaitingTimeAssignment_7"
    // InternalSchedule.g:2526:1: rule__MiddleSpot__WaitingTimeAssignment_7 : ( RULE_INT ) ;
    public final void rule__MiddleSpot__WaitingTimeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2530:1: ( ( RULE_INT ) )
            // InternalSchedule.g:2531:2: ( RULE_INT )
            {
            // InternalSchedule.g:2531:2: ( RULE_INT )
            // InternalSchedule.g:2532:3: RULE_INT
            {
             before(grammarAccess.getMiddleSpotAccess().getWaitingTimeINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getWaitingTimeINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__MiddleSpot__WaitingTimeAssignment_7"


    // $ANTLR start "rule__MiddleSpot__TurnStationAssignment_9_1"
    // InternalSchedule.g:2541:1: rule__MiddleSpot__TurnStationAssignment_9_1 : ( ( 'turn' ) ) ;
    public final void rule__MiddleSpot__TurnStationAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2545:1: ( ( ( 'turn' ) ) )
            // InternalSchedule.g:2546:2: ( ( 'turn' ) )
            {
            // InternalSchedule.g:2546:2: ( ( 'turn' ) )
            // InternalSchedule.g:2547:3: ( 'turn' )
            {
             before(grammarAccess.getMiddleSpotAccess().getTurnStationTurnKeyword_9_1_0()); 
            // InternalSchedule.g:2548:3: ( 'turn' )
            // InternalSchedule.g:2549:4: 'turn'
            {
             before(grammarAccess.getMiddleSpotAccess().getTurnStationTurnKeyword_9_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getTurnStationTurnKeyword_9_1_0()); 

            }

             after(grammarAccess.getMiddleSpotAccess().getTurnStationTurnKeyword_9_1_0()); 

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
    // $ANTLR end "rule__MiddleSpot__TurnStationAssignment_9_1"


    // $ANTLR start "rule__MiddleSpot__LegAssignment_10_2"
    // InternalSchedule.g:2560:1: rule__MiddleSpot__LegAssignment_10_2 : ( ( RULE_ID ) ) ;
    public final void rule__MiddleSpot__LegAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2564:1: ( ( ( RULE_ID ) ) )
            // InternalSchedule.g:2565:2: ( ( RULE_ID ) )
            {
            // InternalSchedule.g:2565:2: ( ( RULE_ID ) )
            // InternalSchedule.g:2566:3: ( RULE_ID )
            {
             before(grammarAccess.getMiddleSpotAccess().getLegLegCrossReference_10_2_0()); 
            // InternalSchedule.g:2567:3: ( RULE_ID )
            // InternalSchedule.g:2568:4: RULE_ID
            {
             before(grammarAccess.getMiddleSpotAccess().getLegLegIDTerminalRuleCall_10_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMiddleSpotAccess().getLegLegIDTerminalRuleCall_10_2_0_1()); 

            }

             after(grammarAccess.getMiddleSpotAccess().getLegLegCrossReference_10_2_0()); 

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
    // $ANTLR end "rule__MiddleSpot__LegAssignment_10_2"


    // $ANTLR start "rule__FinalSpot__StationAssignment_2"
    // InternalSchedule.g:2579:1: rule__FinalSpot__StationAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__FinalSpot__StationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2583:1: ( ( ( RULE_STRING ) ) )
            // InternalSchedule.g:2584:2: ( ( RULE_STRING ) )
            {
            // InternalSchedule.g:2584:2: ( ( RULE_STRING ) )
            // InternalSchedule.g:2585:3: ( RULE_STRING )
            {
             before(grammarAccess.getFinalSpotAccess().getStationStationCrossReference_2_0()); 
            // InternalSchedule.g:2586:3: ( RULE_STRING )
            // InternalSchedule.g:2587:4: RULE_STRING
            {
             before(grammarAccess.getFinalSpotAccess().getStationStationSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFinalSpotAccess().getStationStationSTRINGTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFinalSpotAccess().getStationStationCrossReference_2_0()); 

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


    // $ANTLR start "rule__FinalSpot__PlatformAssignment_5"
    // InternalSchedule.g:2598:1: rule__FinalSpot__PlatformAssignment_5 : ( RULE_STRING ) ;
    public final void rule__FinalSpot__PlatformAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2602:1: ( ( RULE_STRING ) )
            // InternalSchedule.g:2603:2: ( RULE_STRING )
            {
            // InternalSchedule.g:2603:2: ( RULE_STRING )
            // InternalSchedule.g:2604:3: RULE_STRING
            {
             before(grammarAccess.getFinalSpotAccess().getPlatformSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFinalSpotAccess().getPlatformSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__FinalSpot__PlatformAssignment_5"

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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000007F000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});

}