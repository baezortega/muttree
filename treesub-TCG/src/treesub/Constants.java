package treesub;

import com.google.common.collect.Lists;

import java.util.List;

public class Constants {
    // TODO: Only handles codon sequences!
    public static final int CODON_LENGTH = 3;
    public static final String PAML_RECONSTRUCTION_FILE = "rst";
    public static final String ALIGNMENT_NAMES = "alignment_names";
    public static final String PROPERTIES_FILENAME = "annotator.properties";
    public static final String RAXML_PATH_PROPERTY = "RAXML_PATH";
    public static final String PAML_PATH_PROPERTY = "PAML_PATH";
    public static final String RAXML_OPTIONS_PROPERTY = "RAXML_OPTIONS";
    public static final String DEFAULT_PATH_PROPERTY = "DEFAULT_PATH";
    public static final String RAXML_DEFAULT_OPTIONS = "-m GTRGAMMA -T 2 -# 10 -p 12345";
    public static final List<String> FILES_TO_CHECK = Lists.newArrayList("alignment", ALIGNMENT_NAMES, "alignment.raxml.phylip",
            "alignment.paml.phylip", "RAxML_bestTree.RECON", "RAxML_bestTree.RECON.rooted", "pamlout", PAML_RECONSTRUCTION_FILE);
    public static final String OUTGROUP_SEQUENCE_NAME = "seq_1";
    // MODIFIED: ADDED NEW CONSTANTS
    public static final String RAXML_ORIGINAL_TREE = "RAxML_bestTree.RECON.rooted";
    public static final String RAXML_RECONSTRUCTION_TREE = "RAxML_nodeLabelledRootedTree.ASR";
    public static final String RAXML_ORIGINAL_SEQS = "alignment_codons.phylip";
    public static final String RAXML_RECONSTRUCTION_SEQS = "RAxML_marginalAncestralStates.ASR";
}
