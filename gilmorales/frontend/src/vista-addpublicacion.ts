import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-addpublicacion')
export class VistaAddpublicacion extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout theme="spacing-s" style="width: 100%; position: fixed; height: 100%; justify-content: center; z-index: 999; background-color: #fffff;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing-s" style="width: 100%; flex-shrink: 1; flex-grow: 0; height: 100%; justify-content: center; background-color: #ffffff;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout style="flex-shrink: 0; flex-grow: 0; height: 100%; padding-bottom: 5%; width: 75%;" id="layoutSubirVideo" theme="spacing-xs">
   <vaadin-vertical-layout theme="spacing-xs" id="layoutTitulo" style="margin: var(--lumo-space-s); margin-left: var(--lumo-space-xl); padding-top: var(--lumo-space-m); margin-top: var(--lumo-space-m);">
    <h2 id="titulo" style="margin: var(--lumo-space-s); align-self: flex-start; border-left: 2px solid black; border-top: none; border-right: none; border-bottom: none; padding-left: var(--lumo-space-s);">Añadir publicación</h2>
    <label id="label" style="align-self: flex-start; flex-grow: 0; margin: var(--lumo-space-s); border-left: 2px solid black; border-top: none; border-right: none; border-bottom: none; padding-left: var(--lumo-space-s); margin-left: var(--lumo-space-l);">Publica un video en tu perfil.</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; padding: var(--lumo-space-m); background-color: black; color: gray; border-radius: 18px; border: 2px solid #F5F5F5; flex-grow: 0; width: 100%; height: 80%;">
    <vaadin-vertical-layout id="layoutVideo" style="flex-grow: 0; flex-shrink: 0; width: 990px; background-color: black; color: gray; padding: var(--lumo-space-xs); margin-left: var(--lumo-space-s); align-self: center; align-items: center; height: 100%;"></vaadin-vertical-layout>
   </vaadin-vertical-layout>
   <hr style="width: 100%; align-self: center; margin-top: var(--lumo-space-m); height: 2px; background-color: black;">
   <vaadin-button id="botonSubir" style="align-self: center; flex-grow: 0; margin-top: var(--lumo-space-s);" theme="primary contrast">
     Subir 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="align-items: center; align-self: center; border-radius: 18px; border: 2px solid #F5F5F5; padding: var(--lumo-space-s); margin-right: var(--lumo-space-m);" id="layoutDatosPublicacion" theme="spacing-s">
   <vaadin-vertical-layout id="vaadinVerticalLayout1" style="align-self: stretch; width: 100%; margin: var(--lumo-space-m);">
    <label id="labelLocalizacion" style="align-self: flex-start; flex-grow: 0; border-left: 2px solid black; border-top: none; border-right: none; border-bottom: none; padding-left: var(--lumo-space-s);">Añadir localización</label>
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
     <vaadin-text-field placeholder="Añadir localización..." id="textFielLocalizacion" style="flex-grow: 1;"></vaadin-text-field>
     <vaadin-button id="botonAniadir">
       Añadir 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout id="vaadinVerticalLayout2" style="align-self: stretch; height: 10%; flex-grow: 0; margin: var(--lumo-space-m);">
    <label id="labelDescripcion" style="align-self: flex-start; flex-grow: 0; border-left: 2px solid black; border-top: none; border-right: none; border-bottom: none; padding-left: var(--lumo-space-s);">Descripción (máximo 250 caracteres)</label>
    <vaadin-text-area label="" placeholder="Añade una descripción a tu publicación..." id="textAreaDescripcion" style="flex-grow: 1; align-self: stretch;"></vaadin-text-area>
   </vaadin-vertical-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="margin: var(--lumo-space-m); align-self: center;">
    <vaadin-button id="botonDescartar" style="margin: var(--lumo-space-m); z-index: 999;">
      Descartar 
    </vaadin-button>
    <vaadin-button id="botonPublicar" style="margin: var(--lumo-space-m);z-index: 999;" theme="primary">
      Publicar 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
