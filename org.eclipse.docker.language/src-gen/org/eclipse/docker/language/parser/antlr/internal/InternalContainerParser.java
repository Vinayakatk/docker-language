package org.eclipse.docker.language.parser.antlr.internal; 

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
import org.eclipse.docker.language.services.ContainerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalContainerParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Container-Section'", "'{'", "'}'", "'Image-Section'", "'image'", "'tag'", "'dockerFileLocation'", "'Force-rm'", "'noCache'", "'memory'", "'memswap'", "'cpusetcpus'", "'cpushares'", "'remove'", "'quiet'", "'pull'", "'false'", "'true'", "'container'", "'image-tag'", "'binds'", "'capabilityAdd'", "'capabilityDrop'", "'commands'", "'containerIDFile'", "'cpuPeriod'", "'cpusetCpus'", "'cpusetMems'", "'cpuShares'", "'devices'", "'dns'", "'dnsSearch'", "'domainName'", "'entrypoint'", "'env'", "'exposedPorts'", "'extraHosts'", "'labels'", "'links'", "'macAddress'", "'memorySwap'", "'disableNetwork'", "'networkMode'", "'portBindings'", "'privileged'", "'publishAllPorts'", "'readonlyRootfs'", "'pidMode'", "'workingDir'", "'user'", "'tty'", "'restartPolicy'", "'volumes'", "'-'", "'volumesFrom'", "'ulimits'", "':'", "'always'", "'onFailure'", "'none'", "'/'", "'TCP'", "'UDP'", "'rw'", "'ro'", "'ALL'", "'AUDIT_CONTROL'", "'AUDIT_WRITE'", "'BLOCK_SUSPEND'", "'CHOWN'", "'DAC_OVERRIDE'", "'DAC_READ_SEARCH'", "'FOWNER'", "'FSETID'", "'IPC_LOCK'", "'IPC_OWNER'", "'KILL'", "'LEASE'", "'LINUX_IMMUTABLE'", "'MAC_ADMIN'", "'MAC_OVERRIDE'", "'MKNOD'", "'NET_ADMIN'", "'NET_BIND_SERVICE'", "'NET_BROADCAST'", "'NET_RAW'", "'SETFCAP'", "'SETGID'", "'SETPCAP'", "'SETUID'", "'SYS_ADMIN'", "'SYS_BOOT'", "'SYS_CHROOT'", "'SYSLOG'", "'SYS_MODULE'", "'SYS_NICE'", "'SYS_PACCT'", "'SYS_PTRACE'", "'SYS_RAWIO'", "'SYS_RESOURCE'", "'SYS_TIME'", "'SYS_TTY_CONFIG'", "'WAKE_ALARM'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalContainerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalContainerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalContainerParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g"; }



     	private ContainerGrammarAccess grammarAccess;
     	
        public InternalContainerParser(TokenStream input, ContainerGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Docker";	
       	}
       	
       	@Override
       	protected ContainerGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDocker"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:68:1: entryRuleDocker returns [EObject current=null] : iv_ruleDocker= ruleDocker EOF ;
    public final EObject entryRuleDocker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocker = null;


        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:69:2: (iv_ruleDocker= ruleDocker EOF )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:70:2: iv_ruleDocker= ruleDocker EOF
            {
             newCompositeNode(grammarAccess.getDockerRule()); 
            pushFollow(FOLLOW_ruleDocker_in_entryRuleDocker75);
            iv_ruleDocker=ruleDocker();

            state._fsp--;

             current =iv_ruleDocker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocker85); 

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
    // $ANTLR end "entryRuleDocker"


    // $ANTLR start "ruleDocker"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:77:1: ruleDocker returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_containerRegion_1_0= ruleContainerSection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imageRegion_2_0= ruleImageSection ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleDocker() throws RecognitionException {
        EObject current = null;

        EObject lv_containerRegion_1_0 = null;

        EObject lv_imageRegion_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:80:28: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_containerRegion_1_0= ruleContainerSection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imageRegion_2_0= ruleImageSection ) ) ) ) ) )* ) ) ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:81:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_containerRegion_1_0= ruleContainerSection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imageRegion_2_0= ruleImageSection ) ) ) ) ) )* ) ) )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:81:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_containerRegion_1_0= ruleContainerSection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imageRegion_2_0= ruleImageSection ) ) ) ) ) )* ) ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:83:1: ( ( ( ({...}? => ( ({...}? => ( (lv_containerRegion_1_0= ruleContainerSection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imageRegion_2_0= ruleImageSection ) ) ) ) ) )* ) )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:83:1: ( ( ( ({...}? => ( ({...}? => ( (lv_containerRegion_1_0= ruleContainerSection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imageRegion_2_0= ruleImageSection ) ) ) ) ) )* ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:84:2: ( ( ({...}? => ( ({...}? => ( (lv_containerRegion_1_0= ruleContainerSection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imageRegion_2_0= ruleImageSection ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getDockerAccess().getUnorderedGroup());
            	
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:87:2: ( ( ({...}? => ( ({...}? => ( (lv_containerRegion_1_0= ruleContainerSection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imageRegion_2_0= ruleImageSection ) ) ) ) ) )* )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:88:3: ( ({...}? => ( ({...}? => ( (lv_containerRegion_1_0= ruleContainerSection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imageRegion_2_0= ruleImageSection ) ) ) ) ) )*
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:88:3: ( ({...}? => ( ({...}? => ( (lv_containerRegion_1_0= ruleContainerSection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imageRegion_2_0= ruleImageSection ) ) ) ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( LA1_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getDockerAccess().getUnorderedGroup(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDockerAccess().getUnorderedGroup(), 1) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:90:4: ({...}? => ( ({...}? => ( (lv_containerRegion_1_0= ruleContainerSection ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:90:4: ({...}? => ( ({...}? => ( (lv_containerRegion_1_0= ruleContainerSection ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:91:5: {...}? => ( ({...}? => ( (lv_containerRegion_1_0= ruleContainerSection ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDocker", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:91:101: ( ({...}? => ( (lv_containerRegion_1_0= ruleContainerSection ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:92:6: ({...}? => ( (lv_containerRegion_1_0= ruleContainerSection ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDockerAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:95:6: ({...}? => ( (lv_containerRegion_1_0= ruleContainerSection ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:95:7: {...}? => ( (lv_containerRegion_1_0= ruleContainerSection ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDocker", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:95:16: ( (lv_containerRegion_1_0= ruleContainerSection ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:96:1: (lv_containerRegion_1_0= ruleContainerSection )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:96:1: (lv_containerRegion_1_0= ruleContainerSection )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:97:3: lv_containerRegion_1_0= ruleContainerSection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDockerAccess().getContainerRegionContainerSectionParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContainerSection_in_ruleDocker175);
            	    lv_containerRegion_1_0=ruleContainerSection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDockerRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"containerRegion",
            	            		lv_containerRegion_1_0, 
            	            		"ContainerSection");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDockerAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:120:4: ({...}? => ( ({...}? => ( (lv_imageRegion_2_0= ruleImageSection ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:120:4: ({...}? => ( ({...}? => ( (lv_imageRegion_2_0= ruleImageSection ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:121:5: {...}? => ( ({...}? => ( (lv_imageRegion_2_0= ruleImageSection ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDockerAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDocker", "getUnorderedGroupHelper().canSelect(grammarAccess.getDockerAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:121:101: ( ({...}? => ( (lv_imageRegion_2_0= ruleImageSection ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:122:6: ({...}? => ( (lv_imageRegion_2_0= ruleImageSection ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDockerAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:125:6: ({...}? => ( (lv_imageRegion_2_0= ruleImageSection ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:125:7: {...}? => ( (lv_imageRegion_2_0= ruleImageSection ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDocker", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:125:16: ( (lv_imageRegion_2_0= ruleImageSection ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:126:1: (lv_imageRegion_2_0= ruleImageSection )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:126:1: (lv_imageRegion_2_0= ruleImageSection )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:127:3: lv_imageRegion_2_0= ruleImageSection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDockerAccess().getImageRegionImageSectionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImageSection_in_ruleDocker250);
            	    lv_imageRegion_2_0=ruleImageSection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDockerRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"imageRegion",
            	            		lv_imageRegion_2_0, 
            	            		"ImageSection");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDockerAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getDockerAccess().getUnorderedGroup());
            	

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
    // $ANTLR end "ruleDocker"


    // $ANTLR start "entryRuleContainerSection"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:165:1: entryRuleContainerSection returns [EObject current=null] : iv_ruleContainerSection= ruleContainerSection EOF ;
    public final EObject entryRuleContainerSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerSection = null;


        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:166:2: (iv_ruleContainerSection= ruleContainerSection EOF )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:167:2: iv_ruleContainerSection= ruleContainerSection EOF
            {
             newCompositeNode(grammarAccess.getContainerSectionRule()); 
            pushFollow(FOLLOW_ruleContainerSection_in_entryRuleContainerSection325);
            iv_ruleContainerSection=ruleContainerSection();

            state._fsp--;

             current =iv_ruleContainerSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerSection335); 

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
    // $ANTLR end "entryRuleContainerSection"


    // $ANTLR start "ruleContainerSection"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:174:1: ruleContainerSection returns [EObject current=null] : ( () ( (lv_name_1_0= 'Container-Section' ) ) otherlv_2= '{' ( (lv_containers_3_0= ruleContainer ) )* otherlv_4= '}' ) ;
    public final EObject ruleContainerSection() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_containers_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:177:28: ( ( () ( (lv_name_1_0= 'Container-Section' ) ) otherlv_2= '{' ( (lv_containers_3_0= ruleContainer ) )* otherlv_4= '}' ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:178:1: ( () ( (lv_name_1_0= 'Container-Section' ) ) otherlv_2= '{' ( (lv_containers_3_0= ruleContainer ) )* otherlv_4= '}' )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:178:1: ( () ( (lv_name_1_0= 'Container-Section' ) ) otherlv_2= '{' ( (lv_containers_3_0= ruleContainer ) )* otherlv_4= '}' )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:178:2: () ( (lv_name_1_0= 'Container-Section' ) ) otherlv_2= '{' ( (lv_containers_3_0= ruleContainer ) )* otherlv_4= '}'
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:178:2: ()
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:179:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getContainerSectionAccess().getContainerSectionAction_0(),
                        current);
                

            }

            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:184:2: ( (lv_name_1_0= 'Container-Section' ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:185:1: (lv_name_1_0= 'Container-Section' )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:185:1: (lv_name_1_0= 'Container-Section' )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:186:3: lv_name_1_0= 'Container-Section'
            {
            lv_name_1_0=(Token)match(input,11,FOLLOW_11_in_ruleContainerSection387); 

                    newLeafNode(lv_name_1_0, grammarAccess.getContainerSectionAccess().getNameContainerSectionKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerSectionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "Container-Section");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleContainerSection412); 

                	newLeafNode(otherlv_2, grammarAccess.getContainerSectionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:203:1: ( (lv_containers_3_0= ruleContainer ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==29) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:204:1: (lv_containers_3_0= ruleContainer )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:204:1: (lv_containers_3_0= ruleContainer )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:205:3: lv_containers_3_0= ruleContainer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerSectionAccess().getContainersContainerParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContainer_in_ruleContainerSection433);
            	    lv_containers_3_0=ruleContainer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"containers",
            	            		lv_containers_3_0, 
            	            		"Container");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleContainerSection446); 

                	newLeafNode(otherlv_4, grammarAccess.getContainerSectionAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleContainerSection"


    // $ANTLR start "entryRuleImageSection"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:233:1: entryRuleImageSection returns [EObject current=null] : iv_ruleImageSection= ruleImageSection EOF ;
    public final EObject entryRuleImageSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageSection = null;


        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:234:2: (iv_ruleImageSection= ruleImageSection EOF )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:235:2: iv_ruleImageSection= ruleImageSection EOF
            {
             newCompositeNode(grammarAccess.getImageSectionRule()); 
            pushFollow(FOLLOW_ruleImageSection_in_entryRuleImageSection482);
            iv_ruleImageSection=ruleImageSection();

            state._fsp--;

             current =iv_ruleImageSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageSection492); 

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
    // $ANTLR end "entryRuleImageSection"


    // $ANTLR start "ruleImageSection"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:242:1: ruleImageSection returns [EObject current=null] : ( () ( (lv_name_1_0= 'Image-Section' ) ) otherlv_2= '{' ( (lv_images_3_0= ruleImage ) )* otherlv_4= '}' ) ;
    public final EObject ruleImageSection() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_images_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:245:28: ( ( () ( (lv_name_1_0= 'Image-Section' ) ) otherlv_2= '{' ( (lv_images_3_0= ruleImage ) )* otherlv_4= '}' ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:246:1: ( () ( (lv_name_1_0= 'Image-Section' ) ) otherlv_2= '{' ( (lv_images_3_0= ruleImage ) )* otherlv_4= '}' )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:246:1: ( () ( (lv_name_1_0= 'Image-Section' ) ) otherlv_2= '{' ( (lv_images_3_0= ruleImage ) )* otherlv_4= '}' )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:246:2: () ( (lv_name_1_0= 'Image-Section' ) ) otherlv_2= '{' ( (lv_images_3_0= ruleImage ) )* otherlv_4= '}'
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:246:2: ()
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:247:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImageSectionAccess().getImageSectionAction_0(),
                        current);
                

            }

            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:252:2: ( (lv_name_1_0= 'Image-Section' ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:253:1: (lv_name_1_0= 'Image-Section' )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:253:1: (lv_name_1_0= 'Image-Section' )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:254:3: lv_name_1_0= 'Image-Section'
            {
            lv_name_1_0=(Token)match(input,14,FOLLOW_14_in_ruleImageSection544); 

                    newLeafNode(lv_name_1_0, grammarAccess.getImageSectionAccess().getNameImageSectionKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageSectionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "Image-Section");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleImageSection569); 

                	newLeafNode(otherlv_2, grammarAccess.getImageSectionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:271:1: ( (lv_images_3_0= ruleImage ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:272:1: (lv_images_3_0= ruleImage )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:272:1: (lv_images_3_0= ruleImage )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:273:3: lv_images_3_0= ruleImage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageSectionAccess().getImagesImageParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImage_in_ruleImageSection590);
            	    lv_images_3_0=ruleImage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"images",
            	            		lv_images_3_0, 
            	            		"Image");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleImageSection603); 

                	newLeafNode(otherlv_4, grammarAccess.getImageSectionAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleImageSection"


    // $ANTLR start "entryRuleImage"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:301:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:302:2: (iv_ruleImage= ruleImage EOF )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:303:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_ruleImage_in_entryRuleImage639);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImage649); 

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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:310:1: ruleImage returns [EObject current=null] : (otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Force-rm' ( (lv_forceRM_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) otherlv_26= '}' ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_tag_5_0=null;
        Token otherlv_6=null;
        Token lv_dockerFilelocation_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token lv_cpusetcpus_17_0=null;
        Token otherlv_18=null;
        Token lv_cpushares_19_0=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_forceRM_9_0 = null;

        AntlrDatatypeRuleToken lv_noCache_11_0 = null;

        AntlrDatatypeRuleToken lv_memory_13_0 = null;

        AntlrDatatypeRuleToken lv_memswap_15_0 = null;

        AntlrDatatypeRuleToken lv_remove_21_0 = null;

        AntlrDatatypeRuleToken lv_quiet_23_0 = null;

        AntlrDatatypeRuleToken lv_pull_25_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:313:28: ( (otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Force-rm' ( (lv_forceRM_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) otherlv_26= '}' ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:314:1: (otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Force-rm' ( (lv_forceRM_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) otherlv_26= '}' )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:314:1: (otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Force-rm' ( (lv_forceRM_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) otherlv_26= '}' )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:314:3: otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Force-rm' ( (lv_forceRM_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleImage686); 

                	newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
                
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:318:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:319:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:319:1: (lv_name_1_0= RULE_STRING )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:320:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImage703); 

            			newLeafNode(lv_name_1_0, grammarAccess.getImageAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleImage720); 

                	newLeafNode(otherlv_2, grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:340:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Force-rm' ( (lv_forceRM_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )* ) ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:342:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Force-rm' ( (lv_forceRM_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:342:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Force-rm' ( (lv_forceRM_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:343:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Force-rm' ( (lv_forceRM_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getImageAccess().getUnorderedGroup_3());
            	
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:346:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Force-rm' ( (lv_forceRM_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )* )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:347:3: ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Force-rm' ( (lv_forceRM_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )*
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:347:3: ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Force-rm' ( (lv_forceRM_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )*
            loop4:
            do {
                int alt4=12;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:349:4: ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:349:4: ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:350:5: {...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:350:102: ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:351:6: ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:354:6: ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:354:7: {...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:354:16: (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:354:18: otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleImage778); 

            	        	newLeafNode(otherlv_4, grammarAccess.getImageAccess().getTagKeyword_3_0_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:358:1: ( (lv_tag_5_0= RULE_STRING ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:359:1: (lv_tag_5_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:359:1: (lv_tag_5_0= RULE_STRING )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:360:3: lv_tag_5_0= RULE_STRING
            	    {
            	    lv_tag_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImage795); 

            	    			newLeafNode(lv_tag_5_0, grammarAccess.getImageAccess().getTagSTRINGTerminalRuleCall_3_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getImageRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"tag",
            	            		lv_tag_5_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:383:4: ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:383:4: ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:384:5: {...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:384:102: ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:385:6: ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:388:6: ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:388:7: {...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:388:16: (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:388:18: otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleImage868); 

            	        	newLeafNode(otherlv_6, grammarAccess.getImageAccess().getDockerFileLocationKeyword_3_1_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:392:1: ( (lv_dockerFilelocation_7_0= RULE_STRING ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:393:1: (lv_dockerFilelocation_7_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:393:1: (lv_dockerFilelocation_7_0= RULE_STRING )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:394:3: lv_dockerFilelocation_7_0= RULE_STRING
            	    {
            	    lv_dockerFilelocation_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImage885); 

            	    			newLeafNode(lv_dockerFilelocation_7_0, grammarAccess.getImageAccess().getDockerFilelocationSTRINGTerminalRuleCall_3_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getImageRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"dockerFilelocation",
            	            		lv_dockerFilelocation_7_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:417:4: ({...}? => ( ({...}? => (otherlv_8= 'Force-rm' ( (lv_forceRM_9_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:417:4: ({...}? => ( ({...}? => (otherlv_8= 'Force-rm' ( (lv_forceRM_9_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:418:5: {...}? => ( ({...}? => (otherlv_8= 'Force-rm' ( (lv_forceRM_9_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:418:102: ( ({...}? => (otherlv_8= 'Force-rm' ( (lv_forceRM_9_0= ruleEBoolean ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:419:6: ({...}? => (otherlv_8= 'Force-rm' ( (lv_forceRM_9_0= ruleEBoolean ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:422:6: ({...}? => (otherlv_8= 'Force-rm' ( (lv_forceRM_9_0= ruleEBoolean ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:422:7: {...}? => (otherlv_8= 'Force-rm' ( (lv_forceRM_9_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:422:16: (otherlv_8= 'Force-rm' ( (lv_forceRM_9_0= ruleEBoolean ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:422:18: otherlv_8= 'Force-rm' ( (lv_forceRM_9_0= ruleEBoolean ) )
            	    {
            	    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleImage958); 

            	        	newLeafNode(otherlv_8, grammarAccess.getImageAccess().getForceRmKeyword_3_2_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:426:1: ( (lv_forceRM_9_0= ruleEBoolean ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:427:1: (lv_forceRM_9_0= ruleEBoolean )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:427:1: (lv_forceRM_9_0= ruleEBoolean )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:428:3: lv_forceRM_9_0= ruleEBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageAccess().getForceRMEBooleanParserRuleCall_3_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleImage979);
            	    lv_forceRM_9_0=ruleEBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"forceRM",
            	            		lv_forceRM_9_0, 
            	            		"EBoolean");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:451:4: ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:451:4: ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:452:5: {...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:452:102: ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:453:6: ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:456:6: ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:456:7: {...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:456:16: (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:456:18: otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) )
            	    {
            	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleImage1047); 

            	        	newLeafNode(otherlv_10, grammarAccess.getImageAccess().getNoCacheKeyword_3_3_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:460:1: ( (lv_noCache_11_0= ruleEBoolean ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:461:1: (lv_noCache_11_0= ruleEBoolean )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:461:1: (lv_noCache_11_0= ruleEBoolean )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:462:3: lv_noCache_11_0= ruleEBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageAccess().getNoCacheEBooleanParserRuleCall_3_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleImage1068);
            	    lv_noCache_11_0=ruleEBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"noCache",
            	            		lv_noCache_11_0, 
            	            		"EBoolean");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:485:4: ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:485:4: ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:486:5: {...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:486:102: ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:487:6: ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:490:6: ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:490:7: {...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:490:16: (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:490:18: otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) )
            	    {
            	    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleImage1136); 

            	        	newLeafNode(otherlv_12, grammarAccess.getImageAccess().getMemoryKeyword_3_4_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:494:1: ( (lv_memory_13_0= ruleElong ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:495:1: (lv_memory_13_0= ruleElong )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:495:1: (lv_memory_13_0= ruleElong )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:496:3: lv_memory_13_0= ruleElong
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageAccess().getMemoryElongParserRuleCall_3_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElong_in_ruleImage1157);
            	    lv_memory_13_0=ruleElong();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"memory",
            	            		lv_memory_13_0, 
            	            		"Elong");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:519:4: ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:519:4: ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:520:5: {...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:520:102: ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:521:6: ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:524:6: ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:524:7: {...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:524:16: (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:524:18: otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) )
            	    {
            	    otherlv_14=(Token)match(input,21,FOLLOW_21_in_ruleImage1225); 

            	        	newLeafNode(otherlv_14, grammarAccess.getImageAccess().getMemswapKeyword_3_5_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:528:1: ( (lv_memswap_15_0= ruleElong ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:529:1: (lv_memswap_15_0= ruleElong )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:529:1: (lv_memswap_15_0= ruleElong )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:530:3: lv_memswap_15_0= ruleElong
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageAccess().getMemswapElongParserRuleCall_3_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElong_in_ruleImage1246);
            	    lv_memswap_15_0=ruleElong();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"memswap",
            	            		lv_memswap_15_0, 
            	            		"Elong");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:553:4: ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:553:4: ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:554:5: {...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:554:102: ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:555:6: ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:558:6: ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:558:7: {...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:558:16: (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:558:18: otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) )
            	    {
            	    otherlv_16=(Token)match(input,22,FOLLOW_22_in_ruleImage1314); 

            	        	newLeafNode(otherlv_16, grammarAccess.getImageAccess().getCpusetcpusKeyword_3_6_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:562:1: ( (lv_cpusetcpus_17_0= RULE_STRING ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:563:1: (lv_cpusetcpus_17_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:563:1: (lv_cpusetcpus_17_0= RULE_STRING )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:564:3: lv_cpusetcpus_17_0= RULE_STRING
            	    {
            	    lv_cpusetcpus_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImage1331); 

            	    			newLeafNode(lv_cpusetcpus_17_0, grammarAccess.getImageAccess().getCpusetcpusSTRINGTerminalRuleCall_3_6_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getImageRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"cpusetcpus",
            	            		lv_cpusetcpus_17_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:587:4: ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:587:4: ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:588:5: {...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:588:102: ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:589:6: ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 7);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:592:6: ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:592:7: {...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:592:16: (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:592:18: otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) )
            	    {
            	    otherlv_18=(Token)match(input,23,FOLLOW_23_in_ruleImage1404); 

            	        	newLeafNode(otherlv_18, grammarAccess.getImageAccess().getCpusharesKeyword_3_7_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:596:1: ( (lv_cpushares_19_0= RULE_STRING ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:597:1: (lv_cpushares_19_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:597:1: (lv_cpushares_19_0= RULE_STRING )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:598:3: lv_cpushares_19_0= RULE_STRING
            	    {
            	    lv_cpushares_19_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImage1421); 

            	    			newLeafNode(lv_cpushares_19_0, grammarAccess.getImageAccess().getCpusharesSTRINGTerminalRuleCall_3_7_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getImageRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"cpushares",
            	            		lv_cpushares_19_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:621:4: ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:621:4: ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:622:5: {...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:622:102: ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:623:6: ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 8);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:626:6: ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:626:7: {...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:626:16: (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:626:18: otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) )
            	    {
            	    otherlv_20=(Token)match(input,24,FOLLOW_24_in_ruleImage1494); 

            	        	newLeafNode(otherlv_20, grammarAccess.getImageAccess().getRemoveKeyword_3_8_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:630:1: ( (lv_remove_21_0= ruleEBoolean ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:631:1: (lv_remove_21_0= ruleEBoolean )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:631:1: (lv_remove_21_0= ruleEBoolean )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:632:3: lv_remove_21_0= ruleEBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageAccess().getRemoveEBooleanParserRuleCall_3_8_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleImage1515);
            	    lv_remove_21_0=ruleEBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"remove",
            	            		lv_remove_21_0, 
            	            		"EBoolean");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:655:4: ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:655:4: ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:656:5: {...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:656:102: ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:657:6: ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 9);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:660:6: ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:660:7: {...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:660:16: (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:660:18: otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) )
            	    {
            	    otherlv_22=(Token)match(input,25,FOLLOW_25_in_ruleImage1583); 

            	        	newLeafNode(otherlv_22, grammarAccess.getImageAccess().getQuietKeyword_3_9_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:664:1: ( (lv_quiet_23_0= ruleEBoolean ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:665:1: (lv_quiet_23_0= ruleEBoolean )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:665:1: (lv_quiet_23_0= ruleEBoolean )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:666:3: lv_quiet_23_0= ruleEBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageAccess().getQuietEBooleanParserRuleCall_3_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleImage1604);
            	    lv_quiet_23_0=ruleEBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"quiet",
            	            		lv_quiet_23_0, 
            	            		"EBoolean");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:689:4: ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:689:4: ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:690:5: {...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:690:103: ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:691:6: ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 10);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:694:6: ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:694:7: {...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:694:16: (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:694:18: otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) )
            	    {
            	    otherlv_24=(Token)match(input,26,FOLLOW_26_in_ruleImage1672); 

            	        	newLeafNode(otherlv_24, grammarAccess.getImageAccess().getPullKeyword_3_10_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:698:1: ( (lv_pull_25_0= ruleEBoolean ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:699:1: (lv_pull_25_0= ruleEBoolean )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:699:1: (lv_pull_25_0= ruleEBoolean )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:700:3: lv_pull_25_0= ruleEBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageAccess().getPullEBooleanParserRuleCall_3_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleImage1693);
            	    lv_pull_25_0=ruleEBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"pull",
            	            		lv_pull_25_0, 
            	            		"EBoolean");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getImageAccess().getUnorderedGroup_3());
            	

            }

            otherlv_26=(Token)match(input,13,FOLLOW_13_in_ruleImage1746); 

                	newLeafNode(otherlv_26, grammarAccess.getImageAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleEBoolean"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:744:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:745:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:746:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_ruleEBoolean_in_entryRuleEBoolean1785);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolean1796); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:753:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'false' | kw= 'true' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:756:28: ( (kw= 'false' | kw= 'true' ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:757:1: (kw= 'false' | kw= 'true' )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:757:1: (kw= 'false' | kw= 'true' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            else if ( (LA5_0==28) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:758:2: kw= 'false'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleEBoolean1834); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:765:2: kw= 'true'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleEBoolean1853); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_1()); 
                        

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleElong"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:778:1: entryRuleElong returns [String current=null] : iv_ruleElong= ruleElong EOF ;
    public final String entryRuleElong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElong = null;


        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:779:2: (iv_ruleElong= ruleElong EOF )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:780:2: iv_ruleElong= ruleElong EOF
            {
             newCompositeNode(grammarAccess.getElongRule()); 
            pushFollow(FOLLOW_ruleElong_in_entryRuleElong1894);
            iv_ruleElong=ruleElong();

            state._fsp--;

             current =iv_ruleElong.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElong1905); 

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
    // $ANTLR end "entryRuleElong"


    // $ANTLR start "ruleElong"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:787:1: ruleElong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleElong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:790:28: (this_INT_0= RULE_INT )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:791:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleElong1944); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getElongAccess().getINTTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleElong"


    // $ANTLR start "entryRuleContainer"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:806:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:807:2: (iv_ruleContainer= ruleContainer EOF )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:808:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_ruleContainer_in_entryRuleContainer1988);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainer1998); 

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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:815:1: ruleContainer returns [EObject current=null] : (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'image-tag' ( (lv_image_4_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+ otherlv_107= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_108= 'ulimits' otherlv_109= '{' ( (lv_ulimits_110_0= ruleUlimit ) )+ otherlv_111= '}' ) ) ) ) )* ) ) ) otherlv_112= '}' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_image_4_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_commands_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_containerIDFile_23_0=null;
        Token otherlv_24=null;
        Token lv_cpuPeriod_25_0=null;
        Token otherlv_26=null;
        Token lv_cpusetCpus_27_0=null;
        Token otherlv_28=null;
        Token lv_cpusetMems_29_0=null;
        Token otherlv_30=null;
        Token lv_cpuShares_31_0=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token lv_dns_37_0=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token lv_dnsSearch_41_0=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token lv_domainName_44_0=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token lv_entrypoint_47_0=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token lv_env_51_0=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token otherlv_56=null;
        Token otherlv_57=null;
        Token otherlv_58=null;
        Token lv_extraHosts_59_0=null;
        Token otherlv_60=null;
        Token otherlv_61=null;
        Token otherlv_62=null;
        Token otherlv_64=null;
        Token otherlv_65=null;
        Token otherlv_66=null;
        Token otherlv_68=null;
        Token otherlv_69=null;
        Token lv_macAddress_70_0=null;
        Token otherlv_71=null;
        Token otherlv_73=null;
        Token otherlv_75=null;
        Token otherlv_77=null;
        Token lv_networkMode_78_0=null;
        Token otherlv_79=null;
        Token otherlv_80=null;
        Token otherlv_82=null;
        Token otherlv_83=null;
        Token otherlv_85=null;
        Token otherlv_87=null;
        Token otherlv_89=null;
        Token lv_pidMode_90_0=null;
        Token otherlv_91=null;
        Token lv_workingDir_92_0=null;
        Token otherlv_93=null;
        Token lv_user_94_0=null;
        Token otherlv_95=null;
        Token otherlv_97=null;
        Token otherlv_99=null;
        Token otherlv_100=null;
        Token otherlv_101=null;
        Token otherlv_103=null;
        Token otherlv_104=null;
        Token otherlv_105=null;
        Token otherlv_107=null;
        Token otherlv_108=null;
        Token otherlv_109=null;
        Token otherlv_111=null;
        Token otherlv_112=null;
        EObject lv_binds_8_0 = null;

        Enumerator lv_capabilityAdd_12_0 = null;

        Enumerator lv_capabilityDrop_16_0 = null;

        EObject lv_devices_34_0 = null;

        EObject lv_exposedPorts_55_0 = null;

        EObject lv_labels_63_0 = null;

        EObject lv_links_67_0 = null;

        AntlrDatatypeRuleToken lv_memory_72_0 = null;

        AntlrDatatypeRuleToken lv_memorySwap_74_0 = null;

        AntlrDatatypeRuleToken lv_disableNetwork_76_0 = null;

        EObject lv_portBindings_81_0 = null;

        AntlrDatatypeRuleToken lv_privileged_84_0 = null;

        AntlrDatatypeRuleToken lv_publishAllPorts_86_0 = null;

        AntlrDatatypeRuleToken lv_readonlyRootfs_88_0 = null;

        AntlrDatatypeRuleToken lv_tty_96_0 = null;

        EObject lv_restartPolicy_98_0 = null;

        EObject lv_volumes_102_0 = null;

        EObject lv_volumesFrom_106_0 = null;

        EObject lv_ulimits_110_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:818:28: ( (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'image-tag' ( (lv_image_4_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+ otherlv_107= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_108= 'ulimits' otherlv_109= '{' ( (lv_ulimits_110_0= ruleUlimit ) )+ otherlv_111= '}' ) ) ) ) )* ) ) ) otherlv_112= '}' ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:819:1: (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'image-tag' ( (lv_image_4_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+ otherlv_107= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_108= 'ulimits' otherlv_109= '{' ( (lv_ulimits_110_0= ruleUlimit ) )+ otherlv_111= '}' ) ) ) ) )* ) ) ) otherlv_112= '}' )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:819:1: (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'image-tag' ( (lv_image_4_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+ otherlv_107= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_108= 'ulimits' otherlv_109= '{' ( (lv_ulimits_110_0= ruleUlimit ) )+ otherlv_111= '}' ) ) ) ) )* ) ) ) otherlv_112= '}' )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:819:3: otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'image-tag' ( (lv_image_4_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+ otherlv_107= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_108= 'ulimits' otherlv_109= '{' ( (lv_ulimits_110_0= ruleUlimit ) )+ otherlv_111= '}' ) ) ) ) )* ) ) ) otherlv_112= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleContainer2035); 

                	newLeafNode(otherlv_0, grammarAccess.getContainerAccess().getContainerKeyword_0());
                
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:823:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:824:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:824:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:825:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContainer2052); 

            			newLeafNode(lv_name_1_0, grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleContainer2069); 

                	newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleContainer2081); 

                	newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getImageTagKeyword_3());
                
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:849:1: ( (lv_image_4_0= RULE_STRING ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:850:1: (lv_image_4_0= RULE_STRING )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:850:1: (lv_image_4_0= RULE_STRING )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:851:3: lv_image_4_0= RULE_STRING
            {
            lv_image_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContainer2098); 

            			newLeafNode(lv_image_4_0, grammarAccess.getContainerAccess().getImageSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"image",
                    		lv_image_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:867:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+ otherlv_107= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_108= 'ulimits' otherlv_109= '{' ( (lv_ulimits_110_0= ruleUlimit ) )+ otherlv_111= '}' ) ) ) ) )* ) ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:869:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+ otherlv_107= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_108= 'ulimits' otherlv_109= '{' ( (lv_ulimits_110_0= ruleUlimit ) )+ otherlv_111= '}' ) ) ) ) )* ) )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:869:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+ otherlv_107= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_108= 'ulimits' otherlv_109= '{' ( (lv_ulimits_110_0= ruleUlimit ) )+ otherlv_111= '}' ) ) ) ) )* ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:870:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+ otherlv_107= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_108= 'ulimits' otherlv_109= '{' ( (lv_ulimits_110_0= ruleUlimit ) )+ otherlv_111= '}' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:873:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+ otherlv_107= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_108= 'ulimits' otherlv_109= '{' ( (lv_ulimits_110_0= ruleUlimit ) )+ otherlv_111= '}' ) ) ) ) )* )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:874:3: ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+ otherlv_107= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_108= 'ulimits' otherlv_109= '{' ( (lv_ulimits_110_0= ruleUlimit ) )+ otherlv_111= '}' ) ) ) ) )*
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:874:3: ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+ otherlv_107= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_108= 'ulimits' otherlv_109= '{' ( (lv_ulimits_110_0= ruleUlimit ) )+ otherlv_111= '}' ) ) ) ) )*
            loop23:
            do {
                int alt23=37;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:876:4: ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:876:4: ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:877:5: {...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:877:106: ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:878:6: ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 0);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:881:6: ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:881:7: {...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:881:16: (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:881:18: otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}'
            	    {
            	    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleContainer2161); 

            	        	newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getBindsKeyword_5_0_0());
            	        
            	    otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleContainer2173); 

            	        	newLeafNode(otherlv_7, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_0_1());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:889:1: ( (lv_binds_8_0= ruleBind ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==64) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:890:1: (lv_binds_8_0= ruleBind )
            	    	    {
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:890:1: (lv_binds_8_0= ruleBind )
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:891:3: lv_binds_8_0= ruleBind
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContainerAccess().getBindsBindParserRuleCall_5_0_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleBind_in_ruleContainer2194);
            	    	    lv_binds_8_0=ruleBind();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"binds",
            	    	            		lv_binds_8_0, 
            	    	            		"Bind");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);

            	    otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleContainer2207); 

            	        	newLeafNode(otherlv_9, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:918:4: ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:918:4: ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:919:5: {...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:919:106: ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:920:6: ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 1);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:923:6: ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:923:7: {...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:923:16: (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:923:18: otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}'
            	    {
            	    otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleContainer2275); 

            	        	newLeafNode(otherlv_10, grammarAccess.getContainerAccess().getCapabilityAddKeyword_5_1_0());
            	        
            	    otherlv_11=(Token)match(input,12,FOLLOW_12_in_ruleContainer2287); 

            	        	newLeafNode(otherlv_11, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_1_1());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:931:1: ( (lv_capabilityAdd_12_0= ruleCapability ) )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( ((LA7_0>=76 && LA7_0<=113)) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:932:1: (lv_capabilityAdd_12_0= ruleCapability )
            	    	    {
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:932:1: (lv_capabilityAdd_12_0= ruleCapability )
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:933:3: lv_capabilityAdd_12_0= ruleCapability
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContainerAccess().getCapabilityAddCapabilityEnumRuleCall_5_1_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleCapability_in_ruleContainer2308);
            	    	    lv_capabilityAdd_12_0=ruleCapability();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"capabilityAdd",
            	    	            		lv_capabilityAdd_12_0, 
            	    	            		"Capability");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt7 >= 1 ) break loop7;
            	                EarlyExitException eee =
            	                    new EarlyExitException(7, input);
            	                throw eee;
            	        }
            	        cnt7++;
            	    } while (true);

            	    otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleContainer2321); 

            	        	newLeafNode(otherlv_13, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:960:4: ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:960:4: ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:961:5: {...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:961:106: ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:962:6: ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 2);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:965:6: ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:965:7: {...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:965:16: (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:965:18: otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}'
            	    {
            	    otherlv_14=(Token)match(input,33,FOLLOW_33_in_ruleContainer2389); 

            	        	newLeafNode(otherlv_14, grammarAccess.getContainerAccess().getCapabilityDropKeyword_5_2_0());
            	        
            	    otherlv_15=(Token)match(input,12,FOLLOW_12_in_ruleContainer2401); 

            	        	newLeafNode(otherlv_15, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_2_1());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:973:1: ( (lv_capabilityDrop_16_0= ruleCapability ) )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( ((LA8_0>=76 && LA8_0<=113)) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:974:1: (lv_capabilityDrop_16_0= ruleCapability )
            	    	    {
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:974:1: (lv_capabilityDrop_16_0= ruleCapability )
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:975:3: lv_capabilityDrop_16_0= ruleCapability
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContainerAccess().getCapabilityDropCapabilityEnumRuleCall_5_2_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleCapability_in_ruleContainer2422);
            	    	    lv_capabilityDrop_16_0=ruleCapability();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"capabilityDrop",
            	    	            		lv_capabilityDrop_16_0, 
            	    	            		"Capability");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt8 >= 1 ) break loop8;
            	                EarlyExitException eee =
            	                    new EarlyExitException(8, input);
            	                throw eee;
            	        }
            	        cnt8++;
            	    } while (true);

            	    otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleContainer2435); 

            	        	newLeafNode(otherlv_17, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1002:4: ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1002:4: ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1003:5: {...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1003:106: ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1004:6: ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 3);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1007:6: ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1007:7: {...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1007:16: (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1007:18: otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}'
            	    {
            	    otherlv_18=(Token)match(input,34,FOLLOW_34_in_ruleContainer2503); 

            	        	newLeafNode(otherlv_18, grammarAccess.getContainerAccess().getCommandsKeyword_5_3_0());
            	        
            	    otherlv_19=(Token)match(input,12,FOLLOW_12_in_ruleContainer2515); 

            	        	newLeafNode(otherlv_19, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_3_1());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1015:1: ( (lv_commands_20_0= RULE_STRING ) )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==RULE_STRING) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1016:1: (lv_commands_20_0= RULE_STRING )
            	    	    {
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1016:1: (lv_commands_20_0= RULE_STRING )
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1017:3: lv_commands_20_0= RULE_STRING
            	    	    {
            	    	    lv_commands_20_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContainer2532); 

            	    	    			newLeafNode(lv_commands_20_0, grammarAccess.getContainerAccess().getCommandsSTRINGTerminalRuleCall_5_3_2_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		addWithLastConsumed(
            	    	           			current, 
            	    	           			"commands",
            	    	            		lv_commands_20_0, 
            	    	            		"STRING");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt9 >= 1 ) break loop9;
            	                EarlyExitException eee =
            	                    new EarlyExitException(9, input);
            	                throw eee;
            	        }
            	        cnt9++;
            	    } while (true);

            	    otherlv_21=(Token)match(input,13,FOLLOW_13_in_ruleContainer2550); 

            	        	newLeafNode(otherlv_21, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1044:4: ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1044:4: ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1045:5: {...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1045:106: ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1046:6: ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 4);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1049:6: ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1049:7: {...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1049:16: (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1049:18: otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) )
            	    {
            	    otherlv_22=(Token)match(input,35,FOLLOW_35_in_ruleContainer2618); 

            	        	newLeafNode(otherlv_22, grammarAccess.getContainerAccess().getContainerIDFileKeyword_5_4_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1053:1: ( (lv_containerIDFile_23_0= RULE_STRING ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1054:1: (lv_containerIDFile_23_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1054:1: (lv_containerIDFile_23_0= RULE_STRING )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1055:3: lv_containerIDFile_23_0= RULE_STRING
            	    {
            	    lv_containerIDFile_23_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContainer2635); 

            	    			newLeafNode(lv_containerIDFile_23_0, grammarAccess.getContainerAccess().getContainerIDFileSTRINGTerminalRuleCall_5_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"containerIDFile",
            	            		lv_containerIDFile_23_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1078:4: ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1078:4: ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1079:5: {...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 5)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1079:106: ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1080:6: ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 5);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1083:6: ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1083:7: {...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1083:16: (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1083:18: otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) )
            	    {
            	    otherlv_24=(Token)match(input,36,FOLLOW_36_in_ruleContainer2708); 

            	        	newLeafNode(otherlv_24, grammarAccess.getContainerAccess().getCpuPeriodKeyword_5_5_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1087:1: ( (lv_cpuPeriod_25_0= RULE_INT ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1088:1: (lv_cpuPeriod_25_0= RULE_INT )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1088:1: (lv_cpuPeriod_25_0= RULE_INT )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1089:3: lv_cpuPeriod_25_0= RULE_INT
            	    {
            	    lv_cpuPeriod_25_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContainer2725); 

            	    			newLeafNode(lv_cpuPeriod_25_0, grammarAccess.getContainerAccess().getCpuPeriodINTTerminalRuleCall_5_5_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"cpuPeriod",
            	            		lv_cpuPeriod_25_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1112:4: ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1112:4: ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1113:5: {...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 6)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1113:106: ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1114:6: ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 6);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1117:6: ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1117:7: {...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1117:16: (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1117:18: otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) )
            	    {
            	    otherlv_26=(Token)match(input,37,FOLLOW_37_in_ruleContainer2798); 

            	        	newLeafNode(otherlv_26, grammarAccess.getContainerAccess().getCpusetCpusKeyword_5_6_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1121:1: ( (lv_cpusetCpus_27_0= RULE_STRING ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1122:1: (lv_cpusetCpus_27_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1122:1: (lv_cpusetCpus_27_0= RULE_STRING )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1123:3: lv_cpusetCpus_27_0= RULE_STRING
            	    {
            	    lv_cpusetCpus_27_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContainer2815); 

            	    			newLeafNode(lv_cpusetCpus_27_0, grammarAccess.getContainerAccess().getCpusetCpusSTRINGTerminalRuleCall_5_6_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"cpusetCpus",
            	            		lv_cpusetCpus_27_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1146:4: ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1146:4: ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1147:5: {...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 7)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1147:106: ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1148:6: ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 7);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1151:6: ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1151:7: {...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1151:16: (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1151:18: otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) )
            	    {
            	    otherlv_28=(Token)match(input,38,FOLLOW_38_in_ruleContainer2888); 

            	        	newLeafNode(otherlv_28, grammarAccess.getContainerAccess().getCpusetMemsKeyword_5_7_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1155:1: ( (lv_cpusetMems_29_0= RULE_STRING ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1156:1: (lv_cpusetMems_29_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1156:1: (lv_cpusetMems_29_0= RULE_STRING )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1157:3: lv_cpusetMems_29_0= RULE_STRING
            	    {
            	    lv_cpusetMems_29_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContainer2905); 

            	    			newLeafNode(lv_cpusetMems_29_0, grammarAccess.getContainerAccess().getCpusetMemsSTRINGTerminalRuleCall_5_7_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"cpusetMems",
            	            		lv_cpusetMems_29_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1180:4: ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1180:4: ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1181:5: {...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 8)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1181:106: ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1182:6: ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 8);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1185:6: ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1185:7: {...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1185:16: (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1185:18: otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) )
            	    {
            	    otherlv_30=(Token)match(input,39,FOLLOW_39_in_ruleContainer2978); 

            	        	newLeafNode(otherlv_30, grammarAccess.getContainerAccess().getCpuSharesKeyword_5_8_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1189:1: ( (lv_cpuShares_31_0= RULE_INT ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1190:1: (lv_cpuShares_31_0= RULE_INT )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1190:1: (lv_cpuShares_31_0= RULE_INT )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1191:3: lv_cpuShares_31_0= RULE_INT
            	    {
            	    lv_cpuShares_31_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContainer2995); 

            	    			newLeafNode(lv_cpuShares_31_0, grammarAccess.getContainerAccess().getCpuSharesINTTerminalRuleCall_5_8_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"cpuShares",
            	            		lv_cpuShares_31_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1214:4: ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1214:4: ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1215:5: {...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 9)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1215:106: ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1216:6: ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 9);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1219:6: ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1219:7: {...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1219:16: (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1219:18: otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}'
            	    {
            	    otherlv_32=(Token)match(input,40,FOLLOW_40_in_ruleContainer3068); 

            	        	newLeafNode(otherlv_32, grammarAccess.getContainerAccess().getDevicesKeyword_5_9_0());
            	        
            	    otherlv_33=(Token)match(input,12,FOLLOW_12_in_ruleContainer3080); 

            	        	newLeafNode(otherlv_33, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_9_1());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1227:1: ( (lv_devices_34_0= ruleDevice ) )+
            	    int cnt10=0;
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==64) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1228:1: (lv_devices_34_0= ruleDevice )
            	    	    {
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1228:1: (lv_devices_34_0= ruleDevice )
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1229:3: lv_devices_34_0= ruleDevice
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContainerAccess().getDevicesDeviceParserRuleCall_5_9_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDevice_in_ruleContainer3101);
            	    	    lv_devices_34_0=ruleDevice();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"devices",
            	    	            		lv_devices_34_0, 
            	    	            		"Device");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt10 >= 1 ) break loop10;
            	                EarlyExitException eee =
            	                    new EarlyExitException(10, input);
            	                throw eee;
            	        }
            	        cnt10++;
            	    } while (true);

            	    otherlv_35=(Token)match(input,13,FOLLOW_13_in_ruleContainer3114); 

            	        	newLeafNode(otherlv_35, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_9_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1256:4: ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1256:4: ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1257:5: {...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 10)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1257:107: ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1258:6: ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 10);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1261:6: ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1261:7: {...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1261:16: (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1261:18: otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}'
            	    {
            	    otherlv_36=(Token)match(input,41,FOLLOW_41_in_ruleContainer3182); 

            	        	newLeafNode(otherlv_36, grammarAccess.getContainerAccess().getDnsKeyword_5_10_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1265:1: ( (lv_dns_37_0= RULE_STRING ) )+
            	    int cnt11=0;
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==RULE_STRING) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1266:1: (lv_dns_37_0= RULE_STRING )
            	    	    {
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1266:1: (lv_dns_37_0= RULE_STRING )
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1267:3: lv_dns_37_0= RULE_STRING
            	    	    {
            	    	    lv_dns_37_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContainer3199); 

            	    	    			newLeafNode(lv_dns_37_0, grammarAccess.getContainerAccess().getDnsSTRINGTerminalRuleCall_5_10_1_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		addWithLastConsumed(
            	    	           			current, 
            	    	           			"dns",
            	    	            		lv_dns_37_0, 
            	    	            		"STRING");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt11 >= 1 ) break loop11;
            	                EarlyExitException eee =
            	                    new EarlyExitException(11, input);
            	                throw eee;
            	        }
            	        cnt11++;
            	    } while (true);

            	    otherlv_38=(Token)match(input,13,FOLLOW_13_in_ruleContainer3217); 

            	        	newLeafNode(otherlv_38, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_10_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1294:4: ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1294:4: ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1295:5: {...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 11)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1295:107: ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1296:6: ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 11);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1299:6: ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1299:7: {...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1299:16: (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1299:18: otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}'
            	    {
            	    otherlv_39=(Token)match(input,42,FOLLOW_42_in_ruleContainer3285); 

            	        	newLeafNode(otherlv_39, grammarAccess.getContainerAccess().getDnsSearchKeyword_5_11_0());
            	        
            	    otherlv_40=(Token)match(input,12,FOLLOW_12_in_ruleContainer3297); 

            	        	newLeafNode(otherlv_40, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_11_1());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1307:1: ( (lv_dnsSearch_41_0= RULE_STRING ) )+
            	    int cnt12=0;
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==RULE_STRING) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1308:1: (lv_dnsSearch_41_0= RULE_STRING )
            	    	    {
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1308:1: (lv_dnsSearch_41_0= RULE_STRING )
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1309:3: lv_dnsSearch_41_0= RULE_STRING
            	    	    {
            	    	    lv_dnsSearch_41_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContainer3314); 

            	    	    			newLeafNode(lv_dnsSearch_41_0, grammarAccess.getContainerAccess().getDnsSearchSTRINGTerminalRuleCall_5_11_2_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		addWithLastConsumed(
            	    	           			current, 
            	    	           			"dnsSearch",
            	    	            		lv_dnsSearch_41_0, 
            	    	            		"STRING");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt12 >= 1 ) break loop12;
            	                EarlyExitException eee =
            	                    new EarlyExitException(12, input);
            	                throw eee;
            	        }
            	        cnt12++;
            	    } while (true);

            	    otherlv_42=(Token)match(input,13,FOLLOW_13_in_ruleContainer3332); 

            	        	newLeafNode(otherlv_42, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_11_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1336:4: ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1336:4: ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1337:5: {...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 12)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1337:107: ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1338:6: ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 12);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1341:6: ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1341:7: {...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1341:16: (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1341:18: otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) )
            	    {
            	    otherlv_43=(Token)match(input,43,FOLLOW_43_in_ruleContainer3400); 

            	        	newLeafNode(otherlv_43, grammarAccess.getContainerAccess().getDomainNameKeyword_5_12_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1345:1: ( (lv_domainName_44_0= RULE_STRING ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1346:1: (lv_domainName_44_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1346:1: (lv_domainName_44_0= RULE_STRING )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1347:3: lv_domainName_44_0= RULE_STRING
            	    {
            	    lv_domainName_44_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContainer3417); 

            	    			newLeafNode(lv_domainName_44_0, grammarAccess.getContainerAccess().getDomainNameSTRINGTerminalRuleCall_5_12_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"domainName",
            	            		lv_domainName_44_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1370:4: ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1370:4: ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1371:5: {...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 13)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1371:107: ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1372:6: ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 13);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1375:6: ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1375:7: {...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1375:16: (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1375:18: otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}'
            	    {
            	    otherlv_45=(Token)match(input,44,FOLLOW_44_in_ruleContainer3490); 

            	        	newLeafNode(otherlv_45, grammarAccess.getContainerAccess().getEntrypointKeyword_5_13_0());
            	        
            	    otherlv_46=(Token)match(input,12,FOLLOW_12_in_ruleContainer3502); 

            	        	newLeafNode(otherlv_46, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_13_1());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1383:1: ( (lv_entrypoint_47_0= RULE_STRING ) )+
            	    int cnt13=0;
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==RULE_STRING) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1384:1: (lv_entrypoint_47_0= RULE_STRING )
            	    	    {
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1384:1: (lv_entrypoint_47_0= RULE_STRING )
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1385:3: lv_entrypoint_47_0= RULE_STRING
            	    	    {
            	    	    lv_entrypoint_47_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContainer3519); 

            	    	    			newLeafNode(lv_entrypoint_47_0, grammarAccess.getContainerAccess().getEntrypointSTRINGTerminalRuleCall_5_13_2_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		addWithLastConsumed(
            	    	           			current, 
            	    	           			"entrypoint",
            	    	            		lv_entrypoint_47_0, 
            	    	            		"STRING");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt13 >= 1 ) break loop13;
            	                EarlyExitException eee =
            	                    new EarlyExitException(13, input);
            	                throw eee;
            	        }
            	        cnt13++;
            	    } while (true);

            	    otherlv_48=(Token)match(input,13,FOLLOW_13_in_ruleContainer3537); 

            	        	newLeafNode(otherlv_48, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_13_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1412:4: ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1412:4: ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1413:5: {...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 14)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1413:107: ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1414:6: ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 14);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1417:6: ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1417:7: {...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1417:16: (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1417:18: otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}'
            	    {
            	    otherlv_49=(Token)match(input,45,FOLLOW_45_in_ruleContainer3605); 

            	        	newLeafNode(otherlv_49, grammarAccess.getContainerAccess().getEnvKeyword_5_14_0());
            	        
            	    otherlv_50=(Token)match(input,12,FOLLOW_12_in_ruleContainer3617); 

            	        	newLeafNode(otherlv_50, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_14_1());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1425:1: ( (lv_env_51_0= RULE_STRING ) )+
            	    int cnt14=0;
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==RULE_STRING) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1426:1: (lv_env_51_0= RULE_STRING )
            	    	    {
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1426:1: (lv_env_51_0= RULE_STRING )
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1427:3: lv_env_51_0= RULE_STRING
            	    	    {
            	    	    lv_env_51_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContainer3634); 

            	    	    			newLeafNode(lv_env_51_0, grammarAccess.getContainerAccess().getEnvSTRINGTerminalRuleCall_5_14_2_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		addWithLastConsumed(
            	    	           			current, 
            	    	           			"env",
            	    	            		lv_env_51_0, 
            	    	            		"STRING");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt14 >= 1 ) break loop14;
            	                EarlyExitException eee =
            	                    new EarlyExitException(14, input);
            	                throw eee;
            	        }
            	        cnt14++;
            	    } while (true);

            	    otherlv_52=(Token)match(input,13,FOLLOW_13_in_ruleContainer3652); 

            	        	newLeafNode(otherlv_52, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_14_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 16 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1454:4: ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1454:4: ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1455:5: {...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 15) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 15)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1455:107: ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1456:6: ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 15);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1459:6: ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1459:7: {...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1459:16: (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1459:18: otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}'
            	    {
            	    otherlv_53=(Token)match(input,46,FOLLOW_46_in_ruleContainer3720); 

            	        	newLeafNode(otherlv_53, grammarAccess.getContainerAccess().getExposedPortsKeyword_5_15_0());
            	        
            	    otherlv_54=(Token)match(input,12,FOLLOW_12_in_ruleContainer3732); 

            	        	newLeafNode(otherlv_54, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_15_1());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1467:1: ( (lv_exposedPorts_55_0= ruleExposedPort ) )+
            	    int cnt15=0;
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==64) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1468:1: (lv_exposedPorts_55_0= ruleExposedPort )
            	    	    {
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1468:1: (lv_exposedPorts_55_0= ruleExposedPort )
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1469:3: lv_exposedPorts_55_0= ruleExposedPort
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContainerAccess().getExposedPortsExposedPortParserRuleCall_5_15_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleExposedPort_in_ruleContainer3753);
            	    	    lv_exposedPorts_55_0=ruleExposedPort();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"exposedPorts",
            	    	            		lv_exposedPorts_55_0, 
            	    	            		"ExposedPort");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt15 >= 1 ) break loop15;
            	                EarlyExitException eee =
            	                    new EarlyExitException(15, input);
            	                throw eee;
            	        }
            	        cnt15++;
            	    } while (true);

            	    otherlv_56=(Token)match(input,13,FOLLOW_13_in_ruleContainer3766); 

            	        	newLeafNode(otherlv_56, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_15_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 17 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1496:4: ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1496:4: ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1497:5: {...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 16) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 16)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1497:107: ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1498:6: ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 16);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1501:6: ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1501:7: {...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1501:16: (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1501:18: otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}'
            	    {
            	    otherlv_57=(Token)match(input,47,FOLLOW_47_in_ruleContainer3834); 

            	        	newLeafNode(otherlv_57, grammarAccess.getContainerAccess().getExtraHostsKeyword_5_16_0());
            	        
            	    otherlv_58=(Token)match(input,12,FOLLOW_12_in_ruleContainer3846); 

            	        	newLeafNode(otherlv_58, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_16_1());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1509:1: ( (lv_extraHosts_59_0= RULE_STRING ) )+
            	    int cnt16=0;
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==RULE_STRING) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1510:1: (lv_extraHosts_59_0= RULE_STRING )
            	    	    {
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1510:1: (lv_extraHosts_59_0= RULE_STRING )
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1511:3: lv_extraHosts_59_0= RULE_STRING
            	    	    {
            	    	    lv_extraHosts_59_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContainer3863); 

            	    	    			newLeafNode(lv_extraHosts_59_0, grammarAccess.getContainerAccess().getExtraHostsSTRINGTerminalRuleCall_5_16_2_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		addWithLastConsumed(
            	    	           			current, 
            	    	           			"extraHosts",
            	    	            		lv_extraHosts_59_0, 
            	    	            		"STRING");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt16 >= 1 ) break loop16;
            	                EarlyExitException eee =
            	                    new EarlyExitException(16, input);
            	                throw eee;
            	        }
            	        cnt16++;
            	    } while (true);

            	    otherlv_60=(Token)match(input,13,FOLLOW_13_in_ruleContainer3881); 

            	        	newLeafNode(otherlv_60, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_16_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 18 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1538:4: ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1538:4: ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1539:5: {...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 17) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 17)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1539:107: ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1540:6: ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 17);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1543:6: ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1543:7: {...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1543:16: (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1543:18: otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}'
            	    {
            	    otherlv_61=(Token)match(input,48,FOLLOW_48_in_ruleContainer3949); 

            	        	newLeafNode(otherlv_61, grammarAccess.getContainerAccess().getLabelsKeyword_5_17_0());
            	        
            	    otherlv_62=(Token)match(input,12,FOLLOW_12_in_ruleContainer3961); 

            	        	newLeafNode(otherlv_62, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_17_1());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1551:1: ( (lv_labels_63_0= ruleLabel ) )+
            	    int cnt17=0;
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==RULE_STRING) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1552:1: (lv_labels_63_0= ruleLabel )
            	    	    {
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1552:1: (lv_labels_63_0= ruleLabel )
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1553:3: lv_labels_63_0= ruleLabel
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContainerAccess().getLabelsLabelParserRuleCall_5_17_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleLabel_in_ruleContainer3982);
            	    	    lv_labels_63_0=ruleLabel();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"labels",
            	    	            		lv_labels_63_0, 
            	    	            		"Label");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt17 >= 1 ) break loop17;
            	                EarlyExitException eee =
            	                    new EarlyExitException(17, input);
            	                throw eee;
            	        }
            	        cnt17++;
            	    } while (true);

            	    otherlv_64=(Token)match(input,13,FOLLOW_13_in_ruleContainer3995); 

            	        	newLeafNode(otherlv_64, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_17_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 19 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1580:4: ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1580:4: ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1581:5: {...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 18) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 18)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1581:107: ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1582:6: ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 18);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1585:6: ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1585:7: {...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1585:16: (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1585:18: otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}'
            	    {
            	    otherlv_65=(Token)match(input,49,FOLLOW_49_in_ruleContainer4063); 

            	        	newLeafNode(otherlv_65, grammarAccess.getContainerAccess().getLinksKeyword_5_18_0());
            	        
            	    otherlv_66=(Token)match(input,12,FOLLOW_12_in_ruleContainer4075); 

            	        	newLeafNode(otherlv_66, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_18_1());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1593:1: ( (lv_links_67_0= ruleLink ) )+
            	    int cnt18=0;
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0==64) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1594:1: (lv_links_67_0= ruleLink )
            	    	    {
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1594:1: (lv_links_67_0= ruleLink )
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1595:3: lv_links_67_0= ruleLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContainerAccess().getLinksLinkParserRuleCall_5_18_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleLink_in_ruleContainer4096);
            	    	    lv_links_67_0=ruleLink();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"links",
            	    	            		lv_links_67_0, 
            	    	            		"Link");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt18 >= 1 ) break loop18;
            	                EarlyExitException eee =
            	                    new EarlyExitException(18, input);
            	                throw eee;
            	        }
            	        cnt18++;
            	    } while (true);

            	    otherlv_68=(Token)match(input,13,FOLLOW_13_in_ruleContainer4109); 

            	        	newLeafNode(otherlv_68, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_18_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 20 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1622:4: ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1622:4: ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1623:5: {...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 19) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 19)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1623:107: ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1624:6: ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 19);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1627:6: ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1627:7: {...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1627:16: (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1627:18: otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) )
            	    {
            	    otherlv_69=(Token)match(input,50,FOLLOW_50_in_ruleContainer4177); 

            	        	newLeafNode(otherlv_69, grammarAccess.getContainerAccess().getMacAddressKeyword_5_19_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1631:1: ( (lv_macAddress_70_0= RULE_STRING ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1632:1: (lv_macAddress_70_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1632:1: (lv_macAddress_70_0= RULE_STRING )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1633:3: lv_macAddress_70_0= RULE_STRING
            	    {
            	    lv_macAddress_70_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContainer4194); 

            	    			newLeafNode(lv_macAddress_70_0, grammarAccess.getContainerAccess().getMacAddressSTRINGTerminalRuleCall_5_19_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"macAddress",
            	            		lv_macAddress_70_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 21 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1656:4: ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1656:4: ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1657:5: {...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 20) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 20)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1657:107: ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1658:6: ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 20);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1661:6: ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1661:7: {...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1661:16: (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1661:18: otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) )
            	    {
            	    otherlv_71=(Token)match(input,20,FOLLOW_20_in_ruleContainer4267); 

            	        	newLeafNode(otherlv_71, grammarAccess.getContainerAccess().getMemoryKeyword_5_20_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1665:1: ( (lv_memory_72_0= ruleElong ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1666:1: (lv_memory_72_0= ruleElong )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1666:1: (lv_memory_72_0= ruleElong )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1667:3: lv_memory_72_0= ruleElong
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getMemoryElongParserRuleCall_5_20_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElong_in_ruleContainer4288);
            	    lv_memory_72_0=ruleElong();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"memory",
            	            		lv_memory_72_0, 
            	            		"Elong");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 22 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1690:4: ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1690:4: ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1691:5: {...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 21) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 21)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1691:107: ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1692:6: ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 21);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1695:6: ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1695:7: {...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1695:16: (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1695:18: otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) )
            	    {
            	    otherlv_73=(Token)match(input,51,FOLLOW_51_in_ruleContainer4356); 

            	        	newLeafNode(otherlv_73, grammarAccess.getContainerAccess().getMemorySwapKeyword_5_21_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1699:1: ( (lv_memorySwap_74_0= ruleElong ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1700:1: (lv_memorySwap_74_0= ruleElong )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1700:1: (lv_memorySwap_74_0= ruleElong )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1701:3: lv_memorySwap_74_0= ruleElong
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getMemorySwapElongParserRuleCall_5_21_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElong_in_ruleContainer4377);
            	    lv_memorySwap_74_0=ruleElong();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"memorySwap",
            	            		lv_memorySwap_74_0, 
            	            		"Elong");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 23 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1724:4: ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1724:4: ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1725:5: {...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 22) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 22)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1725:107: ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1726:6: ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 22);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1729:6: ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1729:7: {...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1729:16: (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1729:18: otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) )
            	    {
            	    otherlv_75=(Token)match(input,52,FOLLOW_52_in_ruleContainer4445); 

            	        	newLeafNode(otherlv_75, grammarAccess.getContainerAccess().getDisableNetworkKeyword_5_22_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1733:1: ( (lv_disableNetwork_76_0= ruleEBoolean ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1734:1: (lv_disableNetwork_76_0= ruleEBoolean )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1734:1: (lv_disableNetwork_76_0= ruleEBoolean )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1735:3: lv_disableNetwork_76_0= ruleEBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getDisableNetworkEBooleanParserRuleCall_5_22_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleContainer4466);
            	    lv_disableNetwork_76_0=ruleEBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"disableNetwork",
            	            		lv_disableNetwork_76_0, 
            	            		"EBoolean");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 24 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1758:4: ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1758:4: ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1759:5: {...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 23) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 23)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1759:107: ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1760:6: ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 23);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1763:6: ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1763:7: {...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1763:16: (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1763:18: otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) )
            	    {
            	    otherlv_77=(Token)match(input,53,FOLLOW_53_in_ruleContainer4534); 

            	        	newLeafNode(otherlv_77, grammarAccess.getContainerAccess().getNetworkModeKeyword_5_23_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1767:1: ( (lv_networkMode_78_0= RULE_STRING ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1768:1: (lv_networkMode_78_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1768:1: (lv_networkMode_78_0= RULE_STRING )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1769:3: lv_networkMode_78_0= RULE_STRING
            	    {
            	    lv_networkMode_78_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContainer4551); 

            	    			newLeafNode(lv_networkMode_78_0, grammarAccess.getContainerAccess().getNetworkModeSTRINGTerminalRuleCall_5_23_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"networkMode",
            	            		lv_networkMode_78_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 25 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1792:4: ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1792:4: ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1793:5: {...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 24) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 24)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1793:107: ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1794:6: ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 24);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1797:6: ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1797:7: {...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1797:16: (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1797:18: otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}'
            	    {
            	    otherlv_79=(Token)match(input,54,FOLLOW_54_in_ruleContainer4624); 

            	        	newLeafNode(otherlv_79, grammarAccess.getContainerAccess().getPortBindingsKeyword_5_24_0());
            	        
            	    otherlv_80=(Token)match(input,12,FOLLOW_12_in_ruleContainer4636); 

            	        	newLeafNode(otherlv_80, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_24_1());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1805:1: ( (lv_portBindings_81_0= rulePortBinding ) )+
            	    int cnt19=0;
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==64) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1806:1: (lv_portBindings_81_0= rulePortBinding )
            	    	    {
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1806:1: (lv_portBindings_81_0= rulePortBinding )
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1807:3: lv_portBindings_81_0= rulePortBinding
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContainerAccess().getPortBindingsPortBindingParserRuleCall_5_24_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_rulePortBinding_in_ruleContainer4657);
            	    	    lv_portBindings_81_0=rulePortBinding();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"portBindings",
            	    	            		lv_portBindings_81_0, 
            	    	            		"PortBinding");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt19 >= 1 ) break loop19;
            	                EarlyExitException eee =
            	                    new EarlyExitException(19, input);
            	                throw eee;
            	        }
            	        cnt19++;
            	    } while (true);

            	    otherlv_82=(Token)match(input,13,FOLLOW_13_in_ruleContainer4670); 

            	        	newLeafNode(otherlv_82, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_24_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 26 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1834:4: ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1834:4: ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1835:5: {...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 25) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 25)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1835:107: ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1836:6: ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 25);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1839:6: ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1839:7: {...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1839:16: (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1839:18: otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) )
            	    {
            	    otherlv_83=(Token)match(input,55,FOLLOW_55_in_ruleContainer4738); 

            	        	newLeafNode(otherlv_83, grammarAccess.getContainerAccess().getPrivilegedKeyword_5_25_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1843:1: ( (lv_privileged_84_0= ruleEBoolean ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1844:1: (lv_privileged_84_0= ruleEBoolean )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1844:1: (lv_privileged_84_0= ruleEBoolean )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1845:3: lv_privileged_84_0= ruleEBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getPrivilegedEBooleanParserRuleCall_5_25_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleContainer4759);
            	    lv_privileged_84_0=ruleEBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"privileged",
            	            		lv_privileged_84_0, 
            	            		"EBoolean");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 27 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1868:4: ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1868:4: ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1869:5: {...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 26) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 26)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1869:107: ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1870:6: ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 26);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1873:6: ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1873:7: {...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1873:16: (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1873:18: otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) )
            	    {
            	    otherlv_85=(Token)match(input,56,FOLLOW_56_in_ruleContainer4827); 

            	        	newLeafNode(otherlv_85, grammarAccess.getContainerAccess().getPublishAllPortsKeyword_5_26_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1877:1: ( (lv_publishAllPorts_86_0= ruleEBoolean ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1878:1: (lv_publishAllPorts_86_0= ruleEBoolean )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1878:1: (lv_publishAllPorts_86_0= ruleEBoolean )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1879:3: lv_publishAllPorts_86_0= ruleEBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getPublishAllPortsEBooleanParserRuleCall_5_26_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleContainer4848);
            	    lv_publishAllPorts_86_0=ruleEBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"publishAllPorts",
            	            		lv_publishAllPorts_86_0, 
            	            		"EBoolean");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 28 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1902:4: ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1902:4: ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1903:5: {...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 27) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 27)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1903:107: ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1904:6: ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 27);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1907:6: ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1907:7: {...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1907:16: (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1907:18: otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) )
            	    {
            	    otherlv_87=(Token)match(input,57,FOLLOW_57_in_ruleContainer4916); 

            	        	newLeafNode(otherlv_87, grammarAccess.getContainerAccess().getReadonlyRootfsKeyword_5_27_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1911:1: ( (lv_readonlyRootfs_88_0= ruleEBoolean ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1912:1: (lv_readonlyRootfs_88_0= ruleEBoolean )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1912:1: (lv_readonlyRootfs_88_0= ruleEBoolean )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1913:3: lv_readonlyRootfs_88_0= ruleEBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getReadonlyRootfsEBooleanParserRuleCall_5_27_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleContainer4937);
            	    lv_readonlyRootfs_88_0=ruleEBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"readonlyRootfs",
            	            		lv_readonlyRootfs_88_0, 
            	            		"EBoolean");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 29 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1936:4: ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1936:4: ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1937:5: {...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 28) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 28)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1937:107: ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1938:6: ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 28);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1941:6: ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1941:7: {...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1941:16: (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1941:18: otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) )
            	    {
            	    otherlv_89=(Token)match(input,58,FOLLOW_58_in_ruleContainer5005); 

            	        	newLeafNode(otherlv_89, grammarAccess.getContainerAccess().getPidModeKeyword_5_28_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1945:1: ( (lv_pidMode_90_0= RULE_STRING ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1946:1: (lv_pidMode_90_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1946:1: (lv_pidMode_90_0= RULE_STRING )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1947:3: lv_pidMode_90_0= RULE_STRING
            	    {
            	    lv_pidMode_90_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContainer5022); 

            	    			newLeafNode(lv_pidMode_90_0, grammarAccess.getContainerAccess().getPidModeSTRINGTerminalRuleCall_5_28_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"pidMode",
            	            		lv_pidMode_90_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 30 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1970:4: ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1970:4: ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1971:5: {...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 29) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 29)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1971:107: ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1972:6: ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 29);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1975:6: ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1975:7: {...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1975:16: (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1975:18: otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) )
            	    {
            	    otherlv_91=(Token)match(input,59,FOLLOW_59_in_ruleContainer5095); 

            	        	newLeafNode(otherlv_91, grammarAccess.getContainerAccess().getWorkingDirKeyword_5_29_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1979:1: ( (lv_workingDir_92_0= RULE_STRING ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1980:1: (lv_workingDir_92_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1980:1: (lv_workingDir_92_0= RULE_STRING )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:1981:3: lv_workingDir_92_0= RULE_STRING
            	    {
            	    lv_workingDir_92_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContainer5112); 

            	    			newLeafNode(lv_workingDir_92_0, grammarAccess.getContainerAccess().getWorkingDirSTRINGTerminalRuleCall_5_29_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"workingDir",
            	            		lv_workingDir_92_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 31 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2004:4: ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2004:4: ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2005:5: {...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 30) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 30)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2005:107: ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2006:6: ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 30);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2009:6: ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2009:7: {...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2009:16: (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2009:18: otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) )
            	    {
            	    otherlv_93=(Token)match(input,60,FOLLOW_60_in_ruleContainer5185); 

            	        	newLeafNode(otherlv_93, grammarAccess.getContainerAccess().getUserKeyword_5_30_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2013:1: ( (lv_user_94_0= RULE_STRING ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2014:1: (lv_user_94_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2014:1: (lv_user_94_0= RULE_STRING )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2015:3: lv_user_94_0= RULE_STRING
            	    {
            	    lv_user_94_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContainer5202); 

            	    			newLeafNode(lv_user_94_0, grammarAccess.getContainerAccess().getUserSTRINGTerminalRuleCall_5_30_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"user",
            	            		lv_user_94_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 32 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2038:4: ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2038:4: ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2039:5: {...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 31) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 31)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2039:107: ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2040:6: ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 31);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2043:6: ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2043:7: {...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2043:16: (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2043:18: otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) )
            	    {
            	    otherlv_95=(Token)match(input,61,FOLLOW_61_in_ruleContainer5275); 

            	        	newLeafNode(otherlv_95, grammarAccess.getContainerAccess().getTtyKeyword_5_31_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2047:1: ( (lv_tty_96_0= ruleEBoolean ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2048:1: (lv_tty_96_0= ruleEBoolean )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2048:1: (lv_tty_96_0= ruleEBoolean )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2049:3: lv_tty_96_0= ruleEBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getTtyEBooleanParserRuleCall_5_31_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEBoolean_in_ruleContainer5296);
            	    lv_tty_96_0=ruleEBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"tty",
            	            		lv_tty_96_0, 
            	            		"EBoolean");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 33 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2072:4: ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2072:4: ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2073:5: {...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 32) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 32)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2073:107: ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2074:6: ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 32);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2077:6: ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2077:7: {...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2077:16: (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2077:18: otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) )
            	    {
            	    otherlv_97=(Token)match(input,62,FOLLOW_62_in_ruleContainer5364); 

            	        	newLeafNode(otherlv_97, grammarAccess.getContainerAccess().getRestartPolicyKeyword_5_32_0());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2081:1: ( (lv_restartPolicy_98_0= ruleRestartPolicy ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2082:1: (lv_restartPolicy_98_0= ruleRestartPolicy )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2082:1: (lv_restartPolicy_98_0= ruleRestartPolicy )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2083:3: lv_restartPolicy_98_0= ruleRestartPolicy
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getRestartPolicyRestartPolicyParserRuleCall_5_32_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRestartPolicy_in_ruleContainer5385);
            	    lv_restartPolicy_98_0=ruleRestartPolicy();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"restartPolicy",
            	            		lv_restartPolicy_98_0, 
            	            		"RestartPolicy");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 34 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2106:4: ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2106:4: ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2107:5: {...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 33) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 33)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2107:107: ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2108:6: ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 33);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2111:6: ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2111:7: {...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2111:16: (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2111:18: otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}'
            	    {
            	    otherlv_99=(Token)match(input,63,FOLLOW_63_in_ruleContainer5453); 

            	        	newLeafNode(otherlv_99, grammarAccess.getContainerAccess().getVolumesKeyword_5_33_0());
            	        
            	    otherlv_100=(Token)match(input,12,FOLLOW_12_in_ruleContainer5465); 

            	        	newLeafNode(otherlv_100, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_33_1());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2119:1: (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+
            	    int cnt20=0;
            	    loop20:
            	    do {
            	        int alt20=2;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0==64) ) {
            	            alt20=1;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2119:3: otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) )
            	    	    {
            	    	    otherlv_101=(Token)match(input,64,FOLLOW_64_in_ruleContainer5478); 

            	    	        	newLeafNode(otherlv_101, grammarAccess.getContainerAccess().getHyphenMinusKeyword_5_33_2_0());
            	    	        
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2123:1: ( (lv_volumes_102_0= ruleVolume ) )
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2124:1: (lv_volumes_102_0= ruleVolume )
            	    	    {
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2124:1: (lv_volumes_102_0= ruleVolume )
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2125:3: lv_volumes_102_0= ruleVolume
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContainerAccess().getVolumesVolumeParserRuleCall_5_33_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleVolume_in_ruleContainer5499);
            	    	    lv_volumes_102_0=ruleVolume();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"volumes",
            	    	            		lv_volumes_102_0, 
            	    	            		"Volume");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt20 >= 1 ) break loop20;
            	                EarlyExitException eee =
            	                    new EarlyExitException(20, input);
            	                throw eee;
            	        }
            	        cnt20++;
            	    } while (true);

            	    otherlv_103=(Token)match(input,13,FOLLOW_13_in_ruleContainer5513); 

            	        	newLeafNode(otherlv_103, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_33_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 35 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2152:4: ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+ otherlv_107= '}' ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2152:4: ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+ otherlv_107= '}' ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2153:5: {...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+ otherlv_107= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 34) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 34)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2153:107: ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+ otherlv_107= '}' ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2154:6: ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+ otherlv_107= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 34);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2157:6: ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+ otherlv_107= '}' ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2157:7: {...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+ otherlv_107= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2157:16: (otherlv_104= 'volumesFrom' otherlv_105= '{' ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+ otherlv_107= '}' )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2157:18: otherlv_104= 'volumesFrom' otherlv_105= '{' ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+ otherlv_107= '}'
            	    {
            	    otherlv_104=(Token)match(input,65,FOLLOW_65_in_ruleContainer5581); 

            	        	newLeafNode(otherlv_104, grammarAccess.getContainerAccess().getVolumesFromKeyword_5_34_0());
            	        
            	    otherlv_105=(Token)match(input,12,FOLLOW_12_in_ruleContainer5593); 

            	        	newLeafNode(otherlv_105, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_34_1());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2165:1: ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+
            	    int cnt21=0;
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==64) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2166:1: (lv_volumesFrom_106_0= ruleVolumesFrom )
            	    	    {
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2166:1: (lv_volumesFrom_106_0= ruleVolumesFrom )
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2167:3: lv_volumesFrom_106_0= ruleVolumesFrom
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContainerAccess().getVolumesFromVolumesFromParserRuleCall_5_34_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleVolumesFrom_in_ruleContainer5614);
            	    	    lv_volumesFrom_106_0=ruleVolumesFrom();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"volumesFrom",
            	    	            		lv_volumesFrom_106_0, 
            	    	            		"VolumesFrom");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt21 >= 1 ) break loop21;
            	                EarlyExitException eee =
            	                    new EarlyExitException(21, input);
            	                throw eee;
            	        }
            	        cnt21++;
            	    } while (true);

            	    otherlv_107=(Token)match(input,13,FOLLOW_13_in_ruleContainer5627); 

            	        	newLeafNode(otherlv_107, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_34_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 36 :
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2194:4: ({...}? => ( ({...}? => (otherlv_108= 'ulimits' otherlv_109= '{' ( (lv_ulimits_110_0= ruleUlimit ) )+ otherlv_111= '}' ) ) ) )
            	    {
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2194:4: ({...}? => ( ({...}? => (otherlv_108= 'ulimits' otherlv_109= '{' ( (lv_ulimits_110_0= ruleUlimit ) )+ otherlv_111= '}' ) ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2195:5: {...}? => ( ({...}? => (otherlv_108= 'ulimits' otherlv_109= '{' ( (lv_ulimits_110_0= ruleUlimit ) )+ otherlv_111= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 35) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 35)");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2195:107: ( ({...}? => (otherlv_108= 'ulimits' otherlv_109= '{' ( (lv_ulimits_110_0= ruleUlimit ) )+ otherlv_111= '}' ) ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2196:6: ({...}? => (otherlv_108= 'ulimits' otherlv_109= '{' ( (lv_ulimits_110_0= ruleUlimit ) )+ otherlv_111= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 35);
            	    	 				
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2199:6: ({...}? => (otherlv_108= 'ulimits' otherlv_109= '{' ( (lv_ulimits_110_0= ruleUlimit ) )+ otherlv_111= '}' ) )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2199:7: {...}? => (otherlv_108= 'ulimits' otherlv_109= '{' ( (lv_ulimits_110_0= ruleUlimit ) )+ otherlv_111= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2199:16: (otherlv_108= 'ulimits' otherlv_109= '{' ( (lv_ulimits_110_0= ruleUlimit ) )+ otherlv_111= '}' )
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2199:18: otherlv_108= 'ulimits' otherlv_109= '{' ( (lv_ulimits_110_0= ruleUlimit ) )+ otherlv_111= '}'
            	    {
            	    otherlv_108=(Token)match(input,66,FOLLOW_66_in_ruleContainer5695); 

            	        	newLeafNode(otherlv_108, grammarAccess.getContainerAccess().getUlimitsKeyword_5_35_0());
            	        
            	    otherlv_109=(Token)match(input,12,FOLLOW_12_in_ruleContainer5707); 

            	        	newLeafNode(otherlv_109, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_35_1());
            	        
            	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2207:1: ( (lv_ulimits_110_0= ruleUlimit ) )+
            	    int cnt22=0;
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==64) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2208:1: (lv_ulimits_110_0= ruleUlimit )
            	    	    {
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2208:1: (lv_ulimits_110_0= ruleUlimit )
            	    	    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2209:3: lv_ulimits_110_0= ruleUlimit
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContainerAccess().getUlimitsUlimitParserRuleCall_5_35_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleUlimit_in_ruleContainer5728);
            	    	    lv_ulimits_110_0=ruleUlimit();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"ulimits",
            	    	            		lv_ulimits_110_0, 
            	    	            		"Ulimit");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt22 >= 1 ) break loop22;
            	                EarlyExitException eee =
            	                    new EarlyExitException(22, input);
            	                throw eee;
            	        }
            	        cnt22++;
            	    } while (true);

            	    otherlv_111=(Token)match(input,13,FOLLOW_13_in_ruleContainer5741); 

            	        	newLeafNode(otherlv_111, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_35_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	

            }

            otherlv_112=(Token)match(input,13,FOLLOW_13_in_ruleContainer5794); 

                	newLeafNode(otherlv_112, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleVolumesFrom"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2255:1: entryRuleVolumesFrom returns [EObject current=null] : iv_ruleVolumesFrom= ruleVolumesFrom EOF ;
    public final EObject entryRuleVolumesFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumesFrom = null;


        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2256:2: (iv_ruleVolumesFrom= ruleVolumesFrom EOF )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2257:2: iv_ruleVolumesFrom= ruleVolumesFrom EOF
            {
             newCompositeNode(grammarAccess.getVolumesFromRule()); 
            pushFollow(FOLLOW_ruleVolumesFrom_in_entryRuleVolumesFrom5830);
            iv_ruleVolumesFrom=ruleVolumesFrom();

            state._fsp--;

             current =iv_ruleVolumesFrom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVolumesFrom5840); 

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
    // $ANTLR end "entryRuleVolumesFrom"


    // $ANTLR start "ruleVolumesFrom"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2264:1: ruleVolumesFrom returns [EObject current=null] : (otherlv_0= '-' ( (lv_container_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_accessMode_3_0= ruleAccessMode ) )? ) ;
    public final EObject ruleVolumesFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_container_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_accessMode_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2267:28: ( (otherlv_0= '-' ( (lv_container_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_accessMode_3_0= ruleAccessMode ) )? ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2268:1: (otherlv_0= '-' ( (lv_container_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_accessMode_3_0= ruleAccessMode ) )? )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2268:1: (otherlv_0= '-' ( (lv_container_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_accessMode_3_0= ruleAccessMode ) )? )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2268:3: otherlv_0= '-' ( (lv_container_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_accessMode_3_0= ruleAccessMode ) )?
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleVolumesFrom5877); 

                	newLeafNode(otherlv_0, grammarAccess.getVolumesFromAccess().getHyphenMinusKeyword_0());
                
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2272:1: ( (lv_container_1_0= RULE_STRING ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2273:1: (lv_container_1_0= RULE_STRING )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2273:1: (lv_container_1_0= RULE_STRING )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2274:3: lv_container_1_0= RULE_STRING
            {
            lv_container_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVolumesFrom5894); 

            			newLeafNode(lv_container_1_0, grammarAccess.getVolumesFromAccess().getContainerSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVolumesFromRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"container",
                    		lv_container_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleVolumesFrom5911); 

                	newLeafNode(otherlv_2, grammarAccess.getVolumesFromAccess().getColonKeyword_2());
                
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2294:1: ( (lv_accessMode_3_0= ruleAccessMode ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=74 && LA24_0<=75)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2295:1: (lv_accessMode_3_0= ruleAccessMode )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2295:1: (lv_accessMode_3_0= ruleAccessMode )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2296:3: lv_accessMode_3_0= ruleAccessMode
                    {
                     
                    	        newCompositeNode(grammarAccess.getVolumesFromAccess().getAccessModeAccessModeEnumRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAccessMode_in_ruleVolumesFrom5932);
                    lv_accessMode_3_0=ruleAccessMode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVolumesFromRule());
                    	        }
                           		set(
                           			current, 
                           			"accessMode",
                            		lv_accessMode_3_0, 
                            		"AccessMode");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleVolumesFrom"


    // $ANTLR start "entryRuleRestartPolicy"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2320:1: entryRuleRestartPolicy returns [EObject current=null] : iv_ruleRestartPolicy= ruleRestartPolicy EOF ;
    public final EObject entryRuleRestartPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestartPolicy = null;


        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2321:2: (iv_ruleRestartPolicy= ruleRestartPolicy EOF )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2322:2: iv_ruleRestartPolicy= ruleRestartPolicy EOF
            {
             newCompositeNode(grammarAccess.getRestartPolicyRule()); 
            pushFollow(FOLLOW_ruleRestartPolicy_in_entryRuleRestartPolicy5969);
            iv_ruleRestartPolicy=ruleRestartPolicy();

            state._fsp--;

             current =iv_ruleRestartPolicy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestartPolicy5979); 

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
    // $ANTLR end "entryRuleRestartPolicy"


    // $ANTLR start "ruleRestartPolicy"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2329:1: ruleRestartPolicy returns [EObject current=null] : ( (otherlv_0= '-' ( (lv_value_1_0= 'always' ) ) ) | otherlv_2= 'onFailure' | (otherlv_3= 'none' ( (lv_maximumRetryCount_4_0= RULE_INT ) ) ) ) ;
    public final EObject ruleRestartPolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_maximumRetryCount_4_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2332:28: ( ( (otherlv_0= '-' ( (lv_value_1_0= 'always' ) ) ) | otherlv_2= 'onFailure' | (otherlv_3= 'none' ( (lv_maximumRetryCount_4_0= RULE_INT ) ) ) ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2333:1: ( (otherlv_0= '-' ( (lv_value_1_0= 'always' ) ) ) | otherlv_2= 'onFailure' | (otherlv_3= 'none' ( (lv_maximumRetryCount_4_0= RULE_INT ) ) ) )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2333:1: ( (otherlv_0= '-' ( (lv_value_1_0= 'always' ) ) ) | otherlv_2= 'onFailure' | (otherlv_3= 'none' ( (lv_maximumRetryCount_4_0= RULE_INT ) ) ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt25=1;
                }
                break;
            case 69:
                {
                alt25=2;
                }
                break;
            case 70:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2333:2: (otherlv_0= '-' ( (lv_value_1_0= 'always' ) ) )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2333:2: (otherlv_0= '-' ( (lv_value_1_0= 'always' ) ) )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2333:4: otherlv_0= '-' ( (lv_value_1_0= 'always' ) )
                    {
                    otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleRestartPolicy6017); 

                        	newLeafNode(otherlv_0, grammarAccess.getRestartPolicyAccess().getHyphenMinusKeyword_0_0());
                        
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2337:1: ( (lv_value_1_0= 'always' ) )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2338:1: (lv_value_1_0= 'always' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2338:1: (lv_value_1_0= 'always' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2339:3: lv_value_1_0= 'always'
                    {
                    lv_value_1_0=(Token)match(input,68,FOLLOW_68_in_ruleRestartPolicy6035); 

                            newLeafNode(lv_value_1_0, grammarAccess.getRestartPolicyAccess().getValueAlwaysKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRestartPolicyRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_0, "always");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2353:7: otherlv_2= 'onFailure'
                    {
                    otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleRestartPolicy6067); 

                        	newLeafNode(otherlv_2, grammarAccess.getRestartPolicyAccess().getOnFailureKeyword_1());
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2358:6: (otherlv_3= 'none' ( (lv_maximumRetryCount_4_0= RULE_INT ) ) )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2358:6: (otherlv_3= 'none' ( (lv_maximumRetryCount_4_0= RULE_INT ) ) )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2358:8: otherlv_3= 'none' ( (lv_maximumRetryCount_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,70,FOLLOW_70_in_ruleRestartPolicy6086); 

                        	newLeafNode(otherlv_3, grammarAccess.getRestartPolicyAccess().getNoneKeyword_2_0());
                        
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2362:1: ( (lv_maximumRetryCount_4_0= RULE_INT ) )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2363:1: (lv_maximumRetryCount_4_0= RULE_INT )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2363:1: (lv_maximumRetryCount_4_0= RULE_INT )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2364:3: lv_maximumRetryCount_4_0= RULE_INT
                    {
                    lv_maximumRetryCount_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRestartPolicy6103); 

                    			newLeafNode(lv_maximumRetryCount_4_0, grammarAccess.getRestartPolicyAccess().getMaximumRetryCountINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRestartPolicyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"maximumRetryCount",
                            		lv_maximumRetryCount_4_0, 
                            		"INT");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleRestartPolicy"


    // $ANTLR start "entryRulePortBinding"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2388:1: entryRulePortBinding returns [EObject current=null] : iv_rulePortBinding= rulePortBinding EOF ;
    public final EObject entryRulePortBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortBinding = null;


        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2389:2: (iv_rulePortBinding= rulePortBinding EOF )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2390:2: iv_rulePortBinding= rulePortBinding EOF
            {
             newCompositeNode(grammarAccess.getPortBindingRule()); 
            pushFollow(FOLLOW_rulePortBinding_in_entryRulePortBinding6145);
            iv_rulePortBinding=rulePortBinding();

            state._fsp--;

             current =iv_rulePortBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePortBinding6155); 

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
    // $ANTLR end "entryRulePortBinding"


    // $ANTLR start "rulePortBinding"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2397:1: rulePortBinding returns [EObject current=null] : (otherlv_0= '-' ( (lv_binding_1_0= ruleBinding ) ) ( (otherlv_2= RULE_STRING ) ) ) ;
    public final EObject rulePortBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_binding_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2400:28: ( (otherlv_0= '-' ( (lv_binding_1_0= ruleBinding ) ) ( (otherlv_2= RULE_STRING ) ) ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2401:1: (otherlv_0= '-' ( (lv_binding_1_0= ruleBinding ) ) ( (otherlv_2= RULE_STRING ) ) )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2401:1: (otherlv_0= '-' ( (lv_binding_1_0= ruleBinding ) ) ( (otherlv_2= RULE_STRING ) ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2401:3: otherlv_0= '-' ( (lv_binding_1_0= ruleBinding ) ) ( (otherlv_2= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_rulePortBinding6192); 

                	newLeafNode(otherlv_0, grammarAccess.getPortBindingAccess().getHyphenMinusKeyword_0());
                
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2405:1: ( (lv_binding_1_0= ruleBinding ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2406:1: (lv_binding_1_0= ruleBinding )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2406:1: (lv_binding_1_0= ruleBinding )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2407:3: lv_binding_1_0= ruleBinding
            {
             
            	        newCompositeNode(grammarAccess.getPortBindingAccess().getBindingBindingParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBinding_in_rulePortBinding6213);
            lv_binding_1_0=ruleBinding();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPortBindingRule());
            	        }
                   		set(
                   			current, 
                   			"binding",
                    		lv_binding_1_0, 
                    		"Binding");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2423:2: ( (otherlv_2= RULE_STRING ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2424:1: (otherlv_2= RULE_STRING )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2424:1: (otherlv_2= RULE_STRING )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2425:3: otherlv_2= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPortBindingRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePortBinding6233); 

            		newLeafNode(otherlv_2, grammarAccess.getPortBindingAccess().getExposedPortExposedPortCrossReference_2_0()); 
            	

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
    // $ANTLR end "rulePortBinding"


    // $ANTLR start "entryRuleBinding"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2444:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2445:2: (iv_ruleBinding= ruleBinding EOF )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2446:2: iv_ruleBinding= ruleBinding EOF
            {
             newCompositeNode(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_ruleBinding_in_entryRuleBinding6269);
            iv_ruleBinding=ruleBinding();

            state._fsp--;

             current =iv_ruleBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinding6279); 

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
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2453:1: ruleBinding returns [EObject current=null] : (otherlv_0= '-' ( (lv_hostIP_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_hostPort_3_0= RULE_INT ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hostIP_1_0=null;
        Token otherlv_2=null;
        Token lv_hostPort_3_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2456:28: ( (otherlv_0= '-' ( (lv_hostIP_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_hostPort_3_0= RULE_INT ) ) ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2457:1: (otherlv_0= '-' ( (lv_hostIP_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_hostPort_3_0= RULE_INT ) ) )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2457:1: (otherlv_0= '-' ( (lv_hostIP_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_hostPort_3_0= RULE_INT ) ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2457:3: otherlv_0= '-' ( (lv_hostIP_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_hostPort_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleBinding6316); 

                	newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getHyphenMinusKeyword_0());
                
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2461:1: ( (lv_hostIP_1_0= RULE_STRING ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2462:1: (lv_hostIP_1_0= RULE_STRING )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2462:1: (lv_hostIP_1_0= RULE_STRING )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2463:3: lv_hostIP_1_0= RULE_STRING
            {
            lv_hostIP_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBinding6333); 

            			newLeafNode(lv_hostIP_1_0, grammarAccess.getBindingAccess().getHostIPSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBindingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"hostIP",
                    		lv_hostIP_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleBinding6350); 

                	newLeafNode(otherlv_2, grammarAccess.getBindingAccess().getColonKeyword_2());
                
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2483:1: ( (lv_hostPort_3_0= RULE_INT ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2484:1: (lv_hostPort_3_0= RULE_INT )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2484:1: (lv_hostPort_3_0= RULE_INT )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2485:3: lv_hostPort_3_0= RULE_INT
            {
            lv_hostPort_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBinding6367); 

            			newLeafNode(lv_hostPort_3_0, grammarAccess.getBindingAccess().getHostPortINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBindingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"hostPort",
                    		lv_hostPort_3_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleLink"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2509:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2510:2: (iv_ruleLink= ruleLink EOF )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2511:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink6408);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink6418); 

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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2518:1: ruleLink returns [EObject current=null] : (otherlv_0= '-' ( (lv_containerLink_1_0= RULE_STRING ) ) (otherlv_2= ':' ( (lv_alias_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_containerLink_1_0=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2521:28: ( (otherlv_0= '-' ( (lv_containerLink_1_0= RULE_STRING ) ) (otherlv_2= ':' ( (lv_alias_3_0= RULE_STRING ) ) )? ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2522:1: (otherlv_0= '-' ( (lv_containerLink_1_0= RULE_STRING ) ) (otherlv_2= ':' ( (lv_alias_3_0= RULE_STRING ) ) )? )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2522:1: (otherlv_0= '-' ( (lv_containerLink_1_0= RULE_STRING ) ) (otherlv_2= ':' ( (lv_alias_3_0= RULE_STRING ) ) )? )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2522:3: otherlv_0= '-' ( (lv_containerLink_1_0= RULE_STRING ) ) (otherlv_2= ':' ( (lv_alias_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleLink6455); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getHyphenMinusKeyword_0());
                
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2526:1: ( (lv_containerLink_1_0= RULE_STRING ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2527:1: (lv_containerLink_1_0= RULE_STRING )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2527:1: (lv_containerLink_1_0= RULE_STRING )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2528:3: lv_containerLink_1_0= RULE_STRING
            {
            lv_containerLink_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLink6472); 

            			newLeafNode(lv_containerLink_1_0, grammarAccess.getLinkAccess().getContainerLinkSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"containerLink",
                    		lv_containerLink_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2544:2: (otherlv_2= ':' ( (lv_alias_3_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==67) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2544:4: otherlv_2= ':' ( (lv_alias_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleLink6490); 

                        	newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getColonKeyword_2_0());
                        
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2548:1: ( (lv_alias_3_0= RULE_STRING ) )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2549:1: (lv_alias_3_0= RULE_STRING )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2549:1: (lv_alias_3_0= RULE_STRING )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2550:3: lv_alias_3_0= RULE_STRING
                    {
                    lv_alias_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLink6507); 

                    			newLeafNode(lv_alias_3_0, grammarAccess.getLinkAccess().getAliasSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"alias",
                            		lv_alias_3_0, 
                            		"STRING");
                    	    

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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleUlimit"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2574:1: entryRuleUlimit returns [EObject current=null] : iv_ruleUlimit= ruleUlimit EOF ;
    public final EObject entryRuleUlimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUlimit = null;


        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2575:2: (iv_ruleUlimit= ruleUlimit EOF )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2576:2: iv_ruleUlimit= ruleUlimit EOF
            {
             newCompositeNode(grammarAccess.getUlimitRule()); 
            pushFollow(FOLLOW_ruleUlimit_in_entryRuleUlimit6550);
            iv_ruleUlimit=ruleUlimit();

            state._fsp--;

             current =iv_ruleUlimit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUlimit6560); 

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
    // $ANTLR end "entryRuleUlimit"


    // $ANTLR start "ruleUlimit"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2583:1: ruleUlimit returns [EObject current=null] : (otherlv_0= '-' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_soft_2_0= RULE_INT ) ) ( (lv_hard_3_0= RULE_INT ) ) ) ;
    public final EObject ruleUlimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_soft_2_0=null;
        Token lv_hard_3_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2586:28: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_soft_2_0= RULE_INT ) ) ( (lv_hard_3_0= RULE_INT ) ) ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2587:1: (otherlv_0= '-' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_soft_2_0= RULE_INT ) ) ( (lv_hard_3_0= RULE_INT ) ) )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2587:1: (otherlv_0= '-' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_soft_2_0= RULE_INT ) ) ( (lv_hard_3_0= RULE_INT ) ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2587:3: otherlv_0= '-' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_soft_2_0= RULE_INT ) ) ( (lv_hard_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleUlimit6597); 

                	newLeafNode(otherlv_0, grammarAccess.getUlimitAccess().getHyphenMinusKeyword_0());
                
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2591:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2592:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2592:1: (lv_name_1_0= RULE_STRING )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2593:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUlimit6614); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUlimitAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUlimitRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2609:2: ( (lv_soft_2_0= RULE_INT ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2610:1: (lv_soft_2_0= RULE_INT )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2610:1: (lv_soft_2_0= RULE_INT )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2611:3: lv_soft_2_0= RULE_INT
            {
            lv_soft_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUlimit6636); 

            			newLeafNode(lv_soft_2_0, grammarAccess.getUlimitAccess().getSoftINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUlimitRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"soft",
                    		lv_soft_2_0, 
                    		"INT");
            	    

            }


            }

            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2627:2: ( (lv_hard_3_0= RULE_INT ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2628:1: (lv_hard_3_0= RULE_INT )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2628:1: (lv_hard_3_0= RULE_INT )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2629:3: lv_hard_3_0= RULE_INT
            {
            lv_hard_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUlimit6658); 

            			newLeafNode(lv_hard_3_0, grammarAccess.getUlimitAccess().getHardINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUlimitRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"hard",
                    		lv_hard_3_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleUlimit"


    // $ANTLR start "entryRuleLabel"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2653:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2654:2: (iv_ruleLabel= ruleLabel EOF )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2655:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel6699);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel6709); 

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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2662:1: ruleLabel returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2665:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2666:1: ( ( (lv_key_0_0= RULE_STRING ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2666:1: ( ( (lv_key_0_0= RULE_STRING ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2666:2: ( (lv_key_0_0= RULE_STRING ) ) ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2666:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2667:1: (lv_key_0_0= RULE_STRING )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2667:1: (lv_key_0_0= RULE_STRING )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2668:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabel6751); 

            			newLeafNode(lv_key_0_0, grammarAccess.getLabelAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2684:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2685:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2685:1: (lv_value_1_0= RULE_STRING )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2686:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabel6773); 

            			newLeafNode(lv_value_1_0, grammarAccess.getLabelAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleExposedPort"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2710:1: entryRuleExposedPort returns [EObject current=null] : iv_ruleExposedPort= ruleExposedPort EOF ;
    public final EObject entryRuleExposedPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExposedPort = null;


        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2711:2: (iv_ruleExposedPort= ruleExposedPort EOF )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2712:2: iv_ruleExposedPort= ruleExposedPort EOF
            {
             newCompositeNode(grammarAccess.getExposedPortRule()); 
            pushFollow(FOLLOW_ruleExposedPort_in_entryRuleExposedPort6814);
            iv_ruleExposedPort=ruleExposedPort();

            state._fsp--;

             current =iv_ruleExposedPort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExposedPort6824); 

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
    // $ANTLR end "entryRuleExposedPort"


    // $ANTLR start "ruleExposedPort"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2719:1: ruleExposedPort returns [EObject current=null] : (otherlv_0= '-' ( (lv_port_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_protocol_3_0= ruleInternalProtocol ) ) ) ;
    public final EObject ruleExposedPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_port_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_protocol_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2722:28: ( (otherlv_0= '-' ( (lv_port_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_protocol_3_0= ruleInternalProtocol ) ) ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2723:1: (otherlv_0= '-' ( (lv_port_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_protocol_3_0= ruleInternalProtocol ) ) )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2723:1: (otherlv_0= '-' ( (lv_port_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_protocol_3_0= ruleInternalProtocol ) ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2723:3: otherlv_0= '-' ( (lv_port_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_protocol_3_0= ruleInternalProtocol ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleExposedPort6861); 

                	newLeafNode(otherlv_0, grammarAccess.getExposedPortAccess().getHyphenMinusKeyword_0());
                
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2727:1: ( (lv_port_1_0= RULE_STRING ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2728:1: (lv_port_1_0= RULE_STRING )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2728:1: (lv_port_1_0= RULE_STRING )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2729:3: lv_port_1_0= RULE_STRING
            {
            lv_port_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExposedPort6878); 

            			newLeafNode(lv_port_1_0, grammarAccess.getExposedPortAccess().getPortSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExposedPortRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"port",
                    		lv_port_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,71,FOLLOW_71_in_ruleExposedPort6895); 

                	newLeafNode(otherlv_2, grammarAccess.getExposedPortAccess().getSolidusKeyword_2());
                
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2749:1: ( (lv_protocol_3_0= ruleInternalProtocol ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2750:1: (lv_protocol_3_0= ruleInternalProtocol )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2750:1: (lv_protocol_3_0= ruleInternalProtocol )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2751:3: lv_protocol_3_0= ruleInternalProtocol
            {
             
            	        newCompositeNode(grammarAccess.getExposedPortAccess().getProtocolInternalProtocolEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleInternalProtocol_in_ruleExposedPort6916);
            lv_protocol_3_0=ruleInternalProtocol();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExposedPortRule());
            	        }
                   		set(
                   			current, 
                   			"protocol",
                    		lv_protocol_3_0, 
                    		"InternalProtocol");
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
    // $ANTLR end "ruleExposedPort"


    // $ANTLR start "entryRuleDevice"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2775:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2776:2: (iv_ruleDevice= ruleDevice EOF )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2777:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_ruleDevice_in_entryRuleDevice6952);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDevice6962); 

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
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2784:1: ruleDevice returns [EObject current=null] : (otherlv_0= '-' ( (lv_cGroupPermissions_1_0= RULE_STRING ) ) ( (lv_pathOnHost_2_0= RULE_STRING ) ) ( (lv_pathInContainer_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_cGroupPermissions_1_0=null;
        Token lv_pathOnHost_2_0=null;
        Token lv_pathInContainer_3_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2787:28: ( (otherlv_0= '-' ( (lv_cGroupPermissions_1_0= RULE_STRING ) ) ( (lv_pathOnHost_2_0= RULE_STRING ) ) ( (lv_pathInContainer_3_0= RULE_STRING ) ) ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2788:1: (otherlv_0= '-' ( (lv_cGroupPermissions_1_0= RULE_STRING ) ) ( (lv_pathOnHost_2_0= RULE_STRING ) ) ( (lv_pathInContainer_3_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2788:1: (otherlv_0= '-' ( (lv_cGroupPermissions_1_0= RULE_STRING ) ) ( (lv_pathOnHost_2_0= RULE_STRING ) ) ( (lv_pathInContainer_3_0= RULE_STRING ) ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2788:3: otherlv_0= '-' ( (lv_cGroupPermissions_1_0= RULE_STRING ) ) ( (lv_pathOnHost_2_0= RULE_STRING ) ) ( (lv_pathInContainer_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleDevice6999); 

                	newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getHyphenMinusKeyword_0());
                
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2792:1: ( (lv_cGroupPermissions_1_0= RULE_STRING ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2793:1: (lv_cGroupPermissions_1_0= RULE_STRING )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2793:1: (lv_cGroupPermissions_1_0= RULE_STRING )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2794:3: lv_cGroupPermissions_1_0= RULE_STRING
            {
            lv_cGroupPermissions_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDevice7016); 

            			newLeafNode(lv_cGroupPermissions_1_0, grammarAccess.getDeviceAccess().getCGroupPermissionsSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"cGroupPermissions",
                    		lv_cGroupPermissions_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2810:2: ( (lv_pathOnHost_2_0= RULE_STRING ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2811:1: (lv_pathOnHost_2_0= RULE_STRING )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2811:1: (lv_pathOnHost_2_0= RULE_STRING )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2812:3: lv_pathOnHost_2_0= RULE_STRING
            {
            lv_pathOnHost_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDevice7038); 

            			newLeafNode(lv_pathOnHost_2_0, grammarAccess.getDeviceAccess().getPathOnHostSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"pathOnHost",
                    		lv_pathOnHost_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2828:2: ( (lv_pathInContainer_3_0= RULE_STRING ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2829:1: (lv_pathInContainer_3_0= RULE_STRING )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2829:1: (lv_pathInContainer_3_0= RULE_STRING )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2830:3: lv_pathInContainer_3_0= RULE_STRING
            {
            lv_pathInContainer_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDevice7060); 

            			newLeafNode(lv_pathInContainer_3_0, grammarAccess.getDeviceAccess().getPathInContainerSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"pathInContainer",
                    		lv_pathInContainer_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleBind"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2854:1: entryRuleBind returns [EObject current=null] : iv_ruleBind= ruleBind EOF ;
    public final EObject entryRuleBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBind = null;


        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2855:2: (iv_ruleBind= ruleBind EOF )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2856:2: iv_ruleBind= ruleBind EOF
            {
             newCompositeNode(grammarAccess.getBindRule()); 
            pushFollow(FOLLOW_ruleBind_in_entryRuleBind7101);
            iv_ruleBind=ruleBind();

            state._fsp--;

             current =iv_ruleBind; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBind7111); 

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
    // $ANTLR end "entryRuleBind"


    // $ANTLR start "ruleBind"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2863:1: ruleBind returns [EObject current=null] : (otherlv_0= '-' ( (lv_location_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_volume_3_0= ruleVolume ) ) (otherlv_4= ':' ( (lv_accessMode1_5_0= ruleAccessMode ) ) )? ) ;
    public final EObject ruleBind() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_location_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_volume_3_0 = null;

        Enumerator lv_accessMode1_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2866:28: ( (otherlv_0= '-' ( (lv_location_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_volume_3_0= ruleVolume ) ) (otherlv_4= ':' ( (lv_accessMode1_5_0= ruleAccessMode ) ) )? ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2867:1: (otherlv_0= '-' ( (lv_location_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_volume_3_0= ruleVolume ) ) (otherlv_4= ':' ( (lv_accessMode1_5_0= ruleAccessMode ) ) )? )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2867:1: (otherlv_0= '-' ( (lv_location_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_volume_3_0= ruleVolume ) ) (otherlv_4= ':' ( (lv_accessMode1_5_0= ruleAccessMode ) ) )? )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2867:3: otherlv_0= '-' ( (lv_location_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_volume_3_0= ruleVolume ) ) (otherlv_4= ':' ( (lv_accessMode1_5_0= ruleAccessMode ) ) )?
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleBind7148); 

                	newLeafNode(otherlv_0, grammarAccess.getBindAccess().getHyphenMinusKeyword_0());
                
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2871:1: ( (lv_location_1_0= RULE_STRING ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2872:1: (lv_location_1_0= RULE_STRING )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2872:1: (lv_location_1_0= RULE_STRING )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2873:3: lv_location_1_0= RULE_STRING
            {
            lv_location_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBind7165); 

            			newLeafNode(lv_location_1_0, grammarAccess.getBindAccess().getLocationSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBindRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"location",
                    		lv_location_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleBind7182); 

                	newLeafNode(otherlv_2, grammarAccess.getBindAccess().getColonKeyword_2());
                
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2893:1: ( (lv_volume_3_0= ruleVolume ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2894:1: (lv_volume_3_0= ruleVolume )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2894:1: (lv_volume_3_0= ruleVolume )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2895:3: lv_volume_3_0= ruleVolume
            {
             
            	        newCompositeNode(grammarAccess.getBindAccess().getVolumeVolumeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVolume_in_ruleBind7203);
            lv_volume_3_0=ruleVolume();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBindRule());
            	        }
                   		set(
                   			current, 
                   			"volume",
                    		lv_volume_3_0, 
                    		"Volume");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2911:2: (otherlv_4= ':' ( (lv_accessMode1_5_0= ruleAccessMode ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==67) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2911:4: otherlv_4= ':' ( (lv_accessMode1_5_0= ruleAccessMode ) )
                    {
                    otherlv_4=(Token)match(input,67,FOLLOW_67_in_ruleBind7216); 

                        	newLeafNode(otherlv_4, grammarAccess.getBindAccess().getColonKeyword_4_0());
                        
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2915:1: ( (lv_accessMode1_5_0= ruleAccessMode ) )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2916:1: (lv_accessMode1_5_0= ruleAccessMode )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2916:1: (lv_accessMode1_5_0= ruleAccessMode )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2917:3: lv_accessMode1_5_0= ruleAccessMode
                    {
                     
                    	        newCompositeNode(grammarAccess.getBindAccess().getAccessMode1AccessModeEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAccessMode_in_ruleBind7237);
                    lv_accessMode1_5_0=ruleAccessMode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBindRule());
                    	        }
                           		set(
                           			current, 
                           			"accessMode1",
                            		lv_accessMode1_5_0, 
                            		"AccessMode");
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
    // $ANTLR end "ruleBind"


    // $ANTLR start "entryRuleVolume"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2941:1: entryRuleVolume returns [EObject current=null] : iv_ruleVolume= ruleVolume EOF ;
    public final EObject entryRuleVolume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolume = null;


        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2942:2: (iv_ruleVolume= ruleVolume EOF )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2943:2: iv_ruleVolume= ruleVolume EOF
            {
             newCompositeNode(grammarAccess.getVolumeRule()); 
            pushFollow(FOLLOW_ruleVolume_in_entryRuleVolume7275);
            iv_ruleVolume=ruleVolume();

            state._fsp--;

             current =iv_ruleVolume; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVolume7285); 

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
    // $ANTLR end "entryRuleVolume"


    // $ANTLR start "ruleVolume"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2950:1: ruleVolume returns [EObject current=null] : ( (lv_path_0_0= RULE_STRING ) ) ;
    public final EObject ruleVolume() throws RecognitionException {
        EObject current = null;

        Token lv_path_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2953:28: ( ( (lv_path_0_0= RULE_STRING ) ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2954:1: ( (lv_path_0_0= RULE_STRING ) )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2954:1: ( (lv_path_0_0= RULE_STRING ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2955:1: (lv_path_0_0= RULE_STRING )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2955:1: (lv_path_0_0= RULE_STRING )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2956:3: lv_path_0_0= RULE_STRING
            {
            lv_path_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVolume7326); 

            			newLeafNode(lv_path_0_0, grammarAccess.getVolumeAccess().getPathSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVolumeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"path",
                    		lv_path_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleVolume"


    // $ANTLR start "ruleInternalProtocol"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2980:1: ruleInternalProtocol returns [Enumerator current=null] : ( (enumLiteral_0= 'TCP' ) | (enumLiteral_1= 'UDP' ) ) ;
    public final Enumerator ruleInternalProtocol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2982:28: ( ( (enumLiteral_0= 'TCP' ) | (enumLiteral_1= 'UDP' ) ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2983:1: ( (enumLiteral_0= 'TCP' ) | (enumLiteral_1= 'UDP' ) )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2983:1: ( (enumLiteral_0= 'TCP' ) | (enumLiteral_1= 'UDP' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==72) ) {
                alt28=1;
            }
            else if ( (LA28_0==73) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2983:2: (enumLiteral_0= 'TCP' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2983:2: (enumLiteral_0= 'TCP' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2983:4: enumLiteral_0= 'TCP'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_72_in_ruleInternalProtocol7380); 

                            current = grammarAccess.getInternalProtocolAccess().getTCPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getInternalProtocolAccess().getTCPEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2989:6: (enumLiteral_1= 'UDP' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2989:6: (enumLiteral_1= 'UDP' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2989:8: enumLiteral_1= 'UDP'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_73_in_ruleInternalProtocol7397); 

                            current = grammarAccess.getInternalProtocolAccess().getUDPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getInternalProtocolAccess().getUDPEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleInternalProtocol"


    // $ANTLR start "ruleAccessMode"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:2999:1: ruleAccessMode returns [Enumerator current=null] : ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) ) ;
    public final Enumerator ruleAccessMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3001:28: ( ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3002:1: ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3002:1: ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==74) ) {
                alt29=1;
            }
            else if ( (LA29_0==75) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3002:2: (enumLiteral_0= 'rw' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3002:2: (enumLiteral_0= 'rw' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3002:4: enumLiteral_0= 'rw'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_74_in_ruleAccessMode7442); 

                            current = grammarAccess.getAccessModeAccess().getRwEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAccessModeAccess().getRwEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3008:6: (enumLiteral_1= 'ro' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3008:6: (enumLiteral_1= 'ro' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3008:8: enumLiteral_1= 'ro'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_75_in_ruleAccessMode7459); 

                            current = grammarAccess.getAccessModeAccess().getRoEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAccessModeAccess().getRoEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleAccessMode"


    // $ANTLR start "ruleCapability"
    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3018:1: ruleCapability returns [Enumerator current=null] : ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'AUDIT_CONTROL' ) | (enumLiteral_2= 'AUDIT_WRITE' ) | (enumLiteral_3= 'BLOCK_SUSPEND' ) | (enumLiteral_4= 'CHOWN' ) | (enumLiteral_5= 'DAC_OVERRIDE' ) | (enumLiteral_6= 'DAC_READ_SEARCH' ) | (enumLiteral_7= 'FOWNER' ) | (enumLiteral_8= 'FSETID' ) | (enumLiteral_9= 'IPC_LOCK' ) | (enumLiteral_10= 'IPC_OWNER' ) | (enumLiteral_11= 'KILL' ) | (enumLiteral_12= 'LEASE' ) | (enumLiteral_13= 'LINUX_IMMUTABLE' ) | (enumLiteral_14= 'MAC_ADMIN' ) | (enumLiteral_15= 'MAC_OVERRIDE' ) | (enumLiteral_16= 'MKNOD' ) | (enumLiteral_17= 'NET_ADMIN' ) | (enumLiteral_18= 'NET_BIND_SERVICE' ) | (enumLiteral_19= 'NET_BROADCAST' ) | (enumLiteral_20= 'NET_RAW' ) | (enumLiteral_21= 'SETFCAP' ) | (enumLiteral_22= 'SETGID' ) | (enumLiteral_23= 'SETPCAP' ) | (enumLiteral_24= 'SETUID' ) | (enumLiteral_25= 'SYS_ADMIN' ) | (enumLiteral_26= 'SYS_BOOT' ) | (enumLiteral_27= 'SYS_CHROOT' ) | (enumLiteral_28= 'SYSLOG' ) | (enumLiteral_29= 'SYS_MODULE' ) | (enumLiteral_30= 'SYS_NICE' ) | (enumLiteral_31= 'SYS_PACCT' ) | (enumLiteral_32= 'SYS_PTRACE' ) | (enumLiteral_33= 'SYS_RAWIO' ) | (enumLiteral_34= 'SYS_RESOURCE' ) | (enumLiteral_35= 'SYS_TIME' ) | (enumLiteral_36= 'SYS_TTY_CONFIG' ) | (enumLiteral_37= 'WAKE_ALARM' ) ) ;
    public final Enumerator ruleCapability() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;
        Token enumLiteral_20=null;
        Token enumLiteral_21=null;
        Token enumLiteral_22=null;
        Token enumLiteral_23=null;
        Token enumLiteral_24=null;
        Token enumLiteral_25=null;
        Token enumLiteral_26=null;
        Token enumLiteral_27=null;
        Token enumLiteral_28=null;
        Token enumLiteral_29=null;
        Token enumLiteral_30=null;
        Token enumLiteral_31=null;
        Token enumLiteral_32=null;
        Token enumLiteral_33=null;
        Token enumLiteral_34=null;
        Token enumLiteral_35=null;
        Token enumLiteral_36=null;
        Token enumLiteral_37=null;

         enterRule(); 
        try {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3020:28: ( ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'AUDIT_CONTROL' ) | (enumLiteral_2= 'AUDIT_WRITE' ) | (enumLiteral_3= 'BLOCK_SUSPEND' ) | (enumLiteral_4= 'CHOWN' ) | (enumLiteral_5= 'DAC_OVERRIDE' ) | (enumLiteral_6= 'DAC_READ_SEARCH' ) | (enumLiteral_7= 'FOWNER' ) | (enumLiteral_8= 'FSETID' ) | (enumLiteral_9= 'IPC_LOCK' ) | (enumLiteral_10= 'IPC_OWNER' ) | (enumLiteral_11= 'KILL' ) | (enumLiteral_12= 'LEASE' ) | (enumLiteral_13= 'LINUX_IMMUTABLE' ) | (enumLiteral_14= 'MAC_ADMIN' ) | (enumLiteral_15= 'MAC_OVERRIDE' ) | (enumLiteral_16= 'MKNOD' ) | (enumLiteral_17= 'NET_ADMIN' ) | (enumLiteral_18= 'NET_BIND_SERVICE' ) | (enumLiteral_19= 'NET_BROADCAST' ) | (enumLiteral_20= 'NET_RAW' ) | (enumLiteral_21= 'SETFCAP' ) | (enumLiteral_22= 'SETGID' ) | (enumLiteral_23= 'SETPCAP' ) | (enumLiteral_24= 'SETUID' ) | (enumLiteral_25= 'SYS_ADMIN' ) | (enumLiteral_26= 'SYS_BOOT' ) | (enumLiteral_27= 'SYS_CHROOT' ) | (enumLiteral_28= 'SYSLOG' ) | (enumLiteral_29= 'SYS_MODULE' ) | (enumLiteral_30= 'SYS_NICE' ) | (enumLiteral_31= 'SYS_PACCT' ) | (enumLiteral_32= 'SYS_PTRACE' ) | (enumLiteral_33= 'SYS_RAWIO' ) | (enumLiteral_34= 'SYS_RESOURCE' ) | (enumLiteral_35= 'SYS_TIME' ) | (enumLiteral_36= 'SYS_TTY_CONFIG' ) | (enumLiteral_37= 'WAKE_ALARM' ) ) )
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3021:1: ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'AUDIT_CONTROL' ) | (enumLiteral_2= 'AUDIT_WRITE' ) | (enumLiteral_3= 'BLOCK_SUSPEND' ) | (enumLiteral_4= 'CHOWN' ) | (enumLiteral_5= 'DAC_OVERRIDE' ) | (enumLiteral_6= 'DAC_READ_SEARCH' ) | (enumLiteral_7= 'FOWNER' ) | (enumLiteral_8= 'FSETID' ) | (enumLiteral_9= 'IPC_LOCK' ) | (enumLiteral_10= 'IPC_OWNER' ) | (enumLiteral_11= 'KILL' ) | (enumLiteral_12= 'LEASE' ) | (enumLiteral_13= 'LINUX_IMMUTABLE' ) | (enumLiteral_14= 'MAC_ADMIN' ) | (enumLiteral_15= 'MAC_OVERRIDE' ) | (enumLiteral_16= 'MKNOD' ) | (enumLiteral_17= 'NET_ADMIN' ) | (enumLiteral_18= 'NET_BIND_SERVICE' ) | (enumLiteral_19= 'NET_BROADCAST' ) | (enumLiteral_20= 'NET_RAW' ) | (enumLiteral_21= 'SETFCAP' ) | (enumLiteral_22= 'SETGID' ) | (enumLiteral_23= 'SETPCAP' ) | (enumLiteral_24= 'SETUID' ) | (enumLiteral_25= 'SYS_ADMIN' ) | (enumLiteral_26= 'SYS_BOOT' ) | (enumLiteral_27= 'SYS_CHROOT' ) | (enumLiteral_28= 'SYSLOG' ) | (enumLiteral_29= 'SYS_MODULE' ) | (enumLiteral_30= 'SYS_NICE' ) | (enumLiteral_31= 'SYS_PACCT' ) | (enumLiteral_32= 'SYS_PTRACE' ) | (enumLiteral_33= 'SYS_RAWIO' ) | (enumLiteral_34= 'SYS_RESOURCE' ) | (enumLiteral_35= 'SYS_TIME' ) | (enumLiteral_36= 'SYS_TTY_CONFIG' ) | (enumLiteral_37= 'WAKE_ALARM' ) )
            {
            // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3021:1: ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'AUDIT_CONTROL' ) | (enumLiteral_2= 'AUDIT_WRITE' ) | (enumLiteral_3= 'BLOCK_SUSPEND' ) | (enumLiteral_4= 'CHOWN' ) | (enumLiteral_5= 'DAC_OVERRIDE' ) | (enumLiteral_6= 'DAC_READ_SEARCH' ) | (enumLiteral_7= 'FOWNER' ) | (enumLiteral_8= 'FSETID' ) | (enumLiteral_9= 'IPC_LOCK' ) | (enumLiteral_10= 'IPC_OWNER' ) | (enumLiteral_11= 'KILL' ) | (enumLiteral_12= 'LEASE' ) | (enumLiteral_13= 'LINUX_IMMUTABLE' ) | (enumLiteral_14= 'MAC_ADMIN' ) | (enumLiteral_15= 'MAC_OVERRIDE' ) | (enumLiteral_16= 'MKNOD' ) | (enumLiteral_17= 'NET_ADMIN' ) | (enumLiteral_18= 'NET_BIND_SERVICE' ) | (enumLiteral_19= 'NET_BROADCAST' ) | (enumLiteral_20= 'NET_RAW' ) | (enumLiteral_21= 'SETFCAP' ) | (enumLiteral_22= 'SETGID' ) | (enumLiteral_23= 'SETPCAP' ) | (enumLiteral_24= 'SETUID' ) | (enumLiteral_25= 'SYS_ADMIN' ) | (enumLiteral_26= 'SYS_BOOT' ) | (enumLiteral_27= 'SYS_CHROOT' ) | (enumLiteral_28= 'SYSLOG' ) | (enumLiteral_29= 'SYS_MODULE' ) | (enumLiteral_30= 'SYS_NICE' ) | (enumLiteral_31= 'SYS_PACCT' ) | (enumLiteral_32= 'SYS_PTRACE' ) | (enumLiteral_33= 'SYS_RAWIO' ) | (enumLiteral_34= 'SYS_RESOURCE' ) | (enumLiteral_35= 'SYS_TIME' ) | (enumLiteral_36= 'SYS_TTY_CONFIG' ) | (enumLiteral_37= 'WAKE_ALARM' ) )
            int alt30=38;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt30=1;
                }
                break;
            case 77:
                {
                alt30=2;
                }
                break;
            case 78:
                {
                alt30=3;
                }
                break;
            case 79:
                {
                alt30=4;
                }
                break;
            case 80:
                {
                alt30=5;
                }
                break;
            case 81:
                {
                alt30=6;
                }
                break;
            case 82:
                {
                alt30=7;
                }
                break;
            case 83:
                {
                alt30=8;
                }
                break;
            case 84:
                {
                alt30=9;
                }
                break;
            case 85:
                {
                alt30=10;
                }
                break;
            case 86:
                {
                alt30=11;
                }
                break;
            case 87:
                {
                alt30=12;
                }
                break;
            case 88:
                {
                alt30=13;
                }
                break;
            case 89:
                {
                alt30=14;
                }
                break;
            case 90:
                {
                alt30=15;
                }
                break;
            case 91:
                {
                alt30=16;
                }
                break;
            case 92:
                {
                alt30=17;
                }
                break;
            case 93:
                {
                alt30=18;
                }
                break;
            case 94:
                {
                alt30=19;
                }
                break;
            case 95:
                {
                alt30=20;
                }
                break;
            case 96:
                {
                alt30=21;
                }
                break;
            case 97:
                {
                alt30=22;
                }
                break;
            case 98:
                {
                alt30=23;
                }
                break;
            case 99:
                {
                alt30=24;
                }
                break;
            case 100:
                {
                alt30=25;
                }
                break;
            case 101:
                {
                alt30=26;
                }
                break;
            case 102:
                {
                alt30=27;
                }
                break;
            case 103:
                {
                alt30=28;
                }
                break;
            case 104:
                {
                alt30=29;
                }
                break;
            case 105:
                {
                alt30=30;
                }
                break;
            case 106:
                {
                alt30=31;
                }
                break;
            case 107:
                {
                alt30=32;
                }
                break;
            case 108:
                {
                alt30=33;
                }
                break;
            case 109:
                {
                alt30=34;
                }
                break;
            case 110:
                {
                alt30=35;
                }
                break;
            case 111:
                {
                alt30=36;
                }
                break;
            case 112:
                {
                alt30=37;
                }
                break;
            case 113:
                {
                alt30=38;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3021:2: (enumLiteral_0= 'ALL' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3021:2: (enumLiteral_0= 'ALL' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3021:4: enumLiteral_0= 'ALL'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_76_in_ruleCapability7504); 

                            current = grammarAccess.getCapabilityAccess().getALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCapabilityAccess().getALLEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3027:6: (enumLiteral_1= 'AUDIT_CONTROL' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3027:6: (enumLiteral_1= 'AUDIT_CONTROL' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3027:8: enumLiteral_1= 'AUDIT_CONTROL'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_77_in_ruleCapability7521); 

                            current = grammarAccess.getCapabilityAccess().getAUDIT_CONTROLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCapabilityAccess().getAUDIT_CONTROLEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3033:6: (enumLiteral_2= 'AUDIT_WRITE' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3033:6: (enumLiteral_2= 'AUDIT_WRITE' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3033:8: enumLiteral_2= 'AUDIT_WRITE'
                    {
                    enumLiteral_2=(Token)match(input,78,FOLLOW_78_in_ruleCapability7538); 

                            current = grammarAccess.getCapabilityAccess().getAUDIT_WRITEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCapabilityAccess().getAUDIT_WRITEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3039:6: (enumLiteral_3= 'BLOCK_SUSPEND' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3039:6: (enumLiteral_3= 'BLOCK_SUSPEND' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3039:8: enumLiteral_3= 'BLOCK_SUSPEND'
                    {
                    enumLiteral_3=(Token)match(input,79,FOLLOW_79_in_ruleCapability7555); 

                            current = grammarAccess.getCapabilityAccess().getBLOCK_SUSPENDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getCapabilityAccess().getBLOCK_SUSPENDEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3045:6: (enumLiteral_4= 'CHOWN' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3045:6: (enumLiteral_4= 'CHOWN' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3045:8: enumLiteral_4= 'CHOWN'
                    {
                    enumLiteral_4=(Token)match(input,80,FOLLOW_80_in_ruleCapability7572); 

                            current = grammarAccess.getCapabilityAccess().getCHOWNEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getCapabilityAccess().getCHOWNEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3051:6: (enumLiteral_5= 'DAC_OVERRIDE' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3051:6: (enumLiteral_5= 'DAC_OVERRIDE' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3051:8: enumLiteral_5= 'DAC_OVERRIDE'
                    {
                    enumLiteral_5=(Token)match(input,81,FOLLOW_81_in_ruleCapability7589); 

                            current = grammarAccess.getCapabilityAccess().getDAC_OVERRIDEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getCapabilityAccess().getDAC_OVERRIDEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3057:6: (enumLiteral_6= 'DAC_READ_SEARCH' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3057:6: (enumLiteral_6= 'DAC_READ_SEARCH' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3057:8: enumLiteral_6= 'DAC_READ_SEARCH'
                    {
                    enumLiteral_6=(Token)match(input,82,FOLLOW_82_in_ruleCapability7606); 

                            current = grammarAccess.getCapabilityAccess().getDAC_READ_SEARCHEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getCapabilityAccess().getDAC_READ_SEARCHEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3063:6: (enumLiteral_7= 'FOWNER' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3063:6: (enumLiteral_7= 'FOWNER' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3063:8: enumLiteral_7= 'FOWNER'
                    {
                    enumLiteral_7=(Token)match(input,83,FOLLOW_83_in_ruleCapability7623); 

                            current = grammarAccess.getCapabilityAccess().getFOWNEREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getCapabilityAccess().getFOWNEREnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3069:6: (enumLiteral_8= 'FSETID' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3069:6: (enumLiteral_8= 'FSETID' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3069:8: enumLiteral_8= 'FSETID'
                    {
                    enumLiteral_8=(Token)match(input,84,FOLLOW_84_in_ruleCapability7640); 

                            current = grammarAccess.getCapabilityAccess().getFSETIDEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getCapabilityAccess().getFSETIDEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3075:6: (enumLiteral_9= 'IPC_LOCK' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3075:6: (enumLiteral_9= 'IPC_LOCK' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3075:8: enumLiteral_9= 'IPC_LOCK'
                    {
                    enumLiteral_9=(Token)match(input,85,FOLLOW_85_in_ruleCapability7657); 

                            current = grammarAccess.getCapabilityAccess().getIPC_LOCKEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getCapabilityAccess().getIPC_LOCKEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3081:6: (enumLiteral_10= 'IPC_OWNER' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3081:6: (enumLiteral_10= 'IPC_OWNER' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3081:8: enumLiteral_10= 'IPC_OWNER'
                    {
                    enumLiteral_10=(Token)match(input,86,FOLLOW_86_in_ruleCapability7674); 

                            current = grammarAccess.getCapabilityAccess().getIPC_OWNEREnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getCapabilityAccess().getIPC_OWNEREnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3087:6: (enumLiteral_11= 'KILL' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3087:6: (enumLiteral_11= 'KILL' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3087:8: enumLiteral_11= 'KILL'
                    {
                    enumLiteral_11=(Token)match(input,87,FOLLOW_87_in_ruleCapability7691); 

                            current = grammarAccess.getCapabilityAccess().getKILLEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getCapabilityAccess().getKILLEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3093:6: (enumLiteral_12= 'LEASE' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3093:6: (enumLiteral_12= 'LEASE' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3093:8: enumLiteral_12= 'LEASE'
                    {
                    enumLiteral_12=(Token)match(input,88,FOLLOW_88_in_ruleCapability7708); 

                            current = grammarAccess.getCapabilityAccess().getLEASEEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getCapabilityAccess().getLEASEEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3099:6: (enumLiteral_13= 'LINUX_IMMUTABLE' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3099:6: (enumLiteral_13= 'LINUX_IMMUTABLE' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3099:8: enumLiteral_13= 'LINUX_IMMUTABLE'
                    {
                    enumLiteral_13=(Token)match(input,89,FOLLOW_89_in_ruleCapability7725); 

                            current = grammarAccess.getCapabilityAccess().getLINUX_IMMUTABLEEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getCapabilityAccess().getLINUX_IMMUTABLEEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3105:6: (enumLiteral_14= 'MAC_ADMIN' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3105:6: (enumLiteral_14= 'MAC_ADMIN' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3105:8: enumLiteral_14= 'MAC_ADMIN'
                    {
                    enumLiteral_14=(Token)match(input,90,FOLLOW_90_in_ruleCapability7742); 

                            current = grammarAccess.getCapabilityAccess().getMAC_ADMINEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getCapabilityAccess().getMAC_ADMINEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3111:6: (enumLiteral_15= 'MAC_OVERRIDE' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3111:6: (enumLiteral_15= 'MAC_OVERRIDE' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3111:8: enumLiteral_15= 'MAC_OVERRIDE'
                    {
                    enumLiteral_15=(Token)match(input,91,FOLLOW_91_in_ruleCapability7759); 

                            current = grammarAccess.getCapabilityAccess().getMAC_OVERRIDEEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_15, grammarAccess.getCapabilityAccess().getMAC_OVERRIDEEnumLiteralDeclaration_15()); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3117:6: (enumLiteral_16= 'MKNOD' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3117:6: (enumLiteral_16= 'MKNOD' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3117:8: enumLiteral_16= 'MKNOD'
                    {
                    enumLiteral_16=(Token)match(input,92,FOLLOW_92_in_ruleCapability7776); 

                            current = grammarAccess.getCapabilityAccess().getMKNODEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_16, grammarAccess.getCapabilityAccess().getMKNODEnumLiteralDeclaration_16()); 
                        

                    }


                    }
                    break;
                case 18 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3123:6: (enumLiteral_17= 'NET_ADMIN' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3123:6: (enumLiteral_17= 'NET_ADMIN' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3123:8: enumLiteral_17= 'NET_ADMIN'
                    {
                    enumLiteral_17=(Token)match(input,93,FOLLOW_93_in_ruleCapability7793); 

                            current = grammarAccess.getCapabilityAccess().getNET_ADMINEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_17, grammarAccess.getCapabilityAccess().getNET_ADMINEnumLiteralDeclaration_17()); 
                        

                    }


                    }
                    break;
                case 19 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3129:6: (enumLiteral_18= 'NET_BIND_SERVICE' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3129:6: (enumLiteral_18= 'NET_BIND_SERVICE' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3129:8: enumLiteral_18= 'NET_BIND_SERVICE'
                    {
                    enumLiteral_18=(Token)match(input,94,FOLLOW_94_in_ruleCapability7810); 

                            current = grammarAccess.getCapabilityAccess().getNET_BIND_SERVICEEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_18, grammarAccess.getCapabilityAccess().getNET_BIND_SERVICEEnumLiteralDeclaration_18()); 
                        

                    }


                    }
                    break;
                case 20 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3135:6: (enumLiteral_19= 'NET_BROADCAST' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3135:6: (enumLiteral_19= 'NET_BROADCAST' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3135:8: enumLiteral_19= 'NET_BROADCAST'
                    {
                    enumLiteral_19=(Token)match(input,95,FOLLOW_95_in_ruleCapability7827); 

                            current = grammarAccess.getCapabilityAccess().getNET_BROADCASTEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_19, grammarAccess.getCapabilityAccess().getNET_BROADCASTEnumLiteralDeclaration_19()); 
                        

                    }


                    }
                    break;
                case 21 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3141:6: (enumLiteral_20= 'NET_RAW' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3141:6: (enumLiteral_20= 'NET_RAW' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3141:8: enumLiteral_20= 'NET_RAW'
                    {
                    enumLiteral_20=(Token)match(input,96,FOLLOW_96_in_ruleCapability7844); 

                            current = grammarAccess.getCapabilityAccess().getNET_RAWEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_20, grammarAccess.getCapabilityAccess().getNET_RAWEnumLiteralDeclaration_20()); 
                        

                    }


                    }
                    break;
                case 22 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3147:6: (enumLiteral_21= 'SETFCAP' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3147:6: (enumLiteral_21= 'SETFCAP' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3147:8: enumLiteral_21= 'SETFCAP'
                    {
                    enumLiteral_21=(Token)match(input,97,FOLLOW_97_in_ruleCapability7861); 

                            current = grammarAccess.getCapabilityAccess().getSETFCAPEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_21, grammarAccess.getCapabilityAccess().getSETFCAPEnumLiteralDeclaration_21()); 
                        

                    }


                    }
                    break;
                case 23 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3153:6: (enumLiteral_22= 'SETGID' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3153:6: (enumLiteral_22= 'SETGID' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3153:8: enumLiteral_22= 'SETGID'
                    {
                    enumLiteral_22=(Token)match(input,98,FOLLOW_98_in_ruleCapability7878); 

                            current = grammarAccess.getCapabilityAccess().getSETGIDEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_22, grammarAccess.getCapabilityAccess().getSETGIDEnumLiteralDeclaration_22()); 
                        

                    }


                    }
                    break;
                case 24 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3159:6: (enumLiteral_23= 'SETPCAP' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3159:6: (enumLiteral_23= 'SETPCAP' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3159:8: enumLiteral_23= 'SETPCAP'
                    {
                    enumLiteral_23=(Token)match(input,99,FOLLOW_99_in_ruleCapability7895); 

                            current = grammarAccess.getCapabilityAccess().getSETPCAPEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_23, grammarAccess.getCapabilityAccess().getSETPCAPEnumLiteralDeclaration_23()); 
                        

                    }


                    }
                    break;
                case 25 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3165:6: (enumLiteral_24= 'SETUID' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3165:6: (enumLiteral_24= 'SETUID' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3165:8: enumLiteral_24= 'SETUID'
                    {
                    enumLiteral_24=(Token)match(input,100,FOLLOW_100_in_ruleCapability7912); 

                            current = grammarAccess.getCapabilityAccess().getSETUIDEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_24, grammarAccess.getCapabilityAccess().getSETUIDEnumLiteralDeclaration_24()); 
                        

                    }


                    }
                    break;
                case 26 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3171:6: (enumLiteral_25= 'SYS_ADMIN' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3171:6: (enumLiteral_25= 'SYS_ADMIN' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3171:8: enumLiteral_25= 'SYS_ADMIN'
                    {
                    enumLiteral_25=(Token)match(input,101,FOLLOW_101_in_ruleCapability7929); 

                            current = grammarAccess.getCapabilityAccess().getSYS_ADMINEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_25, grammarAccess.getCapabilityAccess().getSYS_ADMINEnumLiteralDeclaration_25()); 
                        

                    }


                    }
                    break;
                case 27 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3177:6: (enumLiteral_26= 'SYS_BOOT' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3177:6: (enumLiteral_26= 'SYS_BOOT' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3177:8: enumLiteral_26= 'SYS_BOOT'
                    {
                    enumLiteral_26=(Token)match(input,102,FOLLOW_102_in_ruleCapability7946); 

                            current = grammarAccess.getCapabilityAccess().getSYS_BOOTEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_26, grammarAccess.getCapabilityAccess().getSYS_BOOTEnumLiteralDeclaration_26()); 
                        

                    }


                    }
                    break;
                case 28 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3183:6: (enumLiteral_27= 'SYS_CHROOT' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3183:6: (enumLiteral_27= 'SYS_CHROOT' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3183:8: enumLiteral_27= 'SYS_CHROOT'
                    {
                    enumLiteral_27=(Token)match(input,103,FOLLOW_103_in_ruleCapability7963); 

                            current = grammarAccess.getCapabilityAccess().getSYS_CHROOTEnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_27, grammarAccess.getCapabilityAccess().getSYS_CHROOTEnumLiteralDeclaration_27()); 
                        

                    }


                    }
                    break;
                case 29 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3189:6: (enumLiteral_28= 'SYSLOG' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3189:6: (enumLiteral_28= 'SYSLOG' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3189:8: enumLiteral_28= 'SYSLOG'
                    {
                    enumLiteral_28=(Token)match(input,104,FOLLOW_104_in_ruleCapability7980); 

                            current = grammarAccess.getCapabilityAccess().getSYSLOGEnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_28, grammarAccess.getCapabilityAccess().getSYSLOGEnumLiteralDeclaration_28()); 
                        

                    }


                    }
                    break;
                case 30 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3195:6: (enumLiteral_29= 'SYS_MODULE' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3195:6: (enumLiteral_29= 'SYS_MODULE' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3195:8: enumLiteral_29= 'SYS_MODULE'
                    {
                    enumLiteral_29=(Token)match(input,105,FOLLOW_105_in_ruleCapability7997); 

                            current = grammarAccess.getCapabilityAccess().getSYS_MODULEEnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_29, grammarAccess.getCapabilityAccess().getSYS_MODULEEnumLiteralDeclaration_29()); 
                        

                    }


                    }
                    break;
                case 31 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3201:6: (enumLiteral_30= 'SYS_NICE' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3201:6: (enumLiteral_30= 'SYS_NICE' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3201:8: enumLiteral_30= 'SYS_NICE'
                    {
                    enumLiteral_30=(Token)match(input,106,FOLLOW_106_in_ruleCapability8014); 

                            current = grammarAccess.getCapabilityAccess().getSYS_NICEEnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_30, grammarAccess.getCapabilityAccess().getSYS_NICEEnumLiteralDeclaration_30()); 
                        

                    }


                    }
                    break;
                case 32 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3207:6: (enumLiteral_31= 'SYS_PACCT' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3207:6: (enumLiteral_31= 'SYS_PACCT' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3207:8: enumLiteral_31= 'SYS_PACCT'
                    {
                    enumLiteral_31=(Token)match(input,107,FOLLOW_107_in_ruleCapability8031); 

                            current = grammarAccess.getCapabilityAccess().getSYS_PACCTEnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_31, grammarAccess.getCapabilityAccess().getSYS_PACCTEnumLiteralDeclaration_31()); 
                        

                    }


                    }
                    break;
                case 33 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3213:6: (enumLiteral_32= 'SYS_PTRACE' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3213:6: (enumLiteral_32= 'SYS_PTRACE' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3213:8: enumLiteral_32= 'SYS_PTRACE'
                    {
                    enumLiteral_32=(Token)match(input,108,FOLLOW_108_in_ruleCapability8048); 

                            current = grammarAccess.getCapabilityAccess().getSYS_PTRACEEnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_32, grammarAccess.getCapabilityAccess().getSYS_PTRACEEnumLiteralDeclaration_32()); 
                        

                    }


                    }
                    break;
                case 34 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3219:6: (enumLiteral_33= 'SYS_RAWIO' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3219:6: (enumLiteral_33= 'SYS_RAWIO' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3219:8: enumLiteral_33= 'SYS_RAWIO'
                    {
                    enumLiteral_33=(Token)match(input,109,FOLLOW_109_in_ruleCapability8065); 

                            current = grammarAccess.getCapabilityAccess().getSYS_RAWIOEnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_33, grammarAccess.getCapabilityAccess().getSYS_RAWIOEnumLiteralDeclaration_33()); 
                        

                    }


                    }
                    break;
                case 35 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3225:6: (enumLiteral_34= 'SYS_RESOURCE' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3225:6: (enumLiteral_34= 'SYS_RESOURCE' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3225:8: enumLiteral_34= 'SYS_RESOURCE'
                    {
                    enumLiteral_34=(Token)match(input,110,FOLLOW_110_in_ruleCapability8082); 

                            current = grammarAccess.getCapabilityAccess().getSYS_RESOURCEEnumLiteralDeclaration_34().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_34, grammarAccess.getCapabilityAccess().getSYS_RESOURCEEnumLiteralDeclaration_34()); 
                        

                    }


                    }
                    break;
                case 36 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3231:6: (enumLiteral_35= 'SYS_TIME' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3231:6: (enumLiteral_35= 'SYS_TIME' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3231:8: enumLiteral_35= 'SYS_TIME'
                    {
                    enumLiteral_35=(Token)match(input,111,FOLLOW_111_in_ruleCapability8099); 

                            current = grammarAccess.getCapabilityAccess().getSYS_TIMEEnumLiteralDeclaration_35().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_35, grammarAccess.getCapabilityAccess().getSYS_TIMEEnumLiteralDeclaration_35()); 
                        

                    }


                    }
                    break;
                case 37 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3237:6: (enumLiteral_36= 'SYS_TTY_CONFIG' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3237:6: (enumLiteral_36= 'SYS_TTY_CONFIG' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3237:8: enumLiteral_36= 'SYS_TTY_CONFIG'
                    {
                    enumLiteral_36=(Token)match(input,112,FOLLOW_112_in_ruleCapability8116); 

                            current = grammarAccess.getCapabilityAccess().getSYS_TTY_CONFIGEnumLiteralDeclaration_36().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_36, grammarAccess.getCapabilityAccess().getSYS_TTY_CONFIGEnumLiteralDeclaration_36()); 
                        

                    }


                    }
                    break;
                case 38 :
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3243:6: (enumLiteral_37= 'WAKE_ALARM' )
                    {
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3243:6: (enumLiteral_37= 'WAKE_ALARM' )
                    // ../org.eclipse.docker.language/src-gen/org/eclipse/docker/language/parser/antlr/internal/InternalContainer.g:3243:8: enumLiteral_37= 'WAKE_ALARM'
                    {
                    enumLiteral_37=(Token)match(input,113,FOLLOW_113_in_ruleCapability8133); 

                            current = grammarAccess.getCapabilityAccess().getWAKE_ALARMEnumLiteralDeclaration_37().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_37, grammarAccess.getCapabilityAccess().getWAKE_ALARMEnumLiteralDeclaration_37()); 
                        

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
    // $ANTLR end "ruleCapability"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA4_eotS =
        "\15\uffff";
    static final String DFA4_eofS =
        "\15\uffff";
    static final String DFA4_minS =
        "\1\15\14\uffff";
    static final String DFA4_maxS =
        "\1\32\14\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA4_specialS =
        "\1\0\14\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
            "\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "()* loopback of 347:3: ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Force-rm' ( (lv_forceRM_9_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_0 = input.LA(1);

                         
                        int index4_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_0==13) ) {s = 1;}

                        else if ( LA4_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA4_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA4_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA4_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA4_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA4_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA4_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA4_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA4_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                        else if ( LA4_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 9) ) {s = 11;}

                        else if ( LA4_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 10) ) {s = 12;}

                         
                        input.seek(index4_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA23_eotS =
        "\46\uffff";
    static final String DFA23_eofS =
        "\46\uffff";
    static final String DFA23_minS =
        "\1\15\45\uffff";
    static final String DFA23_maxS =
        "\1\102\45\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\45\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44";
    static final String DFA23_specialS =
        "\1\0\45\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1\6\uffff\1\26\12\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
            "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
            "\1\43\1\uffff\1\44\1\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "()* loopback of 874:3: ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' ( (lv_volumesFrom_106_0= ruleVolumesFrom ) )+ otherlv_107= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_108= 'ulimits' otherlv_109= '{' ( (lv_ulimits_110_0= ruleUlimit ) )+ otherlv_111= '}' ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_0 = input.LA(1);

                         
                        int index23_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA23_0==13) ) {s = 1;}

                        else if ( LA23_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 0) ) {s = 2;}

                        else if ( LA23_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 1) ) {s = 3;}

                        else if ( LA23_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 2) ) {s = 4;}

                        else if ( LA23_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 3) ) {s = 5;}

                        else if ( LA23_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 4) ) {s = 6;}

                        else if ( LA23_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 5) ) {s = 7;}

                        else if ( LA23_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 6) ) {s = 8;}

                        else if ( LA23_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 7) ) {s = 9;}

                        else if ( LA23_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 8) ) {s = 10;}

                        else if ( LA23_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 9) ) {s = 11;}

                        else if ( LA23_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 10) ) {s = 12;}

                        else if ( LA23_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 11) ) {s = 13;}

                        else if ( LA23_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 12) ) {s = 14;}

                        else if ( LA23_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 13) ) {s = 15;}

                        else if ( LA23_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 14) ) {s = 16;}

                        else if ( LA23_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 15) ) {s = 17;}

                        else if ( LA23_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 16) ) {s = 18;}

                        else if ( LA23_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 17) ) {s = 19;}

                        else if ( LA23_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 18) ) {s = 20;}

                        else if ( LA23_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 19) ) {s = 21;}

                        else if ( LA23_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 20) ) {s = 22;}

                        else if ( LA23_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 21) ) {s = 23;}

                        else if ( LA23_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 22) ) {s = 24;}

                        else if ( LA23_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 23) ) {s = 25;}

                        else if ( LA23_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 24) ) {s = 26;}

                        else if ( LA23_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 25) ) {s = 27;}

                        else if ( LA23_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 26) ) {s = 28;}

                        else if ( LA23_0 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 27) ) {s = 29;}

                        else if ( LA23_0 ==58 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 28) ) {s = 30;}

                        else if ( LA23_0 ==59 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 29) ) {s = 31;}

                        else if ( LA23_0 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 30) ) {s = 32;}

                        else if ( LA23_0 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 31) ) {s = 33;}

                        else if ( LA23_0 ==62 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 32) ) {s = 34;}

                        else if ( LA23_0 ==63 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 33) ) {s = 35;}

                        else if ( LA23_0 ==65 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 34) ) {s = 36;}

                        else if ( LA23_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 35) ) {s = 37;}

                         
                        input.seek(index23_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleDocker_in_entryRuleDocker75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocker85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerSection_in_ruleDocker175 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_ruleImageSection_in_ruleDocker250 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_ruleContainerSection_in_entryRuleContainerSection325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerSection335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleContainerSection387 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContainerSection412 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_ruleContainer_in_ruleContainerSection433 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_13_in_ruleContainerSection446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageSection_in_entryRuleImageSection482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageSection492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImageSection544 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImageSection569 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_ruleImage_in_ruleImageSection590 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleImageSection603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_entryRuleImage639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImage649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImage686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImage703 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImage720 = new BitSet(new long[]{0x0000000007FF2000L});
    public static final BitSet FOLLOW_16_in_ruleImage778 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImage795 = new BitSet(new long[]{0x0000000007FF2000L});
    public static final BitSet FOLLOW_17_in_ruleImage868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImage885 = new BitSet(new long[]{0x0000000007FF2000L});
    public static final BitSet FOLLOW_18_in_ruleImage958 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleImage979 = new BitSet(new long[]{0x0000000007FF2000L});
    public static final BitSet FOLLOW_19_in_ruleImage1047 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleImage1068 = new BitSet(new long[]{0x0000000007FF2000L});
    public static final BitSet FOLLOW_20_in_ruleImage1136 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleElong_in_ruleImage1157 = new BitSet(new long[]{0x0000000007FF2000L});
    public static final BitSet FOLLOW_21_in_ruleImage1225 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleElong_in_ruleImage1246 = new BitSet(new long[]{0x0000000007FF2000L});
    public static final BitSet FOLLOW_22_in_ruleImage1314 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImage1331 = new BitSet(new long[]{0x0000000007FF2000L});
    public static final BitSet FOLLOW_23_in_ruleImage1404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImage1421 = new BitSet(new long[]{0x0000000007FF2000L});
    public static final BitSet FOLLOW_24_in_ruleImage1494 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleImage1515 = new BitSet(new long[]{0x0000000007FF2000L});
    public static final BitSet FOLLOW_25_in_ruleImage1583 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleImage1604 = new BitSet(new long[]{0x0000000007FF2000L});
    public static final BitSet FOLLOW_26_in_ruleImage1672 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleImage1693 = new BitSet(new long[]{0x0000000007FF2000L});
    public static final BitSet FOLLOW_13_in_ruleImage1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean1785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEBoolean1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEBoolean1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElong_in_entryRuleElong1894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElong1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleElong1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer1988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainer1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleContainer2035 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContainer2052 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContainer2069 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleContainer2081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContainer2098 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_31_in_ruleContainer2161 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContainer2173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleBind_in_ruleContainer2194 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000001L});
    public static final BitSet FOLLOW_13_in_ruleContainer2207 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_32_in_ruleContainer2275 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContainer2287 = new BitSet(new long[]{0x0000000000000000L,0x0003FFFFFFFFF000L});
    public static final BitSet FOLLOW_ruleCapability_in_ruleContainer2308 = new BitSet(new long[]{0x0000000000002000L,0x0003FFFFFFFFF000L});
    public static final BitSet FOLLOW_13_in_ruleContainer2321 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_33_in_ruleContainer2389 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContainer2401 = new BitSet(new long[]{0x0000000000000000L,0x0003FFFFFFFFF000L});
    public static final BitSet FOLLOW_ruleCapability_in_ruleContainer2422 = new BitSet(new long[]{0x0000000000002000L,0x0003FFFFFFFFF000L});
    public static final BitSet FOLLOW_13_in_ruleContainer2435 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_34_in_ruleContainer2503 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContainer2515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContainer2532 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleContainer2550 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_35_in_ruleContainer2618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContainer2635 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_36_in_ruleContainer2708 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContainer2725 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_37_in_ruleContainer2798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContainer2815 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_38_in_ruleContainer2888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContainer2905 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_39_in_ruleContainer2978 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContainer2995 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_40_in_ruleContainer3068 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContainer3080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleDevice_in_ruleContainer3101 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000001L});
    public static final BitSet FOLLOW_13_in_ruleContainer3114 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_41_in_ruleContainer3182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContainer3199 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleContainer3217 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_42_in_ruleContainer3285 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContainer3297 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContainer3314 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleContainer3332 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_43_in_ruleContainer3400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContainer3417 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_44_in_ruleContainer3490 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContainer3502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContainer3519 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleContainer3537 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_45_in_ruleContainer3605 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContainer3617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContainer3634 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleContainer3652 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_46_in_ruleContainer3720 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContainer3732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExposedPort_in_ruleContainer3753 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000001L});
    public static final BitSet FOLLOW_13_in_ruleContainer3766 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_47_in_ruleContainer3834 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContainer3846 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContainer3863 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleContainer3881 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_48_in_ruleContainer3949 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContainer3961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleContainer3982 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleContainer3995 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_49_in_ruleContainer4063 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContainer4075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleLink_in_ruleContainer4096 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000001L});
    public static final BitSet FOLLOW_13_in_ruleContainer4109 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_50_in_ruleContainer4177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContainer4194 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_20_in_ruleContainer4267 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleElong_in_ruleContainer4288 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_51_in_ruleContainer4356 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleElong_in_ruleContainer4377 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_52_in_ruleContainer4445 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleContainer4466 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_53_in_ruleContainer4534 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContainer4551 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_54_in_ruleContainer4624 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContainer4636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rulePortBinding_in_ruleContainer4657 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000001L});
    public static final BitSet FOLLOW_13_in_ruleContainer4670 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_55_in_ruleContainer4738 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleContainer4759 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_56_in_ruleContainer4827 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleContainer4848 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_57_in_ruleContainer4916 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleContainer4937 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_58_in_ruleContainer5005 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContainer5022 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_59_in_ruleContainer5095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContainer5112 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_60_in_ruleContainer5185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContainer5202 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_61_in_ruleContainer5275 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ruleEBoolean_in_ruleContainer5296 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_62_in_ruleContainer5364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000061L});
    public static final BitSet FOLLOW_ruleRestartPolicy_in_ruleContainer5385 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_63_in_ruleContainer5453 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContainer5465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleContainer5478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVolume_in_ruleContainer5499 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000001L});
    public static final BitSet FOLLOW_13_in_ruleContainer5513 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_65_in_ruleContainer5581 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContainer5593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleVolumesFrom_in_ruleContainer5614 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000001L});
    public static final BitSet FOLLOW_13_in_ruleContainer5627 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_66_in_ruleContainer5695 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContainer5707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleUlimit_in_ruleContainer5728 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000001L});
    public static final BitSet FOLLOW_13_in_ruleContainer5741 = new BitSet(new long[]{0xFFFFFFFF80102000L,0x0000000000000006L});
    public static final BitSet FOLLOW_13_in_ruleContainer5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVolumesFrom_in_entryRuleVolumesFrom5830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVolumesFrom5840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleVolumesFrom5877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVolumesFrom5894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleVolumesFrom5911 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleAccessMode_in_ruleVolumesFrom5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestartPolicy_in_entryRuleRestartPolicy5969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestartPolicy5979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleRestartPolicy6017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleRestartPolicy6035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleRestartPolicy6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleRestartPolicy6086 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRestartPolicy6103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePortBinding_in_entryRulePortBinding6145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePortBinding6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rulePortBinding6192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleBinding_in_rulePortBinding6213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePortBinding6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_entryRuleBinding6269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinding6279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleBinding6316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBinding6333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleBinding6350 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBinding6367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink6408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink6418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleLink6455 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLink6472 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleLink6490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLink6507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUlimit_in_entryRuleUlimit6550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUlimit6560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleUlimit6597 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUlimit6614 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUlimit6636 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUlimit6658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel6699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel6709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabel6751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabel6773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExposedPort_in_entryRuleExposedPort6814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExposedPort6824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleExposedPort6861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExposedPort6878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleExposedPort6895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleInternalProtocol_in_ruleExposedPort6916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevice_in_entryRuleDevice6952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDevice6962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleDevice6999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDevice7016 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDevice7038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDevice7060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBind_in_entryRuleBind7101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBind7111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleBind7148 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBind7165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleBind7182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVolume_in_ruleBind7203 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleBind7216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleAccessMode_in_ruleBind7237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVolume_in_entryRuleVolume7275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVolume7285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVolume7326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleInternalProtocol7380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleInternalProtocol7397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleAccessMode7442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleAccessMode7459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleCapability7504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleCapability7521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleCapability7538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleCapability7555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleCapability7572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleCapability7589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleCapability7606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleCapability7623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleCapability7640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleCapability7657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleCapability7674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleCapability7691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleCapability7708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleCapability7725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleCapability7742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleCapability7759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleCapability7776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleCapability7793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleCapability7810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleCapability7827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleCapability7844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleCapability7861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleCapability7878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleCapability7895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleCapability7912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleCapability7929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleCapability7946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleCapability7963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleCapability7980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleCapability7997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleCapability8014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleCapability8031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleCapability8048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleCapability8065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleCapability8082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleCapability8099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleCapability8116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleCapability8133 = new BitSet(new long[]{0x0000000000000002L});

}
