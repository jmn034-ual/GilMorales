import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
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
<vaadin-vertical-layout theme="spacing-s" style="width: 100%; position: fixed; height: 90%; justify-content: center; z-index: 999;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing-s" style="width: 100%; flex-shrink: 1; flex-grow: 0; height: 100%; justify-content: center; " id="vaadinHorizontalLayout">
  <vaadin-vertical-layout style="flex-shrink: 0; flex-grow: 0; margin: var(--lumo-space-s); width: 40%; margin-left: var(--lumo-space-xl);" id="layoutSubirVideo" theme="spacing-xs">
   <vaadin-vertical-layout theme="spacing-xs" id="layoutTitulo" style="margin: var(--lumo-space-s); margin-left: var(--lumo-space-xl);">
    <h2 id="titulo" style="margin: var(--lumo-space-s); align-self: flex-start;">Añadir publicación</h2>
    <label id="label" style="align-self: flex-start; flex-grow: 0; margin: var(--lumo-space-s);">Publica un video en tu perfil.</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout id="layoutVideo" style="flex-grow: 0; margin: var(--lumo-space-s); align-self: stretch; height: 60%;"></vaadin-vertical-layout>
   <vaadin-button id="botonSubir" style="align-self: center;">
     Subir 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="flex-shrink: 1; flex-grow: 0; justify-content: center; align-items: flex-start; margin-right: var(--lumo-space-xl); z-index: 999;" id="layoutDatosPublicacion" theme="spacing-s">
   <vaadin-vertical-layout id="vaadinVerticalLayout1" style="align-self: stretch; width: 100%; margin: var(--lumo-space-m);">
    <label id="labelLocalizacion">Añadir localización</label>
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
     <vaadin-text-field placeholder="Añadir localización..." id="textFielLocalizacion"></vaadin-text-field>
     <vaadin-button id="botonAniadir">
       Añadir 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout id="vaadinVerticalLayout2" style="align-self: stretch; height: 10%; flex-grow: 0; margin: var(--lumo-space-m);">
    <label id="labelDescripcion">Descripción (máximo 250 caracteres)</label>
    <vaadin-text-area label="" placeholder="Add detailed explanation" id="textAreaDescripcion" style="flex-grow: 0;"></vaadin-text-area>
   </vaadin-vertical-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="margin: var(--lumo-space-m); align-self: center;">
    <vaadin-button id="botonDescartar" style="margin: var(--lumo-space-m); z-index: 999;">
      Descartar 
    </vaadin-button>
    <vaadin-button id="botonPublicar" style="margin: var(--lumo-space-m);z-index: 999;">
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
