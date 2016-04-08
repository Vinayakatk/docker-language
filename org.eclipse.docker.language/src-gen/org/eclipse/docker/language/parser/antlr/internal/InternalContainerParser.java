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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'image'", "'{'", "'tag'", "'dockerFileLocation'", "'buildArg'", "'noCache'", "'memory'", "'memswap'", "'cpusetcpus'", "'cpushares'", "'remove'", "'quiet'", "'pull'", "'}'", "'-'", "'false'", "'true'", "'container'", "'binds'", "'capabilityAdd'", "'capabilityDrop'", "'commands'", "'containerIDFile'", "'cpuPeriod'", "'cpusetCpus'", "'cpusetMems'", "'cpuShares'", "'devices'", "'dns'", "'dnsSearch'", "'domainName'", "'entrypoint'", "'env'", "'exposedPorts'", "'extraHosts'", "'labels'", "'links'", "'macAddress'", "'memorySwap'", "'disableNetwork'", "'networkMode'", "'portBindings'", "'privileged'", "'publishAllPorts'", "'readonlyRootfs'", "'pidMode'", "'workingDir'", "'user'", "'tty'", "'restartPolicy'", "'volumes'", "'volumesFrom'", "'ulimits'", "':'", "'always'", "'onFailure'", "'none'", "'/'", "'TCP'", "'UDP'", "'rw'", "'ro'", "'ALL'", "'AUDIT_CONTROL'", "'AUDIT_WRITE'", "'BLOCK_SUSPEND'", "'CHOWN'", "'DAC_OVERRIDE'", "'DAC_READ_SEARCH'", "'FOWNER'", "'FSETID'", "'IPC_LOCK'", "'IPC_OWNER'", "'KILL'", "'LEASE'", "'LINUX_IMMUTABLE'", "'MAC_ADMIN'", "'MAC_OVERRIDE'", "'MKNOD'", "'NET_ADMIN'", "'NET_BIND_SERVICE'", "'NET_BROADCAST'", "'NET_RAW'", "'SETFCAP'", "'SETGID'", "'SETPCAP'", "'SETUID'", "'SYS_ADMIN'", "'SYS_BOOT'", "'SYS_CHROOT'", "'SYSLOG'", "'SYS_MODULE'", "'SYS_NICE'", "'SYS_PACCT'", "'SYS_PTRACE'", "'SYS_RAWIO'", "'SYS_RESOURCE'", "'SYS_TIME'", "'SYS_TTY_CONFIG'", "'WAKE_ALARM'"
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
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__83=83;
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
    public String getGrammarFileName() { return "InternalContainer.g"; }



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
    // InternalContainer.g:68:1: entryRuleDocker returns [EObject current=null] : iv_ruleDocker= ruleDocker EOF ;
    public final EObject entryRuleDocker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocker = null;


        try {
            // InternalContainer.g:69:2: (iv_ruleDocker= ruleDocker EOF )
            // InternalContainer.g:70:2: iv_ruleDocker= ruleDocker EOF
            {
             newCompositeNode(grammarAccess.getDockerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocker=ruleDocker();

            state._fsp--;

             current =iv_ruleDocker; 
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
    // $ANTLR end "entryRuleDocker"


    // $ANTLR start "ruleDocker"
    // InternalContainer.g:77:1: ruleDocker returns [EObject current=null] : ( ( (lv_containers_0_0= ruleContainer ) ) | ( (lv_images_1_0= ruleImage ) ) )* ;
    public final EObject ruleDocker() throws RecognitionException {
        EObject current = null;

        EObject lv_containers_0_0 = null;

        EObject lv_images_1_0 = null;


         enterRule(); 
            
        try {
            // InternalContainer.g:80:28: ( ( ( (lv_containers_0_0= ruleContainer ) ) | ( (lv_images_1_0= ruleImage ) ) )* )
            // InternalContainer.g:81:1: ( ( (lv_containers_0_0= ruleContainer ) ) | ( (lv_images_1_0= ruleImage ) ) )*
            {
            // InternalContainer.g:81:1: ( ( (lv_containers_0_0= ruleContainer ) ) | ( (lv_images_1_0= ruleImage ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==28) ) {
                    alt1=1;
                }
                else if ( (LA1_0==11) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalContainer.g:81:2: ( (lv_containers_0_0= ruleContainer ) )
            	    {
            	    // InternalContainer.g:81:2: ( (lv_containers_0_0= ruleContainer ) )
            	    // InternalContainer.g:82:1: (lv_containers_0_0= ruleContainer )
            	    {
            	    // InternalContainer.g:82:1: (lv_containers_0_0= ruleContainer )
            	    // InternalContainer.g:83:3: lv_containers_0_0= ruleContainer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDockerAccess().getContainersContainerParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_3);
            	    lv_containers_0_0=ruleContainer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDockerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"containers",
            	            		lv_containers_0_0, 
            	            		"org.eclipse.docker.language.Container.Container");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalContainer.g:100:6: ( (lv_images_1_0= ruleImage ) )
            	    {
            	    // InternalContainer.g:100:6: ( (lv_images_1_0= ruleImage ) )
            	    // InternalContainer.g:101:1: (lv_images_1_0= ruleImage )
            	    {
            	    // InternalContainer.g:101:1: (lv_images_1_0= ruleImage )
            	    // InternalContainer.g:102:3: lv_images_1_0= ruleImage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDockerAccess().getImagesImageParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_3);
            	    lv_images_1_0=ruleImage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDockerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"images",
            	            		lv_images_1_0, 
            	            		"org.eclipse.docker.language.Container.Image");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleImage"
    // InternalContainer.g:126:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalContainer.g:127:2: (iv_ruleImage= ruleImage EOF )
            // InternalContainer.g:128:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalContainer.g:135:1: ruleImage returns [EObject current=null] : (otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'buildArg' ( (lv_buildargs_9_0= ruleBuildArgs ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) otherlv_26= '}' ) ;
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
        EObject lv_buildargs_9_0 = null;

        AntlrDatatypeRuleToken lv_noCache_11_0 = null;

        AntlrDatatypeRuleToken lv_memory_13_0 = null;

        AntlrDatatypeRuleToken lv_memswap_15_0 = null;

        AntlrDatatypeRuleToken lv_remove_21_0 = null;

        AntlrDatatypeRuleToken lv_quiet_23_0 = null;

        AntlrDatatypeRuleToken lv_pull_25_0 = null;


         enterRule(); 
            
        try {
            // InternalContainer.g:138:28: ( (otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'buildArg' ( (lv_buildargs_9_0= ruleBuildArgs ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) otherlv_26= '}' ) )
            // InternalContainer.g:139:1: (otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'buildArg' ( (lv_buildargs_9_0= ruleBuildArgs ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) otherlv_26= '}' )
            {
            // InternalContainer.g:139:1: (otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'buildArg' ( (lv_buildargs_9_0= ruleBuildArgs ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) otherlv_26= '}' )
            // InternalContainer.g:139:3: otherlv_0= 'image' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'buildArg' ( (lv_buildargs_9_0= ruleBuildArgs ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
                
            // InternalContainer.g:143:1: ( (lv_name_1_0= RULE_STRING ) )
            // InternalContainer.g:144:1: (lv_name_1_0= RULE_STRING )
            {
            // InternalContainer.g:144:1: (lv_name_1_0= RULE_STRING )
            // InternalContainer.g:145:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            			newLeafNode(lv_name_1_0, grammarAccess.getImageAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

                	newLeafNode(otherlv_2, grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalContainer.g:165:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'buildArg' ( (lv_buildargs_9_0= ruleBuildArgs ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )* ) ) )
            // InternalContainer.g:167:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'buildArg' ( (lv_buildargs_9_0= ruleBuildArgs ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            {
            // InternalContainer.g:167:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'buildArg' ( (lv_buildargs_9_0= ruleBuildArgs ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            // InternalContainer.g:168:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'buildArg' ( (lv_buildargs_9_0= ruleBuildArgs ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getImageAccess().getUnorderedGroup_3());
            	
            // InternalContainer.g:171:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'buildArg' ( (lv_buildargs_9_0= ruleBuildArgs ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )* )
            // InternalContainer.g:172:3: ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'buildArg' ( (lv_buildargs_9_0= ruleBuildArgs ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )*
            {
            // InternalContainer.g:172:3: ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'buildArg' ( (lv_buildargs_9_0= ruleBuildArgs ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )*
            loop3:
            do {
                int alt3=12;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalContainer.g:174:4: ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:174:4: ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalContainer.g:175:5: {...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalContainer.g:175:102: ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) )
            	    // InternalContainer.g:176:6: ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // InternalContainer.g:179:6: ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) )
            	    // InternalContainer.g:179:7: {...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalContainer.g:179:16: (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) )
            	    // InternalContainer.g:179:18: otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_4); 

            	        	newLeafNode(otherlv_4, grammarAccess.getImageAccess().getTagKeyword_3_0_0());
            	        
            	    // InternalContainer.g:183:1: ( (lv_tag_5_0= RULE_STRING ) )
            	    // InternalContainer.g:184:1: (lv_tag_5_0= RULE_STRING )
            	    {
            	    // InternalContainer.g:184:1: (lv_tag_5_0= RULE_STRING )
            	    // InternalContainer.g:185:3: lv_tag_5_0= RULE_STRING
            	    {
            	    lv_tag_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            	    			newLeafNode(lv_tag_5_0, grammarAccess.getImageAccess().getTagSTRINGTerminalRuleCall_3_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getImageRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"tag",
            	            		lv_tag_5_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

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
            	    // InternalContainer.g:208:4: ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:208:4: ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) )
            	    // InternalContainer.g:209:5: {...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalContainer.g:209:102: ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) )
            	    // InternalContainer.g:210:6: ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // InternalContainer.g:213:6: ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) )
            	    // InternalContainer.g:213:7: {...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalContainer.g:213:16: (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) )
            	    // InternalContainer.g:213:18: otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_4); 

            	        	newLeafNode(otherlv_6, grammarAccess.getImageAccess().getDockerFileLocationKeyword_3_1_0());
            	        
            	    // InternalContainer.g:217:1: ( (lv_dockerFilelocation_7_0= RULE_STRING ) )
            	    // InternalContainer.g:218:1: (lv_dockerFilelocation_7_0= RULE_STRING )
            	    {
            	    // InternalContainer.g:218:1: (lv_dockerFilelocation_7_0= RULE_STRING )
            	    // InternalContainer.g:219:3: lv_dockerFilelocation_7_0= RULE_STRING
            	    {
            	    lv_dockerFilelocation_7_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            	    			newLeafNode(lv_dockerFilelocation_7_0, grammarAccess.getImageAccess().getDockerFilelocationSTRINGTerminalRuleCall_3_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getImageRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"dockerFilelocation",
            	            		lv_dockerFilelocation_7_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

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
            	    // InternalContainer.g:242:4: ({...}? => ( ({...}? => (otherlv_8= 'buildArg' ( (lv_buildargs_9_0= ruleBuildArgs ) )+ ) ) ) )
            	    {
            	    // InternalContainer.g:242:4: ({...}? => ( ({...}? => (otherlv_8= 'buildArg' ( (lv_buildargs_9_0= ruleBuildArgs ) )+ ) ) ) )
            	    // InternalContainer.g:243:5: {...}? => ( ({...}? => (otherlv_8= 'buildArg' ( (lv_buildargs_9_0= ruleBuildArgs ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalContainer.g:243:102: ( ({...}? => (otherlv_8= 'buildArg' ( (lv_buildargs_9_0= ruleBuildArgs ) )+ ) ) )
            	    // InternalContainer.g:244:6: ({...}? => (otherlv_8= 'buildArg' ( (lv_buildargs_9_0= ruleBuildArgs ) )+ ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // InternalContainer.g:247:6: ({...}? => (otherlv_8= 'buildArg' ( (lv_buildargs_9_0= ruleBuildArgs ) )+ ) )
            	    // InternalContainer.g:247:7: {...}? => (otherlv_8= 'buildArg' ( (lv_buildargs_9_0= ruleBuildArgs ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalContainer.g:247:16: (otherlv_8= 'buildArg' ( (lv_buildargs_9_0= ruleBuildArgs ) )+ )
            	    // InternalContainer.g:247:18: otherlv_8= 'buildArg' ( (lv_buildargs_9_0= ruleBuildArgs ) )+
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

            	        	newLeafNode(otherlv_8, grammarAccess.getImageAccess().getBuildArgKeyword_3_2_0());
            	        
            	    // InternalContainer.g:251:1: ( (lv_buildargs_9_0= ruleBuildArgs ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==25) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalContainer.g:252:1: (lv_buildargs_9_0= ruleBuildArgs )
            	    	    {
            	    	    // InternalContainer.g:252:1: (lv_buildargs_9_0= ruleBuildArgs )
            	    	    // InternalContainer.g:253:3: lv_buildargs_9_0= ruleBuildArgs
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getImageAccess().getBuildargsBuildArgsParserRuleCall_3_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_buildargs_9_0=ruleBuildArgs();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getImageRule());
            	    	    	        }
            	    	           		set(
            	    	           			current, 
            	    	           			"buildargs",
            	    	            		lv_buildargs_9_0, 
            	    	            		"org.eclipse.docker.language.Container.BuildArgs");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalContainer.g:276:4: ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:276:4: ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalContainer.g:277:5: {...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalContainer.g:277:102: ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) )
            	    // InternalContainer.g:278:6: ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // InternalContainer.g:281:6: ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) )
            	    // InternalContainer.g:281:7: {...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalContainer.g:281:16: (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) )
            	    // InternalContainer.g:281:18: otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_9); 

            	        	newLeafNode(otherlv_10, grammarAccess.getImageAccess().getNoCacheKeyword_3_3_0());
            	        
            	    // InternalContainer.g:285:1: ( (lv_noCache_11_0= ruleEBoolean ) )
            	    // InternalContainer.g:286:1: (lv_noCache_11_0= ruleEBoolean )
            	    {
            	    // InternalContainer.g:286:1: (lv_noCache_11_0= ruleEBoolean )
            	    // InternalContainer.g:287:3: lv_noCache_11_0= ruleEBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageAccess().getNoCacheEBooleanParserRuleCall_3_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_6);
            	    lv_noCache_11_0=ruleEBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"noCache",
            	            		lv_noCache_11_0, 
            	            		"org.eclipse.docker.language.Container.EBoolean");
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
            	    // InternalContainer.g:310:4: ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:310:4: ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) )
            	    // InternalContainer.g:311:5: {...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalContainer.g:311:102: ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) )
            	    // InternalContainer.g:312:6: ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // InternalContainer.g:315:6: ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) )
            	    // InternalContainer.g:315:7: {...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalContainer.g:315:16: (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) )
            	    // InternalContainer.g:315:18: otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) )
            	    {
            	    otherlv_12=(Token)match(input,17,FOLLOW_10); 

            	        	newLeafNode(otherlv_12, grammarAccess.getImageAccess().getMemoryKeyword_3_4_0());
            	        
            	    // InternalContainer.g:319:1: ( (lv_memory_13_0= ruleElong ) )
            	    // InternalContainer.g:320:1: (lv_memory_13_0= ruleElong )
            	    {
            	    // InternalContainer.g:320:1: (lv_memory_13_0= ruleElong )
            	    // InternalContainer.g:321:3: lv_memory_13_0= ruleElong
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageAccess().getMemoryElongParserRuleCall_3_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_6);
            	    lv_memory_13_0=ruleElong();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"memory",
            	            		lv_memory_13_0, 
            	            		"org.eclipse.docker.language.Container.Elong");
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
            	    // InternalContainer.g:344:4: ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:344:4: ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) )
            	    // InternalContainer.g:345:5: {...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalContainer.g:345:102: ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) )
            	    // InternalContainer.g:346:6: ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // InternalContainer.g:349:6: ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) )
            	    // InternalContainer.g:349:7: {...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalContainer.g:349:16: (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) )
            	    // InternalContainer.g:349:18: otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) )
            	    {
            	    otherlv_14=(Token)match(input,18,FOLLOW_10); 

            	        	newLeafNode(otherlv_14, grammarAccess.getImageAccess().getMemswapKeyword_3_5_0());
            	        
            	    // InternalContainer.g:353:1: ( (lv_memswap_15_0= ruleElong ) )
            	    // InternalContainer.g:354:1: (lv_memswap_15_0= ruleElong )
            	    {
            	    // InternalContainer.g:354:1: (lv_memswap_15_0= ruleElong )
            	    // InternalContainer.g:355:3: lv_memswap_15_0= ruleElong
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageAccess().getMemswapElongParserRuleCall_3_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_6);
            	    lv_memswap_15_0=ruleElong();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"memswap",
            	            		lv_memswap_15_0, 
            	            		"org.eclipse.docker.language.Container.Elong");
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
            	    // InternalContainer.g:378:4: ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:378:4: ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) )
            	    // InternalContainer.g:379:5: {...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalContainer.g:379:102: ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) )
            	    // InternalContainer.g:380:6: ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // InternalContainer.g:383:6: ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) )
            	    // InternalContainer.g:383:7: {...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalContainer.g:383:16: (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) )
            	    // InternalContainer.g:383:18: otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) )
            	    {
            	    otherlv_16=(Token)match(input,19,FOLLOW_4); 

            	        	newLeafNode(otherlv_16, grammarAccess.getImageAccess().getCpusetcpusKeyword_3_6_0());
            	        
            	    // InternalContainer.g:387:1: ( (lv_cpusetcpus_17_0= RULE_STRING ) )
            	    // InternalContainer.g:388:1: (lv_cpusetcpus_17_0= RULE_STRING )
            	    {
            	    // InternalContainer.g:388:1: (lv_cpusetcpus_17_0= RULE_STRING )
            	    // InternalContainer.g:389:3: lv_cpusetcpus_17_0= RULE_STRING
            	    {
            	    lv_cpusetcpus_17_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            	    			newLeafNode(lv_cpusetcpus_17_0, grammarAccess.getImageAccess().getCpusetcpusSTRINGTerminalRuleCall_3_6_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getImageRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"cpusetcpus",
            	            		lv_cpusetcpus_17_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

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
            	    // InternalContainer.g:412:4: ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:412:4: ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) )
            	    // InternalContainer.g:413:5: {...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalContainer.g:413:102: ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) )
            	    // InternalContainer.g:414:6: ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 7);
            	    	 				
            	    // InternalContainer.g:417:6: ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) )
            	    // InternalContainer.g:417:7: {...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalContainer.g:417:16: (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) )
            	    // InternalContainer.g:417:18: otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) )
            	    {
            	    otherlv_18=(Token)match(input,20,FOLLOW_4); 

            	        	newLeafNode(otherlv_18, grammarAccess.getImageAccess().getCpusharesKeyword_3_7_0());
            	        
            	    // InternalContainer.g:421:1: ( (lv_cpushares_19_0= RULE_STRING ) )
            	    // InternalContainer.g:422:1: (lv_cpushares_19_0= RULE_STRING )
            	    {
            	    // InternalContainer.g:422:1: (lv_cpushares_19_0= RULE_STRING )
            	    // InternalContainer.g:423:3: lv_cpushares_19_0= RULE_STRING
            	    {
            	    lv_cpushares_19_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            	    			newLeafNode(lv_cpushares_19_0, grammarAccess.getImageAccess().getCpusharesSTRINGTerminalRuleCall_3_7_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getImageRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"cpushares",
            	            		lv_cpushares_19_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

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
            	    // InternalContainer.g:446:4: ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:446:4: ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalContainer.g:447:5: {...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalContainer.g:447:102: ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) )
            	    // InternalContainer.g:448:6: ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 8);
            	    	 				
            	    // InternalContainer.g:451:6: ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) )
            	    // InternalContainer.g:451:7: {...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalContainer.g:451:16: (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) )
            	    // InternalContainer.g:451:18: otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) )
            	    {
            	    otherlv_20=(Token)match(input,21,FOLLOW_9); 

            	        	newLeafNode(otherlv_20, grammarAccess.getImageAccess().getRemoveKeyword_3_8_0());
            	        
            	    // InternalContainer.g:455:1: ( (lv_remove_21_0= ruleEBoolean ) )
            	    // InternalContainer.g:456:1: (lv_remove_21_0= ruleEBoolean )
            	    {
            	    // InternalContainer.g:456:1: (lv_remove_21_0= ruleEBoolean )
            	    // InternalContainer.g:457:3: lv_remove_21_0= ruleEBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageAccess().getRemoveEBooleanParserRuleCall_3_8_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_6);
            	    lv_remove_21_0=ruleEBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"remove",
            	            		lv_remove_21_0, 
            	            		"org.eclipse.docker.language.Container.EBoolean");
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
            	    // InternalContainer.g:480:4: ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:480:4: ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalContainer.g:481:5: {...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // InternalContainer.g:481:102: ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) )
            	    // InternalContainer.g:482:6: ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 9);
            	    	 				
            	    // InternalContainer.g:485:6: ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) )
            	    // InternalContainer.g:485:7: {...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalContainer.g:485:16: (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) )
            	    // InternalContainer.g:485:18: otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) )
            	    {
            	    otherlv_22=(Token)match(input,22,FOLLOW_9); 

            	        	newLeafNode(otherlv_22, grammarAccess.getImageAccess().getQuietKeyword_3_9_0());
            	        
            	    // InternalContainer.g:489:1: ( (lv_quiet_23_0= ruleEBoolean ) )
            	    // InternalContainer.g:490:1: (lv_quiet_23_0= ruleEBoolean )
            	    {
            	    // InternalContainer.g:490:1: (lv_quiet_23_0= ruleEBoolean )
            	    // InternalContainer.g:491:3: lv_quiet_23_0= ruleEBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageAccess().getQuietEBooleanParserRuleCall_3_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_6);
            	    lv_quiet_23_0=ruleEBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"quiet",
            	            		lv_quiet_23_0, 
            	            		"org.eclipse.docker.language.Container.EBoolean");
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
            	    // InternalContainer.g:514:4: ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:514:4: ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalContainer.g:515:5: {...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // InternalContainer.g:515:103: ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) )
            	    // InternalContainer.g:516:6: ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 10);
            	    	 				
            	    // InternalContainer.g:519:6: ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) )
            	    // InternalContainer.g:519:7: {...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalContainer.g:519:16: (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) )
            	    // InternalContainer.g:519:18: otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) )
            	    {
            	    otherlv_24=(Token)match(input,23,FOLLOW_9); 

            	        	newLeafNode(otherlv_24, grammarAccess.getImageAccess().getPullKeyword_3_10_0());
            	        
            	    // InternalContainer.g:523:1: ( (lv_pull_25_0= ruleEBoolean ) )
            	    // InternalContainer.g:524:1: (lv_pull_25_0= ruleEBoolean )
            	    {
            	    // InternalContainer.g:524:1: (lv_pull_25_0= ruleEBoolean )
            	    // InternalContainer.g:525:3: lv_pull_25_0= ruleEBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageAccess().getPullEBooleanParserRuleCall_3_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_6);
            	    lv_pull_25_0=ruleEBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"pull",
            	            		lv_pull_25_0, 
            	            		"org.eclipse.docker.language.Container.EBoolean");
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
            	    break loop3;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getImageAccess().getUnorderedGroup_3());
            	

            }

            otherlv_26=(Token)match(input,24,FOLLOW_2); 

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


    // $ANTLR start "entryRuleBuildArgs"
    // InternalContainer.g:567:1: entryRuleBuildArgs returns [EObject current=null] : iv_ruleBuildArgs= ruleBuildArgs EOF ;
    public final EObject entryRuleBuildArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildArgs = null;


        try {
            // InternalContainer.g:568:2: (iv_ruleBuildArgs= ruleBuildArgs EOF )
            // InternalContainer.g:569:2: iv_ruleBuildArgs= ruleBuildArgs EOF
            {
             newCompositeNode(grammarAccess.getBuildArgsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuildArgs=ruleBuildArgs();

            state._fsp--;

             current =iv_ruleBuildArgs; 
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
    // $ANTLR end "entryRuleBuildArgs"


    // $ANTLR start "ruleBuildArgs"
    // InternalContainer.g:576:1: ruleBuildArgs returns [EObject current=null] : (otherlv_0= '-' ( (lv_key_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleBuildArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // InternalContainer.g:579:28: ( (otherlv_0= '-' ( (lv_key_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalContainer.g:580:1: (otherlv_0= '-' ( (lv_key_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalContainer.g:580:1: (otherlv_0= '-' ( (lv_key_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalContainer.g:580:3: otherlv_0= '-' ( (lv_key_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getBuildArgsAccess().getHyphenMinusKeyword_0());
                
            // InternalContainer.g:584:1: ( (lv_key_1_0= RULE_STRING ) )
            // InternalContainer.g:585:1: (lv_key_1_0= RULE_STRING )
            {
            // InternalContainer.g:585:1: (lv_key_1_0= RULE_STRING )
            // InternalContainer.g:586:3: lv_key_1_0= RULE_STRING
            {
            lv_key_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            			newLeafNode(lv_key_1_0, grammarAccess.getBuildArgsAccess().getKeySTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBuildArgsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalContainer.g:602:2: ( (lv_value_2_0= RULE_STRING ) )
            // InternalContainer.g:603:1: (lv_value_2_0= RULE_STRING )
            {
            // InternalContainer.g:603:1: (lv_value_2_0= RULE_STRING )
            // InternalContainer.g:604:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_value_2_0, grammarAccess.getBuildArgsAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBuildArgsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // $ANTLR end "ruleBuildArgs"


    // $ANTLR start "entryRuleEBoolean"
    // InternalContainer.g:628:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalContainer.g:629:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalContainer.g:630:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalContainer.g:637:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'false' | kw= 'true' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalContainer.g:640:28: ( (kw= 'false' | kw= 'true' ) )
            // InternalContainer.g:641:1: (kw= 'false' | kw= 'true' )
            {
            // InternalContainer.g:641:1: (kw= 'false' | kw= 'true' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalContainer.g:642:2: kw= 'false'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalContainer.g:649:2: kw= 'true'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

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
    // InternalContainer.g:662:1: entryRuleElong returns [String current=null] : iv_ruleElong= ruleElong EOF ;
    public final String entryRuleElong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElong = null;


        try {
            // InternalContainer.g:663:2: (iv_ruleElong= ruleElong EOF )
            // InternalContainer.g:664:2: iv_ruleElong= ruleElong EOF
            {
             newCompositeNode(grammarAccess.getElongRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElong=ruleElong();

            state._fsp--;

             current =iv_ruleElong.getText(); 
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
    // $ANTLR end "entryRuleElong"


    // $ANTLR start "ruleElong"
    // InternalContainer.g:671:1: ruleElong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleElong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // InternalContainer.g:674:28: (this_INT_0= RULE_INT )
            // InternalContainer.g:675:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

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
    // InternalContainer.g:690:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalContainer.g:691:2: (iv_ruleContainer= ruleContainer EOF )
            // InternalContainer.g:692:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalContainer.g:699:1: ruleContainer returns [EObject current=null] : (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'image' ( (lv_image_4_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+ otherlv_108= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'ulimits' otherlv_110= '{' (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+ otherlv_113= '}' ) ) ) ) )* ) ) ) otherlv_114= '}' ) ;
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
        Token otherlv_106=null;
        Token otherlv_108=null;
        Token otherlv_109=null;
        Token otherlv_110=null;
        Token otherlv_111=null;
        Token otherlv_113=null;
        Token otherlv_114=null;
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

        EObject lv_volumesFrom_107_0 = null;

        EObject lv_ulimits_112_0 = null;


         enterRule(); 
            
        try {
            // InternalContainer.g:702:28: ( (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'image' ( (lv_image_4_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+ otherlv_108= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'ulimits' otherlv_110= '{' (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+ otherlv_113= '}' ) ) ) ) )* ) ) ) otherlv_114= '}' ) )
            // InternalContainer.g:703:1: (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'image' ( (lv_image_4_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+ otherlv_108= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'ulimits' otherlv_110= '{' (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+ otherlv_113= '}' ) ) ) ) )* ) ) ) otherlv_114= '}' )
            {
            // InternalContainer.g:703:1: (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'image' ( (lv_image_4_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+ otherlv_108= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'ulimits' otherlv_110= '{' (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+ otherlv_113= '}' ) ) ) ) )* ) ) ) otherlv_114= '}' )
            // InternalContainer.g:703:3: otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'image' ( (lv_image_4_0= RULE_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+ otherlv_108= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'ulimits' otherlv_110= '{' (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+ otherlv_113= '}' ) ) ) ) )* ) ) ) otherlv_114= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_11); 

                	newLeafNode(otherlv_0, grammarAccess.getContainerAccess().getContainerKeyword_0());
                
            // InternalContainer.g:707:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalContainer.g:708:1: (lv_name_1_0= RULE_ID )
            {
            // InternalContainer.g:708:1: (lv_name_1_0= RULE_ID )
            // InternalContainer.g:709:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            			newLeafNode(lv_name_1_0, grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

                	newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,11,FOLLOW_4); 

                	newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getImageKeyword_3());
                
            // InternalContainer.g:733:1: ( (lv_image_4_0= RULE_STRING ) )
            // InternalContainer.g:734:1: (lv_image_4_0= RULE_STRING )
            {
            // InternalContainer.g:734:1: (lv_image_4_0= RULE_STRING )
            // InternalContainer.g:735:3: lv_image_4_0= RULE_STRING
            {
            lv_image_4_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            			newLeafNode(lv_image_4_0, grammarAccess.getContainerAccess().getImageSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"image",
                    		lv_image_4_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalContainer.g:751:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+ otherlv_108= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'ulimits' otherlv_110= '{' (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+ otherlv_113= '}' ) ) ) ) )* ) ) )
            // InternalContainer.g:753:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+ otherlv_108= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'ulimits' otherlv_110= '{' (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+ otherlv_113= '}' ) ) ) ) )* ) )
            {
            // InternalContainer.g:753:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+ otherlv_108= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'ulimits' otherlv_110= '{' (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+ otherlv_113= '}' ) ) ) ) )* ) )
            // InternalContainer.g:754:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+ otherlv_108= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'ulimits' otherlv_110= '{' (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+ otherlv_113= '}' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	
            // InternalContainer.g:757:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+ otherlv_108= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'ulimits' otherlv_110= '{' (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+ otherlv_113= '}' ) ) ) ) )* )
            // InternalContainer.g:758:3: ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+ otherlv_108= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'ulimits' otherlv_110= '{' (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+ otherlv_113= '}' ) ) ) ) )*
            {
            // InternalContainer.g:758:3: ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+ otherlv_108= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'ulimits' otherlv_110= '{' (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+ otherlv_113= '}' ) ) ) ) )*
            loop22:
            do {
                int alt22=37;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // InternalContainer.g:760:4: ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) )
            	    {
            	    // InternalContainer.g:760:4: ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) )
            	    // InternalContainer.g:761:5: {...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalContainer.g:761:106: ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) )
            	    // InternalContainer.g:762:6: ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 0);
            	    	 				
            	    // InternalContainer.g:765:6: ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) )
            	    // InternalContainer.g:765:7: {...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:765:16: (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' )
            	    // InternalContainer.g:765:18: otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}'
            	    {
            	    otherlv_6=(Token)match(input,29,FOLLOW_5); 

            	        	newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getBindsKeyword_5_0_0());
            	        
            	    otherlv_7=(Token)match(input,12,FOLLOW_7); 

            	        	newLeafNode(otherlv_7, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_0_1());
            	        
            	    // InternalContainer.g:773:1: ( (lv_binds_8_0= ruleBind ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==25) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalContainer.g:774:1: (lv_binds_8_0= ruleBind )
            	    	    {
            	    	    // InternalContainer.g:774:1: (lv_binds_8_0= ruleBind )
            	    	    // InternalContainer.g:775:3: lv_binds_8_0= ruleBind
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContainerAccess().getBindsBindParserRuleCall_5_0_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_binds_8_0=ruleBind();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"binds",
            	    	            		lv_binds_8_0, 
            	    	            		"org.eclipse.docker.language.Container.Bind");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	    otherlv_9=(Token)match(input,24,FOLLOW_13); 

            	        	newLeafNode(otherlv_9, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalContainer.g:802:4: ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) )
            	    {
            	    // InternalContainer.g:802:4: ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) )
            	    // InternalContainer.g:803:5: {...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalContainer.g:803:106: ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) )
            	    // InternalContainer.g:804:6: ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 1);
            	    	 				
            	    // InternalContainer.g:807:6: ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) )
            	    // InternalContainer.g:807:7: {...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:807:16: (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' )
            	    // InternalContainer.g:807:18: otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}'
            	    {
            	    otherlv_10=(Token)match(input,30,FOLLOW_5); 

            	        	newLeafNode(otherlv_10, grammarAccess.getContainerAccess().getCapabilityAddKeyword_5_1_0());
            	        
            	    otherlv_11=(Token)match(input,12,FOLLOW_15); 

            	        	newLeafNode(otherlv_11, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_1_1());
            	        
            	    // InternalContainer.g:815:1: ( (lv_capabilityAdd_12_0= ruleCapability ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( ((LA6_0>=73 && LA6_0<=110)) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalContainer.g:816:1: (lv_capabilityAdd_12_0= ruleCapability )
            	    	    {
            	    	    // InternalContainer.g:816:1: (lv_capabilityAdd_12_0= ruleCapability )
            	    	    // InternalContainer.g:817:3: lv_capabilityAdd_12_0= ruleCapability
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContainerAccess().getCapabilityAddCapabilityEnumRuleCall_5_1_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_16);
            	    	    lv_capabilityAdd_12_0=ruleCapability();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"capabilityAdd",
            	    	            		lv_capabilityAdd_12_0, 
            	    	            		"org.eclipse.docker.language.Container.Capability");
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

            	    otherlv_13=(Token)match(input,24,FOLLOW_13); 

            	        	newLeafNode(otherlv_13, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalContainer.g:844:4: ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) )
            	    {
            	    // InternalContainer.g:844:4: ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) )
            	    // InternalContainer.g:845:5: {...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalContainer.g:845:106: ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) )
            	    // InternalContainer.g:846:6: ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 2);
            	    	 				
            	    // InternalContainer.g:849:6: ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) )
            	    // InternalContainer.g:849:7: {...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:849:16: (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' )
            	    // InternalContainer.g:849:18: otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}'
            	    {
            	    otherlv_14=(Token)match(input,31,FOLLOW_5); 

            	        	newLeafNode(otherlv_14, grammarAccess.getContainerAccess().getCapabilityDropKeyword_5_2_0());
            	        
            	    otherlv_15=(Token)match(input,12,FOLLOW_15); 

            	        	newLeafNode(otherlv_15, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_2_1());
            	        
            	    // InternalContainer.g:857:1: ( (lv_capabilityDrop_16_0= ruleCapability ) )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( ((LA7_0>=73 && LA7_0<=110)) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalContainer.g:858:1: (lv_capabilityDrop_16_0= ruleCapability )
            	    	    {
            	    	    // InternalContainer.g:858:1: (lv_capabilityDrop_16_0= ruleCapability )
            	    	    // InternalContainer.g:859:3: lv_capabilityDrop_16_0= ruleCapability
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContainerAccess().getCapabilityDropCapabilityEnumRuleCall_5_2_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_16);
            	    	    lv_capabilityDrop_16_0=ruleCapability();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"capabilityDrop",
            	    	            		lv_capabilityDrop_16_0, 
            	    	            		"org.eclipse.docker.language.Container.Capability");
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

            	    otherlv_17=(Token)match(input,24,FOLLOW_13); 

            	        	newLeafNode(otherlv_17, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalContainer.g:886:4: ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) )
            	    {
            	    // InternalContainer.g:886:4: ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) )
            	    // InternalContainer.g:887:5: {...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // InternalContainer.g:887:106: ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) )
            	    // InternalContainer.g:888:6: ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 3);
            	    	 				
            	    // InternalContainer.g:891:6: ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) )
            	    // InternalContainer.g:891:7: {...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:891:16: (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' )
            	    // InternalContainer.g:891:18: otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}'
            	    {
            	    otherlv_18=(Token)match(input,32,FOLLOW_5); 

            	        	newLeafNode(otherlv_18, grammarAccess.getContainerAccess().getCommandsKeyword_5_3_0());
            	        
            	    otherlv_19=(Token)match(input,12,FOLLOW_4); 

            	        	newLeafNode(otherlv_19, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_3_1());
            	        
            	    // InternalContainer.g:899:1: ( (lv_commands_20_0= RULE_STRING ) )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==RULE_STRING) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalContainer.g:900:1: (lv_commands_20_0= RULE_STRING )
            	    	    {
            	    	    // InternalContainer.g:900:1: (lv_commands_20_0= RULE_STRING )
            	    	    // InternalContainer.g:901:3: lv_commands_20_0= RULE_STRING
            	    	    {
            	    	    lv_commands_20_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    	    			newLeafNode(lv_commands_20_0, grammarAccess.getContainerAccess().getCommandsSTRINGTerminalRuleCall_5_3_2_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		addWithLastConsumed(
            	    	           			current, 
            	    	           			"commands",
            	    	            		lv_commands_20_0, 
            	    	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    	    

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

            	    otherlv_21=(Token)match(input,24,FOLLOW_13); 

            	        	newLeafNode(otherlv_21, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalContainer.g:928:4: ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:928:4: ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) )
            	    // InternalContainer.g:929:5: {...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // InternalContainer.g:929:106: ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) )
            	    // InternalContainer.g:930:6: ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 4);
            	    	 				
            	    // InternalContainer.g:933:6: ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) )
            	    // InternalContainer.g:933:7: {...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:933:16: (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) )
            	    // InternalContainer.g:933:18: otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) )
            	    {
            	    otherlv_22=(Token)match(input,33,FOLLOW_4); 

            	        	newLeafNode(otherlv_22, grammarAccess.getContainerAccess().getContainerIDFileKeyword_5_4_0());
            	        
            	    // InternalContainer.g:937:1: ( (lv_containerIDFile_23_0= RULE_STRING ) )
            	    // InternalContainer.g:938:1: (lv_containerIDFile_23_0= RULE_STRING )
            	    {
            	    // InternalContainer.g:938:1: (lv_containerIDFile_23_0= RULE_STRING )
            	    // InternalContainer.g:939:3: lv_containerIDFile_23_0= RULE_STRING
            	    {
            	    lv_containerIDFile_23_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    			newLeafNode(lv_containerIDFile_23_0, grammarAccess.getContainerAccess().getContainerIDFileSTRINGTerminalRuleCall_5_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"containerIDFile",
            	            		lv_containerIDFile_23_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

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
            	    // InternalContainer.g:962:4: ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:962:4: ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) )
            	    // InternalContainer.g:963:5: {...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 5)");
            	    }
            	    // InternalContainer.g:963:106: ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) )
            	    // InternalContainer.g:964:6: ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 5);
            	    	 				
            	    // InternalContainer.g:967:6: ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) )
            	    // InternalContainer.g:967:7: {...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:967:16: (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) )
            	    // InternalContainer.g:967:18: otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) )
            	    {
            	    otherlv_24=(Token)match(input,34,FOLLOW_10); 

            	        	newLeafNode(otherlv_24, grammarAccess.getContainerAccess().getCpuPeriodKeyword_5_5_0());
            	        
            	    // InternalContainer.g:971:1: ( (lv_cpuPeriod_25_0= RULE_INT ) )
            	    // InternalContainer.g:972:1: (lv_cpuPeriod_25_0= RULE_INT )
            	    {
            	    // InternalContainer.g:972:1: (lv_cpuPeriod_25_0= RULE_INT )
            	    // InternalContainer.g:973:3: lv_cpuPeriod_25_0= RULE_INT
            	    {
            	    lv_cpuPeriod_25_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            	    			newLeafNode(lv_cpuPeriod_25_0, grammarAccess.getContainerAccess().getCpuPeriodINTTerminalRuleCall_5_5_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"cpuPeriod",
            	            		lv_cpuPeriod_25_0, 
            	            		"org.eclipse.xtext.common.Terminals.INT");
            	    	    

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
            	    // InternalContainer.g:996:4: ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:996:4: ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) )
            	    // InternalContainer.g:997:5: {...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 6)");
            	    }
            	    // InternalContainer.g:997:106: ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) )
            	    // InternalContainer.g:998:6: ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 6);
            	    	 				
            	    // InternalContainer.g:1001:6: ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) )
            	    // InternalContainer.g:1001:7: {...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1001:16: (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) )
            	    // InternalContainer.g:1001:18: otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) )
            	    {
            	    otherlv_26=(Token)match(input,35,FOLLOW_4); 

            	        	newLeafNode(otherlv_26, grammarAccess.getContainerAccess().getCpusetCpusKeyword_5_6_0());
            	        
            	    // InternalContainer.g:1005:1: ( (lv_cpusetCpus_27_0= RULE_STRING ) )
            	    // InternalContainer.g:1006:1: (lv_cpusetCpus_27_0= RULE_STRING )
            	    {
            	    // InternalContainer.g:1006:1: (lv_cpusetCpus_27_0= RULE_STRING )
            	    // InternalContainer.g:1007:3: lv_cpusetCpus_27_0= RULE_STRING
            	    {
            	    lv_cpusetCpus_27_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    			newLeafNode(lv_cpusetCpus_27_0, grammarAccess.getContainerAccess().getCpusetCpusSTRINGTerminalRuleCall_5_6_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"cpusetCpus",
            	            		lv_cpusetCpus_27_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

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
            	    // InternalContainer.g:1030:4: ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:1030:4: ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) )
            	    // InternalContainer.g:1031:5: {...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 7)");
            	    }
            	    // InternalContainer.g:1031:106: ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) )
            	    // InternalContainer.g:1032:6: ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 7);
            	    	 				
            	    // InternalContainer.g:1035:6: ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) )
            	    // InternalContainer.g:1035:7: {...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1035:16: (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) )
            	    // InternalContainer.g:1035:18: otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) )
            	    {
            	    otherlv_28=(Token)match(input,36,FOLLOW_4); 

            	        	newLeafNode(otherlv_28, grammarAccess.getContainerAccess().getCpusetMemsKeyword_5_7_0());
            	        
            	    // InternalContainer.g:1039:1: ( (lv_cpusetMems_29_0= RULE_STRING ) )
            	    // InternalContainer.g:1040:1: (lv_cpusetMems_29_0= RULE_STRING )
            	    {
            	    // InternalContainer.g:1040:1: (lv_cpusetMems_29_0= RULE_STRING )
            	    // InternalContainer.g:1041:3: lv_cpusetMems_29_0= RULE_STRING
            	    {
            	    lv_cpusetMems_29_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    			newLeafNode(lv_cpusetMems_29_0, grammarAccess.getContainerAccess().getCpusetMemsSTRINGTerminalRuleCall_5_7_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"cpusetMems",
            	            		lv_cpusetMems_29_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

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
            	    // InternalContainer.g:1064:4: ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:1064:4: ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) )
            	    // InternalContainer.g:1065:5: {...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 8)");
            	    }
            	    // InternalContainer.g:1065:106: ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) )
            	    // InternalContainer.g:1066:6: ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 8);
            	    	 				
            	    // InternalContainer.g:1069:6: ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) )
            	    // InternalContainer.g:1069:7: {...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1069:16: (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) )
            	    // InternalContainer.g:1069:18: otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) )
            	    {
            	    otherlv_30=(Token)match(input,37,FOLLOW_10); 

            	        	newLeafNode(otherlv_30, grammarAccess.getContainerAccess().getCpuSharesKeyword_5_8_0());
            	        
            	    // InternalContainer.g:1073:1: ( (lv_cpuShares_31_0= RULE_INT ) )
            	    // InternalContainer.g:1074:1: (lv_cpuShares_31_0= RULE_INT )
            	    {
            	    // InternalContainer.g:1074:1: (lv_cpuShares_31_0= RULE_INT )
            	    // InternalContainer.g:1075:3: lv_cpuShares_31_0= RULE_INT
            	    {
            	    lv_cpuShares_31_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            	    			newLeafNode(lv_cpuShares_31_0, grammarAccess.getContainerAccess().getCpuSharesINTTerminalRuleCall_5_8_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"cpuShares",
            	            		lv_cpuShares_31_0, 
            	            		"org.eclipse.xtext.common.Terminals.INT");
            	    	    

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
            	    // InternalContainer.g:1098:4: ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) )
            	    {
            	    // InternalContainer.g:1098:4: ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) )
            	    // InternalContainer.g:1099:5: {...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 9)");
            	    }
            	    // InternalContainer.g:1099:106: ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) )
            	    // InternalContainer.g:1100:6: ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 9);
            	    	 				
            	    // InternalContainer.g:1103:6: ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) )
            	    // InternalContainer.g:1103:7: {...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1103:16: (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' )
            	    // InternalContainer.g:1103:18: otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}'
            	    {
            	    otherlv_32=(Token)match(input,38,FOLLOW_5); 

            	        	newLeafNode(otherlv_32, grammarAccess.getContainerAccess().getDevicesKeyword_5_9_0());
            	        
            	    otherlv_33=(Token)match(input,12,FOLLOW_7); 

            	        	newLeafNode(otherlv_33, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_9_1());
            	        
            	    // InternalContainer.g:1111:1: ( (lv_devices_34_0= ruleDevice ) )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==25) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalContainer.g:1112:1: (lv_devices_34_0= ruleDevice )
            	    	    {
            	    	    // InternalContainer.g:1112:1: (lv_devices_34_0= ruleDevice )
            	    	    // InternalContainer.g:1113:3: lv_devices_34_0= ruleDevice
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContainerAccess().getDevicesDeviceParserRuleCall_5_9_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_devices_34_0=ruleDevice();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"devices",
            	    	            		lv_devices_34_0, 
            	    	            		"org.eclipse.docker.language.Container.Device");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

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

            	    otherlv_35=(Token)match(input,24,FOLLOW_13); 

            	        	newLeafNode(otherlv_35, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_9_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalContainer.g:1140:4: ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) )
            	    {
            	    // InternalContainer.g:1140:4: ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) )
            	    // InternalContainer.g:1141:5: {...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 10)");
            	    }
            	    // InternalContainer.g:1141:107: ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) )
            	    // InternalContainer.g:1142:6: ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 10);
            	    	 				
            	    // InternalContainer.g:1145:6: ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) )
            	    // InternalContainer.g:1145:7: {...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1145:16: (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' )
            	    // InternalContainer.g:1145:18: otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}'
            	    {
            	    otherlv_36=(Token)match(input,39,FOLLOW_4); 

            	        	newLeafNode(otherlv_36, grammarAccess.getContainerAccess().getDnsKeyword_5_10_0());
            	        
            	    // InternalContainer.g:1149:1: ( (lv_dns_37_0= RULE_STRING ) )+
            	    int cnt10=0;
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==RULE_STRING) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalContainer.g:1150:1: (lv_dns_37_0= RULE_STRING )
            	    	    {
            	    	    // InternalContainer.g:1150:1: (lv_dns_37_0= RULE_STRING )
            	    	    // InternalContainer.g:1151:3: lv_dns_37_0= RULE_STRING
            	    	    {
            	    	    lv_dns_37_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    	    			newLeafNode(lv_dns_37_0, grammarAccess.getContainerAccess().getDnsSTRINGTerminalRuleCall_5_10_1_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		addWithLastConsumed(
            	    	           			current, 
            	    	           			"dns",
            	    	            		lv_dns_37_0, 
            	    	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    	    

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

            	    otherlv_38=(Token)match(input,24,FOLLOW_13); 

            	        	newLeafNode(otherlv_38, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_10_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalContainer.g:1178:4: ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) )
            	    {
            	    // InternalContainer.g:1178:4: ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) )
            	    // InternalContainer.g:1179:5: {...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 11)");
            	    }
            	    // InternalContainer.g:1179:107: ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) )
            	    // InternalContainer.g:1180:6: ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 11);
            	    	 				
            	    // InternalContainer.g:1183:6: ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) )
            	    // InternalContainer.g:1183:7: {...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1183:16: (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' )
            	    // InternalContainer.g:1183:18: otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}'
            	    {
            	    otherlv_39=(Token)match(input,40,FOLLOW_5); 

            	        	newLeafNode(otherlv_39, grammarAccess.getContainerAccess().getDnsSearchKeyword_5_11_0());
            	        
            	    otherlv_40=(Token)match(input,12,FOLLOW_4); 

            	        	newLeafNode(otherlv_40, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_11_1());
            	        
            	    // InternalContainer.g:1191:1: ( (lv_dnsSearch_41_0= RULE_STRING ) )+
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
            	    	    // InternalContainer.g:1192:1: (lv_dnsSearch_41_0= RULE_STRING )
            	    	    {
            	    	    // InternalContainer.g:1192:1: (lv_dnsSearch_41_0= RULE_STRING )
            	    	    // InternalContainer.g:1193:3: lv_dnsSearch_41_0= RULE_STRING
            	    	    {
            	    	    lv_dnsSearch_41_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    	    			newLeafNode(lv_dnsSearch_41_0, grammarAccess.getContainerAccess().getDnsSearchSTRINGTerminalRuleCall_5_11_2_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		addWithLastConsumed(
            	    	           			current, 
            	    	           			"dnsSearch",
            	    	            		lv_dnsSearch_41_0, 
            	    	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    	    

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

            	    otherlv_42=(Token)match(input,24,FOLLOW_13); 

            	        	newLeafNode(otherlv_42, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_11_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalContainer.g:1220:4: ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:1220:4: ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) )
            	    // InternalContainer.g:1221:5: {...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 12)");
            	    }
            	    // InternalContainer.g:1221:107: ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) )
            	    // InternalContainer.g:1222:6: ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 12);
            	    	 				
            	    // InternalContainer.g:1225:6: ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) )
            	    // InternalContainer.g:1225:7: {...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1225:16: (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) )
            	    // InternalContainer.g:1225:18: otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) )
            	    {
            	    otherlv_43=(Token)match(input,41,FOLLOW_4); 

            	        	newLeafNode(otherlv_43, grammarAccess.getContainerAccess().getDomainNameKeyword_5_12_0());
            	        
            	    // InternalContainer.g:1229:1: ( (lv_domainName_44_0= RULE_STRING ) )
            	    // InternalContainer.g:1230:1: (lv_domainName_44_0= RULE_STRING )
            	    {
            	    // InternalContainer.g:1230:1: (lv_domainName_44_0= RULE_STRING )
            	    // InternalContainer.g:1231:3: lv_domainName_44_0= RULE_STRING
            	    {
            	    lv_domainName_44_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    			newLeafNode(lv_domainName_44_0, grammarAccess.getContainerAccess().getDomainNameSTRINGTerminalRuleCall_5_12_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"domainName",
            	            		lv_domainName_44_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

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
            	    // InternalContainer.g:1254:4: ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) )
            	    {
            	    // InternalContainer.g:1254:4: ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) )
            	    // InternalContainer.g:1255:5: {...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 13)");
            	    }
            	    // InternalContainer.g:1255:107: ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) )
            	    // InternalContainer.g:1256:6: ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 13);
            	    	 				
            	    // InternalContainer.g:1259:6: ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) )
            	    // InternalContainer.g:1259:7: {...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1259:16: (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' )
            	    // InternalContainer.g:1259:18: otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}'
            	    {
            	    otherlv_45=(Token)match(input,42,FOLLOW_5); 

            	        	newLeafNode(otherlv_45, grammarAccess.getContainerAccess().getEntrypointKeyword_5_13_0());
            	        
            	    otherlv_46=(Token)match(input,12,FOLLOW_4); 

            	        	newLeafNode(otherlv_46, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_13_1());
            	        
            	    // InternalContainer.g:1267:1: ( (lv_entrypoint_47_0= RULE_STRING ) )+
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
            	    	    // InternalContainer.g:1268:1: (lv_entrypoint_47_0= RULE_STRING )
            	    	    {
            	    	    // InternalContainer.g:1268:1: (lv_entrypoint_47_0= RULE_STRING )
            	    	    // InternalContainer.g:1269:3: lv_entrypoint_47_0= RULE_STRING
            	    	    {
            	    	    lv_entrypoint_47_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    	    			newLeafNode(lv_entrypoint_47_0, grammarAccess.getContainerAccess().getEntrypointSTRINGTerminalRuleCall_5_13_2_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		addWithLastConsumed(
            	    	           			current, 
            	    	           			"entrypoint",
            	    	            		lv_entrypoint_47_0, 
            	    	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    	    

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

            	    otherlv_48=(Token)match(input,24,FOLLOW_13); 

            	        	newLeafNode(otherlv_48, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_13_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // InternalContainer.g:1296:4: ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) )
            	    {
            	    // InternalContainer.g:1296:4: ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) )
            	    // InternalContainer.g:1297:5: {...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 14)");
            	    }
            	    // InternalContainer.g:1297:107: ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) )
            	    // InternalContainer.g:1298:6: ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 14);
            	    	 				
            	    // InternalContainer.g:1301:6: ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) )
            	    // InternalContainer.g:1301:7: {...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1301:16: (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' )
            	    // InternalContainer.g:1301:18: otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}'
            	    {
            	    otherlv_49=(Token)match(input,43,FOLLOW_5); 

            	        	newLeafNode(otherlv_49, grammarAccess.getContainerAccess().getEnvKeyword_5_14_0());
            	        
            	    otherlv_50=(Token)match(input,12,FOLLOW_4); 

            	        	newLeafNode(otherlv_50, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_14_1());
            	        
            	    // InternalContainer.g:1309:1: ( (lv_env_51_0= RULE_STRING ) )+
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
            	    	    // InternalContainer.g:1310:1: (lv_env_51_0= RULE_STRING )
            	    	    {
            	    	    // InternalContainer.g:1310:1: (lv_env_51_0= RULE_STRING )
            	    	    // InternalContainer.g:1311:3: lv_env_51_0= RULE_STRING
            	    	    {
            	    	    lv_env_51_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    	    			newLeafNode(lv_env_51_0, grammarAccess.getContainerAccess().getEnvSTRINGTerminalRuleCall_5_14_2_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		addWithLastConsumed(
            	    	           			current, 
            	    	           			"env",
            	    	            		lv_env_51_0, 
            	    	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    	    

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

            	    otherlv_52=(Token)match(input,24,FOLLOW_13); 

            	        	newLeafNode(otherlv_52, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_14_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 16 :
            	    // InternalContainer.g:1338:4: ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) )
            	    {
            	    // InternalContainer.g:1338:4: ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) )
            	    // InternalContainer.g:1339:5: {...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 15) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 15)");
            	    }
            	    // InternalContainer.g:1339:107: ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) )
            	    // InternalContainer.g:1340:6: ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 15);
            	    	 				
            	    // InternalContainer.g:1343:6: ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) )
            	    // InternalContainer.g:1343:7: {...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1343:16: (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' )
            	    // InternalContainer.g:1343:18: otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}'
            	    {
            	    otherlv_53=(Token)match(input,44,FOLLOW_5); 

            	        	newLeafNode(otherlv_53, grammarAccess.getContainerAccess().getExposedPortsKeyword_5_15_0());
            	        
            	    otherlv_54=(Token)match(input,12,FOLLOW_7); 

            	        	newLeafNode(otherlv_54, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_15_1());
            	        
            	    // InternalContainer.g:1351:1: ( (lv_exposedPorts_55_0= ruleExposedPort ) )+
            	    int cnt14=0;
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==25) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalContainer.g:1352:1: (lv_exposedPorts_55_0= ruleExposedPort )
            	    	    {
            	    	    // InternalContainer.g:1352:1: (lv_exposedPorts_55_0= ruleExposedPort )
            	    	    // InternalContainer.g:1353:3: lv_exposedPorts_55_0= ruleExposedPort
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContainerAccess().getExposedPortsExposedPortParserRuleCall_5_15_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_exposedPorts_55_0=ruleExposedPort();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"exposedPorts",
            	    	            		lv_exposedPorts_55_0, 
            	    	            		"org.eclipse.docker.language.Container.ExposedPort");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

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

            	    otherlv_56=(Token)match(input,24,FOLLOW_13); 

            	        	newLeafNode(otherlv_56, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_15_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 17 :
            	    // InternalContainer.g:1380:4: ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) )
            	    {
            	    // InternalContainer.g:1380:4: ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) )
            	    // InternalContainer.g:1381:5: {...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 16) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 16)");
            	    }
            	    // InternalContainer.g:1381:107: ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) )
            	    // InternalContainer.g:1382:6: ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 16);
            	    	 				
            	    // InternalContainer.g:1385:6: ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) )
            	    // InternalContainer.g:1385:7: {...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1385:16: (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' )
            	    // InternalContainer.g:1385:18: otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}'
            	    {
            	    otherlv_57=(Token)match(input,45,FOLLOW_5); 

            	        	newLeafNode(otherlv_57, grammarAccess.getContainerAccess().getExtraHostsKeyword_5_16_0());
            	        
            	    otherlv_58=(Token)match(input,12,FOLLOW_4); 

            	        	newLeafNode(otherlv_58, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_16_1());
            	        
            	    // InternalContainer.g:1393:1: ( (lv_extraHosts_59_0= RULE_STRING ) )+
            	    int cnt15=0;
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==RULE_STRING) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // InternalContainer.g:1394:1: (lv_extraHosts_59_0= RULE_STRING )
            	    	    {
            	    	    // InternalContainer.g:1394:1: (lv_extraHosts_59_0= RULE_STRING )
            	    	    // InternalContainer.g:1395:3: lv_extraHosts_59_0= RULE_STRING
            	    	    {
            	    	    lv_extraHosts_59_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    	    			newLeafNode(lv_extraHosts_59_0, grammarAccess.getContainerAccess().getExtraHostsSTRINGTerminalRuleCall_5_16_2_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		addWithLastConsumed(
            	    	           			current, 
            	    	           			"extraHosts",
            	    	            		lv_extraHosts_59_0, 
            	    	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    	    

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

            	    otherlv_60=(Token)match(input,24,FOLLOW_13); 

            	        	newLeafNode(otherlv_60, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_16_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 18 :
            	    // InternalContainer.g:1422:4: ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) )
            	    {
            	    // InternalContainer.g:1422:4: ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) )
            	    // InternalContainer.g:1423:5: {...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 17) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 17)");
            	    }
            	    // InternalContainer.g:1423:107: ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) )
            	    // InternalContainer.g:1424:6: ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 17);
            	    	 				
            	    // InternalContainer.g:1427:6: ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) )
            	    // InternalContainer.g:1427:7: {...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1427:16: (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' )
            	    // InternalContainer.g:1427:18: otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}'
            	    {
            	    otherlv_61=(Token)match(input,46,FOLLOW_5); 

            	        	newLeafNode(otherlv_61, grammarAccess.getContainerAccess().getLabelsKeyword_5_17_0());
            	        
            	    otherlv_62=(Token)match(input,12,FOLLOW_4); 

            	        	newLeafNode(otherlv_62, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_17_1());
            	        
            	    // InternalContainer.g:1435:1: ( (lv_labels_63_0= ruleLabel ) )+
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
            	    	    // InternalContainer.g:1436:1: (lv_labels_63_0= ruleLabel )
            	    	    {
            	    	    // InternalContainer.g:1436:1: (lv_labels_63_0= ruleLabel )
            	    	    // InternalContainer.g:1437:3: lv_labels_63_0= ruleLabel
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContainerAccess().getLabelsLabelParserRuleCall_5_17_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_labels_63_0=ruleLabel();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"labels",
            	    	            		lv_labels_63_0, 
            	    	            		"org.eclipse.docker.language.Container.Label");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

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

            	    otherlv_64=(Token)match(input,24,FOLLOW_13); 

            	        	newLeafNode(otherlv_64, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_17_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 19 :
            	    // InternalContainer.g:1464:4: ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) )
            	    {
            	    // InternalContainer.g:1464:4: ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) )
            	    // InternalContainer.g:1465:5: {...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 18) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 18)");
            	    }
            	    // InternalContainer.g:1465:107: ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) )
            	    // InternalContainer.g:1466:6: ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 18);
            	    	 				
            	    // InternalContainer.g:1469:6: ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) )
            	    // InternalContainer.g:1469:7: {...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1469:16: (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' )
            	    // InternalContainer.g:1469:18: otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}'
            	    {
            	    otherlv_65=(Token)match(input,47,FOLLOW_5); 

            	        	newLeafNode(otherlv_65, grammarAccess.getContainerAccess().getLinksKeyword_5_18_0());
            	        
            	    otherlv_66=(Token)match(input,12,FOLLOW_7); 

            	        	newLeafNode(otherlv_66, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_18_1());
            	        
            	    // InternalContainer.g:1477:1: ( (lv_links_67_0= ruleLink ) )+
            	    int cnt17=0;
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==25) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalContainer.g:1478:1: (lv_links_67_0= ruleLink )
            	    	    {
            	    	    // InternalContainer.g:1478:1: (lv_links_67_0= ruleLink )
            	    	    // InternalContainer.g:1479:3: lv_links_67_0= ruleLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContainerAccess().getLinksLinkParserRuleCall_5_18_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_links_67_0=ruleLink();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"links",
            	    	            		lv_links_67_0, 
            	    	            		"org.eclipse.docker.language.Container.Link");
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

            	    otherlv_68=(Token)match(input,24,FOLLOW_13); 

            	        	newLeafNode(otherlv_68, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_18_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 20 :
            	    // InternalContainer.g:1506:4: ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:1506:4: ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) )
            	    // InternalContainer.g:1507:5: {...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 19) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 19)");
            	    }
            	    // InternalContainer.g:1507:107: ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) )
            	    // InternalContainer.g:1508:6: ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 19);
            	    	 				
            	    // InternalContainer.g:1511:6: ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) )
            	    // InternalContainer.g:1511:7: {...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1511:16: (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) )
            	    // InternalContainer.g:1511:18: otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) )
            	    {
            	    otherlv_69=(Token)match(input,48,FOLLOW_4); 

            	        	newLeafNode(otherlv_69, grammarAccess.getContainerAccess().getMacAddressKeyword_5_19_0());
            	        
            	    // InternalContainer.g:1515:1: ( (lv_macAddress_70_0= RULE_STRING ) )
            	    // InternalContainer.g:1516:1: (lv_macAddress_70_0= RULE_STRING )
            	    {
            	    // InternalContainer.g:1516:1: (lv_macAddress_70_0= RULE_STRING )
            	    // InternalContainer.g:1517:3: lv_macAddress_70_0= RULE_STRING
            	    {
            	    lv_macAddress_70_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    			newLeafNode(lv_macAddress_70_0, grammarAccess.getContainerAccess().getMacAddressSTRINGTerminalRuleCall_5_19_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"macAddress",
            	            		lv_macAddress_70_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

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
            	    // InternalContainer.g:1540:4: ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:1540:4: ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) )
            	    // InternalContainer.g:1541:5: {...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 20) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 20)");
            	    }
            	    // InternalContainer.g:1541:107: ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) )
            	    // InternalContainer.g:1542:6: ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 20);
            	    	 				
            	    // InternalContainer.g:1545:6: ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) )
            	    // InternalContainer.g:1545:7: {...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1545:16: (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) )
            	    // InternalContainer.g:1545:18: otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) )
            	    {
            	    otherlv_71=(Token)match(input,17,FOLLOW_10); 

            	        	newLeafNode(otherlv_71, grammarAccess.getContainerAccess().getMemoryKeyword_5_20_0());
            	        
            	    // InternalContainer.g:1549:1: ( (lv_memory_72_0= ruleElong ) )
            	    // InternalContainer.g:1550:1: (lv_memory_72_0= ruleElong )
            	    {
            	    // InternalContainer.g:1550:1: (lv_memory_72_0= ruleElong )
            	    // InternalContainer.g:1551:3: lv_memory_72_0= ruleElong
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getMemoryElongParserRuleCall_5_20_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_13);
            	    lv_memory_72_0=ruleElong();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"memory",
            	            		lv_memory_72_0, 
            	            		"org.eclipse.docker.language.Container.Elong");
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
            	    // InternalContainer.g:1574:4: ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:1574:4: ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) )
            	    // InternalContainer.g:1575:5: {...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 21) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 21)");
            	    }
            	    // InternalContainer.g:1575:107: ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) )
            	    // InternalContainer.g:1576:6: ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 21);
            	    	 				
            	    // InternalContainer.g:1579:6: ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) )
            	    // InternalContainer.g:1579:7: {...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1579:16: (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) )
            	    // InternalContainer.g:1579:18: otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) )
            	    {
            	    otherlv_73=(Token)match(input,49,FOLLOW_10); 

            	        	newLeafNode(otherlv_73, grammarAccess.getContainerAccess().getMemorySwapKeyword_5_21_0());
            	        
            	    // InternalContainer.g:1583:1: ( (lv_memorySwap_74_0= ruleElong ) )
            	    // InternalContainer.g:1584:1: (lv_memorySwap_74_0= ruleElong )
            	    {
            	    // InternalContainer.g:1584:1: (lv_memorySwap_74_0= ruleElong )
            	    // InternalContainer.g:1585:3: lv_memorySwap_74_0= ruleElong
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getMemorySwapElongParserRuleCall_5_21_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_13);
            	    lv_memorySwap_74_0=ruleElong();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"memorySwap",
            	            		lv_memorySwap_74_0, 
            	            		"org.eclipse.docker.language.Container.Elong");
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
            	    // InternalContainer.g:1608:4: ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:1608:4: ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalContainer.g:1609:5: {...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 22) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 22)");
            	    }
            	    // InternalContainer.g:1609:107: ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) )
            	    // InternalContainer.g:1610:6: ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 22);
            	    	 				
            	    // InternalContainer.g:1613:6: ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) )
            	    // InternalContainer.g:1613:7: {...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1613:16: (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) )
            	    // InternalContainer.g:1613:18: otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) )
            	    {
            	    otherlv_75=(Token)match(input,50,FOLLOW_9); 

            	        	newLeafNode(otherlv_75, grammarAccess.getContainerAccess().getDisableNetworkKeyword_5_22_0());
            	        
            	    // InternalContainer.g:1617:1: ( (lv_disableNetwork_76_0= ruleEBoolean ) )
            	    // InternalContainer.g:1618:1: (lv_disableNetwork_76_0= ruleEBoolean )
            	    {
            	    // InternalContainer.g:1618:1: (lv_disableNetwork_76_0= ruleEBoolean )
            	    // InternalContainer.g:1619:3: lv_disableNetwork_76_0= ruleEBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getDisableNetworkEBooleanParserRuleCall_5_22_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_13);
            	    lv_disableNetwork_76_0=ruleEBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"disableNetwork",
            	            		lv_disableNetwork_76_0, 
            	            		"org.eclipse.docker.language.Container.EBoolean");
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
            	    // InternalContainer.g:1642:4: ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:1642:4: ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) )
            	    // InternalContainer.g:1643:5: {...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 23) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 23)");
            	    }
            	    // InternalContainer.g:1643:107: ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) )
            	    // InternalContainer.g:1644:6: ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 23);
            	    	 				
            	    // InternalContainer.g:1647:6: ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) )
            	    // InternalContainer.g:1647:7: {...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1647:16: (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) )
            	    // InternalContainer.g:1647:18: otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) )
            	    {
            	    otherlv_77=(Token)match(input,51,FOLLOW_4); 

            	        	newLeafNode(otherlv_77, grammarAccess.getContainerAccess().getNetworkModeKeyword_5_23_0());
            	        
            	    // InternalContainer.g:1651:1: ( (lv_networkMode_78_0= RULE_STRING ) )
            	    // InternalContainer.g:1652:1: (lv_networkMode_78_0= RULE_STRING )
            	    {
            	    // InternalContainer.g:1652:1: (lv_networkMode_78_0= RULE_STRING )
            	    // InternalContainer.g:1653:3: lv_networkMode_78_0= RULE_STRING
            	    {
            	    lv_networkMode_78_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    			newLeafNode(lv_networkMode_78_0, grammarAccess.getContainerAccess().getNetworkModeSTRINGTerminalRuleCall_5_23_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"networkMode",
            	            		lv_networkMode_78_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

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
            	    // InternalContainer.g:1676:4: ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) )
            	    {
            	    // InternalContainer.g:1676:4: ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) )
            	    // InternalContainer.g:1677:5: {...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 24) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 24)");
            	    }
            	    // InternalContainer.g:1677:107: ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) )
            	    // InternalContainer.g:1678:6: ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 24);
            	    	 				
            	    // InternalContainer.g:1681:6: ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) )
            	    // InternalContainer.g:1681:7: {...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1681:16: (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' )
            	    // InternalContainer.g:1681:18: otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}'
            	    {
            	    otherlv_79=(Token)match(input,52,FOLLOW_5); 

            	        	newLeafNode(otherlv_79, grammarAccess.getContainerAccess().getPortBindingsKeyword_5_24_0());
            	        
            	    otherlv_80=(Token)match(input,12,FOLLOW_7); 

            	        	newLeafNode(otherlv_80, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_24_1());
            	        
            	    // InternalContainer.g:1689:1: ( (lv_portBindings_81_0= rulePortBinding ) )+
            	    int cnt18=0;
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0==25) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // InternalContainer.g:1690:1: (lv_portBindings_81_0= rulePortBinding )
            	    	    {
            	    	    // InternalContainer.g:1690:1: (lv_portBindings_81_0= rulePortBinding )
            	    	    // InternalContainer.g:1691:3: lv_portBindings_81_0= rulePortBinding
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContainerAccess().getPortBindingsPortBindingParserRuleCall_5_24_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_portBindings_81_0=rulePortBinding();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"portBindings",
            	    	            		lv_portBindings_81_0, 
            	    	            		"org.eclipse.docker.language.Container.PortBinding");
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

            	    otherlv_82=(Token)match(input,24,FOLLOW_13); 

            	        	newLeafNode(otherlv_82, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_24_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 26 :
            	    // InternalContainer.g:1718:4: ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:1718:4: ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalContainer.g:1719:5: {...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 25) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 25)");
            	    }
            	    // InternalContainer.g:1719:107: ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) )
            	    // InternalContainer.g:1720:6: ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 25);
            	    	 				
            	    // InternalContainer.g:1723:6: ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) )
            	    // InternalContainer.g:1723:7: {...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1723:16: (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) )
            	    // InternalContainer.g:1723:18: otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) )
            	    {
            	    otherlv_83=(Token)match(input,53,FOLLOW_9); 

            	        	newLeafNode(otherlv_83, grammarAccess.getContainerAccess().getPrivilegedKeyword_5_25_0());
            	        
            	    // InternalContainer.g:1727:1: ( (lv_privileged_84_0= ruleEBoolean ) )
            	    // InternalContainer.g:1728:1: (lv_privileged_84_0= ruleEBoolean )
            	    {
            	    // InternalContainer.g:1728:1: (lv_privileged_84_0= ruleEBoolean )
            	    // InternalContainer.g:1729:3: lv_privileged_84_0= ruleEBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getPrivilegedEBooleanParserRuleCall_5_25_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_13);
            	    lv_privileged_84_0=ruleEBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"privileged",
            	            		lv_privileged_84_0, 
            	            		"org.eclipse.docker.language.Container.EBoolean");
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
            	    // InternalContainer.g:1752:4: ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:1752:4: ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalContainer.g:1753:5: {...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 26) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 26)");
            	    }
            	    // InternalContainer.g:1753:107: ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) )
            	    // InternalContainer.g:1754:6: ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 26);
            	    	 				
            	    // InternalContainer.g:1757:6: ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) )
            	    // InternalContainer.g:1757:7: {...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1757:16: (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) )
            	    // InternalContainer.g:1757:18: otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) )
            	    {
            	    otherlv_85=(Token)match(input,54,FOLLOW_9); 

            	        	newLeafNode(otherlv_85, grammarAccess.getContainerAccess().getPublishAllPortsKeyword_5_26_0());
            	        
            	    // InternalContainer.g:1761:1: ( (lv_publishAllPorts_86_0= ruleEBoolean ) )
            	    // InternalContainer.g:1762:1: (lv_publishAllPorts_86_0= ruleEBoolean )
            	    {
            	    // InternalContainer.g:1762:1: (lv_publishAllPorts_86_0= ruleEBoolean )
            	    // InternalContainer.g:1763:3: lv_publishAllPorts_86_0= ruleEBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getPublishAllPortsEBooleanParserRuleCall_5_26_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_13);
            	    lv_publishAllPorts_86_0=ruleEBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"publishAllPorts",
            	            		lv_publishAllPorts_86_0, 
            	            		"org.eclipse.docker.language.Container.EBoolean");
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
            	    // InternalContainer.g:1786:4: ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:1786:4: ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalContainer.g:1787:5: {...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 27) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 27)");
            	    }
            	    // InternalContainer.g:1787:107: ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) )
            	    // InternalContainer.g:1788:6: ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 27);
            	    	 				
            	    // InternalContainer.g:1791:6: ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) )
            	    // InternalContainer.g:1791:7: {...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1791:16: (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) )
            	    // InternalContainer.g:1791:18: otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) )
            	    {
            	    otherlv_87=(Token)match(input,55,FOLLOW_9); 

            	        	newLeafNode(otherlv_87, grammarAccess.getContainerAccess().getReadonlyRootfsKeyword_5_27_0());
            	        
            	    // InternalContainer.g:1795:1: ( (lv_readonlyRootfs_88_0= ruleEBoolean ) )
            	    // InternalContainer.g:1796:1: (lv_readonlyRootfs_88_0= ruleEBoolean )
            	    {
            	    // InternalContainer.g:1796:1: (lv_readonlyRootfs_88_0= ruleEBoolean )
            	    // InternalContainer.g:1797:3: lv_readonlyRootfs_88_0= ruleEBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getReadonlyRootfsEBooleanParserRuleCall_5_27_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_13);
            	    lv_readonlyRootfs_88_0=ruleEBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"readonlyRootfs",
            	            		lv_readonlyRootfs_88_0, 
            	            		"org.eclipse.docker.language.Container.EBoolean");
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
            	    // InternalContainer.g:1820:4: ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:1820:4: ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) )
            	    // InternalContainer.g:1821:5: {...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 28) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 28)");
            	    }
            	    // InternalContainer.g:1821:107: ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) )
            	    // InternalContainer.g:1822:6: ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 28);
            	    	 				
            	    // InternalContainer.g:1825:6: ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) )
            	    // InternalContainer.g:1825:7: {...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1825:16: (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) )
            	    // InternalContainer.g:1825:18: otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) )
            	    {
            	    otherlv_89=(Token)match(input,56,FOLLOW_4); 

            	        	newLeafNode(otherlv_89, grammarAccess.getContainerAccess().getPidModeKeyword_5_28_0());
            	        
            	    // InternalContainer.g:1829:1: ( (lv_pidMode_90_0= RULE_STRING ) )
            	    // InternalContainer.g:1830:1: (lv_pidMode_90_0= RULE_STRING )
            	    {
            	    // InternalContainer.g:1830:1: (lv_pidMode_90_0= RULE_STRING )
            	    // InternalContainer.g:1831:3: lv_pidMode_90_0= RULE_STRING
            	    {
            	    lv_pidMode_90_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    			newLeafNode(lv_pidMode_90_0, grammarAccess.getContainerAccess().getPidModeSTRINGTerminalRuleCall_5_28_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"pidMode",
            	            		lv_pidMode_90_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

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
            	    // InternalContainer.g:1854:4: ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:1854:4: ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) )
            	    // InternalContainer.g:1855:5: {...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 29) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 29)");
            	    }
            	    // InternalContainer.g:1855:107: ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) )
            	    // InternalContainer.g:1856:6: ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 29);
            	    	 				
            	    // InternalContainer.g:1859:6: ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) )
            	    // InternalContainer.g:1859:7: {...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1859:16: (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) )
            	    // InternalContainer.g:1859:18: otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) )
            	    {
            	    otherlv_91=(Token)match(input,57,FOLLOW_4); 

            	        	newLeafNode(otherlv_91, grammarAccess.getContainerAccess().getWorkingDirKeyword_5_29_0());
            	        
            	    // InternalContainer.g:1863:1: ( (lv_workingDir_92_0= RULE_STRING ) )
            	    // InternalContainer.g:1864:1: (lv_workingDir_92_0= RULE_STRING )
            	    {
            	    // InternalContainer.g:1864:1: (lv_workingDir_92_0= RULE_STRING )
            	    // InternalContainer.g:1865:3: lv_workingDir_92_0= RULE_STRING
            	    {
            	    lv_workingDir_92_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    			newLeafNode(lv_workingDir_92_0, grammarAccess.getContainerAccess().getWorkingDirSTRINGTerminalRuleCall_5_29_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"workingDir",
            	            		lv_workingDir_92_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

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
            	    // InternalContainer.g:1888:4: ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:1888:4: ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) )
            	    // InternalContainer.g:1889:5: {...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 30) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 30)");
            	    }
            	    // InternalContainer.g:1889:107: ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) )
            	    // InternalContainer.g:1890:6: ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 30);
            	    	 				
            	    // InternalContainer.g:1893:6: ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) )
            	    // InternalContainer.g:1893:7: {...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1893:16: (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) )
            	    // InternalContainer.g:1893:18: otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) )
            	    {
            	    otherlv_93=(Token)match(input,58,FOLLOW_4); 

            	        	newLeafNode(otherlv_93, grammarAccess.getContainerAccess().getUserKeyword_5_30_0());
            	        
            	    // InternalContainer.g:1897:1: ( (lv_user_94_0= RULE_STRING ) )
            	    // InternalContainer.g:1898:1: (lv_user_94_0= RULE_STRING )
            	    {
            	    // InternalContainer.g:1898:1: (lv_user_94_0= RULE_STRING )
            	    // InternalContainer.g:1899:3: lv_user_94_0= RULE_STRING
            	    {
            	    lv_user_94_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    			newLeafNode(lv_user_94_0, grammarAccess.getContainerAccess().getUserSTRINGTerminalRuleCall_5_30_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContainerRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"user",
            	            		lv_user_94_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

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
            	    // InternalContainer.g:1922:4: ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:1922:4: ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalContainer.g:1923:5: {...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 31) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 31)");
            	    }
            	    // InternalContainer.g:1923:107: ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) )
            	    // InternalContainer.g:1924:6: ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 31);
            	    	 				
            	    // InternalContainer.g:1927:6: ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) )
            	    // InternalContainer.g:1927:7: {...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1927:16: (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) )
            	    // InternalContainer.g:1927:18: otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) )
            	    {
            	    otherlv_95=(Token)match(input,59,FOLLOW_9); 

            	        	newLeafNode(otherlv_95, grammarAccess.getContainerAccess().getTtyKeyword_5_31_0());
            	        
            	    // InternalContainer.g:1931:1: ( (lv_tty_96_0= ruleEBoolean ) )
            	    // InternalContainer.g:1932:1: (lv_tty_96_0= ruleEBoolean )
            	    {
            	    // InternalContainer.g:1932:1: (lv_tty_96_0= ruleEBoolean )
            	    // InternalContainer.g:1933:3: lv_tty_96_0= ruleEBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getTtyEBooleanParserRuleCall_5_31_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_13);
            	    lv_tty_96_0=ruleEBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"tty",
            	            		lv_tty_96_0, 
            	            		"org.eclipse.docker.language.Container.EBoolean");
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
            	    // InternalContainer.g:1956:4: ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) )
            	    {
            	    // InternalContainer.g:1956:4: ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) )
            	    // InternalContainer.g:1957:5: {...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 32) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 32)");
            	    }
            	    // InternalContainer.g:1957:107: ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) )
            	    // InternalContainer.g:1958:6: ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 32);
            	    	 				
            	    // InternalContainer.g:1961:6: ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) )
            	    // InternalContainer.g:1961:7: {...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1961:16: (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) )
            	    // InternalContainer.g:1961:18: otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) )
            	    {
            	    otherlv_97=(Token)match(input,60,FOLLOW_18); 

            	        	newLeafNode(otherlv_97, grammarAccess.getContainerAccess().getRestartPolicyKeyword_5_32_0());
            	        
            	    // InternalContainer.g:1965:1: ( (lv_restartPolicy_98_0= ruleRestartPolicy ) )
            	    // InternalContainer.g:1966:1: (lv_restartPolicy_98_0= ruleRestartPolicy )
            	    {
            	    // InternalContainer.g:1966:1: (lv_restartPolicy_98_0= ruleRestartPolicy )
            	    // InternalContainer.g:1967:3: lv_restartPolicy_98_0= ruleRestartPolicy
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getRestartPolicyRestartPolicyParserRuleCall_5_32_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_13);
            	    lv_restartPolicy_98_0=ruleRestartPolicy();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"restartPolicy",
            	            		lv_restartPolicy_98_0, 
            	            		"org.eclipse.docker.language.Container.RestartPolicy");
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
            	    // InternalContainer.g:1990:4: ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) )
            	    {
            	    // InternalContainer.g:1990:4: ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) )
            	    // InternalContainer.g:1991:5: {...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 33) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 33)");
            	    }
            	    // InternalContainer.g:1991:107: ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) )
            	    // InternalContainer.g:1992:6: ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 33);
            	    	 				
            	    // InternalContainer.g:1995:6: ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) )
            	    // InternalContainer.g:1995:7: {...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:1995:16: (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' )
            	    // InternalContainer.g:1995:18: otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}'
            	    {
            	    otherlv_99=(Token)match(input,61,FOLLOW_5); 

            	        	newLeafNode(otherlv_99, grammarAccess.getContainerAccess().getVolumesKeyword_5_33_0());
            	        
            	    otherlv_100=(Token)match(input,12,FOLLOW_7); 

            	        	newLeafNode(otherlv_100, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_33_1());
            	        
            	    // InternalContainer.g:2003:1: (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+
            	    int cnt19=0;
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==25) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // InternalContainer.g:2003:3: otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) )
            	    	    {
            	    	    otherlv_101=(Token)match(input,25,FOLLOW_4); 

            	    	        	newLeafNode(otherlv_101, grammarAccess.getContainerAccess().getHyphenMinusKeyword_5_33_2_0());
            	    	        
            	    	    // InternalContainer.g:2007:1: ( (lv_volumes_102_0= ruleVolume ) )
            	    	    // InternalContainer.g:2008:1: (lv_volumes_102_0= ruleVolume )
            	    	    {
            	    	    // InternalContainer.g:2008:1: (lv_volumes_102_0= ruleVolume )
            	    	    // InternalContainer.g:2009:3: lv_volumes_102_0= ruleVolume
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContainerAccess().getVolumesVolumeParserRuleCall_5_33_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_volumes_102_0=ruleVolume();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"volumes",
            	    	            		lv_volumes_102_0, 
            	    	            		"org.eclipse.docker.language.Container.Volume");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


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

            	    otherlv_103=(Token)match(input,24,FOLLOW_13); 

            	        	newLeafNode(otherlv_103, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_33_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 35 :
            	    // InternalContainer.g:2036:4: ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+ otherlv_108= '}' ) ) ) )
            	    {
            	    // InternalContainer.g:2036:4: ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+ otherlv_108= '}' ) ) ) )
            	    // InternalContainer.g:2037:5: {...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+ otherlv_108= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 34) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 34)");
            	    }
            	    // InternalContainer.g:2037:107: ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+ otherlv_108= '}' ) ) )
            	    // InternalContainer.g:2038:6: ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+ otherlv_108= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 34);
            	    	 				
            	    // InternalContainer.g:2041:6: ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+ otherlv_108= '}' ) )
            	    // InternalContainer.g:2041:7: {...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+ otherlv_108= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:2041:16: (otherlv_104= 'volumesFrom' otherlv_105= '{' (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+ otherlv_108= '}' )
            	    // InternalContainer.g:2041:18: otherlv_104= 'volumesFrom' otherlv_105= '{' (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+ otherlv_108= '}'
            	    {
            	    otherlv_104=(Token)match(input,62,FOLLOW_5); 

            	        	newLeafNode(otherlv_104, grammarAccess.getContainerAccess().getVolumesFromKeyword_5_34_0());
            	        
            	    otherlv_105=(Token)match(input,12,FOLLOW_7); 

            	        	newLeafNode(otherlv_105, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_34_1());
            	        
            	    // InternalContainer.g:2049:1: (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+
            	    int cnt20=0;
            	    loop20:
            	    do {
            	        int alt20=2;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0==25) ) {
            	            alt20=1;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // InternalContainer.g:2049:3: otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) )
            	    	    {
            	    	    otherlv_106=(Token)match(input,25,FOLLOW_7); 

            	    	        	newLeafNode(otherlv_106, grammarAccess.getContainerAccess().getHyphenMinusKeyword_5_34_2_0());
            	    	        
            	    	    // InternalContainer.g:2053:1: ( (lv_volumesFrom_107_0= ruleVolumesFrom ) )
            	    	    // InternalContainer.g:2054:1: (lv_volumesFrom_107_0= ruleVolumesFrom )
            	    	    {
            	    	    // InternalContainer.g:2054:1: (lv_volumesFrom_107_0= ruleVolumesFrom )
            	    	    // InternalContainer.g:2055:3: lv_volumesFrom_107_0= ruleVolumesFrom
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContainerAccess().getVolumesFromVolumesFromParserRuleCall_5_34_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_volumesFrom_107_0=ruleVolumesFrom();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"volumesFrom",
            	    	            		lv_volumesFrom_107_0, 
            	    	            		"org.eclipse.docker.language.Container.VolumesFrom");
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

            	    otherlv_108=(Token)match(input,24,FOLLOW_13); 

            	        	newLeafNode(otherlv_108, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_34_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 36 :
            	    // InternalContainer.g:2082:4: ({...}? => ( ({...}? => (otherlv_109= 'ulimits' otherlv_110= '{' (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+ otherlv_113= '}' ) ) ) )
            	    {
            	    // InternalContainer.g:2082:4: ({...}? => ( ({...}? => (otherlv_109= 'ulimits' otherlv_110= '{' (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+ otherlv_113= '}' ) ) ) )
            	    // InternalContainer.g:2083:5: {...}? => ( ({...}? => (otherlv_109= 'ulimits' otherlv_110= '{' (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+ otherlv_113= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 35) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 35)");
            	    }
            	    // InternalContainer.g:2083:107: ( ({...}? => (otherlv_109= 'ulimits' otherlv_110= '{' (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+ otherlv_113= '}' ) ) )
            	    // InternalContainer.g:2084:6: ({...}? => (otherlv_109= 'ulimits' otherlv_110= '{' (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+ otherlv_113= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 35);
            	    	 				
            	    // InternalContainer.g:2087:6: ({...}? => (otherlv_109= 'ulimits' otherlv_110= '{' (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+ otherlv_113= '}' ) )
            	    // InternalContainer.g:2087:7: {...}? => (otherlv_109= 'ulimits' otherlv_110= '{' (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+ otherlv_113= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContainer", "true");
            	    }
            	    // InternalContainer.g:2087:16: (otherlv_109= 'ulimits' otherlv_110= '{' (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+ otherlv_113= '}' )
            	    // InternalContainer.g:2087:18: otherlv_109= 'ulimits' otherlv_110= '{' (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+ otherlv_113= '}'
            	    {
            	    otherlv_109=(Token)match(input,63,FOLLOW_5); 

            	        	newLeafNode(otherlv_109, grammarAccess.getContainerAccess().getUlimitsKeyword_5_35_0());
            	        
            	    otherlv_110=(Token)match(input,12,FOLLOW_7); 

            	        	newLeafNode(otherlv_110, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_35_1());
            	        
            	    // InternalContainer.g:2095:1: (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+
            	    int cnt21=0;
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==25) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // InternalContainer.g:2095:3: otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) )
            	    	    {
            	    	    otherlv_111=(Token)match(input,25,FOLLOW_7); 

            	    	        	newLeafNode(otherlv_111, grammarAccess.getContainerAccess().getHyphenMinusKeyword_5_35_2_0());
            	    	        
            	    	    // InternalContainer.g:2099:1: ( (lv_ulimits_112_0= ruleUlimit ) )
            	    	    // InternalContainer.g:2100:1: (lv_ulimits_112_0= ruleUlimit )
            	    	    {
            	    	    // InternalContainer.g:2100:1: (lv_ulimits_112_0= ruleUlimit )
            	    	    // InternalContainer.g:2101:3: lv_ulimits_112_0= ruleUlimit
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContainerAccess().getUlimitsUlimitParserRuleCall_5_35_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_ulimits_112_0=ruleUlimit();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"ulimits",
            	    	            		lv_ulimits_112_0, 
            	    	            		"org.eclipse.docker.language.Container.Ulimit");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


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

            	    otherlv_113=(Token)match(input,24,FOLLOW_13); 

            	        	newLeafNode(otherlv_113, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_35_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getContainerAccess().getUnorderedGroup_5());
            	

            }

            otherlv_114=(Token)match(input,24,FOLLOW_2); 

                	newLeafNode(otherlv_114, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_6());
                

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
    // InternalContainer.g:2147:1: entryRuleVolumesFrom returns [EObject current=null] : iv_ruleVolumesFrom= ruleVolumesFrom EOF ;
    public final EObject entryRuleVolumesFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumesFrom = null;


        try {
            // InternalContainer.g:2148:2: (iv_ruleVolumesFrom= ruleVolumesFrom EOF )
            // InternalContainer.g:2149:2: iv_ruleVolumesFrom= ruleVolumesFrom EOF
            {
             newCompositeNode(grammarAccess.getVolumesFromRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVolumesFrom=ruleVolumesFrom();

            state._fsp--;

             current =iv_ruleVolumesFrom; 
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
    // $ANTLR end "entryRuleVolumesFrom"


    // $ANTLR start "ruleVolumesFrom"
    // InternalContainer.g:2156:1: ruleVolumesFrom returns [EObject current=null] : (otherlv_0= '-' ( (lv_container_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_accessMode_3_0= ruleAccessMode ) )? ) ;
    public final EObject ruleVolumesFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_container_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_accessMode_3_0 = null;


         enterRule(); 
            
        try {
            // InternalContainer.g:2159:28: ( (otherlv_0= '-' ( (lv_container_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_accessMode_3_0= ruleAccessMode ) )? ) )
            // InternalContainer.g:2160:1: (otherlv_0= '-' ( (lv_container_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_accessMode_3_0= ruleAccessMode ) )? )
            {
            // InternalContainer.g:2160:1: (otherlv_0= '-' ( (lv_container_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_accessMode_3_0= ruleAccessMode ) )? )
            // InternalContainer.g:2160:3: otherlv_0= '-' ( (lv_container_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_accessMode_3_0= ruleAccessMode ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getVolumesFromAccess().getHyphenMinusKeyword_0());
                
            // InternalContainer.g:2164:1: ( (lv_container_1_0= RULE_STRING ) )
            // InternalContainer.g:2165:1: (lv_container_1_0= RULE_STRING )
            {
            // InternalContainer.g:2165:1: (lv_container_1_0= RULE_STRING )
            // InternalContainer.g:2166:3: lv_container_1_0= RULE_STRING
            {
            lv_container_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            			newLeafNode(lv_container_1_0, grammarAccess.getVolumesFromAccess().getContainerSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVolumesFromRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"container",
                    		lv_container_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,64,FOLLOW_20); 

                	newLeafNode(otherlv_2, grammarAccess.getVolumesFromAccess().getColonKeyword_2());
                
            // InternalContainer.g:2186:1: ( (lv_accessMode_3_0= ruleAccessMode ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=71 && LA23_0<=72)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalContainer.g:2187:1: (lv_accessMode_3_0= ruleAccessMode )
                    {
                    // InternalContainer.g:2187:1: (lv_accessMode_3_0= ruleAccessMode )
                    // InternalContainer.g:2188:3: lv_accessMode_3_0= ruleAccessMode
                    {
                     
                    	        newCompositeNode(grammarAccess.getVolumesFromAccess().getAccessModeAccessModeEnumRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_accessMode_3_0=ruleAccessMode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVolumesFromRule());
                    	        }
                           		set(
                           			current, 
                           			"accessMode",
                            		lv_accessMode_3_0, 
                            		"org.eclipse.docker.language.Container.AccessMode");
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
    // InternalContainer.g:2212:1: entryRuleRestartPolicy returns [EObject current=null] : iv_ruleRestartPolicy= ruleRestartPolicy EOF ;
    public final EObject entryRuleRestartPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestartPolicy = null;


        try {
            // InternalContainer.g:2213:2: (iv_ruleRestartPolicy= ruleRestartPolicy EOF )
            // InternalContainer.g:2214:2: iv_ruleRestartPolicy= ruleRestartPolicy EOF
            {
             newCompositeNode(grammarAccess.getRestartPolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestartPolicy=ruleRestartPolicy();

            state._fsp--;

             current =iv_ruleRestartPolicy; 
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
    // $ANTLR end "entryRuleRestartPolicy"


    // $ANTLR start "ruleRestartPolicy"
    // InternalContainer.g:2221:1: ruleRestartPolicy returns [EObject current=null] : ( (otherlv_0= '-' ( (lv_value_1_0= 'always' ) ) ) | otherlv_2= 'onFailure' | (otherlv_3= 'none' ( (lv_maximumRetryCount_4_0= RULE_INT ) ) ) ) ;
    public final EObject ruleRestartPolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_maximumRetryCount_4_0=null;

         enterRule(); 
            
        try {
            // InternalContainer.g:2224:28: ( ( (otherlv_0= '-' ( (lv_value_1_0= 'always' ) ) ) | otherlv_2= 'onFailure' | (otherlv_3= 'none' ( (lv_maximumRetryCount_4_0= RULE_INT ) ) ) ) )
            // InternalContainer.g:2225:1: ( (otherlv_0= '-' ( (lv_value_1_0= 'always' ) ) ) | otherlv_2= 'onFailure' | (otherlv_3= 'none' ( (lv_maximumRetryCount_4_0= RULE_INT ) ) ) )
            {
            // InternalContainer.g:2225:1: ( (otherlv_0= '-' ( (lv_value_1_0= 'always' ) ) ) | otherlv_2= 'onFailure' | (otherlv_3= 'none' ( (lv_maximumRetryCount_4_0= RULE_INT ) ) ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt24=1;
                }
                break;
            case 66:
                {
                alt24=2;
                }
                break;
            case 67:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalContainer.g:2225:2: (otherlv_0= '-' ( (lv_value_1_0= 'always' ) ) )
                    {
                    // InternalContainer.g:2225:2: (otherlv_0= '-' ( (lv_value_1_0= 'always' ) ) )
                    // InternalContainer.g:2225:4: otherlv_0= '-' ( (lv_value_1_0= 'always' ) )
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_21); 

                        	newLeafNode(otherlv_0, grammarAccess.getRestartPolicyAccess().getHyphenMinusKeyword_0_0());
                        
                    // InternalContainer.g:2229:1: ( (lv_value_1_0= 'always' ) )
                    // InternalContainer.g:2230:1: (lv_value_1_0= 'always' )
                    {
                    // InternalContainer.g:2230:1: (lv_value_1_0= 'always' )
                    // InternalContainer.g:2231:3: lv_value_1_0= 'always'
                    {
                    lv_value_1_0=(Token)match(input,65,FOLLOW_2); 

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
                    // InternalContainer.g:2245:7: otherlv_2= 'onFailure'
                    {
                    otherlv_2=(Token)match(input,66,FOLLOW_2); 

                        	newLeafNode(otherlv_2, grammarAccess.getRestartPolicyAccess().getOnFailureKeyword_1());
                        

                    }
                    break;
                case 3 :
                    // InternalContainer.g:2250:6: (otherlv_3= 'none' ( (lv_maximumRetryCount_4_0= RULE_INT ) ) )
                    {
                    // InternalContainer.g:2250:6: (otherlv_3= 'none' ( (lv_maximumRetryCount_4_0= RULE_INT ) ) )
                    // InternalContainer.g:2250:8: otherlv_3= 'none' ( (lv_maximumRetryCount_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,67,FOLLOW_10); 

                        	newLeafNode(otherlv_3, grammarAccess.getRestartPolicyAccess().getNoneKeyword_2_0());
                        
                    // InternalContainer.g:2254:1: ( (lv_maximumRetryCount_4_0= RULE_INT ) )
                    // InternalContainer.g:2255:1: (lv_maximumRetryCount_4_0= RULE_INT )
                    {
                    // InternalContainer.g:2255:1: (lv_maximumRetryCount_4_0= RULE_INT )
                    // InternalContainer.g:2256:3: lv_maximumRetryCount_4_0= RULE_INT
                    {
                    lv_maximumRetryCount_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(lv_maximumRetryCount_4_0, grammarAccess.getRestartPolicyAccess().getMaximumRetryCountINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRestartPolicyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"maximumRetryCount",
                            		lv_maximumRetryCount_4_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

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
    // InternalContainer.g:2280:1: entryRulePortBinding returns [EObject current=null] : iv_rulePortBinding= rulePortBinding EOF ;
    public final EObject entryRulePortBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortBinding = null;


        try {
            // InternalContainer.g:2281:2: (iv_rulePortBinding= rulePortBinding EOF )
            // InternalContainer.g:2282:2: iv_rulePortBinding= rulePortBinding EOF
            {
             newCompositeNode(grammarAccess.getPortBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortBinding=rulePortBinding();

            state._fsp--;

             current =iv_rulePortBinding; 
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
    // $ANTLR end "entryRulePortBinding"


    // $ANTLR start "rulePortBinding"
    // InternalContainer.g:2289:1: rulePortBinding returns [EObject current=null] : (otherlv_0= '-' ( (lv_binding_1_0= ruleBinding ) ) ( (otherlv_2= RULE_STRING ) ) ) ;
    public final EObject rulePortBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_binding_1_0 = null;


         enterRule(); 
            
        try {
            // InternalContainer.g:2292:28: ( (otherlv_0= '-' ( (lv_binding_1_0= ruleBinding ) ) ( (otherlv_2= RULE_STRING ) ) ) )
            // InternalContainer.g:2293:1: (otherlv_0= '-' ( (lv_binding_1_0= ruleBinding ) ) ( (otherlv_2= RULE_STRING ) ) )
            {
            // InternalContainer.g:2293:1: (otherlv_0= '-' ( (lv_binding_1_0= ruleBinding ) ) ( (otherlv_2= RULE_STRING ) ) )
            // InternalContainer.g:2293:3: otherlv_0= '-' ( (lv_binding_1_0= ruleBinding ) ) ( (otherlv_2= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); 

                	newLeafNode(otherlv_0, grammarAccess.getPortBindingAccess().getHyphenMinusKeyword_0());
                
            // InternalContainer.g:2297:1: ( (lv_binding_1_0= ruleBinding ) )
            // InternalContainer.g:2298:1: (lv_binding_1_0= ruleBinding )
            {
            // InternalContainer.g:2298:1: (lv_binding_1_0= ruleBinding )
            // InternalContainer.g:2299:3: lv_binding_1_0= ruleBinding
            {
             
            	        newCompositeNode(grammarAccess.getPortBindingAccess().getBindingBindingParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_4);
            lv_binding_1_0=ruleBinding();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPortBindingRule());
            	        }
                   		set(
                   			current, 
                   			"binding",
                    		lv_binding_1_0, 
                    		"org.eclipse.docker.language.Container.Binding");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalContainer.g:2315:2: ( (otherlv_2= RULE_STRING ) )
            // InternalContainer.g:2316:1: (otherlv_2= RULE_STRING )
            {
            // InternalContainer.g:2316:1: (otherlv_2= RULE_STRING )
            // InternalContainer.g:2317:3: otherlv_2= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPortBindingRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

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
    // InternalContainer.g:2336:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalContainer.g:2337:2: (iv_ruleBinding= ruleBinding EOF )
            // InternalContainer.g:2338:2: iv_ruleBinding= ruleBinding EOF
            {
             newCompositeNode(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;

             current =iv_ruleBinding; 
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
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalContainer.g:2345:1: ruleBinding returns [EObject current=null] : (otherlv_0= '-' ( (lv_hostIP_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_hostPort_3_0= RULE_INT ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_hostIP_1_0=null;
        Token otherlv_2=null;
        Token lv_hostPort_3_0=null;

         enterRule(); 
            
        try {
            // InternalContainer.g:2348:28: ( (otherlv_0= '-' ( (lv_hostIP_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_hostPort_3_0= RULE_INT ) ) ) )
            // InternalContainer.g:2349:1: (otherlv_0= '-' ( (lv_hostIP_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_hostPort_3_0= RULE_INT ) ) )
            {
            // InternalContainer.g:2349:1: (otherlv_0= '-' ( (lv_hostIP_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_hostPort_3_0= RULE_INT ) ) )
            // InternalContainer.g:2349:3: otherlv_0= '-' ( (lv_hostIP_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_hostPort_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getHyphenMinusKeyword_0());
                
            // InternalContainer.g:2353:1: ( (lv_hostIP_1_0= RULE_STRING ) )
            // InternalContainer.g:2354:1: (lv_hostIP_1_0= RULE_STRING )
            {
            // InternalContainer.g:2354:1: (lv_hostIP_1_0= RULE_STRING )
            // InternalContainer.g:2355:3: lv_hostIP_1_0= RULE_STRING
            {
            lv_hostIP_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            			newLeafNode(lv_hostIP_1_0, grammarAccess.getBindingAccess().getHostIPSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBindingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"hostIP",
                    		lv_hostIP_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,64,FOLLOW_10); 

                	newLeafNode(otherlv_2, grammarAccess.getBindingAccess().getColonKeyword_2());
                
            // InternalContainer.g:2375:1: ( (lv_hostPort_3_0= RULE_INT ) )
            // InternalContainer.g:2376:1: (lv_hostPort_3_0= RULE_INT )
            {
            // InternalContainer.g:2376:1: (lv_hostPort_3_0= RULE_INT )
            // InternalContainer.g:2377:3: lv_hostPort_3_0= RULE_INT
            {
            lv_hostPort_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            			newLeafNode(lv_hostPort_3_0, grammarAccess.getBindingAccess().getHostPortINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBindingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"hostPort",
                    		lv_hostPort_3_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

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
    // InternalContainer.g:2401:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalContainer.g:2402:2: (iv_ruleLink= ruleLink EOF )
            // InternalContainer.g:2403:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalContainer.g:2410:1: ruleLink returns [EObject current=null] : (otherlv_0= '-' ( (lv_containerLink_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_alias_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_containerLink_1_0=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;

         enterRule(); 
            
        try {
            // InternalContainer.g:2413:28: ( (otherlv_0= '-' ( (lv_containerLink_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_alias_3_0= RULE_STRING ) ) ) )
            // InternalContainer.g:2414:1: (otherlv_0= '-' ( (lv_containerLink_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_alias_3_0= RULE_STRING ) ) )
            {
            // InternalContainer.g:2414:1: (otherlv_0= '-' ( (lv_containerLink_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_alias_3_0= RULE_STRING ) ) )
            // InternalContainer.g:2414:3: otherlv_0= '-' ( (lv_containerLink_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_alias_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getHyphenMinusKeyword_0());
                
            // InternalContainer.g:2418:1: ( (lv_containerLink_1_0= RULE_STRING ) )
            // InternalContainer.g:2419:1: (lv_containerLink_1_0= RULE_STRING )
            {
            // InternalContainer.g:2419:1: (lv_containerLink_1_0= RULE_STRING )
            // InternalContainer.g:2420:3: lv_containerLink_1_0= RULE_STRING
            {
            lv_containerLink_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            			newLeafNode(lv_containerLink_1_0, grammarAccess.getLinkAccess().getContainerLinkSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"containerLink",
                    		lv_containerLink_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,64,FOLLOW_4); 

                	newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getColonKeyword_2());
                
            // InternalContainer.g:2440:1: ( (lv_alias_3_0= RULE_STRING ) )
            // InternalContainer.g:2441:1: (lv_alias_3_0= RULE_STRING )
            {
            // InternalContainer.g:2441:1: (lv_alias_3_0= RULE_STRING )
            // InternalContainer.g:2442:3: lv_alias_3_0= RULE_STRING
            {
            lv_alias_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_alias_3_0, grammarAccess.getLinkAccess().getAliasSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"alias",
                    		lv_alias_3_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleUlimit"
    // InternalContainer.g:2466:1: entryRuleUlimit returns [EObject current=null] : iv_ruleUlimit= ruleUlimit EOF ;
    public final EObject entryRuleUlimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUlimit = null;


        try {
            // InternalContainer.g:2467:2: (iv_ruleUlimit= ruleUlimit EOF )
            // InternalContainer.g:2468:2: iv_ruleUlimit= ruleUlimit EOF
            {
             newCompositeNode(grammarAccess.getUlimitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUlimit=ruleUlimit();

            state._fsp--;

             current =iv_ruleUlimit; 
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
    // $ANTLR end "entryRuleUlimit"


    // $ANTLR start "ruleUlimit"
    // InternalContainer.g:2475:1: ruleUlimit returns [EObject current=null] : (otherlv_0= '-' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_soft_2_0= RULE_INT ) ) ( (lv_hard_3_0= RULE_INT ) ) ) ;
    public final EObject ruleUlimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_soft_2_0=null;
        Token lv_hard_3_0=null;

         enterRule(); 
            
        try {
            // InternalContainer.g:2478:28: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_soft_2_0= RULE_INT ) ) ( (lv_hard_3_0= RULE_INT ) ) ) )
            // InternalContainer.g:2479:1: (otherlv_0= '-' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_soft_2_0= RULE_INT ) ) ( (lv_hard_3_0= RULE_INT ) ) )
            {
            // InternalContainer.g:2479:1: (otherlv_0= '-' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_soft_2_0= RULE_INT ) ) ( (lv_hard_3_0= RULE_INT ) ) )
            // InternalContainer.g:2479:3: otherlv_0= '-' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_soft_2_0= RULE_INT ) ) ( (lv_hard_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getUlimitAccess().getHyphenMinusKeyword_0());
                
            // InternalContainer.g:2483:1: ( (lv_name_1_0= RULE_STRING ) )
            // InternalContainer.g:2484:1: (lv_name_1_0= RULE_STRING )
            {
            // InternalContainer.g:2484:1: (lv_name_1_0= RULE_STRING )
            // InternalContainer.g:2485:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUlimitAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUlimitRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalContainer.g:2501:2: ( (lv_soft_2_0= RULE_INT ) )
            // InternalContainer.g:2502:1: (lv_soft_2_0= RULE_INT )
            {
            // InternalContainer.g:2502:1: (lv_soft_2_0= RULE_INT )
            // InternalContainer.g:2503:3: lv_soft_2_0= RULE_INT
            {
            lv_soft_2_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            			newLeafNode(lv_soft_2_0, grammarAccess.getUlimitAccess().getSoftINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUlimitRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"soft",
                    		lv_soft_2_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            // InternalContainer.g:2519:2: ( (lv_hard_3_0= RULE_INT ) )
            // InternalContainer.g:2520:1: (lv_hard_3_0= RULE_INT )
            {
            // InternalContainer.g:2520:1: (lv_hard_3_0= RULE_INT )
            // InternalContainer.g:2521:3: lv_hard_3_0= RULE_INT
            {
            lv_hard_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            			newLeafNode(lv_hard_3_0, grammarAccess.getUlimitAccess().getHardINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUlimitRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"hard",
                    		lv_hard_3_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

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
    // InternalContainer.g:2545:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalContainer.g:2546:2: (iv_ruleLabel= ruleLabel EOF )
            // InternalContainer.g:2547:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalContainer.g:2554:1: ruleLabel returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // InternalContainer.g:2557:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalContainer.g:2558:1: ( ( (lv_key_0_0= RULE_STRING ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalContainer.g:2558:1: ( ( (lv_key_0_0= RULE_STRING ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalContainer.g:2558:2: ( (lv_key_0_0= RULE_STRING ) ) ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalContainer.g:2558:2: ( (lv_key_0_0= RULE_STRING ) )
            // InternalContainer.g:2559:1: (lv_key_0_0= RULE_STRING )
            {
            // InternalContainer.g:2559:1: (lv_key_0_0= RULE_STRING )
            // InternalContainer.g:2560:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            			newLeafNode(lv_key_0_0, grammarAccess.getLabelAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalContainer.g:2576:2: ( (lv_value_1_0= RULE_STRING ) )
            // InternalContainer.g:2577:1: (lv_value_1_0= RULE_STRING )
            {
            // InternalContainer.g:2577:1: (lv_value_1_0= RULE_STRING )
            // InternalContainer.g:2578:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_value_1_0, grammarAccess.getLabelAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // InternalContainer.g:2602:1: entryRuleExposedPort returns [EObject current=null] : iv_ruleExposedPort= ruleExposedPort EOF ;
    public final EObject entryRuleExposedPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExposedPort = null;


        try {
            // InternalContainer.g:2603:2: (iv_ruleExposedPort= ruleExposedPort EOF )
            // InternalContainer.g:2604:2: iv_ruleExposedPort= ruleExposedPort EOF
            {
             newCompositeNode(grammarAccess.getExposedPortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExposedPort=ruleExposedPort();

            state._fsp--;

             current =iv_ruleExposedPort; 
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
    // $ANTLR end "entryRuleExposedPort"


    // $ANTLR start "ruleExposedPort"
    // InternalContainer.g:2611:1: ruleExposedPort returns [EObject current=null] : (otherlv_0= '-' ( (lv_port_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_protocol_3_0= ruleInternalProtocol ) ) ) ;
    public final EObject ruleExposedPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_port_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_protocol_3_0 = null;


         enterRule(); 
            
        try {
            // InternalContainer.g:2614:28: ( (otherlv_0= '-' ( (lv_port_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_protocol_3_0= ruleInternalProtocol ) ) ) )
            // InternalContainer.g:2615:1: (otherlv_0= '-' ( (lv_port_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_protocol_3_0= ruleInternalProtocol ) ) )
            {
            // InternalContainer.g:2615:1: (otherlv_0= '-' ( (lv_port_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_protocol_3_0= ruleInternalProtocol ) ) )
            // InternalContainer.g:2615:3: otherlv_0= '-' ( (lv_port_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_protocol_3_0= ruleInternalProtocol ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getExposedPortAccess().getHyphenMinusKeyword_0());
                
            // InternalContainer.g:2619:1: ( (lv_port_1_0= RULE_STRING ) )
            // InternalContainer.g:2620:1: (lv_port_1_0= RULE_STRING )
            {
            // InternalContainer.g:2620:1: (lv_port_1_0= RULE_STRING )
            // InternalContainer.g:2621:3: lv_port_1_0= RULE_STRING
            {
            lv_port_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            			newLeafNode(lv_port_1_0, grammarAccess.getExposedPortAccess().getPortSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExposedPortRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"port",
                    		lv_port_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,68,FOLLOW_23); 

                	newLeafNode(otherlv_2, grammarAccess.getExposedPortAccess().getSolidusKeyword_2());
                
            // InternalContainer.g:2641:1: ( (lv_protocol_3_0= ruleInternalProtocol ) )
            // InternalContainer.g:2642:1: (lv_protocol_3_0= ruleInternalProtocol )
            {
            // InternalContainer.g:2642:1: (lv_protocol_3_0= ruleInternalProtocol )
            // InternalContainer.g:2643:3: lv_protocol_3_0= ruleInternalProtocol
            {
             
            	        newCompositeNode(grammarAccess.getExposedPortAccess().getProtocolInternalProtocolEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_protocol_3_0=ruleInternalProtocol();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExposedPortRule());
            	        }
                   		set(
                   			current, 
                   			"protocol",
                    		lv_protocol_3_0, 
                    		"org.eclipse.docker.language.Container.InternalProtocol");
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
    // InternalContainer.g:2667:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalContainer.g:2668:2: (iv_ruleDevice= ruleDevice EOF )
            // InternalContainer.g:2669:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
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
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalContainer.g:2676:1: ruleDevice returns [EObject current=null] : (otherlv_0= '-' ( (lv_cGroupPermissions_1_0= RULE_STRING ) ) ( (lv_pathOnHost_2_0= RULE_STRING ) ) ( (lv_pathInContainer_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_cGroupPermissions_1_0=null;
        Token lv_pathOnHost_2_0=null;
        Token lv_pathInContainer_3_0=null;

         enterRule(); 
            
        try {
            // InternalContainer.g:2679:28: ( (otherlv_0= '-' ( (lv_cGroupPermissions_1_0= RULE_STRING ) ) ( (lv_pathOnHost_2_0= RULE_STRING ) ) ( (lv_pathInContainer_3_0= RULE_STRING ) ) ) )
            // InternalContainer.g:2680:1: (otherlv_0= '-' ( (lv_cGroupPermissions_1_0= RULE_STRING ) ) ( (lv_pathOnHost_2_0= RULE_STRING ) ) ( (lv_pathInContainer_3_0= RULE_STRING ) ) )
            {
            // InternalContainer.g:2680:1: (otherlv_0= '-' ( (lv_cGroupPermissions_1_0= RULE_STRING ) ) ( (lv_pathOnHost_2_0= RULE_STRING ) ) ( (lv_pathInContainer_3_0= RULE_STRING ) ) )
            // InternalContainer.g:2680:3: otherlv_0= '-' ( (lv_cGroupPermissions_1_0= RULE_STRING ) ) ( (lv_pathOnHost_2_0= RULE_STRING ) ) ( (lv_pathInContainer_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getHyphenMinusKeyword_0());
                
            // InternalContainer.g:2684:1: ( (lv_cGroupPermissions_1_0= RULE_STRING ) )
            // InternalContainer.g:2685:1: (lv_cGroupPermissions_1_0= RULE_STRING )
            {
            // InternalContainer.g:2685:1: (lv_cGroupPermissions_1_0= RULE_STRING )
            // InternalContainer.g:2686:3: lv_cGroupPermissions_1_0= RULE_STRING
            {
            lv_cGroupPermissions_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            			newLeafNode(lv_cGroupPermissions_1_0, grammarAccess.getDeviceAccess().getCGroupPermissionsSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"cGroupPermissions",
                    		lv_cGroupPermissions_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalContainer.g:2702:2: ( (lv_pathOnHost_2_0= RULE_STRING ) )
            // InternalContainer.g:2703:1: (lv_pathOnHost_2_0= RULE_STRING )
            {
            // InternalContainer.g:2703:1: (lv_pathOnHost_2_0= RULE_STRING )
            // InternalContainer.g:2704:3: lv_pathOnHost_2_0= RULE_STRING
            {
            lv_pathOnHost_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            			newLeafNode(lv_pathOnHost_2_0, grammarAccess.getDeviceAccess().getPathOnHostSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"pathOnHost",
                    		lv_pathOnHost_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalContainer.g:2720:2: ( (lv_pathInContainer_3_0= RULE_STRING ) )
            // InternalContainer.g:2721:1: (lv_pathInContainer_3_0= RULE_STRING )
            {
            // InternalContainer.g:2721:1: (lv_pathInContainer_3_0= RULE_STRING )
            // InternalContainer.g:2722:3: lv_pathInContainer_3_0= RULE_STRING
            {
            lv_pathInContainer_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_pathInContainer_3_0, grammarAccess.getDeviceAccess().getPathInContainerSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"pathInContainer",
                    		lv_pathInContainer_3_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // InternalContainer.g:2746:1: entryRuleBind returns [EObject current=null] : iv_ruleBind= ruleBind EOF ;
    public final EObject entryRuleBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBind = null;


        try {
            // InternalContainer.g:2747:2: (iv_ruleBind= ruleBind EOF )
            // InternalContainer.g:2748:2: iv_ruleBind= ruleBind EOF
            {
             newCompositeNode(grammarAccess.getBindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBind=ruleBind();

            state._fsp--;

             current =iv_ruleBind; 
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
    // $ANTLR end "entryRuleBind"


    // $ANTLR start "ruleBind"
    // InternalContainer.g:2755:1: ruleBind returns [EObject current=null] : (otherlv_0= '-' ( (lv_location_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_volume_3_0= ruleVolume ) ) (otherlv_4= ':' ( (lv_accessMode1_5_0= ruleAccessMode ) ) )? ) ;
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
            // InternalContainer.g:2758:28: ( (otherlv_0= '-' ( (lv_location_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_volume_3_0= ruleVolume ) ) (otherlv_4= ':' ( (lv_accessMode1_5_0= ruleAccessMode ) ) )? ) )
            // InternalContainer.g:2759:1: (otherlv_0= '-' ( (lv_location_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_volume_3_0= ruleVolume ) ) (otherlv_4= ':' ( (lv_accessMode1_5_0= ruleAccessMode ) ) )? )
            {
            // InternalContainer.g:2759:1: (otherlv_0= '-' ( (lv_location_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_volume_3_0= ruleVolume ) ) (otherlv_4= ':' ( (lv_accessMode1_5_0= ruleAccessMode ) ) )? )
            // InternalContainer.g:2759:3: otherlv_0= '-' ( (lv_location_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_volume_3_0= ruleVolume ) ) (otherlv_4= ':' ( (lv_accessMode1_5_0= ruleAccessMode ) ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getBindAccess().getHyphenMinusKeyword_0());
                
            // InternalContainer.g:2763:1: ( (lv_location_1_0= RULE_STRING ) )
            // InternalContainer.g:2764:1: (lv_location_1_0= RULE_STRING )
            {
            // InternalContainer.g:2764:1: (lv_location_1_0= RULE_STRING )
            // InternalContainer.g:2765:3: lv_location_1_0= RULE_STRING
            {
            lv_location_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            			newLeafNode(lv_location_1_0, grammarAccess.getBindAccess().getLocationSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBindRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"location",
                    		lv_location_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,64,FOLLOW_4); 

                	newLeafNode(otherlv_2, grammarAccess.getBindAccess().getColonKeyword_2());
                
            // InternalContainer.g:2785:1: ( (lv_volume_3_0= ruleVolume ) )
            // InternalContainer.g:2786:1: (lv_volume_3_0= ruleVolume )
            {
            // InternalContainer.g:2786:1: (lv_volume_3_0= ruleVolume )
            // InternalContainer.g:2787:3: lv_volume_3_0= ruleVolume
            {
             
            	        newCompositeNode(grammarAccess.getBindAccess().getVolumeVolumeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_24);
            lv_volume_3_0=ruleVolume();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBindRule());
            	        }
                   		set(
                   			current, 
                   			"volume",
                    		lv_volume_3_0, 
                    		"org.eclipse.docker.language.Container.Volume");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalContainer.g:2803:2: (otherlv_4= ':' ( (lv_accessMode1_5_0= ruleAccessMode ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==64) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalContainer.g:2803:4: otherlv_4= ':' ( (lv_accessMode1_5_0= ruleAccessMode ) )
                    {
                    otherlv_4=(Token)match(input,64,FOLLOW_25); 

                        	newLeafNode(otherlv_4, grammarAccess.getBindAccess().getColonKeyword_4_0());
                        
                    // InternalContainer.g:2807:1: ( (lv_accessMode1_5_0= ruleAccessMode ) )
                    // InternalContainer.g:2808:1: (lv_accessMode1_5_0= ruleAccessMode )
                    {
                    // InternalContainer.g:2808:1: (lv_accessMode1_5_0= ruleAccessMode )
                    // InternalContainer.g:2809:3: lv_accessMode1_5_0= ruleAccessMode
                    {
                     
                    	        newCompositeNode(grammarAccess.getBindAccess().getAccessMode1AccessModeEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_accessMode1_5_0=ruleAccessMode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBindRule());
                    	        }
                           		set(
                           			current, 
                           			"accessMode1",
                            		lv_accessMode1_5_0, 
                            		"org.eclipse.docker.language.Container.AccessMode");
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
    // InternalContainer.g:2833:1: entryRuleVolume returns [EObject current=null] : iv_ruleVolume= ruleVolume EOF ;
    public final EObject entryRuleVolume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolume = null;


        try {
            // InternalContainer.g:2834:2: (iv_ruleVolume= ruleVolume EOF )
            // InternalContainer.g:2835:2: iv_ruleVolume= ruleVolume EOF
            {
             newCompositeNode(grammarAccess.getVolumeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVolume=ruleVolume();

            state._fsp--;

             current =iv_ruleVolume; 
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
    // $ANTLR end "entryRuleVolume"


    // $ANTLR start "ruleVolume"
    // InternalContainer.g:2842:1: ruleVolume returns [EObject current=null] : ( (lv_path_0_0= RULE_STRING ) ) ;
    public final EObject ruleVolume() throws RecognitionException {
        EObject current = null;

        Token lv_path_0_0=null;

         enterRule(); 
            
        try {
            // InternalContainer.g:2845:28: ( ( (lv_path_0_0= RULE_STRING ) ) )
            // InternalContainer.g:2846:1: ( (lv_path_0_0= RULE_STRING ) )
            {
            // InternalContainer.g:2846:1: ( (lv_path_0_0= RULE_STRING ) )
            // InternalContainer.g:2847:1: (lv_path_0_0= RULE_STRING )
            {
            // InternalContainer.g:2847:1: (lv_path_0_0= RULE_STRING )
            // InternalContainer.g:2848:3: lv_path_0_0= RULE_STRING
            {
            lv_path_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_path_0_0, grammarAccess.getVolumeAccess().getPathSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVolumeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"path",
                    		lv_path_0_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // InternalContainer.g:2872:1: ruleInternalProtocol returns [Enumerator current=null] : ( (enumLiteral_0= 'TCP' ) | (enumLiteral_1= 'UDP' ) ) ;
    public final Enumerator ruleInternalProtocol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalContainer.g:2874:28: ( ( (enumLiteral_0= 'TCP' ) | (enumLiteral_1= 'UDP' ) ) )
            // InternalContainer.g:2875:1: ( (enumLiteral_0= 'TCP' ) | (enumLiteral_1= 'UDP' ) )
            {
            // InternalContainer.g:2875:1: ( (enumLiteral_0= 'TCP' ) | (enumLiteral_1= 'UDP' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==69) ) {
                alt26=1;
            }
            else if ( (LA26_0==70) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalContainer.g:2875:2: (enumLiteral_0= 'TCP' )
                    {
                    // InternalContainer.g:2875:2: (enumLiteral_0= 'TCP' )
                    // InternalContainer.g:2875:4: enumLiteral_0= 'TCP'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                            current = grammarAccess.getInternalProtocolAccess().getTCPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getInternalProtocolAccess().getTCPEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalContainer.g:2881:6: (enumLiteral_1= 'UDP' )
                    {
                    // InternalContainer.g:2881:6: (enumLiteral_1= 'UDP' )
                    // InternalContainer.g:2881:8: enumLiteral_1= 'UDP'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

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
    // InternalContainer.g:2891:1: ruleAccessMode returns [Enumerator current=null] : ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) ) ;
    public final Enumerator ruleAccessMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalContainer.g:2893:28: ( ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) ) )
            // InternalContainer.g:2894:1: ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) )
            {
            // InternalContainer.g:2894:1: ( (enumLiteral_0= 'rw' ) | (enumLiteral_1= 'ro' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==71) ) {
                alt27=1;
            }
            else if ( (LA27_0==72) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalContainer.g:2894:2: (enumLiteral_0= 'rw' )
                    {
                    // InternalContainer.g:2894:2: (enumLiteral_0= 'rw' )
                    // InternalContainer.g:2894:4: enumLiteral_0= 'rw'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); 

                            current = grammarAccess.getAccessModeAccess().getRwEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAccessModeAccess().getRwEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalContainer.g:2900:6: (enumLiteral_1= 'ro' )
                    {
                    // InternalContainer.g:2900:6: (enumLiteral_1= 'ro' )
                    // InternalContainer.g:2900:8: enumLiteral_1= 'ro'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_2); 

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
    // InternalContainer.g:2910:1: ruleCapability returns [Enumerator current=null] : ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'AUDIT_CONTROL' ) | (enumLiteral_2= 'AUDIT_WRITE' ) | (enumLiteral_3= 'BLOCK_SUSPEND' ) | (enumLiteral_4= 'CHOWN' ) | (enumLiteral_5= 'DAC_OVERRIDE' ) | (enumLiteral_6= 'DAC_READ_SEARCH' ) | (enumLiteral_7= 'FOWNER' ) | (enumLiteral_8= 'FSETID' ) | (enumLiteral_9= 'IPC_LOCK' ) | (enumLiteral_10= 'IPC_OWNER' ) | (enumLiteral_11= 'KILL' ) | (enumLiteral_12= 'LEASE' ) | (enumLiteral_13= 'LINUX_IMMUTABLE' ) | (enumLiteral_14= 'MAC_ADMIN' ) | (enumLiteral_15= 'MAC_OVERRIDE' ) | (enumLiteral_16= 'MKNOD' ) | (enumLiteral_17= 'NET_ADMIN' ) | (enumLiteral_18= 'NET_BIND_SERVICE' ) | (enumLiteral_19= 'NET_BROADCAST' ) | (enumLiteral_20= 'NET_RAW' ) | (enumLiteral_21= 'SETFCAP' ) | (enumLiteral_22= 'SETGID' ) | (enumLiteral_23= 'SETPCAP' ) | (enumLiteral_24= 'SETUID' ) | (enumLiteral_25= 'SYS_ADMIN' ) | (enumLiteral_26= 'SYS_BOOT' ) | (enumLiteral_27= 'SYS_CHROOT' ) | (enumLiteral_28= 'SYSLOG' ) | (enumLiteral_29= 'SYS_MODULE' ) | (enumLiteral_30= 'SYS_NICE' ) | (enumLiteral_31= 'SYS_PACCT' ) | (enumLiteral_32= 'SYS_PTRACE' ) | (enumLiteral_33= 'SYS_RAWIO' ) | (enumLiteral_34= 'SYS_RESOURCE' ) | (enumLiteral_35= 'SYS_TIME' ) | (enumLiteral_36= 'SYS_TTY_CONFIG' ) | (enumLiteral_37= 'WAKE_ALARM' ) ) ;
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
            // InternalContainer.g:2912:28: ( ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'AUDIT_CONTROL' ) | (enumLiteral_2= 'AUDIT_WRITE' ) | (enumLiteral_3= 'BLOCK_SUSPEND' ) | (enumLiteral_4= 'CHOWN' ) | (enumLiteral_5= 'DAC_OVERRIDE' ) | (enumLiteral_6= 'DAC_READ_SEARCH' ) | (enumLiteral_7= 'FOWNER' ) | (enumLiteral_8= 'FSETID' ) | (enumLiteral_9= 'IPC_LOCK' ) | (enumLiteral_10= 'IPC_OWNER' ) | (enumLiteral_11= 'KILL' ) | (enumLiteral_12= 'LEASE' ) | (enumLiteral_13= 'LINUX_IMMUTABLE' ) | (enumLiteral_14= 'MAC_ADMIN' ) | (enumLiteral_15= 'MAC_OVERRIDE' ) | (enumLiteral_16= 'MKNOD' ) | (enumLiteral_17= 'NET_ADMIN' ) | (enumLiteral_18= 'NET_BIND_SERVICE' ) | (enumLiteral_19= 'NET_BROADCAST' ) | (enumLiteral_20= 'NET_RAW' ) | (enumLiteral_21= 'SETFCAP' ) | (enumLiteral_22= 'SETGID' ) | (enumLiteral_23= 'SETPCAP' ) | (enumLiteral_24= 'SETUID' ) | (enumLiteral_25= 'SYS_ADMIN' ) | (enumLiteral_26= 'SYS_BOOT' ) | (enumLiteral_27= 'SYS_CHROOT' ) | (enumLiteral_28= 'SYSLOG' ) | (enumLiteral_29= 'SYS_MODULE' ) | (enumLiteral_30= 'SYS_NICE' ) | (enumLiteral_31= 'SYS_PACCT' ) | (enumLiteral_32= 'SYS_PTRACE' ) | (enumLiteral_33= 'SYS_RAWIO' ) | (enumLiteral_34= 'SYS_RESOURCE' ) | (enumLiteral_35= 'SYS_TIME' ) | (enumLiteral_36= 'SYS_TTY_CONFIG' ) | (enumLiteral_37= 'WAKE_ALARM' ) ) )
            // InternalContainer.g:2913:1: ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'AUDIT_CONTROL' ) | (enumLiteral_2= 'AUDIT_WRITE' ) | (enumLiteral_3= 'BLOCK_SUSPEND' ) | (enumLiteral_4= 'CHOWN' ) | (enumLiteral_5= 'DAC_OVERRIDE' ) | (enumLiteral_6= 'DAC_READ_SEARCH' ) | (enumLiteral_7= 'FOWNER' ) | (enumLiteral_8= 'FSETID' ) | (enumLiteral_9= 'IPC_LOCK' ) | (enumLiteral_10= 'IPC_OWNER' ) | (enumLiteral_11= 'KILL' ) | (enumLiteral_12= 'LEASE' ) | (enumLiteral_13= 'LINUX_IMMUTABLE' ) | (enumLiteral_14= 'MAC_ADMIN' ) | (enumLiteral_15= 'MAC_OVERRIDE' ) | (enumLiteral_16= 'MKNOD' ) | (enumLiteral_17= 'NET_ADMIN' ) | (enumLiteral_18= 'NET_BIND_SERVICE' ) | (enumLiteral_19= 'NET_BROADCAST' ) | (enumLiteral_20= 'NET_RAW' ) | (enumLiteral_21= 'SETFCAP' ) | (enumLiteral_22= 'SETGID' ) | (enumLiteral_23= 'SETPCAP' ) | (enumLiteral_24= 'SETUID' ) | (enumLiteral_25= 'SYS_ADMIN' ) | (enumLiteral_26= 'SYS_BOOT' ) | (enumLiteral_27= 'SYS_CHROOT' ) | (enumLiteral_28= 'SYSLOG' ) | (enumLiteral_29= 'SYS_MODULE' ) | (enumLiteral_30= 'SYS_NICE' ) | (enumLiteral_31= 'SYS_PACCT' ) | (enumLiteral_32= 'SYS_PTRACE' ) | (enumLiteral_33= 'SYS_RAWIO' ) | (enumLiteral_34= 'SYS_RESOURCE' ) | (enumLiteral_35= 'SYS_TIME' ) | (enumLiteral_36= 'SYS_TTY_CONFIG' ) | (enumLiteral_37= 'WAKE_ALARM' ) )
            {
            // InternalContainer.g:2913:1: ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'AUDIT_CONTROL' ) | (enumLiteral_2= 'AUDIT_WRITE' ) | (enumLiteral_3= 'BLOCK_SUSPEND' ) | (enumLiteral_4= 'CHOWN' ) | (enumLiteral_5= 'DAC_OVERRIDE' ) | (enumLiteral_6= 'DAC_READ_SEARCH' ) | (enumLiteral_7= 'FOWNER' ) | (enumLiteral_8= 'FSETID' ) | (enumLiteral_9= 'IPC_LOCK' ) | (enumLiteral_10= 'IPC_OWNER' ) | (enumLiteral_11= 'KILL' ) | (enumLiteral_12= 'LEASE' ) | (enumLiteral_13= 'LINUX_IMMUTABLE' ) | (enumLiteral_14= 'MAC_ADMIN' ) | (enumLiteral_15= 'MAC_OVERRIDE' ) | (enumLiteral_16= 'MKNOD' ) | (enumLiteral_17= 'NET_ADMIN' ) | (enumLiteral_18= 'NET_BIND_SERVICE' ) | (enumLiteral_19= 'NET_BROADCAST' ) | (enumLiteral_20= 'NET_RAW' ) | (enumLiteral_21= 'SETFCAP' ) | (enumLiteral_22= 'SETGID' ) | (enumLiteral_23= 'SETPCAP' ) | (enumLiteral_24= 'SETUID' ) | (enumLiteral_25= 'SYS_ADMIN' ) | (enumLiteral_26= 'SYS_BOOT' ) | (enumLiteral_27= 'SYS_CHROOT' ) | (enumLiteral_28= 'SYSLOG' ) | (enumLiteral_29= 'SYS_MODULE' ) | (enumLiteral_30= 'SYS_NICE' ) | (enumLiteral_31= 'SYS_PACCT' ) | (enumLiteral_32= 'SYS_PTRACE' ) | (enumLiteral_33= 'SYS_RAWIO' ) | (enumLiteral_34= 'SYS_RESOURCE' ) | (enumLiteral_35= 'SYS_TIME' ) | (enumLiteral_36= 'SYS_TTY_CONFIG' ) | (enumLiteral_37= 'WAKE_ALARM' ) )
            int alt28=38;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt28=1;
                }
                break;
            case 74:
                {
                alt28=2;
                }
                break;
            case 75:
                {
                alt28=3;
                }
                break;
            case 76:
                {
                alt28=4;
                }
                break;
            case 77:
                {
                alt28=5;
                }
                break;
            case 78:
                {
                alt28=6;
                }
                break;
            case 79:
                {
                alt28=7;
                }
                break;
            case 80:
                {
                alt28=8;
                }
                break;
            case 81:
                {
                alt28=9;
                }
                break;
            case 82:
                {
                alt28=10;
                }
                break;
            case 83:
                {
                alt28=11;
                }
                break;
            case 84:
                {
                alt28=12;
                }
                break;
            case 85:
                {
                alt28=13;
                }
                break;
            case 86:
                {
                alt28=14;
                }
                break;
            case 87:
                {
                alt28=15;
                }
                break;
            case 88:
                {
                alt28=16;
                }
                break;
            case 89:
                {
                alt28=17;
                }
                break;
            case 90:
                {
                alt28=18;
                }
                break;
            case 91:
                {
                alt28=19;
                }
                break;
            case 92:
                {
                alt28=20;
                }
                break;
            case 93:
                {
                alt28=21;
                }
                break;
            case 94:
                {
                alt28=22;
                }
                break;
            case 95:
                {
                alt28=23;
                }
                break;
            case 96:
                {
                alt28=24;
                }
                break;
            case 97:
                {
                alt28=25;
                }
                break;
            case 98:
                {
                alt28=26;
                }
                break;
            case 99:
                {
                alt28=27;
                }
                break;
            case 100:
                {
                alt28=28;
                }
                break;
            case 101:
                {
                alt28=29;
                }
                break;
            case 102:
                {
                alt28=30;
                }
                break;
            case 103:
                {
                alt28=31;
                }
                break;
            case 104:
                {
                alt28=32;
                }
                break;
            case 105:
                {
                alt28=33;
                }
                break;
            case 106:
                {
                alt28=34;
                }
                break;
            case 107:
                {
                alt28=35;
                }
                break;
            case 108:
                {
                alt28=36;
                }
                break;
            case 109:
                {
                alt28=37;
                }
                break;
            case 110:
                {
                alt28=38;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalContainer.g:2913:2: (enumLiteral_0= 'ALL' )
                    {
                    // InternalContainer.g:2913:2: (enumLiteral_0= 'ALL' )
                    // InternalContainer.g:2913:4: enumLiteral_0= 'ALL'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCapabilityAccess().getALLEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalContainer.g:2919:6: (enumLiteral_1= 'AUDIT_CONTROL' )
                    {
                    // InternalContainer.g:2919:6: (enumLiteral_1= 'AUDIT_CONTROL' )
                    // InternalContainer.g:2919:8: enumLiteral_1= 'AUDIT_CONTROL'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getAUDIT_CONTROLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCapabilityAccess().getAUDIT_CONTROLEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalContainer.g:2925:6: (enumLiteral_2= 'AUDIT_WRITE' )
                    {
                    // InternalContainer.g:2925:6: (enumLiteral_2= 'AUDIT_WRITE' )
                    // InternalContainer.g:2925:8: enumLiteral_2= 'AUDIT_WRITE'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getAUDIT_WRITEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCapabilityAccess().getAUDIT_WRITEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalContainer.g:2931:6: (enumLiteral_3= 'BLOCK_SUSPEND' )
                    {
                    // InternalContainer.g:2931:6: (enumLiteral_3= 'BLOCK_SUSPEND' )
                    // InternalContainer.g:2931:8: enumLiteral_3= 'BLOCK_SUSPEND'
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getBLOCK_SUSPENDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getCapabilityAccess().getBLOCK_SUSPENDEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalContainer.g:2937:6: (enumLiteral_4= 'CHOWN' )
                    {
                    // InternalContainer.g:2937:6: (enumLiteral_4= 'CHOWN' )
                    // InternalContainer.g:2937:8: enumLiteral_4= 'CHOWN'
                    {
                    enumLiteral_4=(Token)match(input,77,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getCHOWNEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getCapabilityAccess().getCHOWNEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // InternalContainer.g:2943:6: (enumLiteral_5= 'DAC_OVERRIDE' )
                    {
                    // InternalContainer.g:2943:6: (enumLiteral_5= 'DAC_OVERRIDE' )
                    // InternalContainer.g:2943:8: enumLiteral_5= 'DAC_OVERRIDE'
                    {
                    enumLiteral_5=(Token)match(input,78,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getDAC_OVERRIDEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getCapabilityAccess().getDAC_OVERRIDEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // InternalContainer.g:2949:6: (enumLiteral_6= 'DAC_READ_SEARCH' )
                    {
                    // InternalContainer.g:2949:6: (enumLiteral_6= 'DAC_READ_SEARCH' )
                    // InternalContainer.g:2949:8: enumLiteral_6= 'DAC_READ_SEARCH'
                    {
                    enumLiteral_6=(Token)match(input,79,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getDAC_READ_SEARCHEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getCapabilityAccess().getDAC_READ_SEARCHEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // InternalContainer.g:2955:6: (enumLiteral_7= 'FOWNER' )
                    {
                    // InternalContainer.g:2955:6: (enumLiteral_7= 'FOWNER' )
                    // InternalContainer.g:2955:8: enumLiteral_7= 'FOWNER'
                    {
                    enumLiteral_7=(Token)match(input,80,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getFOWNEREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getCapabilityAccess().getFOWNEREnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // InternalContainer.g:2961:6: (enumLiteral_8= 'FSETID' )
                    {
                    // InternalContainer.g:2961:6: (enumLiteral_8= 'FSETID' )
                    // InternalContainer.g:2961:8: enumLiteral_8= 'FSETID'
                    {
                    enumLiteral_8=(Token)match(input,81,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getFSETIDEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getCapabilityAccess().getFSETIDEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // InternalContainer.g:2967:6: (enumLiteral_9= 'IPC_LOCK' )
                    {
                    // InternalContainer.g:2967:6: (enumLiteral_9= 'IPC_LOCK' )
                    // InternalContainer.g:2967:8: enumLiteral_9= 'IPC_LOCK'
                    {
                    enumLiteral_9=(Token)match(input,82,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getIPC_LOCKEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getCapabilityAccess().getIPC_LOCKEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // InternalContainer.g:2973:6: (enumLiteral_10= 'IPC_OWNER' )
                    {
                    // InternalContainer.g:2973:6: (enumLiteral_10= 'IPC_OWNER' )
                    // InternalContainer.g:2973:8: enumLiteral_10= 'IPC_OWNER'
                    {
                    enumLiteral_10=(Token)match(input,83,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getIPC_OWNEREnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getCapabilityAccess().getIPC_OWNEREnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // InternalContainer.g:2979:6: (enumLiteral_11= 'KILL' )
                    {
                    // InternalContainer.g:2979:6: (enumLiteral_11= 'KILL' )
                    // InternalContainer.g:2979:8: enumLiteral_11= 'KILL'
                    {
                    enumLiteral_11=(Token)match(input,84,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getKILLEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getCapabilityAccess().getKILLEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // InternalContainer.g:2985:6: (enumLiteral_12= 'LEASE' )
                    {
                    // InternalContainer.g:2985:6: (enumLiteral_12= 'LEASE' )
                    // InternalContainer.g:2985:8: enumLiteral_12= 'LEASE'
                    {
                    enumLiteral_12=(Token)match(input,85,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getLEASEEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getCapabilityAccess().getLEASEEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // InternalContainer.g:2991:6: (enumLiteral_13= 'LINUX_IMMUTABLE' )
                    {
                    // InternalContainer.g:2991:6: (enumLiteral_13= 'LINUX_IMMUTABLE' )
                    // InternalContainer.g:2991:8: enumLiteral_13= 'LINUX_IMMUTABLE'
                    {
                    enumLiteral_13=(Token)match(input,86,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getLINUX_IMMUTABLEEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getCapabilityAccess().getLINUX_IMMUTABLEEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // InternalContainer.g:2997:6: (enumLiteral_14= 'MAC_ADMIN' )
                    {
                    // InternalContainer.g:2997:6: (enumLiteral_14= 'MAC_ADMIN' )
                    // InternalContainer.g:2997:8: enumLiteral_14= 'MAC_ADMIN'
                    {
                    enumLiteral_14=(Token)match(input,87,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getMAC_ADMINEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getCapabilityAccess().getMAC_ADMINEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // InternalContainer.g:3003:6: (enumLiteral_15= 'MAC_OVERRIDE' )
                    {
                    // InternalContainer.g:3003:6: (enumLiteral_15= 'MAC_OVERRIDE' )
                    // InternalContainer.g:3003:8: enumLiteral_15= 'MAC_OVERRIDE'
                    {
                    enumLiteral_15=(Token)match(input,88,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getMAC_OVERRIDEEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_15, grammarAccess.getCapabilityAccess().getMAC_OVERRIDEEnumLiteralDeclaration_15()); 
                        

                    }


                    }
                    break;
                case 17 :
                    // InternalContainer.g:3009:6: (enumLiteral_16= 'MKNOD' )
                    {
                    // InternalContainer.g:3009:6: (enumLiteral_16= 'MKNOD' )
                    // InternalContainer.g:3009:8: enumLiteral_16= 'MKNOD'
                    {
                    enumLiteral_16=(Token)match(input,89,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getMKNODEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_16, grammarAccess.getCapabilityAccess().getMKNODEnumLiteralDeclaration_16()); 
                        

                    }


                    }
                    break;
                case 18 :
                    // InternalContainer.g:3015:6: (enumLiteral_17= 'NET_ADMIN' )
                    {
                    // InternalContainer.g:3015:6: (enumLiteral_17= 'NET_ADMIN' )
                    // InternalContainer.g:3015:8: enumLiteral_17= 'NET_ADMIN'
                    {
                    enumLiteral_17=(Token)match(input,90,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getNET_ADMINEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_17, grammarAccess.getCapabilityAccess().getNET_ADMINEnumLiteralDeclaration_17()); 
                        

                    }


                    }
                    break;
                case 19 :
                    // InternalContainer.g:3021:6: (enumLiteral_18= 'NET_BIND_SERVICE' )
                    {
                    // InternalContainer.g:3021:6: (enumLiteral_18= 'NET_BIND_SERVICE' )
                    // InternalContainer.g:3021:8: enumLiteral_18= 'NET_BIND_SERVICE'
                    {
                    enumLiteral_18=(Token)match(input,91,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getNET_BIND_SERVICEEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_18, grammarAccess.getCapabilityAccess().getNET_BIND_SERVICEEnumLiteralDeclaration_18()); 
                        

                    }


                    }
                    break;
                case 20 :
                    // InternalContainer.g:3027:6: (enumLiteral_19= 'NET_BROADCAST' )
                    {
                    // InternalContainer.g:3027:6: (enumLiteral_19= 'NET_BROADCAST' )
                    // InternalContainer.g:3027:8: enumLiteral_19= 'NET_BROADCAST'
                    {
                    enumLiteral_19=(Token)match(input,92,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getNET_BROADCASTEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_19, grammarAccess.getCapabilityAccess().getNET_BROADCASTEnumLiteralDeclaration_19()); 
                        

                    }


                    }
                    break;
                case 21 :
                    // InternalContainer.g:3033:6: (enumLiteral_20= 'NET_RAW' )
                    {
                    // InternalContainer.g:3033:6: (enumLiteral_20= 'NET_RAW' )
                    // InternalContainer.g:3033:8: enumLiteral_20= 'NET_RAW'
                    {
                    enumLiteral_20=(Token)match(input,93,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getNET_RAWEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_20, grammarAccess.getCapabilityAccess().getNET_RAWEnumLiteralDeclaration_20()); 
                        

                    }


                    }
                    break;
                case 22 :
                    // InternalContainer.g:3039:6: (enumLiteral_21= 'SETFCAP' )
                    {
                    // InternalContainer.g:3039:6: (enumLiteral_21= 'SETFCAP' )
                    // InternalContainer.g:3039:8: enumLiteral_21= 'SETFCAP'
                    {
                    enumLiteral_21=(Token)match(input,94,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getSETFCAPEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_21, grammarAccess.getCapabilityAccess().getSETFCAPEnumLiteralDeclaration_21()); 
                        

                    }


                    }
                    break;
                case 23 :
                    // InternalContainer.g:3045:6: (enumLiteral_22= 'SETGID' )
                    {
                    // InternalContainer.g:3045:6: (enumLiteral_22= 'SETGID' )
                    // InternalContainer.g:3045:8: enumLiteral_22= 'SETGID'
                    {
                    enumLiteral_22=(Token)match(input,95,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getSETGIDEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_22, grammarAccess.getCapabilityAccess().getSETGIDEnumLiteralDeclaration_22()); 
                        

                    }


                    }
                    break;
                case 24 :
                    // InternalContainer.g:3051:6: (enumLiteral_23= 'SETPCAP' )
                    {
                    // InternalContainer.g:3051:6: (enumLiteral_23= 'SETPCAP' )
                    // InternalContainer.g:3051:8: enumLiteral_23= 'SETPCAP'
                    {
                    enumLiteral_23=(Token)match(input,96,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getSETPCAPEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_23, grammarAccess.getCapabilityAccess().getSETPCAPEnumLiteralDeclaration_23()); 
                        

                    }


                    }
                    break;
                case 25 :
                    // InternalContainer.g:3057:6: (enumLiteral_24= 'SETUID' )
                    {
                    // InternalContainer.g:3057:6: (enumLiteral_24= 'SETUID' )
                    // InternalContainer.g:3057:8: enumLiteral_24= 'SETUID'
                    {
                    enumLiteral_24=(Token)match(input,97,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getSETUIDEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_24, grammarAccess.getCapabilityAccess().getSETUIDEnumLiteralDeclaration_24()); 
                        

                    }


                    }
                    break;
                case 26 :
                    // InternalContainer.g:3063:6: (enumLiteral_25= 'SYS_ADMIN' )
                    {
                    // InternalContainer.g:3063:6: (enumLiteral_25= 'SYS_ADMIN' )
                    // InternalContainer.g:3063:8: enumLiteral_25= 'SYS_ADMIN'
                    {
                    enumLiteral_25=(Token)match(input,98,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getSYS_ADMINEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_25, grammarAccess.getCapabilityAccess().getSYS_ADMINEnumLiteralDeclaration_25()); 
                        

                    }


                    }
                    break;
                case 27 :
                    // InternalContainer.g:3069:6: (enumLiteral_26= 'SYS_BOOT' )
                    {
                    // InternalContainer.g:3069:6: (enumLiteral_26= 'SYS_BOOT' )
                    // InternalContainer.g:3069:8: enumLiteral_26= 'SYS_BOOT'
                    {
                    enumLiteral_26=(Token)match(input,99,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getSYS_BOOTEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_26, grammarAccess.getCapabilityAccess().getSYS_BOOTEnumLiteralDeclaration_26()); 
                        

                    }


                    }
                    break;
                case 28 :
                    // InternalContainer.g:3075:6: (enumLiteral_27= 'SYS_CHROOT' )
                    {
                    // InternalContainer.g:3075:6: (enumLiteral_27= 'SYS_CHROOT' )
                    // InternalContainer.g:3075:8: enumLiteral_27= 'SYS_CHROOT'
                    {
                    enumLiteral_27=(Token)match(input,100,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getSYS_CHROOTEnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_27, grammarAccess.getCapabilityAccess().getSYS_CHROOTEnumLiteralDeclaration_27()); 
                        

                    }


                    }
                    break;
                case 29 :
                    // InternalContainer.g:3081:6: (enumLiteral_28= 'SYSLOG' )
                    {
                    // InternalContainer.g:3081:6: (enumLiteral_28= 'SYSLOG' )
                    // InternalContainer.g:3081:8: enumLiteral_28= 'SYSLOG'
                    {
                    enumLiteral_28=(Token)match(input,101,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getSYSLOGEnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_28, grammarAccess.getCapabilityAccess().getSYSLOGEnumLiteralDeclaration_28()); 
                        

                    }


                    }
                    break;
                case 30 :
                    // InternalContainer.g:3087:6: (enumLiteral_29= 'SYS_MODULE' )
                    {
                    // InternalContainer.g:3087:6: (enumLiteral_29= 'SYS_MODULE' )
                    // InternalContainer.g:3087:8: enumLiteral_29= 'SYS_MODULE'
                    {
                    enumLiteral_29=(Token)match(input,102,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getSYS_MODULEEnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_29, grammarAccess.getCapabilityAccess().getSYS_MODULEEnumLiteralDeclaration_29()); 
                        

                    }


                    }
                    break;
                case 31 :
                    // InternalContainer.g:3093:6: (enumLiteral_30= 'SYS_NICE' )
                    {
                    // InternalContainer.g:3093:6: (enumLiteral_30= 'SYS_NICE' )
                    // InternalContainer.g:3093:8: enumLiteral_30= 'SYS_NICE'
                    {
                    enumLiteral_30=(Token)match(input,103,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getSYS_NICEEnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_30, grammarAccess.getCapabilityAccess().getSYS_NICEEnumLiteralDeclaration_30()); 
                        

                    }


                    }
                    break;
                case 32 :
                    // InternalContainer.g:3099:6: (enumLiteral_31= 'SYS_PACCT' )
                    {
                    // InternalContainer.g:3099:6: (enumLiteral_31= 'SYS_PACCT' )
                    // InternalContainer.g:3099:8: enumLiteral_31= 'SYS_PACCT'
                    {
                    enumLiteral_31=(Token)match(input,104,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getSYS_PACCTEnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_31, grammarAccess.getCapabilityAccess().getSYS_PACCTEnumLiteralDeclaration_31()); 
                        

                    }


                    }
                    break;
                case 33 :
                    // InternalContainer.g:3105:6: (enumLiteral_32= 'SYS_PTRACE' )
                    {
                    // InternalContainer.g:3105:6: (enumLiteral_32= 'SYS_PTRACE' )
                    // InternalContainer.g:3105:8: enumLiteral_32= 'SYS_PTRACE'
                    {
                    enumLiteral_32=(Token)match(input,105,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getSYS_PTRACEEnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_32, grammarAccess.getCapabilityAccess().getSYS_PTRACEEnumLiteralDeclaration_32()); 
                        

                    }


                    }
                    break;
                case 34 :
                    // InternalContainer.g:3111:6: (enumLiteral_33= 'SYS_RAWIO' )
                    {
                    // InternalContainer.g:3111:6: (enumLiteral_33= 'SYS_RAWIO' )
                    // InternalContainer.g:3111:8: enumLiteral_33= 'SYS_RAWIO'
                    {
                    enumLiteral_33=(Token)match(input,106,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getSYS_RAWIOEnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_33, grammarAccess.getCapabilityAccess().getSYS_RAWIOEnumLiteralDeclaration_33()); 
                        

                    }


                    }
                    break;
                case 35 :
                    // InternalContainer.g:3117:6: (enumLiteral_34= 'SYS_RESOURCE' )
                    {
                    // InternalContainer.g:3117:6: (enumLiteral_34= 'SYS_RESOURCE' )
                    // InternalContainer.g:3117:8: enumLiteral_34= 'SYS_RESOURCE'
                    {
                    enumLiteral_34=(Token)match(input,107,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getSYS_RESOURCEEnumLiteralDeclaration_34().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_34, grammarAccess.getCapabilityAccess().getSYS_RESOURCEEnumLiteralDeclaration_34()); 
                        

                    }


                    }
                    break;
                case 36 :
                    // InternalContainer.g:3123:6: (enumLiteral_35= 'SYS_TIME' )
                    {
                    // InternalContainer.g:3123:6: (enumLiteral_35= 'SYS_TIME' )
                    // InternalContainer.g:3123:8: enumLiteral_35= 'SYS_TIME'
                    {
                    enumLiteral_35=(Token)match(input,108,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getSYS_TIMEEnumLiteralDeclaration_35().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_35, grammarAccess.getCapabilityAccess().getSYS_TIMEEnumLiteralDeclaration_35()); 
                        

                    }


                    }
                    break;
                case 37 :
                    // InternalContainer.g:3129:6: (enumLiteral_36= 'SYS_TTY_CONFIG' )
                    {
                    // InternalContainer.g:3129:6: (enumLiteral_36= 'SYS_TTY_CONFIG' )
                    // InternalContainer.g:3129:8: enumLiteral_36= 'SYS_TTY_CONFIG'
                    {
                    enumLiteral_36=(Token)match(input,109,FOLLOW_2); 

                            current = grammarAccess.getCapabilityAccess().getSYS_TTY_CONFIGEnumLiteralDeclaration_36().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_36, grammarAccess.getCapabilityAccess().getSYS_TTY_CONFIGEnumLiteralDeclaration_36()); 
                        

                    }


                    }
                    break;
                case 38 :
                    // InternalContainer.g:3135:6: (enumLiteral_37= 'WAKE_ALARM' )
                    {
                    // InternalContainer.g:3135:6: (enumLiteral_37= 'WAKE_ALARM' )
                    // InternalContainer.g:3135:8: enumLiteral_37= 'WAKE_ALARM'
                    {
                    enumLiteral_37=(Token)match(input,110,FOLLOW_2); 

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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\15\14\uffff";
    static final String dfa_3s = "\1\30\14\uffff";
    static final String dfa_4s = "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String dfa_5s = "\1\0\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\1",
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

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 172:3: ( ({...}? => ( ({...}? => (otherlv_4= 'tag' ( (lv_tag_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'dockerFileLocation' ( (lv_dockerFilelocation_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'buildArg' ( (lv_buildargs_9_0= ruleBuildArgs ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'noCache' ( (lv_noCache_11_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'memory' ( (lv_memory_13_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'memswap' ( (lv_memswap_15_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'cpusetcpus' ( (lv_cpusetcpus_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'cpushares' ( (lv_cpushares_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'remove' ( (lv_remove_21_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'quiet' ( (lv_quiet_23_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'pull' ( (lv_pull_25_0= ruleEBoolean ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_0 = input.LA(1);

                         
                        int index3_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_0==24) ) {s = 1;}

                        else if ( LA3_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA3_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA3_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA3_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA3_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA3_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA3_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA3_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA3_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                        else if ( LA3_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 9) ) {s = 11;}

                        else if ( LA3_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 10) ) {s = 12;}

                         
                        input.seek(index3_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\46\uffff";
    static final String dfa_8s = "\1\21\45\uffff";
    static final String dfa_9s = "\1\77\45\uffff";
    static final String dfa_10s = "\1\uffff\1\45\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44";
    static final String dfa_11s = "\1\0\45\uffff}>";
    static final String[] dfa_12s = {
            "\1\26\6\uffff\1\1\4\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45",
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

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 758:3: ( ({...}? => ( ({...}? => (otherlv_6= 'binds' otherlv_7= '{' ( (lv_binds_8_0= ruleBind ) )+ otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'capabilityAdd' otherlv_11= '{' ( (lv_capabilityAdd_12_0= ruleCapability ) )+ otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'capabilityDrop' otherlv_15= '{' ( (lv_capabilityDrop_16_0= ruleCapability ) )+ otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'commands' otherlv_19= '{' ( (lv_commands_20_0= RULE_STRING ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'containerIDFile' ( (lv_containerIDFile_23_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'cpuPeriod' ( (lv_cpuPeriod_25_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'cpusetCpus' ( (lv_cpusetCpus_27_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'cpusetMems' ( (lv_cpusetMems_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cpuShares' ( (lv_cpuShares_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'devices' otherlv_33= '{' ( (lv_devices_34_0= ruleDevice ) )+ otherlv_35= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'dns' ( (lv_dns_37_0= RULE_STRING ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'dnsSearch' otherlv_40= '{' ( (lv_dnsSearch_41_0= RULE_STRING ) )+ otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'domainName' ( (lv_domainName_44_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'entrypoint' otherlv_46= '{' ( (lv_entrypoint_47_0= RULE_STRING ) )+ otherlv_48= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'env' otherlv_50= '{' ( (lv_env_51_0= RULE_STRING ) )+ otherlv_52= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= 'exposedPorts' otherlv_54= '{' ( (lv_exposedPorts_55_0= ruleExposedPort ) )+ otherlv_56= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= 'extraHosts' otherlv_58= '{' ( (lv_extraHosts_59_0= RULE_STRING ) )+ otherlv_60= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_61= 'labels' otherlv_62= '{' ( (lv_labels_63_0= ruleLabel ) )+ otherlv_64= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_65= 'links' otherlv_66= '{' ( (lv_links_67_0= ruleLink ) )+ otherlv_68= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_69= 'macAddress' ( (lv_macAddress_70_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_71= 'memory' ( (lv_memory_72_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_73= 'memorySwap' ( (lv_memorySwap_74_0= ruleElong ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_75= 'disableNetwork' ( (lv_disableNetwork_76_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_77= 'networkMode' ( (lv_networkMode_78_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_79= 'portBindings' otherlv_80= '{' ( (lv_portBindings_81_0= rulePortBinding ) )+ otherlv_82= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_83= 'privileged' ( (lv_privileged_84_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_85= 'publishAllPorts' ( (lv_publishAllPorts_86_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_87= 'readonlyRootfs' ( (lv_readonlyRootfs_88_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'pidMode' ( (lv_pidMode_90_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_91= 'workingDir' ( (lv_workingDir_92_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_93= 'user' ( (lv_user_94_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_95= 'tty' ( (lv_tty_96_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_97= 'restartPolicy' ( (lv_restartPolicy_98_0= ruleRestartPolicy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_99= 'volumes' otherlv_100= '{' (otherlv_101= '-' ( (lv_volumes_102_0= ruleVolume ) ) )+ otherlv_103= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_104= 'volumesFrom' otherlv_105= '{' (otherlv_106= '-' ( (lv_volumesFrom_107_0= ruleVolumesFrom ) ) )+ otherlv_108= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_109= 'ulimits' otherlv_110= '{' (otherlv_111= '-' ( (lv_ulimits_112_0= ruleUlimit ) ) )+ otherlv_113= '}' ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                         
                        int index22_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_0==24) ) {s = 1;}

                        else if ( LA22_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 0) ) {s = 2;}

                        else if ( LA22_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 1) ) {s = 3;}

                        else if ( LA22_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 2) ) {s = 4;}

                        else if ( LA22_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 3) ) {s = 5;}

                        else if ( LA22_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 4) ) {s = 6;}

                        else if ( LA22_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 5) ) {s = 7;}

                        else if ( LA22_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 6) ) {s = 8;}

                        else if ( LA22_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 7) ) {s = 9;}

                        else if ( LA22_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 8) ) {s = 10;}

                        else if ( LA22_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 9) ) {s = 11;}

                        else if ( LA22_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 10) ) {s = 12;}

                        else if ( LA22_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 11) ) {s = 13;}

                        else if ( LA22_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 12) ) {s = 14;}

                        else if ( LA22_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 13) ) {s = 15;}

                        else if ( LA22_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 14) ) {s = 16;}

                        else if ( LA22_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 15) ) {s = 17;}

                        else if ( LA22_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 16) ) {s = 18;}

                        else if ( LA22_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 17) ) {s = 19;}

                        else if ( LA22_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 18) ) {s = 20;}

                        else if ( LA22_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 19) ) {s = 21;}

                        else if ( LA22_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 20) ) {s = 22;}

                        else if ( LA22_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 21) ) {s = 23;}

                        else if ( LA22_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 22) ) {s = 24;}

                        else if ( LA22_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 23) ) {s = 25;}

                        else if ( LA22_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 24) ) {s = 26;}

                        else if ( LA22_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 25) ) {s = 27;}

                        else if ( LA22_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 26) ) {s = 28;}

                        else if ( LA22_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 27) ) {s = 29;}

                        else if ( LA22_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 28) ) {s = 30;}

                        else if ( LA22_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 29) ) {s = 31;}

                        else if ( LA22_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 30) ) {s = 32;}

                        else if ( LA22_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 31) ) {s = 33;}

                        else if ( LA22_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 32) ) {s = 34;}

                        else if ( LA22_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 33) ) {s = 35;}

                        else if ( LA22_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 34) ) {s = 36;}

                        else if ( LA22_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getContainerAccess().getUnorderedGroup_5(), 35) ) {s = 37;}

                         
                        input.seek(index22_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001FFE000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003FFE000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xFFFFFFFFE1020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x00007FFFFFFFFE00L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L,0x00007FFFFFFFFE00L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});

}
