/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-02-05")
public class ThriftElementObject implements org.apache.thrift.TBase<ThriftElementObject, ThriftElementObject._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftElementObject> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftElementObject");

  private static final org.apache.thrift.protocol.TField FIELD1_FIELD_DESC = new org.apache.thrift.protocol.TField("field1", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ThriftElementObjectStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ThriftElementObjectTupleSchemeFactory();

  public java.lang.String field1; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FIELD1((short)1, "field1");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FIELD1
          return FIELD1;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FIELD1, new org.apache.thrift.meta_data.FieldMetaData("field1", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftElementObject.class, metaDataMap);
  }

  public ThriftElementObject() {
  }

  public ThriftElementObject(
    java.lang.String field1)
  {
    this();
    this.field1 = field1;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftElementObject(ThriftElementObject other) {
    if (other.isSetField1()) {
      this.field1 = other.field1;
    }
  }

  public ThriftElementObject deepCopy() {
    return new ThriftElementObject(this);
  }

  @Override
  public void clear() {
    this.field1 = null;
  }

  public java.lang.String getField1() {
    return this.field1;
  }

  public ThriftElementObject setField1(java.lang.String field1) {
    this.field1 = field1;
    return this;
  }

  public void unsetField1() {
    this.field1 = null;
  }

  /** Returns true if field field1 is set (has been assigned a value) and false otherwise */
  public boolean isSetField1() {
    return this.field1 != null;
  }

  public void setField1IsSet(boolean value) {
    if (!value) {
      this.field1 = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case FIELD1:
      if (value == null) {
        unsetField1();
      } else {
        setField1((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case FIELD1:
      return getField1();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case FIELD1:
      return isSetField1();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftElementObject)
      return this.equals((ThriftElementObject)that);
    return false;
  }

  public boolean equals(ThriftElementObject that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_field1 = true && this.isSetField1();
    boolean that_present_field1 = true && that.isSetField1();
    if (this_present_field1 || that_present_field1) {
      if (!(this_present_field1 && that_present_field1))
        return false;
      if (!this.field1.equals(that.field1))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetField1()) ? 131071 : 524287);
    if (isSetField1())
      hashCode = hashCode * 8191 + field1.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ThriftElementObject other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetField1()).compareTo(other.isSetField1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetField1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.field1, other.field1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ThriftElementObject(");
    boolean first = true;

    sb.append("field1:");
    if (this.field1 == null) {
      sb.append("null");
    } else {
      sb.append(this.field1);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThriftElementObjectStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ThriftElementObjectStandardScheme getScheme() {
      return new ThriftElementObjectStandardScheme();
    }
  }

  private static class ThriftElementObjectStandardScheme extends org.apache.thrift.scheme.StandardScheme<ThriftElementObject> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftElementObject struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FIELD1
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.field1 = iprot.readString();
              struct.setField1IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftElementObject struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.field1 != null) {
        oprot.writeFieldBegin(FIELD1_FIELD_DESC);
        oprot.writeString(struct.field1);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftElementObjectTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ThriftElementObjectTupleScheme getScheme() {
      return new ThriftElementObjectTupleScheme();
    }
  }

  private static class ThriftElementObjectTupleScheme extends org.apache.thrift.scheme.TupleScheme<ThriftElementObject> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftElementObject struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetField1()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetField1()) {
        oprot.writeString(struct.field1);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftElementObject struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.field1 = iprot.readString();
        struct.setField1IsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

